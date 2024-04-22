package seleniumTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseOver {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
		
		wait.until(ExpectedConditions.visibilityOf(searchBox)).sendKeys("way2automation");
		
		WebElement searchBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]"));
		
		wait.until(ExpectedConditions.visibilityOf(searchBtn)).click();
		
		driver.findElement(By.xpath("//h3[text()='Way2Automation']")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"elementor-popup-modal-26600\"]/div/div[4]/i")).click();
		
		WebElement resources = driver.findElement(By.xpath("//*[@id=\"menu-item-25091\"]/a/span[2]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(resources).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-25092\"]/a/span[2]")).click();
		
		
		
		

	}

}
