package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fluffyy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver c = new ChromeDriver();
		c.get("http://jqueryui.com/droppable/");
		System.out.println(c.findElement(By.tagName("iframe")).getSize());
		c.switchTo().frame(c.findElement(By.className("demo-frame")));//To switch from driver to frames
		c.findElement(By.id("draggable")).click();
		 // tells us how many frames are present in the entire we page
		//for drag and drop of element then actions class should be used.
		Actions A = new Actions(c);
		WebElement source = c.findElement(By.id("draggable"));
		WebElement target = c.findElement(By.id("droppable"));
	 A.dragAndDrop(source, target).build().perform();
	 c.switchTo().defaultContent(); // to switch back to the HTML elements from frames
	
	}

}
