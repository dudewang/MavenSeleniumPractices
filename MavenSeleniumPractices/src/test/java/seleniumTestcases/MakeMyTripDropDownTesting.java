package seleniumTestcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripDropDownTesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		//opt.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "disable-notifications", "enable-automation"));
		
		List<String> list = new ArrayList<String>();
		list.add("enable-automation");
		opt.setExperimentalOption("excludeSwitches", list);
		
		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();
		
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class).withMessage("Timeout error as the condition is not met");
		
		Thread.sleep(3000);
		
		if(driver.findElements(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).size() > 0)
		{
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")))).click();
		}
		else
		{

		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement fromCitySearch = driver.findElement(By.xpath("//input[@id='fromCity']"));
		
		wait.until(ExpectedConditions.visibilityOf(fromCitySearch)).sendKeys("Bilaspur, India");
		
		List<WebElement> listOptions = driver.findElements(By.xpath("//li[@role='option']"));
		
		for(int i=0; i<driver.findElements(By.xpath("//li[@role='option']")).size(); i++)
		{
			if(listOptions.get(i).getText().contains("Bilaspur"))
			{
				listOptions.get(i).click();
				break;
			}
		}
		
		WebElement toCitySearch = driver.findElement(By.xpath("//input[@id='toCity']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(toCitySearch)).sendKeys("Pune, India");
		
		List<WebElement> listOptions1 = driver.findElements(By.xpath("//li[@role='option']"));
		
		for(int i=0; i<driver.findElements(By.xpath("//li[@role='option']")).size(); i++)
		{
			if(listOptions1.get(i).getText().contains("Pune"))
			{
				listOptions1.get(i).click();
				break;
			}
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()='Search']")));
		}
		
		driver.quit();
		
		//driver.findElement(By.xpath("//a[text()='Search']")).click();

		/*driver.switchTo().defaultContent();

		driver.findElement(By.id("fromCity")).click();

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune,India");

		List<WebElement> fromList = driver.findElements(By.xpath("//li[@role='option']//div[@class='calc60']"));

		int i = 0;
		while (i < fromList.size()) {
			if (fromList.get(i).getText().contains("Pune")) {
				fromList.get(i).click();
				break;
			}
			i++;
		}

		WebElement e = driver.findElement(By.id("toCity"));

		// Resolving the ElementClickInterceptedException using JavascriptExecutor
		// interface
		JavascriptExecutor jexecutor = (JavascriptExecutor) driver;

		jexecutor.executeScript("arguments[0].click();", e);

		WebElement toCity = driver.findElement(By.xpath("//input[@placeholder='To']"));
		toCity.sendKeys("Raipur,India");

		List<WebElement> toList = driver.findElements(By.xpath("//li[@role='option']//div[@class='calc60']"));

		int j = 0;
		while (j < toList.size()) {
			if (toList.get(j).getText().contains("Raipur")) {
				toList.get(j).click();
				break;
			}
			i++;
		}

		WebElement searchBtn = driver.findElement(By.xpath("//a[text()='Search']"));

		jexecutor.executeScript("arguments[0].click();", searchBtn);

		driver.quit();*/

	}

}
