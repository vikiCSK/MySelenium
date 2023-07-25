package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyRediff {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.findElement(By.xpath("//a[contains(.,'Tata Teleservices (M')]")).click();
	}
	public void getExcelData(String Name,int row,int cell) {
		
	}
}
	
