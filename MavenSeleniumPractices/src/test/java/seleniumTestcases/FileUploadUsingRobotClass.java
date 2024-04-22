package seleniumTestcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadUsingRobotClass {

	public static void main(String[] args) throws AWTException {

		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-notifications"));
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		WebElement chooseButton = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(chooseButton).click().perform();
		
		Robot r = new Robot();		
		r.delay(2000);
		
		StringSelection ss = new StringSelection("C:\\Dushyant\\SELENIUM MATERIALS\\AutoIT\\fileupload.html");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.delay(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		/*Actions act = new Actions(driver);
		act.moveToElement(chooseButton).click().perform();
		
		Robot robot = new Robot();
		robot.delay(2000);
		
		//Copying to clipboard
		StringSelection ss = new StringSelection("C:\\Dushyant\\SELENIUM MATERIALS\\AutoIT\\fileupload.html");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//Pressing ctr+v
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Releasing ctr+v
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.delay(2000);
		
		//Hitting the enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		*/

	}

}
