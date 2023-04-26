package com.demowebshop.automation.generic;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Utility_Listener extends Base_Class implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TEST CASE PASS:"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TEST CASE FAILED:"+result.getName());
		try {
			Generic_Screenshot.getPhoto(this.driver, result);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TEST CASE SKIPPED:"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("TESTCASE PASSED WITHIN SUCC PER"+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("TESTCASE FAILED TIMOUT"+result.getName());
	}
	

}
