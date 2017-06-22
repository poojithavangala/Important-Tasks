package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GlobalParameter { //this is a base class where every test case can access this class
	WebDriver driver = null;
	
	@Test
	public void Login() throws IOException
	{
		Properties prop = new Properties(); // properties class can only interpret(work) if it has a .properties file created.
		FileInputStream f =new FileInputStream("C:\\Users\\Fluffyy\\workspace\\TestNGExamples\\src\\dataDriven\\dataDrive.properties"); // This object is created to know the path of the properties file
		prop.load(f); // prop object knows where exactly the file is located
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Password"));
		if(prop.getProperty("browser").equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fluffyy\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("URL"));
	}
}
