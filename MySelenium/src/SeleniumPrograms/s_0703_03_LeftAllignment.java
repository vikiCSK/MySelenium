package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0703_03_LeftAllignment {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// Email
		WebElement emaliTextField = driver.findElement(By.id("email"));
		Rectangle emailRect = emaliTextField.getRect();
		int startXOfEmail = emailRect.getX();
		System.out.println("startXOfEmail = " + startXOfEmail);
		int emailWidth = emailRect.getWidth();
		System.out.println("emailWidth = " + emailWidth);
		int emailLeftAlignment = startXOfEmail + emailWidth;
		System.out.println("emailLeftAlignment = " + emailLeftAlignment);
		// Password
		WebElement passwordTextField = driver.findElement(By.id("passContainer"));
		Rectangle passwordRect = passwordTextField.getRect();
		int startXofPassword = passwordRect.getX();
		System.out.println("startXofPassword = " + startXofPassword);
		int passwordWidth = passwordRect.getWidth();
		System.out.println("passwordWidth = " + passwordWidth);
		int passwordLeftAlignment = startXofPassword + passwordWidth;
		System.out.println("passwordLeftAlignment = " + passwordLeftAlignment);
		// Verify
		if (emailLeftAlignment == passwordLeftAlignment) {
			System.out.println("Pass: The Email and Password Left alignment are verfied and found correct.");
		} else {
			System.out.println("Fail: The Email and Password Left alignment are verfied and found incorrect.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}