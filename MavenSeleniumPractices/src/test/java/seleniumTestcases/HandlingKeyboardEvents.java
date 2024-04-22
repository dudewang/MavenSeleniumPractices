package seleniumTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingKeyboardEvents {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("identifierId")).sendKeys("dushyantdewangan1988@gmail.com");
		
		//driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("//input[@name='Passwd']")).click();
		
		action.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).build().perform();
		
		
		

	}

}
