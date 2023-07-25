package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
//stores the username textbox address as @a1 in untbx
		WebElement untbx = driver.findElement(By.id("username"));
//refresh and username textbox get new address like @p1
		driver.navigate().refresh();
//try to enter admin using old address is @a1
		untbx.sendKeys("admin");
	}

}
