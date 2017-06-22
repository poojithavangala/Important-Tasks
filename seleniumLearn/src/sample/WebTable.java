package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fluffyy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver W = new ChromeDriver();
		W.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = W.findElement(By.id("customers")); //Locating table element in the web page

		//Fining rows in table
		List<WebElement> eachrow = table.findElements(By.tagName("tr"));
		System.out.println("Number of rows : " + eachrow.size());
		
		//Find number of columns present in each row
		
	}

}
