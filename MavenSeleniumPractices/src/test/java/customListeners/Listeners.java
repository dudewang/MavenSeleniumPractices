package customListeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.MonitoringMail;
import utilities.TestConfig;
import utilities.testUtil;

public class Listeners extends testUtil implements ITestListener
{
	
	@Override
	public void onTestFailure(ITestResult result) {
		try {
			testUtil.captureScreenshot(result.getName().toString().trim());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onFinish(ITestContext context) {
		
		testUtil.zip(System.getProperty("user.dir")+"\\screenshot");
		MonitoringMail mail = new MonitoringMail();
		try
		{
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.password, TestConfig.subject, 
				TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
	
	
/*
	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Passing test cases -- " + result.getName());

	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Capturing screenshot -- " + result.getName());
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(
				"<a href=\"C:\\SIMS_PRI\\MavenSeleniumPractices\\Screenshot\\error.jpg\" target=\"_blank\">Screenshot link </a>");
		Reporter.log(
				"<a href=\"C:\\SIMS_PRI\\MavenSeleniumPractices\\Screenshot\\error.jpg\" target=\"_blank\"><img height=150 width=150 src=\"C:\\SIMS_PRI\\MavenSeleniumPractices\\Screenshot\\error.jpg\"> </a>");
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Capturing screenshot -- " + result.getName());
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		try
		{
		testUtil.captureScreenshot(result.getName());
		//result.getName().toString().trim()
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {
		
		MonitoringMail mail = new MonitoringMail();
		try
		{
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.password, TestConfig.subject, 
				TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}

	}*/

}
