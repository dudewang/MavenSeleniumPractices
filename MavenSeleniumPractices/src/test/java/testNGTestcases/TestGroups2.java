package testNGTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGroups2 {
	
	@Test(groups="smoke", dependsOnGroups = "regression", enabled=false)
	public void test1()
	{
		System.out.println("Test1 method executing");
	}
	@Test(groups = "regression")
	public void test2()
	{
		System.out.println("Test2 method executing");
		Assert.fail("Failing this method");
	}

	@Test(groups = {"regression", "smoke"})
	public void test3()
	{
		System.out.println("Test3 method executing");
	}


}
