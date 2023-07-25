package MyPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingRightClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	WebElement target = driver.findElement(By.linkText("actiTimeInc."));
	Actions a = new Actions(driver);
	a.contextClick(target).perform();
	Thread.sleep(3000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_W);
	driver.quit();
}

}
