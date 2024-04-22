package seleniumTestcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingNewWindowTabsPopUp {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.findElement(By.xpath("//a[text()='Locate us']")).click();
		
		Set<String> win_ids = driver.getWindowHandles();
		
		List<String> tabs = new ArrayList<String>(win_ids);
		
		driver.switchTo().window(tabs.get(1));
		
		WebElement ele1 = driver.findElement(By.xpath("(//a[text()='Savings Account'])[1]"));
		
		//driver.switchTo().window(tabs.get(1));
		
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("arguments[0].click();", ele1);
		
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//button[text()='Login'])[3]")))).click();
		
		/*WebElement ele1 = driver.findElement(By.xpath("(//span[text()='INVEST'])[2]"));
		
		wait.until(ExpectedConditions.visibilityOf(ele1));
		
		new Actions(driver).moveToElement(ele1).perform();
		
		driver.findElement(By.xpath("(//span[text()='Demat Account Online'])[2]")).click();	*/	
		
		driver.close();
		
		driver.switchTo().window(tabs.get(1));
		
		driver.close();
		
		driver.switchTo().defaultContent();
		
		driver.close();
		
/*		Set<String> windsId = driver.getWindowHandles();
		
		Iterator<String> iterate = windsId.iterator();
		
		String first_window = iterate.next();
		
		System.out.println(first_window);
		
		
		//2nd window
		windsId = driver.getWindowHandles();		
		iterate = windsId.iterator();
		iterate.next();//first window
		String second_window = iterate.next();
		driver.switchTo().window(second_window);
		
		System.out.println(second_window);		
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div/a[5]")).click();
		
		//3rd window
		windsId = driver.getWindowHandles();
		iterate = windsId.iterator();
		iterate.next();//first window
		iterate.next(); //second window
		String third_window = iterate.next();//third window
		driver.switchTo().window(third_window);
		driver.findElement(By.xpath("//a[@title='Agri']")).click();
		System.out.println(third_window);*/
		
		

	}

}
