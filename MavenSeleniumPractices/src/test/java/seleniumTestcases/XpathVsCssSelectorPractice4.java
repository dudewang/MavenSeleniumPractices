package seleniumTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathVsCssSelectorPractice4 {
	
	/*
	 * Disadvantages or Limitations of Css Selector:-
	 * 1. Cannot go to backward direction means it can traverse from Parent to Child but not from Child to Parent
	 * 2. Cannot use text attribute
	 * 
	 * Advantage of Css Selector:-
	 * 1. Bit faster than Xpath
	 */


	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		
		Thread.sleep(3);
		
		//driver.findElement(By.cssSelector("div#load_box > form >div > div:last-child > input[value='Submit']")).click(); //Parent to last-child traverse
		
		/*driver.findElement(By.cssSelector
				("div#load_box > form#load_form > div > div.span_3_of_4 >p:first-child >a[href='https://www.way2automation.com/way2auto_jquery/automation-practice-site.html']"))
		.click(); //Parent to first-child traverse
*/		

		driver.findElement(By.cssSelector
				("div#load_box > form#load_form > div > div.span_3_of_4 >p:first-child >a[href='https://www.way2automation.com/way2auto_jquery/automation-practice-site.html']"))
		.click(); //Parent to first-child traverse
	}

}
