package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainClass {
	
	private MainClass() {
		
	}
	
	//Here Singleton Design pattern is used as object has been initialized or created only once and same reference is used across the complete execution
	private static WebDriver driver=null;

	public static WebDriver getDriver()
	{
		String browser="chrome";
		
		if(driver==null)
		{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();

		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
		}
		}
		
		return driver;
		
		
	}
	
	public void tearDown()
	{
		driver.quit();
		driver=null;
	}
	

}
