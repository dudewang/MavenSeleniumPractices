package seleniumTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathVsCssSelectorPractice3 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.cssSelector("textarea[id='APjFqb']")).sendKeys("abc");
		
		//driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("abc");
		
		//driver.findElement(By.cssSelector("textarea#APjFqb.gLFyf")).sendKeys("abc");
		
		//driver.findElement(By.cssSelector("textarea#APjFqb.gLFyf[name='q']")).sendKeys("abc");

		//driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("abc");
		
		//driver.findElement(By.cssSelector(".gLFyf")).sendKeys("abc");
		
		//driver.findElement(By.cssSelector("textarea[class='gLFyf'][id='APjFqb']")).sendKeys("abc");
		
		//driver.findElement(By.cssSelector("textarea[class^='gLF']")).sendKeys("abc"); //^ means starts-with in Css Selector
		
		//driver.findElement(By.cssSelector("textarea[class$='Fyf']")).sendKeys("abc"); //$ means ends-with in Css Selector
		
		//driver.findElement(By.cssSelector("textarea[class*='LFy']")).sendKeys("abc"); //* means contains in Css Selector
	}

}
