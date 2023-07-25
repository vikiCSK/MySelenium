package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0703_02_UsageOFGetLocation {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0 ");
		Thread.sleep(3000);
		// email
		WebElement emailTextField = driver.findElement(By.xpath("//input[@ploaceholder='Email or phone']")); 
		//X-PATH BY COMPLETE ATT VALUE //TAGNAME[@ATTNAME='COMPLETE ATT VALUE']
		Point locationOfEmail = emailTextField.getLocation();
		int startYEmail = locationOfEmail.getY();
		System.out.println("startYEmail = " + startYEmail);

		// Password
		WebElement passwordTextField = driver.findElement(By.name("pass"));
		Point locationOfPassword = passwordTextField.getLocation();
		int startYPassword = locationOfPassword.getY();
		System.out.println("startYPassword = " + startYPassword);

		// Verify
		if (startYEmail == startYPassword) {
			System.out.println("Pass: The starting location of email and password is verified and it is correct.");
		} else {
			System.out.println("Fail: The starting location of email and password is verified and it is incorrect.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
