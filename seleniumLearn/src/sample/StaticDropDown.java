package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fluffyy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://www.spicejet.com/");
		//When you find <select> tag in the static drop down HTML page then go with this method of selection.
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		Thread.sleep(5000);
		s.selectByValue("4");
		Thread.sleep(5000);
		s.selectByIndex(0);
		Thread.sleep(5000);
		s.selectByVisibleText("3 Adults");
		Thread.sleep(5000);;
		//Dynamic dropdown
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[4]/li[3]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[1]/li[4]/a)[2]")).click();
		//CheckBoxes
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		driver.close();
	}
 
}
