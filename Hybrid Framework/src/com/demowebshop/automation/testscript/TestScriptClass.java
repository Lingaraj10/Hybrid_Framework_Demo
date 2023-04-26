package com.demowebshop.automation.testscript;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demowebshop.automation.generic.Base_Class;
import com.demowebshop.automation.generic.DataProviderClassFrame;
import com.demowebshop.automation.generic.Generic_Converter;
import com.demowebshop.automation.generic.ReadDataFromProperty;
import com.demowebshop.automation.generic.Utility_JavascriptExecutor;
import com.demowebshop.automation.generic.Utility_Select;
import com.demowebshop.automation.pomclass.PomClass_SmokeComapareData;
@Listeners(com.demowebshop.automation.generic.Utility_Listener.class)
public class TestScriptClass extends Base_Class
{
	@Test(dataProvider ="testcred",dataProviderClass = DataProviderClassFrame.class)
	public void testscript(String username,String password) throws InterruptedException, IOException
	{
		PomClass_SmokeComapareData pmc=new PomClass_SmokeComapareData(driver);
		pmc.login_Link().click();
		Thread.sleep(2000);
		pmc.email_text().sendKeys(username);
		Thread.sleep(2000);
		pmc.pass_text().sendKeys(password);
		Thread.sleep(2000);
		pmc.login_btn().click();
		//assert.fail();
		Thread.sleep(2000);
		pmc.books_tab().click();
		Thread.sleep(2000);
		WebElement sort = pmc.sortby_drop();
		Utility_Select.selectdrop(sort).selectByVisibleText(ReadDataFromProperty.propertyfile("drop1"));
		Thread.sleep(2000);
		WebElement display = pmc.display_drop();
		Utility_Select.selectdrop(display).selectByVisibleText(ReadDataFromProperty.propertyfile("drop2"));
		Thread.sleep(2000);
		WebElement view = pmc.view_drop();
		Utility_Select.selectdrop(view).selectByVisibleText(ReadDataFromProperty.propertyfile("drop3"));
		Thread.sleep(2000);
		WebElement scroll = pmc.fiction_scrollby();
		Utility_JavascriptExecutor.javascriptexecutor(driver).
		executeScript("arguments[0].scrollIntoView;", scroll);
		Thread.sleep(2000);
		pmc.computing_addbtn().click();
		Thread.sleep(2000);
		pmc.fiction_addbtn().click();
		Thread.sleep(2000);
		pmc.health_addbtn().click();
		Thread.sleep(2000);
		WebElement shop = pmc.shoppingcart_btn();
		Utility_JavascriptExecutor.javascriptexecutor(driver).
		executeScript("arguments[0].scrollIntoView;", shop);
		Thread.sleep(2000);
		pmc.shoppingcart_btn().click();
		Thread.sleep(2000);
    	String cprice = pmc.computer_price().getText();
    	String fprice = pmc.fiction_price().getText();
    	String hprice = pmc.health_price().getText();
    	double actual_cprice = Generic_Converter.conversion(cprice);
    	double actual_fprice = Generic_Converter.conversion(fprice);
    	double actual_hprice = Generic_Converter.conversion(hprice);
    	if(actual_cprice>actual_fprice && actual_cprice> actual_hprice)
    	{
    		pmc.computer_cbox().click();
    		Thread.sleep(2000);
    		pmc.updateshopping_btn().click();
    		Thread.sleep(2000);
    	}
    	else if(actual_fprice>actual_hprice && actual_fprice>actual_cprice)
    	{
    		pmc.fiction_cbox().click();
    		Thread.sleep(2000);
    		pmc.updateshopping_btn().click();
    		Thread.sleep(2000);
    	}
    	else
    	{
    		pmc.health_cbox().click();
    		Thread.sleep(2000);
    		pmc.updateshopping_btn().click();
    		Thread.sleep(2000);
    	}
    	
  
		
	}
}
