package SeleniumPrograms;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0606_01_SwithTo_GetWindowHandles {
	public static <string> void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.nationalgeographic.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		driver.get("https://karnatakatourism.org/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> allWindowId = driver.getWindowHandles();
		for (String wid : allWindowId) {
			System.out.println(wid);
		}
		int countOfWindowId = allWindowId.size();
		System.out.println("countOfWindowIds => " + countOfWindowId);
		// To Get Current Window
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
