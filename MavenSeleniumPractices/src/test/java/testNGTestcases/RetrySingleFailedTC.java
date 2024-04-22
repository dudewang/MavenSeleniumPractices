package testNGTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import retryListeners.RetryAnalyzer;

public class RetrySingleFailedTC {
	
	
	@Test(priority=2, retryAnalyzer=RetryAnalyzer.class)
	public void doLogin()
	{
		Assert.fail("Exepected result is not met");
	}
	
	@Test(priority=1)
	public void registerUser()
	{
		Assert.assertTrue(true);
	}

}
