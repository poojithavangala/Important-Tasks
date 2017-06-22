package testNGFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeMethod //type of testNG annotation executed before any other test case execution
	public void Login()
	{
		System.out.println("Login is successful");
	}
	@Test(enabled=false)//using this TestNG annotation we stop/pause the test case
	public void Deposit()
	{
		System.out.println("Deposit is successful");
	}
	@Test(priority=2)// Using this annotation we set the priority to the test case to be executed
	public void WithDraw()
	{
		System.out.println("WithDraw is successful");	
	}
	@AfterMethod//type of testNG annotation executed after all other test case execution
	public void Logout()
	{
		System.out.println("Logout is successful");	
	}
}
