package testNGTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.MainClass;

public class CapturingScreenshotOnFailureANDSendingMailOnFinish{

	WebDriver driver;
	
	@Test(priority=1)
	public void doLogin()
	{
		driver = MainClass.getDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("dushyantdewangan1988@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();

	}
	
	@Test(priority=2)
	public void validateTitle()
	{
		//Assert.fail("Expected result is not met");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Sign in - Google Accounts", driver.getTitle());
	}
}
