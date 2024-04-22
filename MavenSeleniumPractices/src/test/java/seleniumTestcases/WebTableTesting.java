package seleniumTestcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableTesting {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Finding the rows count in the dynamic web table
		List<WebElement> totalrows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		
		//Finding the columns count in the dynamic web table
		List<WebElement> totalcols = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td"));
		
		//Finding the size of rows
		System.out.println("Total no. of rows--> " +totalrows.size());
		
		//Finding the size of rows
		System.out.println("Total no. of columns--> "+totalcols.size());
		
		//Printing all the rows and cols data
		for(int rows=1; rows<=totalrows.size(); rows++)
		{
			for(int cols=1; cols<=totalcols.size(); cols++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+rows+"]//td["+cols+"]")).getText()+" ");
			}
			System.out.println();
		}
		
		driver.quit();


	}

}
