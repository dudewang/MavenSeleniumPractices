package seleniumTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeBrowserTesting {

	public static String browser = "chrome";
	
	public static WebDriver driver=null;

	public static void main(String[] args) {

		if (browser == "chrome") {
			System.setProperty("webdriver.chrome.driver", "C:\\Dushyant\\SELENIUM MATERIALS\\drivers_Jars\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get("https://way2automation.com");
		} else if (browser == "FF") {
			System.setProperty("webdriver.gecko.driver", "C:\\Dushyant\\SELENIUM MATERIALS\\drivers_Jars\\geckodriver.exe");

			driver = new FirefoxDriver();
			driver.get("https://way2automation.com");
		}


	}
	

}
