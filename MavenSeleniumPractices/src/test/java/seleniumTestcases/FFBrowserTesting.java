package seleniumTestcases;

import org.openqa.selenium.firefox.FirefoxDriver;


public class FFBrowserTesting {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "E:\\My Data\\Selenium Required tools\\drivers_Jars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://way2automation.com");

	}

}
