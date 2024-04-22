package seleniumTestcases;

import java.time.Duration;
import java.util.Calendar;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingJqueryCalendar {


	static int targetDay = 0,
			targetMonth = 0,
			targetYear = 0;
	
	static int currentDay = 0,
			currentMonth = 0,
			currentYear = 0;
	
	static int jumpMonthsBy=0;
	
	static boolean increment = true;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * 
		 * target day, month, year
		 * current day, month, year
		 * jump to the month
		 * increment or decrement
		 */
		
		
		String dateToSet= "20/12/2023";
		
		//get current date
		getCurrentDateMonthAndYear();
		System.out.println(currentDay+"   "+currentMonth+"   "+currentYear);
		
		//get target date
		getTargetDateMonthAndYear(dateToSet);
		System.out.println(targetDay+"   "+targetMonth+"   "+targetYear);
		
		
		//Get Jump month
		calculateHowManyMonthsToJump();
		System.out.println(jumpMonthsBy);
		System.out.println(increment);
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("disable-notifications");
		
		//opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "disable-notifications", "enable-automation"));
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class).withMessage("Time out as condition is not met");
		
	
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='labelCalendarContainer']//i")))).click();
		
		
		
		for(int i=0; i<jumpMonthsBy;i++){
			
			if(increment){
				
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']"))))
				.click();
				
			}
			else
			{
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']"))))
				.click();
			}
			
		}
	
		driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH'][normalize-space()='"+Integer.toString(targetDay)+"']")).click();
		

		//driver.close();
	}
	
	
	
	public static void getCurrentDateMonthAndYear(){
		
		Calendar cal = Calendar.getInstance();
		
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		currentMonth = cal.get(Calendar.MONTH)+1;
		currentYear = cal.get(Calendar.YEAR);
		
		
		
	}
	
	
	public static void getTargetDateMonthAndYear(String dateString)
	{
			
		int firstIndex = dateString.indexOf("/");
		int lastIndex = dateString.lastIndexOf("/");
		
		String day = dateString.substring(0, firstIndex);
		targetDay = Integer.parseInt(day);
		
		
		String month = dateString.substring(firstIndex+1, lastIndex);
		targetMonth = Integer.parseInt(month);
		
		
		/*String year = dateString.substring(lastIndex+1, dateString.length());
		targetYear = Integer.parseInt(year);*/
		
		String year = dateString.substring(lastIndex+1);
		targetYear = Integer.parseInt(year);
		
	}
	
	
	public static void calculateHowManyMonthsToJump(){
		
		if((targetMonth-currentMonth)>0){
			
			jumpMonthsBy = (targetMonth-currentMonth);
		}else{
			
			jumpMonthsBy = (currentMonth-targetMonth);
			increment = false;
		}
		
		
	}

}