package testNGTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ParallelTestingUsingDataProvider {
	
	static WebDriver driver=null;
	
	@Test(dataProvider="getData")
	public void doLogin(String browser)
	{
		

		if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle() + browser);

		
	}
	
	
	@DataProvider(parallel=true)
	public Object[][] getData()
	{
		Object[][] data = new Object[2][1];
		
		data[0][0] = "firefox";
		
		data[1][0] = "chrome";
		
		return data;
	}

}
