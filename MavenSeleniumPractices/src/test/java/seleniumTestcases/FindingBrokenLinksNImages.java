package seleniumTestcases;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.BaseClass;

public class FindingBrokenLinksNImages extends BaseClass {

	@Test
	public static void BrokenLinksNImages() throws Throwable {

		WebDriverManager.chromedriver().setup();

		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "disable-notifications", "enable-automation"));
		
		List<String> list = new ArrayList<String>();
		list.add("enable-automation");
		opt.setExperimentalOption("excludeSwitches", list);

		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://makemysushi.com/");
		
		driver.manage().window().maximize();		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Getting the list of all links
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Getting the list of all Images
		List<WebElement> images = driver.findElements(By.tagName("img"));

		// Getting list of all the links and images
		links.addAll(images);

		// Getting the active links and images
		List<WebElement> activeLinks = new ArrayList<WebElement>();

		for (int i = 0; i < links.size(); i++) {

			System.out.println(links.get(i).getAttribute("href"));

			if (links.get(i).getAttribute("href") != null && (!links.get(i).getAttribute("href").contains("javascript")
					&& !links.get(i).getAttribute("href").contains("mailto"))) {
				activeLinks.add(links.get(i));
			}
		}

		// Get the size of active links
		System.out.println(activeLinks.size());

		// Printing the active links
		for (int i = 0; i < activeLinks.size(); i++) {
			System.out.println(activeLinks.get(i).getAttribute("href"));
		}

		// Now open and connect all the URLs to verify whether they are valid or not
		for (int i = 0; i < activeLinks.size(); i++) {
			HttpsURLConnection connection = (HttpsURLConnection) new URL(activeLinks.get(i).getAttribute("href"))
					.openConnection();

			connection.connect();

			String responseMsg = connection.getResponseMessage();

			System.out.println(activeLinks.get(i).getAttribute("href") + "--> " + responseMsg);

			connection.disconnect();

		}

	}
}


