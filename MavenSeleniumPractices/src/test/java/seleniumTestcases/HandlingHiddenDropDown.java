package seleniumTestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingHiddenDropDown {


	@Test
	public static void handlingHiddenObjects() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		/*
		if(driver.findElement(By.name("q")).isDisplayed())
		{
			driver.findElement(By.name("q")).sendKeys("shoes");
			
		}*/
		
		if(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		}
		
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("shoes for men");
		
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='Y5N33s']"));	
		
		for(WebElement l : list)
		{
			if(l.getText().contains("shoes for men"))
			{
				l.click();
				break;
			}
		}
		
		
		System.out.println(driver.getTitle());
	}

}
