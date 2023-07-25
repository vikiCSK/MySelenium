package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0704_01_UsageOfIsEnabledMethod {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		* driver.get("https://www.facebook.com/");
		* WebElement loginButton = driver.findElement(By.name("login")); 
		* if (loginButton.isEnabled()) 
		* {
		* loginButton.click(); 
		* System.out.println("The login button is enabled.");
		* }
		* else { System.out.println("The login button is disabled."); 
		* }
		*/
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		WebElement submitOption = driver.findElement(By.name("submit"));
		if (submitOption.isEnabled()) {
		submitOption.click();
		System.out.println("The submit button is enabled.");
		}else {
		System.out.println("Since the submit button is disabled.");
		WebElement atandS = driver.findElement(By.xpath("//button[text()='Accept Terms of Service']"));
		atandS.click();
		Thread.sleep(2000);
		WebElement checkBox = driver.findElement(By.id("confbtn"));
		checkBox.click();
		Thread.sleep(2000);
		WebElement closeOption = driver.findElement(By.xpath("//button[text()='Close']"));
		closeOption.click();
		Thread.sleep(2000);
		submitOption.click();
		Thread.sleep(2000);
		}
		driver.manage().window().minimize();
		driver.quit();
		}
}
