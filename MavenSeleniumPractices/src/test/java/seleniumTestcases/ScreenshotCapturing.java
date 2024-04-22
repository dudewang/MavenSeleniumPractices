package seleniumTestcases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotCapturing {
	
	public static WebDriver driver;
	
	
	public static void captureScreenshot()
	{
		
		/*try
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File targetFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(targetFile, new File("path of the file"));
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}*/
		
		try
		{
			
		Date d = new Date();
		
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File destinationFile = new File(".//Screenshot//"+ fileName);
		
		FileUtils.copyFile(sourceFile, destinationFile);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		captureScreenshot();
		

	}
	
	

}
