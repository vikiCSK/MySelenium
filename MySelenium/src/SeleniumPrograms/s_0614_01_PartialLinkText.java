package SeleniumPrograms;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class s_0614_01_PartialLinkText {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://alvas.org/");
		Thread.sleep(2000);
		
		//WebElement collegeWeFound = driver.findElement(By.partialLinkText("Medical Laboratory Technology & Post Graduate"));
		//new Actions(driver).scrollToElement(collegeWeFound).perform();
		
		WebElement collegeWeFound = driver.findElement(By.xpath
				("//a[text()='Alva’s College of Medical Laboratory Technology & Post Graduate Research Centre']"));
		Thread.sleep(2000);
		collegeWeFound.click();	
		
		driver.navigate().back();
		//Thread.sleep(2000);
		
		driver.manage().window().minimize();
		driver.quit();
	}
}
