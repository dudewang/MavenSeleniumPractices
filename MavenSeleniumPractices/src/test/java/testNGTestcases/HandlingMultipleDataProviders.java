package testNGTestcases;

import org.testng.annotations.Test;

public class HandlingMultipleDataProviders {
	
	@Test(priority=0, dataProvider="dp1", dataProviderClass=DataProviders.class)
	public void testLogin(String username,String password){
		
		System.out.println(username+"----"+password);	
		
	}
	
	
	@Test(priority=-1, dataProvider="dp1", dataProviderClass=DataProviders.class)
	public void testUserReg(String fName,String lName, String email){
		
		System.out.println(fName+"----"+lName+"----"+email);
		
		
	}

}
