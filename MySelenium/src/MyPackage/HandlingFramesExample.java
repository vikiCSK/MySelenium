package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Desktop/page1.html");
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame("f1");
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("b");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("c");
		Thread.sleep(2000);
		WebElement f = driver.findElement(By.xpath("//iframe"));
		Thread.sleep(2000);
		driver.switchTo().frame(f);
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("d");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
