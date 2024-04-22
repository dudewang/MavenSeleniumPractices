package seleniumTestcases;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowserTesting {

	public static void main(String[] args) {


		//System.setProperty("webdriver.edge.driver", "C:\\Dushyant\\SELENIUM MATERIALS\\drivers_Jars\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://way2automation.com");
		
		//to get current URL
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		if(driver.getPageSource().contains("title"))
		{
			System.out.println("Title is present");
		}
		else
		{
			System.out.println("Not present");
		}
		

	}

}
