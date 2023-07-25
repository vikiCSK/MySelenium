package SeleniumPrograms;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0627_01_HandleAbscuredElement {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		WebElement abscuredEle = driver
				.findElement(By.xpath("//span[contains(text(),\"Don't Change\")]/../input[@type='submit']"));
		abscuredEle.click();
		Thread.sleep(2000);
		WebElement customerSerivece = driver
				.findElement(By.xpath("//div[@id='nav-xshop']/a[text()='Customer Service']"));
		customerSerivece.click();
		driver.quit();
	}
}
