package testNGTestcases;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedTCAtRuntime {
	
	@Test(priority=1)
	public void doLogin()
	{
		String actual = "abc";
		String expected = actual;
		assertEquals(actual, expected);
	}
	
	@Test(priority=2)
	public void validateTitle()
	{
		Assert.fail("Expected result is not met");
	}

}
