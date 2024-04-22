package seleniumTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindingUniqueElement {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org");

		/*WebElement uniqueElement = driver.findElement(By.xpath("//div[@class='other-project']"));
		
		uniqueElement.findElements(By.xpath("//div[@class='other-project']")).get(2).click();*/
		
		driver.findElements(By.xpath("//div[@class='other-project']")).get(1).click();
		
		
		
	}

}
