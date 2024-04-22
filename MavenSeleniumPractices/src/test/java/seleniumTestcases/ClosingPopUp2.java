package seleniumTestcases;


import java.util.ArrayList;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClosingPopUp2 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<String> winIDs = driver.getWindowHandles();
		
		if(winIDs.size() > 1)
		{
			ArrayList<String> tabs = new ArrayList<String>(winIDs);
			
			/*for(int i=0; i<tabs.size(); i++)
			{
				driver.switchTo().window(tabs.get(i)).close();
			}*/
			
			driver.switchTo().window(tabs.get(1)).close();
			
			driver.switchTo().window(tabs.get(2)).close();
			
			driver.switchTo().window(tabs.get(3)).close();
			
			driver.switchTo().window(tabs.get(0));
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
		
		
	}

}
