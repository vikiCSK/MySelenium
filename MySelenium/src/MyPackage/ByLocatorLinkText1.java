package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorLinkText1 {

	public static void main(String[] args) throws InterruptedException {
		// Instantiate the browser specific class
				WebDriver driver = new ChromeDriver();
				// maximise the window
				driver.manage().window().maximize();
				// pass the main URL of the application
				driver.get("https://www.facebook.com/");
				// find the forgotten password?
				WebElement forgottonpasswordbutton = driver.findElement(By.linkText("Forgotten password?"));
				forgottonpasswordbutton.click();
				
				// post condition
				driver.manage().window().minimize();
				Thread.sleep(5000);
	}

}
