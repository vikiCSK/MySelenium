package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0616_03_Xpath_McDonalds {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mcdonalds.com/us/en-us.html");

		// Identify The McDonals Rewards Option
		WebElement linktext = driver.findElement(By.linkText("MyMcDonald's Rewards"));
		linktext.click();

		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
