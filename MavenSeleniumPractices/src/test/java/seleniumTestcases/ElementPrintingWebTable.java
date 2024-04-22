package seleniumTestcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementPrintingWebTable {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://seleniumpractise.blogspot.com/2021/08");
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		
		driver.manage().window().maximize();
		
		/*List<WebElement> totalCols = driver.findElements(By.xpath("//table[@id='customers']//tbody//td"));
		
		for(WebElement cols : totalCols)
		{
			System.out.println(cols.getText());
		}		
		
		List<WebElement> totalrows = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
		
		for(WebElement rows : totalrows)
		{
			if(rows.getText().contains("Amazon"))
			{
				System.out.println(rows.getText());
				break;
			}
		}*/
		
		List<WebElement> totalrows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));	
		
		totalrows.stream().parallel().forEach(e->System.out.println(e.getText()));
		
		/*for(int i=1; i<totalrows.size(); i++)
		{
			List<WebElement> totalcols = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td"));
			
			for(int j=0; j< totalcols.size(); j++)
			{
				WebElement ele = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td[1]"));
				if(totalcols.get(j).getText().contains("430.25"))
				{
					ele.click();
					break;
				}
			}
		}*/
		
		//*[@id="leftcontainer"]/table/tbody/tr["+i+"]/td[1]/a
		//table[@class='dataTable']//tbody//tr[1]//td
		
		
/*		List<WebElement> totalrows = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));		
		
		for(int i=2; i<totalrows.size(); i++)
		{
			List<WebElement> totalcols = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td"));
	
			for(int j=0; j<totalcols.size(); j++) {
			WebElement ele = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td[1]//input"));
				if(totalcols.get(j).getText().contains("Jeff"))
				{
					ele.click();
					break;
				}
			}
			
		}
		
		WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		submitBtn.click();*/
		
		//driver.findElement(By.xpath("//table[@id='customers']//td[text()='Amazon']//preceding-sibling::td//input")).click();
		
	//	driver.quit();
		
		//Printing all the elements of dynamic web table
	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/
		
		/*List<WebElement> list = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		
		int i=0;
		while(i<list.size())
		{
			System.out.println(list.get(i).getText());
			i++;
		}
*/
		
	/*	List<WebElement> totalNoRows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		int rowCount = totalNoRows.size();
		
		for(int i=0; i<rowCount; i++)
		{
			List<WebElement> total_col  = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td"));
			int colCount = total_col.size();
			for(int j=0; j<colCount; j++)
			{
				System.out.print(total_col.get(j).getText()+" ");
			}
			
			System.out.println();
		}*/
		
	}

}
