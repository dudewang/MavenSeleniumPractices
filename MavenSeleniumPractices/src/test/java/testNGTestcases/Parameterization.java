package testNGTestcases;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	/*@Parameters({"browser", "env"})
	@Test
	public void launchBrowser(String browser, String env)
	{
		System.out.println(browser+ "  " +env);
	}*/
	
	Date d = new Date();

	@Parameters({"browser", "env"})
	@Test
	public void launchBrowser(String browserName, String environmentName) throws InterruptedException
	{
		System.out.println(browserName + " " + environmentName + " "+d);
		Thread.sleep(5000);
	}
}
