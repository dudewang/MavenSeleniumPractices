package seleniumTestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxTesting {

	public static WebDriver driver=null;
	
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		WebElement div = driver.findElement(By.xpath("(//div[@class='display'])[1]"));
		List<WebElement> checkBoxes = div.findElements(By.xpath("(//div[@class='display'])[1]//input"));
		
		checkBoxes.stream().forEach(e->e.click());
		
		/*for(WebElement c : checkBoxes)
		{
			c.click();
		}*/
		
		/*List<WebElement> checkboxes = driver.findElements(By.xpath("//div[4]//input[@name='sports']"));
		
		for(WebElement checkbox : checkboxes)
		{
			checkbox.click();
		}*/
		
		/*List<WebElement> checkboxes = driver.findElements(By.xpath("//div[4]//input[@name='sports']"));
		
		for(int i=1; i<=checkboxes.size();i++)
		{
			//driver.findElement(By.xpath("//div[4]//input["+i+"]")).click();
			
			
		}*/
		
		//List<WebElement> checkboxes = driver.findElements(By.xpath("//div[4]//input[@name='sports']"));

		
		//Checking particular single checkbox
		//driver.findElement(By.xpath("(//input[@value='soccer'])[1]")).click();		
		//driver.findElements(By.xpath("//input[@value='soccer']")).get(0).click();
		
		//Optimized logic
		/*int i=1;
		while(isElementPresent(By.xpath("//div[4]/input[" +i+ "]")))
		{
			driver.findElement(By.xpath("//div[4]/input[" +i+ "]")).click();
			i++;
		}
		System.out.println("Checked");*/
		
		
		/*WebElement block = driver.findElement(By.xpath("//div[4]"));
		
		List<WebElement> checkboxes =  block.findElements(By.name("sports"));
		
		for(WebElement checkbox : checkboxes)
		{
			checkbox.click();
		}*/
		
		/*List<WebElement> noOfCheckboxes = driver.findElements(By.xpath("//div[4]//input[@type='checkbox']"));
		
		for(int i=1; i<noOfCheckboxes.size(); i++)
		{
			driver.findElement(By.xpath("//div[4]//input[" +i+ "]")).click();
		}
		*/
		
		/*List<WebElement> noOfCheckboxes = driver.findElements(By.xpath("//div[4]//input[@type='checkbox']"));
		
		int i = 1;
		
		while(i<=noOfCheckboxes.size())
		{
			driver.findElement(By.xpath("//div[4]//input[" +i+ "]")).click();
			i++;
		}*/
		
}
	
	public static boolean isElementPresent(By by)
	{
		int size = driver.findElements(by).size();
		boolean res = (size > 0) ? true : false ;
		
		return res;
	}
}
