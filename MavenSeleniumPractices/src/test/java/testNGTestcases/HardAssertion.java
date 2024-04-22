package testNGTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class HardAssertion extends BaseClass{
	
	@Test
	public void validateTestcase()
	{
		String expected = "gmail.com";
		String actual = "yahoo.com";
		
		//Assert.assertEquals(actual, expected);
		Assert.assertEquals(actual, expected, "Both should be same");
		
		System.out.println("Page title is verified");
		//Assert.assertFalse(false);
		
		System.out.println("Validation message is verified");
		//Assert.assertTrue(true, "Both should be same");
		
		System.out.println("Submit button is verified");
		//Forcefully failing the condition
		//Assert.fail("Failing the test case as both are not same");
		
		//Message is shown only in case of condition is false
		//Assert.assertTrue(false, "Condition is not met");
		
		//Message is shown only in case of condition is true
		//Assert.assertFalse(true, "Condition is not met");

		
	
	}

}
