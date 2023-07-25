package SeleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class s_0715_01_CaptureAllTheOptions {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(
				"https://services.ecourts.gov.in/ecourtindia_v6/?p=casestatus/&app_token=9c50d5092a55a366a8acf5850a154d34cf7afba5aab0857118e7b047596d0cff");

		// identify the menu option method
		WebElement popup = driver.findElement(By.cssSelector("button[class='btn-close']"));
		popup.click();

		WebElement selectStateDropDown = driver.findElement(By.id("sess_state_code"));
		Select stateSelect = new Select(selectStateDropDown);
		List<WebElement> allStateOptions = stateSelect.getOptions();
		for (WebElement opt : allStateOptions) {
			String optText = opt.getText();
			System.out.println(optText);
			stateSelect.selectByVisibleText(optText);
			if (selectStateDropDown.isSelected()) {
				System.out.println("Pass: All the options in the dropdown are selected");
			} else {
				System.out.println("Fail: All the options in the dropdown are not selected");
			}
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
