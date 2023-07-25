package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://alvas.org/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='About AEF']")).click();
	}

}
