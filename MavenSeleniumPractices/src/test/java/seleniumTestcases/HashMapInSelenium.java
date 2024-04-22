package seleniumTestcases;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapInSelenium {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys(getUsername("admin"));
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(getPassword("admin"));
			

	}
	
	public static HashMap<String, String> getCredentials()
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("admin", "admin:admin@123");
		hm.put("daredevil", "daredevil123:daredevil@123");
		
		//duplicate Key is not allowed in HashMap
		hm.put("daredevil", "daredevil123:@daredevil@123");
		
		return hm;
	}
	
	public static String getUsername(String role)
	{
		String userName = getCredentials().get(role);
		
		return userName.split(":")[0];
	}
	
	public static String getPassword(String role)
	{
		String pass = getCredentials().get(role);
		return pass.split(":")[1];
	}

}
