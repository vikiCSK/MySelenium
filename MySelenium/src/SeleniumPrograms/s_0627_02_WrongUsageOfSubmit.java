package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0627_02_WrongUsageOfSubmit {
	public static void main(String[] args) {
		// it is not made up of <input> or <button>
		// it is not having type = "submit"
		// it is not present inside <form>
		// unsupportedOperationException -- java -- Run --- Unchecked.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement loginOption = driver.findElement(By.id("loginButton"));
		loginOption.click();
	}
}