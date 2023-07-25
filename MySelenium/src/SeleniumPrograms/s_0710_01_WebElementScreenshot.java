package SeleniumPrograms;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0710_01_WebElementScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		driver.get("https://www.royalchallengers.com/");
		WebElement rcbLogo = driver.findElement(By.xpath("//div[@class='hdr-logo']//img"));
		File tempFile = rcbLogo.getScreenshotAs(OutputType.FILE);
		File permFile = new File("./errorshots/" + timeStamp + "rcblogo.png");
		FileUtils.copyFile(tempFile, permFile);
		driver.manage().window().minimize();
		driver.quit();
	}
}
