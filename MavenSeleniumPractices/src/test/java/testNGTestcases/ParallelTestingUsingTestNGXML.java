package testNGTestcases;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParallelTestingUsingTestNGXML {
	
	@Parameters({"browser", "env"})
	@Test
	public void doLogin(String browser, String env) throws InterruptedException
	{
		Date d = new Date();
		

			System.out.println(browser + " " + env + "--->"+d);
			Thread.sleep(3000);
		
	}

}
