package testNGTestcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataFromDataProvider {
	
	//Note:- No. of parameters should be equal to no. of columns
	
	@Test(dataProvider="getData")
	public void doLogin(String username, String password)
	{
		System.out.println(username+" "+password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "abc@test.com";
		data[0][1] = "abc123";
		
		data[1][0] = "xyz@test.com";
		data[1][1] = "abc12345";
		
		data[2][0] = "123@test.com";
		data[2][1] = "abc1234567"; 
		
		return data;
	}
	
	/*@Test(dataProvider = "getData")
	public void dataProviderMethod(String username, String password)
	{
		System.out.println(username+"--------------"+password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[3][2];
		obj[0][0] = "dushyant";
		obj[0][1] = "dushyant@123";
		
		obj[1][0] = "sanjay";
		obj[1][1] = "sanjay@123";
		
		obj[2][0] = "sandeep";
		obj[2][1] = "sandeep@123";
		
		return obj;*/
		
		
		

}
