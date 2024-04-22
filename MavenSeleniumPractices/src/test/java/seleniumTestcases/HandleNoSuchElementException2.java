package seleniumTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleNoSuchElementException2 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://courses.letskodeit.com/practice");	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		// 3.Element is in frame
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.xpath("//input[@placeholder='Search Course']")).sendKeys("abc");
		driver.switchTo().defaultContent();
		
		
	}

}
