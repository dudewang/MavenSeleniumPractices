package testNGTestcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.BaseClass;

public class SoftAssertion extends BaseClass{

	@Test
	public void validateTest()
	{
		String expected = "gmail.com";
		String actual = "yahoo.com";
		
		SoftAssert soft = new SoftAssert();
					
		System.out.println("Validating titles");
		soft.assertEquals(actual, expected);
		
		System.out.println("Validating images");
		soft.assertEquals(actual, expected, "Image is not found");
		
		//Assert.assertFalse(false);
		
		System.out.println("Checking both the values");
		soft.assertTrue(false, "Both should be same");
		
		//Assert.fail("Failing the test case as both are not same");
		
		soft.assertAll();
	}
}
