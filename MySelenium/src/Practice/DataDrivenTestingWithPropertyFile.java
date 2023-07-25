package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class DataDrivenTestingWithPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("./data/Data.property");
//create an object of properties class
		Properties p = new Properties();
//load the file
		p.load(f);
//get the data(value) by using key
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);

	}

}
