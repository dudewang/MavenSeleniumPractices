package seleniumTestcases;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderTesting2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions opts = new ChromeOptions();
		opts.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

		WebDriver driver = new ChromeDriver(opts);

		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2))
				.withMessage("Time Out error").ignoring(NoSuchElementException.class);*/
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		List<WebElement> block = driver.findElements(By.xpath("//div[@class='_1psGvi SLyWEo']"));
		WebElement menu = block.get(0);
		
		new Actions(driver).moveToElement(menu).perform();

		driver.findElement(By.xpath("//a[text()=\"Men's T-Shirts\"]")).click();
		
		WebElement slider = driver.findElement(By.xpath("//div[@class='_12FhcQ']"));
		int width = slider.getSize().width/2;
		
		WebElement sliderTab = driver.findElement(By.xpath("//div[@class='_31Kbhn _28DFQy']"));
		
		new Actions(driver).dragAndDropBy(sliderTab, width, 0).perform();

	}

}
