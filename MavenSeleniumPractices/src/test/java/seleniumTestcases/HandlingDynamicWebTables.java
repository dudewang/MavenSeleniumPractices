package seleniumTestcases;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDynamicWebTables {

	@Test
	public void dynamicWebTableHandle() {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-notifications"));
		

		WebDriver driver = new ChromeDriver(opt);

		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement table = driver.findElement(By.xpath("//table[contains(@id, 'cust')]"));

		List<WebElement> headers = table.findElements(By.xpath("//table[contains(@id, 'cust')]//th"));

		System.out.println("Size of headers - >" + headers.size());

		// to get the headers
		for (WebElement header : headers) {
			System.out.println(header.getText());
		}

		System.out.println("------------------------------");

		// to check whether particular column is present or not
		boolean status = false;
		for (WebElement header : headers) {
			if (header.getText().equalsIgnoreCase("Country")) {
				status = true;
				break;
			}
		}

		System.out.println(status);
		Assert.assertTrue(status, "Header is not present");

		System.out.println("------------------------------");

		// to check the row count
		List<WebElement> rowCount = table.findElements(By.xpath("//table[contains(@id, 'cust')]//tr"));

		Assert.assertEquals(rowCount.size(), 7, "Row count is not correct");

		System.out.println("------------------------------");

		// to check a particular data in all the table data
		List<WebElement> tableData = table.findElements(By.xpath("//table[contains(@id, 'cust')]//td"));

		boolean contact = false;
		for (WebElement data : tableData) {
			if (data.getText().equalsIgnoreCase("Bhavish Aggarwal")) {
				contact = true;
				break;
			}
		}

		Assert.assertEquals(contact, true, "Element is not found");
		
		System.out.println("------------------------");
		
		//to check data of particular column
		
		List<WebElement> column2Data = table.findElements(By.xpath("//table[contains(@id, 'cust')]//td[2]"));
		
		boolean comp = false;
		
		for(WebElement colData : column2Data)
		{
			if(colData.getText().equalsIgnoreCase("Ola"))
			{
				comp=true;
				break;
			}
		}

		Assert.assertEquals(comp, true, "Element is not present");
		
		System.out.println("------------------------");
		
		
		//to click on Know More link having company name as "Ola"		
		//driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td//a")).click();
		
		//to check the checkbox having company name as "Selenium"
		driver.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td//input")).click();
		
		try
		{
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
