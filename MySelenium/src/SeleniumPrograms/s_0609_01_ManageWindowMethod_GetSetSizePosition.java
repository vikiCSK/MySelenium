package SeleniumPrograms;

import java.util.Set;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_0609_01_ManageWindowMethod_GetSetSizePosition {

	public static void main(String[] args) throws Throwable {
		// inisiate the browser specific class
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		// iterate one window at a time
		Set<String> allWindowIds = driver.getWindowHandles();
		for (String wid : allWindowIds) {
			String windowurl = driver.switchTo().window(wid).getCurrentUrl();
			if (windowurl.equals("https://www.facebook.com/")) {
				driver.close(); // Close Parent Window
			} else if (windowurl.equals("https://www.amazon.com/")) {

				Dimension amazonsize = driver.manage().window().getSize();
				int amazonwidth = amazonsize.getWidth();
				System.out.println("amazon width => " + amazonwidth);
				int amazonheight = amazonsize.getHeight();
				System.out.println("amazon height => " + amazonheight);
				Thread.sleep(2000);

				// Capture Positon of the Amazon of the browser
				Point amazonposition = driver.manage().window().getPosition();
				int amazonstartx = amazonposition.getX();
				System.out.println("amazonstart x => " + amazonstartx);
				int amazonstarty = amazonposition.getY();
				System.out.println("amazonstart Y => " + amazonstarty);
				Thread.sleep(2000);

				// define the size of the amazon window
				Dimension newamazonsize = new Dimension(200, 200);
				driver.manage().window().setSize(newamazonsize);
				Thread.sleep(2000);

				// define the new position of the amazon window
				Point newamazonposition = new Point(300, 200);
				driver.manage().window().setPosition(newamazonposition);
			}
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}