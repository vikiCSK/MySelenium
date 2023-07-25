package SeleniumPrograms;

import java.io.File;

import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0708_01_WebPageScreenshot {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://www.irctc.co.in/nget/train-search");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		/*
		 * String absolutepath = screenshot.getAbsolutePath();
		 * System.out.println(absolutepath);
		 */
		File permFile = new File("./errorshots/" + timestamp + "irctcwebpage.png");
		FileUtils.copyFile(tempFile, permFile);
		driver.manage().window().minimize();
		driver.quit();

	}
}
