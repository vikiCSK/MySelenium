package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodCLasses {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	LoginPages l= new LoginPages(driver);
	l.setuser("admin1", "manager1");
	Thread.sleep(5000);
	l.setuser("admin","manager");
}
}
