package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0628_01_UsageOfSendKeys {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextField = driver.findElement(By.id("email"));
		// emailTextField.sendKeys("Navya@gmail.com");
		emailTextField.sendKeys(Keys.chord("navya123@gmail.com"));
		Thread.sleep(1000);
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		// passwordTextField.sendKeys("123@abc");
		passwordTextField.sendKeys(Keys.chord("abc@123"));
		Thread.sleep(1000);
		WebElement loginButton = driver.findElement(By.name("login"));
		// loginButton.submit();
		loginButton.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.manage().window().minimize();
		driver.quit();
	}
}