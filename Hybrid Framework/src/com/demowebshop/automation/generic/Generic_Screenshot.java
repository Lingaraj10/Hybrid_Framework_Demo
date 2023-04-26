package com.demowebshop.automation.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

public class Generic_Screenshot implements Framework_Constants
{
	public static void getPhoto(WebDriver driver,ITestResult result) throws InterruptedException
	{
		Date d=new Date();
		String actual_date = d.toString().replaceAll("/",":");
		TakesScreenshot ts= (TakesScreenshot)driver;
		Thread.sleep(1500);
		File src = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(1500);
		File fl=new File(SCREENSHOT_PATH+actual_date+"screen.jpeg");
		try {
			FileHandler.copy(src, fl);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
