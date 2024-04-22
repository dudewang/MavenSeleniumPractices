package seleniumTestcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingGoogleSVG {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		//opt.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "disable-notifications", "enable-automation"));
		
		List<String> list = new ArrayList<String>();
		list.add("enable-automation");
		opt.setExperimentalOption("excludeSwitches", list);
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		//WebElement svgElement = driver.findElement(By.xpath(("(//*[local-name()='svg'])[4]")));
		
		//WebElement svgElement = driver.findElement(By.xpath("(//*[local-name()='svg'])[4]"));
		
		WebElement svgElement = driver.findElements(By.xpath("//*[local-name()='svg']")).get(3);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(svgElement).click().perform();
		
		
		

	}

}
