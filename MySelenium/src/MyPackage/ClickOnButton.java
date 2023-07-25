package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnButton {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//maximise the window browser
		driver.manage().window().maximize();
		//pass the main URL of the app
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg1NTQ5MTMwLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		Thread.sleep(4000);
		//find the login button
		WebElement loginbutton =driver.findElement(By.name("login"));
		//click on the login button
		// we can click the button
		loginbutton.click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
//		driver.quit();

	}

}
