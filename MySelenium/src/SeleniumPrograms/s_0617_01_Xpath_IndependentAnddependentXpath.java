package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0617_01_Xpath_IndependentAnddependentXpath {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");

		//click On Radio Button
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']"));
		maleRadioButton.click();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		driver.quit();
	}
}
