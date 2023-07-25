package SeleniumPrograms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0704_03_UsageOfIsDispayedMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emaiTextField = driver.findElement(By.id("email"));
		if (emaiTextField.isDisplayed()) {
		System.out.println("The emaiTextField is displayed");
		emaiTextField.sendKeys("QSPIDERS");
		}else {
		System.out.println("Fail: The emaiTextField is not displayed");
		}
	}
}
