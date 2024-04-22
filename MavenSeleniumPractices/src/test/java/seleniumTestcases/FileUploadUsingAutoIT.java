package seleniumTestcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadUsingAutoIT {
	
	/*
	 * ControlFocus("File Upload","","Edit1")
	 * ControlSetText("File Upload","","Edit1","path of file to be uploaded")
	 * ControlClick("File Upload","","Button1")
	 */

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("file://F://SELENIUM%20MATERIALS//fileupload.html");
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("1")).click();
		
		Runtime.getRuntime().exec("file://C:/Dushyant/SELENIUM%20MATERIALS/AutoIT/fileupload.html");

	}

}
