package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Desktop/page1.html");
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		driver.findElement(By.id("t2")).sendKeys("JSP-BTM");
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.findElement(By.id("t1")).sendKeys("QSP-BTM");
		Thread.sleep(4000);
		driver.quit();
	}

}
