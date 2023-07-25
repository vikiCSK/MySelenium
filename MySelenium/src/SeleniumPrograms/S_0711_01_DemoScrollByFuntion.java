package SeleniumPrograms;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_0711_01_DemoScrollByFuntion {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/doodles");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-3000)");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}
}