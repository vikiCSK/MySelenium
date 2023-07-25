package SeleniumPrograms;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0603_03_NavigateMethod_ToUrlUrl {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url = "https://www.dassault-aviation.com/en/";
		
		URL mainUrl = new URL(url);
		// build the group page url
		URL groupUrl = new URL(mainUrl, "group/");
		URL defenseUrl = new URL(mainUrl, "defense/");
		URL civilUrl = new URL(mainUrl, "civil/");
		URL spaceUrl = new URL(mainUrl, "space/");
		URL passionUrl = new URL(mainUrl, "passion/");
		// pass the main Url of the application
		driver.get("https://www.dassault-aviation.com/en/");
		System.out.println(driver.getTitle());
		driver.navigate().to(groupUrl);
		System.out.println(driver.getTitle());
		driver.navigate().to(defenseUrl);
		System.out.println(driver.getTitle());
		driver.navigate().to(civilUrl);
		System.out.println(driver.getTitle());
		driver.navigate().to(spaceUrl);
		System.out.println(driver.getTitle());
		driver.navigate().to(passionUrl);
		System.out.println(driver.getTitle());
		driver.manage().window().minimize();
		driver.quit();
	}
}