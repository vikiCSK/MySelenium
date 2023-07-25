package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0704_02_UsageOfGetCssAttribute {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// Identify The Login Button In The Webpage
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
		// Identify The Color Of The Button
		String buttonColor = loginButton.getCssValue("background-color");
		// Print The Button color
		System.out.println("buttonColor : " + buttonColor);
		WebElement createButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		String createColor = createButton.getCssValue("background-color");
		System.out.println("createColor : " + createColor);

		driver.manage().window().minimize();
		driver.quit();
	}
}
