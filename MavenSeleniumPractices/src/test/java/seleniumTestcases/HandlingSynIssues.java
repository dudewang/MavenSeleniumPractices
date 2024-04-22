package seleniumTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSynIssues {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit wait
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//Fluent wait
		 /*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .withMessage("Time out as the condition is not met")
			       .ignoring(NoSuchElementException.class);*/

		//driver.manage().window().minimize();
		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("trainer@way2automation.com");
		//driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();						
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("asdfsf");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("sadfdf");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
		
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='OyEIQ uSvLId']"));
		//WebElement ele1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='OyEIQ uSvLId']"))));
		
		System.out.println(ele1.getText());
	}

}
