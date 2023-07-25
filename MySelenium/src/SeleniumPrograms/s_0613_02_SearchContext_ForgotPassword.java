package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0613_02_SearchContext_ForgotPassword {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);

		// driver.findElement(By.linkText("Forgot your password?")).click();
		// Thread.sleep(2000);

		WebElement ForgotPasswordField = driver.findElement(By.linkText("Forgot your password?"));
		ForgotPasswordField.click();
		Thread.sleep(2000);

		WebElement UsernameIdTextField = driver.findElement(By.id("forgetPasswordEmailOrUsername"));
		UsernameIdTextField.sendKeys("admin");
		Thread.sleep(2000);

		WebElement RequestLoginInfoButton = driver.findElement(By.id("forgetPasswordButtonContainer"));
		RequestLoginInfoButton.click();
		Thread.sleep(2000);

		WebElement ReturnToLoginPageField = driver.findElement(By.id("toLoginPageLink"));
		ReturnToLoginPageField.click();
		Thread.sleep(2000);

		driver.manage().window().minimize();
		driver.quit();
	}
}