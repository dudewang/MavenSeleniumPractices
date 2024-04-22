package seleniumTestcases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingLink {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org");
		
		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(listOfLinks.size());
		
		Iterator<WebElement> iter = listOfLinks.iterator();
		
		while(iter.hasNext())
		{
			WebElement ele = iter.next();
			System.out.println(ele.getText() +" URL-> " + ele.getAttribute("href"));
		}
		

	}

}
