package com.demowebshop.automation.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_Select 
{
	public static Select selectdrop(WebElement drop)
	{
		Select sel=new Select(drop);
		return sel;
	}

}
