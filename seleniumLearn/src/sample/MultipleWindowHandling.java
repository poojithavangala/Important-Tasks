package sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fluffyy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver c = new ChromeDriver();
		c.get("https://accounts.google.com/SignUp?hl=en-GB");
		c.findElement(By.linkText("Learn more")).click();
		System.out.println(c.getTitle());//Gives the title of the parent window
		//To handle all the windows id's that are controlled by webdriver(if there is more than 1 window)
		
		Set<String> id=c.getWindowHandles();//All the windows are stored as a set of strings in "id" object
		Iterator<String> it=id.iterator();//iterator is a java method that helps in moving from parent window to child window
		String parent_id=it.next();//Here .next(); method is used to move to the parent window 
		String child_id=it.next(); // Here another next method is used to move from parent window to child window in a set.
		c.switchTo().window(child_id); // To switch from parent to child window
		System.out.println(c.getTitle()); // prints the title of child window.
		c.switchTo().window(parent_id); //switching back to parent window
		System.out.println(c.getTitle());
	}

}
