package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerss implements ITestListener
{
	public void onTestStart(ITestResult result) 
	{
		System.out.println("I am on test start listner");
	}

	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(" I am on Test pass listner");
	}

	public void onTestFailure(ITestResult result) 
	{
		//screenshot
		System.out.println("on test failure listener");
	}

	public void onTestSkipped(ITestResult result) 
	{
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) 
	{
			
	}

	public void onStart(ITestContext context) 
	{
	}

	public void onFinish(ITestContext context) {
	}

}
