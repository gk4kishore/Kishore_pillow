package resources;

import java.io.IOException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import BaseClass.BrowserSetup;


public class Listeners implements ITestListener{
	static RemoteWebDriver driver;
	
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The name of the testcase started is :" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of the testcase passed is :"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String s=result.getName();
		try {
			BrowserSetup.getScreenshot(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of the testcase Skipped is :"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Failed but within success percentage: " +result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("This is onStart method: " +context.getOutputDirectory());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("This is onFinish method: " +context.getPassedTests());
		System.out.println("This is onFinish method: " +context.getFailedTests());
	}
}