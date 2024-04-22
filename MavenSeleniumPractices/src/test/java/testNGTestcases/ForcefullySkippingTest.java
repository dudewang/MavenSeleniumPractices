package testNGTestcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class ForcefullySkippingTest {
	
	@Test
	public void skipTest()
	{
		throw new SkipException("Condition is not met");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1 method is run");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2 method is run");
	}

}
