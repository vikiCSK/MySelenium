package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath03 {

	public static void main(String[] args) {
		//Instantiate the browser specific class
		
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.naukri.com/nlogin/login");
				

	}

}
