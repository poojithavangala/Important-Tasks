package testNGFramework;

import org.testng.annotations.Test;

public class Test2 {

	@Test(groups={"priority1"})
	public void Openingbrowser()
	{
		System.out.println("The browser is openend");
	}
	
	@Test(dependsOnMethods={"Openingbrowser"},alwaysRun=true) // 2nd argument - even though Openingbrowser() method fails this test case will run
	public void bookingflight()
	{
		System.out.println("Book a flight"); // this method depends on opening the browser...so opening browser should execute first.
	}
}
