package seleniumTestcases;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathVsCssSelectorPractice1 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class)
				.withMessage("Timeout error as condition is not met").pollingEvery(Duration.ofSeconds(2));
		
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		
		/*if(driver.findElements(By.xpath("(//input[@type='submit' and @class='button' and @value='Submit'])[2]")).size() > 0)
		{
			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("(//input[@type='submit' and @class='button' and @value='Submit'])[2]"))).click();//Array based xpath
		}
		else
		{
			throw new NoSuchElementException();
		}*/
		
		if(driver.findElements(By.xpath("//div[@id='load_box']//form[@id='load_form']//div[@class='bottom row']//div//input[@type='submit']")).size() > 0)
		{
			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//div[@id='load_box']//form[@id='load_form']//div[@class='bottom row']//div//input[@type='submit']"))).click();//Parent to child Xpath
		}
		else
		{
			throw new NoSuchElementException();
		}
	


	}

}
