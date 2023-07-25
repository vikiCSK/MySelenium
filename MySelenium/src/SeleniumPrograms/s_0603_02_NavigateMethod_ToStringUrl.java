package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0603_02_NavigateMethod_ToStringUrl {
	public static void main(String[] args) {
		// instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// pass the main url of the application
		driver.get("https://www.dassault-aviation.com/en/");
		System.out.println(driver.getTitle());
		// pass the group page sub url
		driver.navigate().to("https://www.dassault-aviation.com/en/group/");
		System.out.println(driver.getTitle());
		// pass the defence page sub url
		driver.navigate().to("https://www.dassault-aviation.com/en/defense/");
		System.out.println(driver.getTitle());
		// pass the civil page sub url
		driver.navigate().to("https://www.dassault-aviation.com/en/civil/");
		System.out.println(driver.getTitle());
		// pass the space page sub url
		driver.navigate().to("https://www.dassault-aviation.com/en/space/");
		System.out.println(driver.getTitle());
		// pass the passion page sub url
		driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
		System.out.println(driver.getTitle());
		driver.manage().window().minimize();
		driver.quit();
	}

}