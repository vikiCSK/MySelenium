package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement untbx; // declaration
	private WebElement pwtbx;
	private WebElement lgbtn;

	public LoginPage(WebDriver driver) {
		untbx = driver.findElement(By.id("username"));// intialization
		pwtbx = driver.findElement(By.name("pwd"));
		lgbtn = driver.findElement(By.xpath("//div[text()='Login '] "));
	}

	public void setuser(String un, String pw) {
		untbx.sendKeys(un);// utilization
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}

}
