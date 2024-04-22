package seleniumTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathVsCssSelectorPractice2 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//*[contains(text(), 'ENTER TO THE TESTING WEBSITE')])[2]")).click();
		
		//driver.findElement(By.xpath("//*[contains(text(),'Signin')]")).click();
		
		//driver.findElement(By.xpath("//*[text()='Signin']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Signin']")).click();

	}

}
