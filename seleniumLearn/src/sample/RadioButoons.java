package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButoons {

	public static void main(String[] args) throws InterruptedException {
		//FirefoxDriver F = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fluffyy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver F = new ChromeDriver();
		Thread.sleep(5000);
		F.get("http://echoecho.com/htmlforms10.htm");
		//Thread.sleep(5000);
		int count = F.findElements(By.xpath("//input[@name='group1']")).size();
		Thread.sleep(5000);
			for (int i = 0;i<count;i++){
				//F.findElements(By.xpath("//input[@name='group1']")).get(1).click();
				String text=F.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
				if(text.equals("Cheese"))
				{
					F.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				}
					
			}
			
	}

}
