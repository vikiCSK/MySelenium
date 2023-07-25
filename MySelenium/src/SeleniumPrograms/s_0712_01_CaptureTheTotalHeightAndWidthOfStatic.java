package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0712_01_CaptureTheTotalHeightAndWidthOfStatic {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//Null-Pointer-Exception => RUN => UNCHECKED => FROM JAVA 
		long height = (long) jse.executeScript("return document.body.scrollHeight");
		System.out.println("Height of the page is "+height);
		long width = (long) jse.executeScript("return document.body.scrollWidth");
		System.out.println("Width of the page is "+width);
		driver.manage().window().minimize();
		driver.quit();
}
}