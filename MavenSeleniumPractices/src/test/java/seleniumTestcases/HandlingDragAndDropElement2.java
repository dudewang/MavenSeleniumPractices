package seleniumTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDragAndDropElement2 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		WebElement draggableElement = driver.findElement(By.id("draggable"));
		
		WebElement droppableElement = driver.findElement(By.id("droppable"));
		
		//new Actions(driver).dragAndDrop(draggableElement, droppableElement).perform();
		new Actions(driver).dragAndDrop(draggableElement, droppableElement).perform();
		
		
		//to drop outside somewhere
		//new Actions(driver).dragAndDropBy(draggableElement, 400, 400).perform();
	

	}

}
