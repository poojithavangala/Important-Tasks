package stepDefinitionFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AttitudeTest {
	
	@Given("I work in ([^\"]*)")
	public void ln(String str)//regular expression argument will come and fall into the method ln(String str)
	
	{
		if(str.equals("Latenights"))
		{
			System.out.println("Latenight automation");
		}
		
		if(str.equals("Mornings"))
		{
			System.out.println("Execute another automation test case");
		}
	}
	
	@When("^I meet ([^\"]*)$")
	public void Imeet(String str)
	{
		if(str.equals("watchmen"))
		{
			System.out.println("RUN this test case under this test case ");
		}
		if(str.equals("NewspaperBoy"))
		{
			System.out.println("Run this test case");
		}
	}
	
	@Then("^I ([^\"]*) him$")
	public void  Greet(String str)
	{
		if (str.equals("Greeted"))
		{
			System.out.println("Greeted");
		}
		
		if(str.equals("skipGreeting"))
		{
			System.out.println("Skipped it");
		}
	}
	
	@Given("we work in \"([^\"]*)\"$")
	public void we_work_in(String arg1) throws Throwable
	{
		System.out.println("Print this parameterized case");
	}
	
	
}
