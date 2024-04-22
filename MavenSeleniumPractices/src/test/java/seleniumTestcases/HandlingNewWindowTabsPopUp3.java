package seleniumTestcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingNewWindowTabsPopUp3 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Locate us']")).click();
		
		Set<String> windsId = driver.getWindowHandles();
		
		Iterator<String> iterate = windsId.iterator();
		
		String first_window = iterate.next();
		
		System.out.println(first_window);
	}

}
