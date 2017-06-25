package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepo.RediffHomepage;
import objectRepo.RediffLoginpage;

public class LoginApplication {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fluffyy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage R = new RediffLoginpage(driver);
		R.Emailid().sendKeys("Hello@yahoo.com");
		R.Paswrd().sendKeys("1234");
		R.submit().click();
		R.Home().click();
		RediffHomepage H = new RediffHomepage(driver);
		H.search().sendKeys("Home appliances");
	}
	

}
