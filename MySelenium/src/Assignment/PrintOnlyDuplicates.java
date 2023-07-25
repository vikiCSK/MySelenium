package Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicates {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///D:/Q%20SPIDERS/SELENIUM/DaysDropDown.html");
		WebElement dropdown = driver.findElement(By.id("a"));
		Select select = new Select(dropdown);
		ArrayList<String> al=new ArrayList<String>();
		List<WebElement> allOptions = select.getOptions();
		for(WebElement option:allOptions)
		{
			String value=option.getText();
			al.add(value);
		}	
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
						{
					System.out.println(al.get(i));
						}
			}
		}
	}

	}

