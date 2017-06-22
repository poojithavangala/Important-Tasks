package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver W=new FirefoxDriver();
		W.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		W.findElement(By.xpath(".//*[@id='js-switch__option']/div[2]/label")).click();
		//Increasing the size by clicking + symbol
		//int i = 0;
		//while(i<5)
		//{
		//	W.findElement(By.xpath("")).click();
		//i++;
		//}

	}

}
