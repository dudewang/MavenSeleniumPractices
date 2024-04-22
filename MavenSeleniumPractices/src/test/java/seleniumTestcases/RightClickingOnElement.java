package seleniumTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickingOnElement {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement image = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
		
		Actions act = new Actions(driver);
		//right clicking on image
		act.contextClick(image).perform();

		WebElement productInfo = driver.findElement(By.id("dm2m1i1tdT"));
		
		act.moveToElement(productInfo).perform();
		
		WebElement installation = driver.findElement(By.id("dm2m2i1tdT"));
		
		act.moveToElement(installation).perform();
		
		driver.findElement(By.id("dm2m3i0tdT")).click();

	}

}
