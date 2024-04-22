package seleniumTestcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HitURL {
	
	static HttpURLConnection connection;

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.password_manager_enabled", false);
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", new String[]{ "enable-automation" });
		opt.setExperimentalOption("prefs", prefs);

		WebDriver driver =new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("https://makemysushi.com");
		
		driver.navigate().to("https://www.google.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Make my Sushi']"));
		
		try
		{
		
		connection = (HttpURLConnection) new URL(element.getAttribute("href")).openConnection();
		
		connection.connect();
		
		String msg = connection.getResponseMessage();
		
		System.out.println(element.getAttribute("href") + " -> "+ msg);
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			connection.disconnect();
		}


	}

}
