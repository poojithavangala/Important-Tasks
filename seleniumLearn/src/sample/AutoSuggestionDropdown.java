package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionDropdown {
//Using explicit wait we can write test scripts for auto suggesting drop downs
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fluffyy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/gp/site-directory/ref=nav_shopall_btn");
		WebDriverWait wd= new WebDriverWait(driver,5);//wait maximum time of 5seconds..when object appears early continues with the execution of the script
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Women");
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='twotabsearchtextbox']")));
		

	}

}
