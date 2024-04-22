package seleniumTestcases;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCalendarDynamically {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions opts = new ChromeOptions();
		opts.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });

		WebDriver driver = new ChromeDriver(opts);

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");

		driver.manage().deleteAllCookies();

		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);

		/*
		 * Wait<WebDriver> wait = new
		 * FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).
		 * pollingEvery(Duration.ofSeconds(2)).withMessage("TimeOut error")
		 * .ignoring(StaleElementReferenceException.class);
		 */

		driver.findElement(By.xpath("//div[@class='labelCalendarContainer']//i")).click();

		List<WebElement> list = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		
		int i = 0;
		while (i < list.size()) {
			if (list.get(i).getText()
					.equalsIgnoreCase("28")) {
				
				list.get(i).click();
				break;
			}
			i++;
		}
		
		//driver.quit();

	}
}
