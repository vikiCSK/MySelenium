package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0603_01_ManageWindowMethod_GetSizePosition {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		System.out.println("Fullscreen Window Position is --> " + driver.manage().window().getPosition());
		System.out.println("Fullscreen Window Size is --> " + driver.manage().window().getSize());
		// Window Position is --> (0, 0) & Window Size is --> (1536, 864)
		Thread.sleep(2000);
		driver.manage().window().minimize();
		System.out.println("Minimize Window Position is --> " + driver.manage().window().getPosition());
		System.out.println("Minimize Window Size is --> " + driver.manage().window().getSize());
		// Window Position is --> (9, 9) & Window Size is --> (1051, 806)
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println("Maximize Window Position is --> " + driver.manage().window().getPosition());
		System.out.println("Maximize Window Size is --> " + driver.manage().window().getSize());
		// Window Position is --> (-8, -8) & Window Size is --> (1552, 840)
		driver.close();
		System.out.println("All Executed");
		
	}
}
