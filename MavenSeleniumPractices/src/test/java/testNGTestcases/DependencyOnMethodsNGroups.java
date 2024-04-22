package testNGTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class DependencyOnMethodsNGroups extends BaseClass{
	
	@Test(priority=2, groups="smoke")
	public void doLogin()
	{
		System.out.println("Executing login testcase");
		Assert.assertTrue(true);
	}
	
	@Test(priority=1, groups="smoke", enabled = true)
	public void doUserRegister()
	{
		System.out.println("Executing user registration testcase");
		Assert.fail("Not able to register");
	}
	
	@Test(groups="regression", dependsOnMethods= {"doUserRegister", "doLogin"}, alwaysRun=true)
	public void validatingTitle()
	{
		System.out.println("Validating title");
		Assert.assertFalse(false);
	}
	
	@Test(groups="smoke", dependsOnMethods= {"doUserRegister", "doLogin"})
	public void validatingImage()
	{
		System.out.println("Validating Image");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnGroups="smoke", alwaysRun=true)
	public void validatingMessage()
	{
		System.out.println("Validating Validation Message");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnGroups="smoke")
	public void validatingSubmitBtn()
	{
		System.out.println("Validating Submit button");
		Assert.assertTrue(true);
	}

}
