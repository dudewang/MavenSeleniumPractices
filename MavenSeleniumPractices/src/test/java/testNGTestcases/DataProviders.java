package testNGTestcases;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	public Object[][] data=null;
	
	@DataProvider(name="dp1")
	public Object[][] getData(Method m)
	{
		
		if(m.getName().equalsIgnoreCase("testLogin"))
		{
			//Set the size of the array as per parameters passed in respective method
			data = new Object[2][2];
			
			data[0][0] = "ddewangan@test.com";
			data[0][1] = "123qwe";
			
			data[1][0] = "abc@test.com";
			data[1][1] = "abc123qwe";
		}
		
		else if(m.getName().equalsIgnoreCase("testUserReg"))
		{
			
			//Set the size of the array as per parameters passed in respective method
			data = new Object[2][3];
			
			data[0][0] = "ddewangan";
			data[0][1] = "123qwe";
			data[0][2] = "ddewangan@test.com";

			data[1][0] = "abc";
			data[1][1] = "abc123qwe";
			data[1][2] = "abc@test.com";
			
		}
		
		return data;
		
	}

	/*public Object[][] data = null;

	@DataProvider(name = "dp1")
	public Object[][] dataProvider1(Method m) {

		if (m.getName().equals("testLogin")) {
			data = new Object[2][2];

			data[0][0] = "ddewangan@test.com";
			data[0][1] = "123qwe";

			data[1][0] = "abc@test.com";
			data[1][1] = "abc123qwe";

		}

		else if (m.getName().equals("testUserReg")) {
			data = new Object[2][3];
			
			data[0][0] = "ddewangan";
			data[0][1] = "123qwe";
			data[0][2] = "ddewangan@test.com";

			data[1][0] = "abc";
			data[1][1] = "abc123qwe";
			data[1][2] = "abc@test.com";

		}

		return data;*/

	}

	/*
	 * @DataProvider public static Object[][] dataProvider2() { Object[][] data =
	 * new Object[2][2];
	 * 
	 * data[0][0] = "ddewangan@test.com"; data[0][1] = "123qwe";
	 * 
	 * data[1][0] = "abc@test.com"; data[1][1] = "abc123qwe";
	 * 
	 * data[2][0] = "xyz@test.com"; data[2][1] = "xyz123qwe";
	 * 
	 * return data;
	 * 
	 * }
	 */

