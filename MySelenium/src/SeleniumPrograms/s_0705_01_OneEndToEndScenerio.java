package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0705_01_OneEndToEndScenerio {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement UsernameTextField = driver.findElement(By.id("username"));
		UsernameTextField.sendKeys("admin");
		WebElement PasswordNameTextField = driver.findElement(By.name("pwd"));
		PasswordNameTextField.sendKeys("manager");
		WebElement LoginOption = driver.findElement(By.linkText("Login"));
		LoginOption.click();
		Thread.sleep(5000);
		WebElement LogoutOption = driver.findElement(By.id("logoutLink"));
		LogoutOption.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
