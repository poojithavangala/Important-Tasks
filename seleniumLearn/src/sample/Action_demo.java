package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fluffyy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		Actions a = new Actions(d); // Actions class a will invoke all the driver "d" features to perform tasks
		WebElement move = d.findElement(By.xpath("//a[@id='nav-link-shopall']"));
		a.moveToElement(move).build().perform();//a object uses build to build the whole action to be performed
		//& to execute the action perform() method is used
		a.moveToElement(d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		
	}

}
