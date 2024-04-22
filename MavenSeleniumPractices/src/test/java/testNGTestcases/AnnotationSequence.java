package testNGTestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class AnnotationSequence extends BaseClass{
	
	@BeforeClass
	public void openClassAnnotation()
	{
		System.out.println("Opening Class Annotation--Before Class");
	}
	
	@AfterClass
	public void closeClassAnnotation()
	{
		System.out.println("Closing Class Annotation--After Class");
	}
	
	@BeforeTest
	public void openDBConnection()
	{
		System.out.println("Opening DB Connection--Before Test");
	}
	
	@AfterTest
	public void closeDBConnection()
	{
		System.out.println("Closing DB Connection--After Test");
	}
	
	@BeforeGroups(value="Regression")
	public void beforeGroupsAnnotation()
	{
		System.out.println("Opening DB Connection--Before Groups");
	}
	
	@AfterGroups(value="Regression")
	public void afterGroupsAnnotation()
	{
		System.out.println("Closing DB Connection--After Groups");
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Launching browser--Before Method");
	}
	
	@AfterMethod
	public void tearDownBrowser()
	{
		System.out.println("Closing browser--After Method");
	}

	@Test(priority=1, enabled=true, groups="Regression")
	public void doLogin()
	{
		System.out.println("Executing login testcase");
	}
	
	@Test(priority=0, groups="Regression")
	public void doUserRegister()
	{
		System.out.println("Executing user registration testcase");
	}
	
	@Test(priority=-1)
	public void GoToDashboard()
	{
		System.out.println("Executing Dashboard testcase");
	}

}
