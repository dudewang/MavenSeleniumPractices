package seleniumTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingJavaScriptAlert1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		
		//checking if the alert is correct one
		/* if(alert.getText().contains("Please enter a valid user name"))
		{
			driver.switchTo().alert();
			System.out.println("Correct alert");
			alert.accept();
		}
		
		else
		{
			System.out.println("Wrong alert");
		}*/
		
		//alert.dismiss();
		
		
		
		

	}

}
