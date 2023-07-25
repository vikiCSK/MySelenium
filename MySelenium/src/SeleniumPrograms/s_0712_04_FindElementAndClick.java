package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0712_04_FindElementAndClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		for (;;) {
			try {
				WebElement polandNationalDay = driver
						.findElement(By.xpath("// a[text()='Poland National Day 2022']"));
				polandNationalDay.click();
				break;
			} catch (NoSuchElementException e) {
				jse.executeScript("window.scrollBy(0,5000)");
			}
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
