package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		WebDriver D=new FirefoxDriver();
		D.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		//click on confirmation alert button to view the pop-up window
		D.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		
		//To display the text present on the pop-up window
		System.out.println(D.switchTo().alert().getText());
		
		//Switch control from driver(D) to alert for inspecting.
		D.switchTo().alert().accept();//Accept method is used to create a positive scenario(YES, OK, DONE)
		
		//D.switchTo().alert().dismiss(); //Dismiss is a method to click cancel buttons on the alert window
		
	}

}
