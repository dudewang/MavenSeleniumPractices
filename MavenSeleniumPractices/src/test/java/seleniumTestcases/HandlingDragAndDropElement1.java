package seleniumTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDragAndDropElement1 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement dragableElement = driver.findElement(By.id("draggable"));
		WebElement dropableElement = driver.findElement(By.id("droppable"));
		
		/*Actions act = new Actions(driver);
		act.clickAndHold(dragableElement).release(dropableElement).perform();*/
		
		new Actions(driver).clickAndHold(dragableElement).release(dropableElement).build().perform();
		
		driver.quit();
		
		
		

	}

}
