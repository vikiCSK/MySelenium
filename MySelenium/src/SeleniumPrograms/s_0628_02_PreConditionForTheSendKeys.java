package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0628_02_PreConditionForTheSendKeys {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		usernameTextField.clear();
		Thread.sleep(2000);
		usernameTextField.sendKeys("admin");
		Thread.sleep(2000);
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		Thread.sleep(2000);
		passwordTextField.sendKeys("Test@123");
		Thread.sleep(2000);
		WebElement signInOption = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signInOption.sendKeys(Keys.ENTER);
	}
}