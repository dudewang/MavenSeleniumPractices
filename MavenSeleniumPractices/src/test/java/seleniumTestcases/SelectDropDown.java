package seleniumTestcases;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org");
		
		WebElement element = driver.findElement(By.xpath("//select[id='searchLanguage']"));
		
		Select select = new Select(element);
		select.selectByValue("sk");
		
		List<WebElement> options = select.getOptions();
		
		System.out.println(options.size());
		System.out.println(options.get(0).getText());


		Iterator<WebElement> itr = options.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
		
		/*List<WebElement> listOfOptions = select.getOptions();
		
		System.out.println(listOfOptions.size());
		System.out.println(listOfOptions.get(5).getAttribute("value"));
		System.out.println(listOfOptions.get(5).getAttribute("lang"));
		System.out.println(listOfOptions.get(5).getText());
		
		for(int i=0; i<listOfOptions.size(); i++)
		{
			String lang = listOfOptions.get(i).getAttribute("lang");
			System.out.println(lang);
		}*/
		
		/*List<WebElement> listOfOptions = driver.findElements(By.xpath("//select[@id='searchLanguage']//option"));
		
		System.out.println(listOfOptions.size());
		System.out.println(listOfOptions.get(5).getText());
		System.out.println(listOfOptions.get(5).getAttribute("lang"));
		
		int i=0;
		while(i<listOfOptions.size())
		{
			System.out.println(listOfOptions.get(i).getText());
			i++;
		}*/
		
		/*for( WebElement options : listOfOptions)
		{
			System.out.println(options.getText());
		}*/
		
		
	}

}
