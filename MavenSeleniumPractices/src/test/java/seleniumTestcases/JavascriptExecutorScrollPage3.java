package seleniumTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorScrollPage3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });

		ChromeDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.navigate().to("https://www.toolsqa.com/selenium-webdriver/page-factory-in-selenium/");
		
		driver.findElement(By.xpath("//a[@href='https://www.toolsqa.com/selenium-webdriver/page-object-model/']//strong[contains(text(),'Page Object Model')]"));

		// JavascriptExecutor js = driver;
		driver.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.quit();
	}
}
