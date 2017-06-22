package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyNewScript {

	public static void main(String[] args) throws InterruptedException {
	//WebDriver c = new FirefoxDriver();
	//Thread.sleep(5000);				
	
	    //Thread.sleep(5000);  
	    //m.close();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fluffyy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver c = new ChromeDriver();
		c.get("https://www.facebook.com/");
		Thread.sleep(5000);
		c.findElement(By.id("email")).sendKeys("poojitha.vnr93@gmail.com");
		Thread.sleep(5000);
		c.findElement(By.id("pass")).sendKeys("Kamala200293");
		Thread.sleep(5000);
		c.findElement(By.id("u_0_q")).click();
		//Thread.sleep(5000);
		//c.findElement(By.id("pass")).sendKeys("Kamala200293");
		//Thread.sleep(5000);
		//c.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		Thread.sleep(5000);
		c.close();
	}

}
