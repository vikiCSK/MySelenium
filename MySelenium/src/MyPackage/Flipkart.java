package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		//Instantiate the Browser specific class
		WebDriver driver = new ChromeDriver();
		//pass the main URL
		driver.get("https://www.flipkart.com/search?q=redmi%2010%20pro&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		//maximise the window
		driver.manage().window().maximize();

	}

}
