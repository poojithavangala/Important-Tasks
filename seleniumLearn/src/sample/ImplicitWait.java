package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver Wait = new FirefoxDriver();
		Wait.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Wait.get("https://www.southwest.com/flight/search-flight.html?int=");
		Wait.findElement(By.xpath(".//*[@id='originAirport_displayed']")).sendKeys("CAK");
		Wait.findElement(By.xpath(".//*[@id='destinationAirport_displayed']")).sendKeys("AUS");
		Wait.findElement(By.xpath(".//*[@id='submitButton']")).click();
		
		//Implicit wait is declared globally and is applicable to whole script
		Wait.findElement(By.xpath(".//*[@id='modifySearchTitleText']/button")).click();

	}

}
