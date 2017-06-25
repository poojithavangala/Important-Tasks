package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

	WebDriver driver;
	

	public RediffLoginpage(WebDriver driver) {
		this.driver=driver;
	}

	By username = By.id("login1");
	By password = By.id("password");
	By Go = By.name("proceed");
	By home = By.linkText("Home");
	
	public WebElement Emailid()
	{
		return driver.findElement(username);
	}
	public WebElement Paswrd()
	{
		return driver.findElement(password);
	}
	public WebElement submit()
	{
		return driver.findElement(Go);
	}
	public WebElement Home()
	{
		return driver.findElement(home);
	}
	
}
