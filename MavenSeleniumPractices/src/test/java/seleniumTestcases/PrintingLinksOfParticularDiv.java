package seleniumTestcases;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingLinksOfParticularDiv {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org");
		
		/*List<WebElement> listOfLinks = driver.findElements(By.xpath("//div[@class='other-projects']//a"));
		
		System.out.println(listOfLinks.size());
		
		for(WebElement links : listOfLinks)
		{
			System.out.println(links.getText()+ " URL-> "+ links.getAttribute("href"));
		}*/
		
		WebElement division = driver.findElement(By.xpath("//div[@class='other-projects']"));
		
		List<WebElement> listOfLinks = division.findElements(By.tagName("a"));
		
		listOfLinks.stream().forEach(e->System.out.println(e.getText()+" -> " +e.getAttribute("href")));
		
		/*System.out.println(listOfLinks.size());
		
		for(int i=0; i<listOfLinks.size(); i++)
		{
			System.out.println(listOfLinks.get(i).getText()+" URL-> "+listOfLinks.get(i).getAttribute("href"));
		}
*/
		
		/*int i=0;
		
		while(i<listOfLinks.size())
		{
			System.out.println(listOfLinks.get(i).getText()+" URL-> "+listOfLinks.get(i).getAttribute("href"));
			i++;
		}*/
	}

}
