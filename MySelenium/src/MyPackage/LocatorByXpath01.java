package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByXpath01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://integrator.actitime.com/auth/at");
		// find the Login button

		driver.findElement(By.xpath("//span[text()-'Login']"));

	}

}
