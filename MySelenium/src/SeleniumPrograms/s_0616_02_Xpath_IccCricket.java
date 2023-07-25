package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0616_02_Xpath_IccCricket {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/homepage");
		Thread.sleep(2000);

		WebElement pop = driver.findElement(By.cssSelector("svg[class='icon generic-splash-promo__close-icon']"));
		Thread.sleep(2000);
		pop.click();
		Thread.sleep(2000);

		// identify the menu option method
		WebElement menu = driver.findElement(By.cssSelector("button[class='hamburger js-sidebar-btn']"));
		Thread.sleep(2000);
		menu.click();
		Thread.sleep(2000);

		// identify the close option method
		WebElement close = driver.findElement(By.cssSelector("span[class='sidebar-nav__close js-sidebar-btn']"));
		Thread.sleep(2000);
		close.click();
		// Thread.sleep(3000);

		driver.manage().window().minimize();
		driver.quit();
	}
}
