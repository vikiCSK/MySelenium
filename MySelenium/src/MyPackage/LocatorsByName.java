package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("9944537900");
		Thread.sleep(5000);
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("1234567");
		Thread.sleep(5000);
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(500000);
		driver.quit();

	}

}
