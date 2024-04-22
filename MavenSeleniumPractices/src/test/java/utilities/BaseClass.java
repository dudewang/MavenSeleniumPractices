package utilities;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("Setting up everything !!! - Before Suite");
	}
	
	@AfterSuite
	public void tearDown()
	{
		System.out.println("Tearing down everything !!! - After Suite");
	}

}
