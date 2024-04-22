package seleniumTestcases;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers{

	public static void main(String[] args) {

		/*
		 * No need to add browser executable files as there is one abstract class called "WebDriverManager" which is having static methods
		 * so no need to set the path of executable files as well
		 * 
		 */
		

		//System.setProperty("webdriver.chrome.driver", "C:\\SIMS_PRI\\SIMS_Primary_Automation\\src\\test\\resources\\Drivers\\chromedriver.exe");
		
		
		/*WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://way2automation.com");*/
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com");
		
		/*WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://way2automation.com");*/
		
		/*WebDriverManager.iedriver().setup();
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://way2automation.com");*/

	}

}
