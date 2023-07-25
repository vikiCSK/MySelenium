package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0703_01_Check_UsageOfGetSize {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// EMAIL
		WebElement emailTextfield = driver.findElement(By.id("email"));
		// WebElement password = driver.findElement(By.id("passContainer"));
		Dimension sizeOfEmailTextfield = emailTextfield.getSize();
		int emailHeight = sizeOfEmailTextfield.getHeight();
		System.out.println("email height is " + emailHeight);
		int emailWidth = sizeOfEmailTextfield.getWidth();
		System.out.println("email widhth is " + emailWidth);

		// PASSWORD
		WebElement passwordTextField = driver.findElement(By.id("passContainer"));
		Dimension sizeOfThePasswordTextField = passwordTextField.getSize();
		int heightPassword = sizeOfThePasswordTextField.getHeight();
		System.out.println("heightPassword = " + heightPassword);
		int widthOfPassword = sizeOfThePasswordTextField.getWidth();
		System.out.println("widthOfPassword = " + widthOfPassword);
		// Verify the condition
		if (emailHeight == heightPassword) {
			System.out.println("Pass: The Hight Of the email and password are verified and found correct.");
		} else {
			System.out.println("Fail: The Hight Of the email and password are verified and found incorrect.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
