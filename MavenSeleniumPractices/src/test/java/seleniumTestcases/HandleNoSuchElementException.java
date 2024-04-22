package seleniumTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleNoSuchElementException {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();	
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://learn.letskodeit.com");	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		
		// 1. Wait issues - to resolve use implicit or explicit wait
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		driver.findElement(By.id("email")).sendKeys("learnKodeit");
		
		// 2. Incorrect locator - to resolve relocate the same element		
		driver.findElement(By.name("commit")).click();
		
		driver.quit();
		
		
		
		

	}

}
