package SeleniumPrograms;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0616_01_Xpath_Malaicha {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		// Thread.sleep(2000);

		// identify the accept cookies button
		// WebElement acceptCookiesButton =
		// driver.findElement(By.xpath("//button[text()='Accept Cookies']"));
		// acceptCookiesButton.click();

		// identify the register button
		// tagname [text()='CompleteMainTagText]
		WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
		Thread.sleep(2000);
		registerButton.click();
		Thread.sleep(3000);

		driver.manage().window().minimize();
		driver.quit();
	}
}