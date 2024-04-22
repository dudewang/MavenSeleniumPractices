package seleniumTestcases;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleElementNotInteractableException {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		driver.manage().window().maximize();
		
		//resolving this by changing the loactor from id to xpath
		//WebElement ele1 = driver.findElement(By.id("persistent"));
		
		WebElement ele1 = driver.findElement(By.xpath("//label[@for='persistent']"));
		ele1.click();
		System.out.println("clicked");
		//driver.close();
		
		/*Point location = ele1.getLocation();
		
		int cordinateX = location.getX();
		int cordinateY = location.getY();
		
		new Actions(driver).moveToElement(ele1, cordinateX, cordinateY).click().build().perform();*/
		
		
		

	}

}
