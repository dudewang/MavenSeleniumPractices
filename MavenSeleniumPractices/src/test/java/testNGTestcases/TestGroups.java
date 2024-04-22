package testNGTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class TestGroups extends BaseClass{
	
	@Test(groups= {"smoke", "regressions"})
	public void test1()
	{
		System.out.println("Executing Test1");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnGroups="regression")
	public void test2()
	{
		System.out.println("Executing Test2");
		Assert.fail("Not able to register");
	}
	
	@Test(groups="regression")
	public void test3()
	{
		System.out.println("Executing Test3");
		Assert.assertFalse(false);
	}
	
	@Test(groups="smoke")
	public void test4()
	{
		System.out.println("Executing Test4");
		Assert.assertTrue(true);
	}
	
	@Test(groups="regression")
	public void test5()
	{
		System.out.println("Executing Test5");
		Assert.assertTrue(true);
	}
	
	@Test(groups="smoke")
	public void test6()
	{
		System.out.println("Executing Test6");
		Assert.assertTrue(true);
	}

}
