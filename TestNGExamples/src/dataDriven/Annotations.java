package dataDriven;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations extends GlobalParameter {
	
	
	//Parameterizing with TestNG annotation using DataProvider
	@Test(dataProvider="getData")
	public void UseridGeneration(String username,String paswrd)
	{
		System.out.println("This block executes before each method is executed");
		System.out.println(username);
		System.out.println(paswrd);
		
	}
	
	@BeforeTest
	public void Cookies()
	{
		System.out.println("This block executes before all test cases");
	
	}
	
	@AfterTest
	public void Cookiesclose()
	{
		System.out.println("This methos executes after all test cases are executed");
		
	}

	@Test
	public void OpeningBrowser() throws IOException
	{
		Login();
		System.out.println("Browser opened");
	}
	
	@Test
	@Parameters({"Name"})
	public void BookShow(String Name)
	{
		System.out.println(Name);
		System.out.println("Please book your ticket for the show");
	}
	@DataProvider
	public Object[] [] getData()
	{
		// i stands for number of times testcase should run
		//j stands for number of parameters it should send for one go.
		Object[] [] data = new Object[2] [2];
		data[0][0]="Poojitha";
		data[0][1]="1234";
		data[1][0]="vangala";
		data[1][1]="4253";
		
		return data;
		
	}
}
