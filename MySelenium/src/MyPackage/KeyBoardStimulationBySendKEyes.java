package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardStimulationBySendKEyes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		// Identify the usernametextfield
		WebElement emailTextField = driver.findElement(By.id("email"));
		Thread.sleep(3000);
		emailTextField.sendKeys("9944233492");
//		2times Tab and 1time Enter
		emailTextField.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		emailTextField.sendKeys("Selenium");
		Thread.sleep(3000);
		emailTextField.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(3000);
		emailTextField.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
