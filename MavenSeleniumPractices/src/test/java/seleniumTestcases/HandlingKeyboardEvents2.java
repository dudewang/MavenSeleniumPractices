package seleniumTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingKeyboardEvents2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]")).click();
		
		
		Actions action = new Actions(driver);
		//action.sendKeys(Keys.CONTROL+"a").perform();
		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).build().perform();
		//action.sendKeys(Keys.CONTROL+"c").perform();		
		action.sendKeys(Keys.chord(Keys.CONTROL+"c")).build().perform();
		driver.findElement(By.id("identifierId")).click();
		//action.sendKeys(Keys.CONTROL+"v").perform();
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).build().perform();
		

	}

}
