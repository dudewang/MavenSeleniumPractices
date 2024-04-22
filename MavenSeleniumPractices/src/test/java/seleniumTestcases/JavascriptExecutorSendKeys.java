package seleniumTestcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorSendKeys {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		// Excluding Chrome Extension
		ChromeOptions options = new ChromeOptions();

		// options.setExperimentalOption("excludeSwitches", new String[]
		// {"enable-automation"});
		// options.setExperimentalOption("excludeSwitches",
		// Arrays.asList("enable-automation"));
		// options.setExperimentalOption("excludeSwitches",
		// Collections.singleton("enable-automation"));
		// options.setExperimentalOption("excludeSwitches",
		// Collections.singletonList("enable-automation"));

		List<String> list = new ArrayList<String>();
		list.add("enable-automation");
		list.add("disable-popup-blocking");
		options.setExperimentalOption("excludeSwitches", list);

		/*
		 * options.addArguments("--start-maximized");
		 * options.addArguments("--disable-web-security");
		 * options.addArguments("--no-proxy-server");
		 * 
		 * Map<String,Object> prefs = new HashedMap<String,Object>();
		 * prefs.put("credentials_enable_service", false);
		 * prefs.put("profile.password_manager_enabled", false);
		 * prefs.put("profile.default_content_setting_values.notifications", 2);
		 * options.setExperimentalOption("prefs", prefs);
		 */

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com");

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		WebElement searchBox = driver.findElement(By.name("q"));
		
		executor.executeScript("arguments[0].value='abc'", searchBox);

		//driver.quit();

	}

}
