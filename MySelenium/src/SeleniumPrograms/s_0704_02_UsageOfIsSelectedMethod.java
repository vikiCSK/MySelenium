package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0704_02_UsageOfIsSelectedMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		if (checkBox.isSelected()) {
			System.out.println("The check box is in the selectable format.");
		} else {
			checkBox.click();
			System.out.println("The check box is not in the selectable format.");
		}
	}
}
