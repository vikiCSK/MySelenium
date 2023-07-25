package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsInAscOrder {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Q%20SPIDERS/SELENIUM/DaysDropDown.html");
		WebElement dropdown = driver.findElement(By.id("a"));
		Select select = new Select(dropdown);
		List<WebElement> allOptions = select.getOptions();
		ArrayList<String> al = new ArrayList<String>();
		for (WebElement option : allOptions) {
			String value = option.getText();
			al.add(value);
		}
		Collections.sort(al);
		System.out.println(al);
	}

}
