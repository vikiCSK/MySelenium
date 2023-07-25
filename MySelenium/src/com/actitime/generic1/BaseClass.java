package com.actitime.generic1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.activitime.pom1.HomePage;
import com.projectname.pom.LoginPage;

public class BaseClass {
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		Reporter.log("openBrowser", true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@AfterTest
	public void closeBrowser() {
		Reporter.log("closeBrowser", true);
		driver.quit();
	}

	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login", true);
		FileLib f = new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		driver.get(url);
		LoginPage l = new LoginPage(driver);
		l.setLogin(un, pw);
	}

	@AfterMethod
	public void logOut() {
		Reporter.log("logout", true);
		HomePage h = new HomePage(driver);
		h.setLogOut();
	}
}