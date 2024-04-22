package seleniumTestcases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment4 {
	
	static WebDriver driver = null;
	static String browser = "chrome";

	public static void main(String[] args) {
		
		
		
		if(driver==null)
		{
			if(browser == "chrome")
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if(browser == "ff")
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new ChromeDriver();
			}
			else
			{
				WebDriverManager.edgedriver().setup();
				driver = new ChromeDriver();
			}
			
		}
		
		driver.get("https://www.google.com");
		
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		System.out.println("Width of the window : "+width);
		System.out.println("Height of the window : "+height);
		
		Dimension d = new Dimension(400, 400);
		
		driver.manage().window().setSize(d);
		
		
		if(driver!=null)
		{
			driver.quit();
		}

	}

}
