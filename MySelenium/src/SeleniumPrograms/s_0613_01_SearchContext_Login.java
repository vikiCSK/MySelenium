package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0613_01_SearchContext_Login {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);

		// 1.ID
		// Identify username textfield by ID
		WebElement UsernameIdTextField = driver.findElement(By.id("username"));
		UsernameIdTextField.sendKeys("admin");
		Thread.sleep(2000);

		// ID - When Not To Go For ID
		// 1.Having Duplicate
		// 2.Id Not present
		// 3.ID Present But Dynamic 4.ID Value Is To Lengthy

		// WebElement loginButton = driver.findElement(By.id("u-0-5-Q"));
		// loginButton.click();
		// Thread.sleep(2000);

		// 2 - NAME
		// Identify password textfield by NAME
		WebElement PasswordNameTextField = driver.findElement(By.name("pwd"));
		PasswordNameTextField.sendKeys("manager");
		Thread.sleep(2000);

		// NAME - When Not To Go For NAME
		// 1.Having Duplicate
		// 2.Name Attribute Not Present
		// 3.Name Attribute Value Is Too Lengthy

		// 3 - CLASSNAME
		// Identify password textfield by CLASSNAME
		// Invalid Selector Exception - Space in className
		// WebElement passwordClassTextField =
		// driver.findElement(By.className("textField pwdfield"));
		// passwordClassTextField.sendKeys("manager");
		// Thread.sleep(2000);

		// CLASSNAME - When Not To Go For CLASSNAME
		// 1.Having Duplicate
		// 2.Class Attribute Not Present
		// 3.Class Attribute Is Too Lengthy
		// 4.Class Attribute Present But It Contains Spaces
		// Invalid Selector Exception - IF Space in className

		// 4 - TAG NAME
		// TAGNAME - When Not To Go For Tag Name
		// 1.When It Has Duplicate Tag

		// 5 - LINKTEXT
		// Identify login button By LinkText
		WebElement LinkTextTextField = driver.findElement(By.linkText("Login"));
		LinkTextTextField.click();
		Thread.sleep(2000);
		
		//LINK TEXT - WHEN NOT TO GO FOR LINK TEXT
		//1.If link text is very lengthy
		//2.The link text is very lengthy 
		//3.When the tag text is either fully or partially dynamic
		//4.Tag name is other than <a>

		driver.manage().window().minimize();
		driver.quit();

	}

}
