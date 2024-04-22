package seleniumTestcases;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTesting {

	public static void main(String[] args) {


		System.setProperty("webdriver.ie.driver", "E:\\My Data\\Selenium Required tools\\drivers_Jars\\IEDriverServer.exe");
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://way2automation.com");

	}

}
