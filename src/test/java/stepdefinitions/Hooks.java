package stepdefinitions;

import Cucumber.Automation.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass {

	
	@Before("@MobileTest")
	public void beforevaldiation()
	{
		System.out.println("Before Mobile  hook");
	}
	
	@After("@MobileTest")
	public void Aftervaldiation()
	{
		System.out.println("  After Mobile before hook");
	}
	
	@After("@SeleniumTest")
	public void AfterSeleniumvaldiation()
	{
		driver.close();
	}
		
		@Before("@WebTest")
		public void beforeWebvaldiation()
		{
			System.out.println("Before Web  hook");
		}
		
		@After("@WebTest")
		public void AfterWebvaldiation()
		{
			System.out.println("  After Web before hook");
		}
	}
