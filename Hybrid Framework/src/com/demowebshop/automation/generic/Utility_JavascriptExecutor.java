package com.demowebshop.automation.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Utility_JavascriptExecutor 
{
	public static JavascriptExecutor javascriptexecutor(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		return js;
	}

}
;