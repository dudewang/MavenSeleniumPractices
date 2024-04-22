package testNGTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.MainClass;

public class InvocationCountTesting{
	
	WebDriver driver = null;
	
	@Test( invocationCount=3, threadPoolSize=2)
	public void doLogin1()
	{
		
		driver = MainClass.getDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());

		driver.quit();

	}

}
