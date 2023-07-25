package com.projectname.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodClassEx {

	@Test
	public void validLogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l = new LoginPage(driver);
		l.setLogin("admin", "manager");

	}

}
