package testNGTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftDependency {
	
	@Test(priority=-1)
	public void doRegister()
	{
		System.out.println("Register the user");
		Assert.fail("Registration is failed due to internal error");
	}
	@Test(priority=0, dependsOnMethods="doRegister", alwaysRun=true)
	public void doLogin()
	{
		System.out.println("Login into the application");
	}
	@Test(priority=1, dependsOnMethods= {"doRegister", "doLogin"})
	public void goDashboard()
	{
		System.out.println("Click on Dashboard");
	}
	
	@Test(priority=1, dependsOnMethods= {"doRegister", "doLogin"}, alwaysRun=true)
	public void goLogout()
	{
		System.out.println("Click on Logout icon");
	}

}
