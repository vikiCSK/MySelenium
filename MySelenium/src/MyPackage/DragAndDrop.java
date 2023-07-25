package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement target = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		WebElement srcs = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		WebElement targets = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(src, target).perform();
		a.dragAndDrop(srcs, targets).perform();


	}

}
