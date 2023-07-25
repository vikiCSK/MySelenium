package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIndependentEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.flipkart.com/search?q=redmi%2010%20pro&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.findElement(By.xpath("(//div[text()='₹19,999'])[1]")).click();

	}

}
