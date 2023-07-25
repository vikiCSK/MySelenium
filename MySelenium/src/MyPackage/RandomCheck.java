package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomCheck {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//pass the url
		driver.get("https://shop-global.malaicha.com/");
	//driver.findElement(By.id("my-acc-btn")).click();
//		driver.findElement(By.className("transparent")).click();
//		driver.findElement(By.tagName("button")).click();
//		driver.findElement(By.cssSelector("button[id='my-acc-btn']")).click();
//		driver.findElement(By.cssSelector("button[class='transparent']")).click();
//		driver.findElement(By.xpath("//button[@class='transparent']")).click();
//		driver.findElement(By.xpath("//button[@id='my-acc-btn']")).click();
//		WebElement loginbutton=driver.findElement(By.xpath("//button[contains(@class,'transparent')]"));
//		loginbutton.click();
	//driver.findElement(By.xpath("//button[contains(@id,'my-acc-btn')]")).click();
//		driver.findElement(By.xpath("//button[.='Login &nbsp;|&nbsp; Register;']")).click();
//		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
//		driver.findElement(By.xpath("//button[contains(.,'Register')]")).click();
//		driver.findElement(By.xpath("//button[contains(.,'Register')]")).click();
//		driver.findElement(By.xpath("//span[@class='loginRegister']")).click();
		driver.findElement(By.xpath("//span[@class='loginRegister']/parent::button")).click();


	}

}
