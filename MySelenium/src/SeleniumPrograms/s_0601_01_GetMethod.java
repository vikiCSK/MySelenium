package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0601_01_GetMethod {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//String title =  driver.getTitle();
		System.out.println("Title is --> " + driver.getTitle());
		System.out.println("Current URL is--> " + driver.getCurrentUrl());
		System.out.println("WindowHandle is--> " + driver.getWindowHandle());
		System.out.println("WindowHandles is--> " + driver.getWindowHandles());
		System.out.println("PageSource is--> " + driver.getPageSource());
		driver.manage().window().minimize();
		driver.quit();
	}
}
