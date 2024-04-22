package seleniumTestcases;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementClickingWebTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		/*// Finding all the rows
		List<WebElement> totalRows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));

		// Finding all the values in first columns
		List<WebElement> totalFirstCols = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));

		// Finding total count of rows
		int totalRowsCount = totalRows.size();

		// Finding total count of values in first column
		int totalFirstColsCount = totalFirstCols.size();

		//Clicking on particular element of dynamic web table		
		int temp=0;
		for(int rows=0; rows<totalRowsCount; rows++)
		{
			for(int cols=0; cols<totalFirstColsCount; cols++)
			{
				if(totalFirstCols.get(cols).getText().contains("Suzlon Energy Ltd."))
				{
					totalFirstCols.get(cols).click();
					//System.out.println(totalFirstCols.get(cols).getText());
					temp++;
					break;
				}
				
			}
			if(temp > 0)
			{
				break;
			}
		}
		*/
		
		List<WebElement> firstCol = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]//a"));
		
		firstCol.stream().parallel().filter(e->e.getText().contains("MCX")).forEach(e->e.click());
		
		/*boolean flag = true;
		
		for(int i=0; i < firstCol.size(); i++)
		{
			if(firstCol.get(i).getText().contains("Reliance Power"))
			{
			
				firstCol.get(i).click();
				flag = false;
			}
			
			if(flag==false)
			{
				break;
			}
			
		}*/
		
	/*	try
		{
		
		firstCol.parallelStream().filter(ele-> ele.getText().contains("Reliance Power")).forEach(ele->ele.click());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		
		
		
		//System.out.println(total_rows);
		//String title = driver.getTitle();
		//System.out.println(title);
		
		System.out.println("Clicked");

		driver.close();

	}

}
