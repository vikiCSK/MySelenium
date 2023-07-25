package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneSmallScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
//Enter the username as admin
		WebElement user = driver.findElement(By.id("username"));
		user.clear();
		user.sendKeys("admin");
		Thread.sleep(3000);
//Enter the password
		WebElement pass = driver.findElement(By.name("pwd"));
		pass.clear();
		pass.sendKeys("manager");
		Thread.sleep(3000);
//click on login button
		WebElement login = driver.findElement(By.id("loginButton"));
		login.click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
		

	}

}
