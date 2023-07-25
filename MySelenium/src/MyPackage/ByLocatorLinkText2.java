package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorLinkText2 {

	public static void main(String[] args) {
		//Instantiate the browser specific class
		WebDriver driver= new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//pass the main URL of the application
		driver.get("https://www.instagram.com/");
		//find the forgotten password option
		WebElement forgotbutton =driver.findElement(By.linkText("Forgot password?"));
		forgotbutton.click();


	}

}
