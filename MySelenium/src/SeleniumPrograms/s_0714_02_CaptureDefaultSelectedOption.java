package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class s_0714_02_CaptureDefaultSelectedOption {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.facebook.com/signup");
		
		//Day
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select daySelect = new Select(dayDropDown);
		String DefaultDaySelectedOption = daySelect.getFirstSelectedOption().getText();
		System.out.println("DefaultDaySelectedOption = "+DefaultDaySelectedOption);
		//Month
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropDown);
		String DefaultMonthSelectedOption = monthSelect.getFirstSelectedOption().getText();
		System.out.println("DefaultMonthSelectedOption = " + DefaultMonthSelectedOption);
		//Year
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropDown);
		String DefaultyearDropDownSelectedOption = yearSelect.getFirstSelectedOption().getText();
		System.out.println("DefaultyearDropDownSelectedOption = " + DefaultyearDropDownSelectedOption);
		
		driver.manage().window().minimize();
		driver.quit();
	}
}
