package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fluffyy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver C = new ChromeDriver();
		C.get("http://www.ebay.com/");
		//Count of links present in the entire web page
		// Links are always present in <a> tag.
		System.out.println("Number of links in the page: " + C.findElements(By.tagName("a")).size());
		//Count of links in the footer section of the web page
		WebElement footer = C.findElement(By.xpath("//footer[@id='glbfooter']")); // limiting the scope of finding the element to footer section only
		System.out.println(footer.findElements(By.tagName("a")).size()); // gives the number of links in the footer section
		WebElement col = C.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println("Number of links in the sell column of the footer: " + col.findElements(By.tagName("a")).size());
		String Beforeclicking = null;
		for(int i=0;i< col.findElements(By.tagName("a")).size();i++)
		{
			//System.out.println(col.findElements(By.tagName("a")).get(i).getText()); //to print all the link names that are present in that column
			if (col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				 Beforeclicking = C.getTitle();//we should see the title of the ebay webpage
			col.findElements(By.tagName("a")).get(i).click();
			break;
			}	
		}
			String Afterclicking = C.getTitle();//Here we'll see the title of site map page
		
			if(Beforeclicking != Afterclicking)
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
	}

}
