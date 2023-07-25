package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0630_01_UsageOfGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wwww.facebook.com/");
		WebElement emailTextField = driver.findElement(By.id("email"));
		// String expctedplaceHolder="Email address or phone number"
		String placeHolderOfemailTextField = emailTextField.getAttribute("placeholder");
		System.out.println(placeHolderOfemailTextField);
		driver.manage().window().minimize();
		driver.quit();
	}
}
