package SeleniumPrograms;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class s_0706_01_OneEndToEndScenerio {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		WebElement UsernameTextField = driver.findElement(By.id("username"));
		UsernameTextField.sendKeys("admin");
		WebElement PasswordNameTextField = driver.findElement(By.name("pwd"));
		PasswordNameTextField.sendKeys("manager");
		WebElement LoginOption = driver.findElement(By.linkText("Login"));
		LoginOption.click();
		WebElement LogoutLink = driver.findElement(By.id("logoutLink"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		// until - non static method from web driver wait class - Parameterized
		if (wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/user/submit_tt.do"))) {
			System.out.println("The Logout Link Is Displayed");
		}
		else 
		{
			System.out.println("The Logout Link Is Displayed");
		}

		LogoutLink.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
