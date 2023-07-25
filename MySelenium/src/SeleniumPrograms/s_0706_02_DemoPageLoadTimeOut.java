package SeleniumPrograms;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.timeout.TimeoutException;

public class s_0706_02_DemoPageLoadTimeOut {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		try {
			driver.get("https://www.amazon.com/");
		}
		catch (TimeoutException e) {
			System.out.println("The Application is not having the capacity to load within the given time");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
