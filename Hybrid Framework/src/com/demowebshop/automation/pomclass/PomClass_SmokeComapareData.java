package com.demowebshop.automation.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass_SmokeComapareData 
{
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement login_link;
	
	@FindBy(id="Email")
	private WebElement email_text;
	
	@FindBy(id="Password")
	private WebElement pass_text;
	
	@FindBy(id="RememberMe")
	private WebElement rem_cbox;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement log_btn;
	
	@FindBy(xpath="//ul[@class='top-menu']/li/a")
	private WebElement books_tab;
	
	@FindBy(id="products-orderby")
	private WebElement sortby_drop;
	
	@FindBy(id="products-pagesize")
	private WebElement display_drop;
	         
	@FindBy(id="products-viewmode")
	private WebElement view_drop;
	
	@FindBy(xpath="//a[text()='Computing and Internet']/../../div[3]/div[2]/input")
	private WebElement computing_addbtn;
	
	@FindBy(xpath="//a[text()='Fiction']/../../div[3]/div[2]/input")
	private WebElement fiction_addbtn;
	
	@FindBy(xpath="//a[text()='Health Book']/../../div[3]/div[2]/input")
	private WebElement health_addbtn;
	
	@FindBy(xpath="//a[text()='Fiction']")
	private WebElement fiction_scrollby;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingcart_btn;
	
	@FindBy(xpath="//h1[text()='Shopping cart']/../following-sibling::div[1]/div/form/table/tbody/tr/td[6]/span[2]")
	private WebElement computer_price;
	
	@FindBy(xpath="//h1[text()='Shopping cart']/../following-sibling::div[1]/div/form/table/tbody/tr[2]/td[6]/span[2]")
	private WebElement fiction_price;  
	
	@FindBy(xpath="//h1[text()='Shopping cart']/../following-sibling::div[1]/div/form/table/tbody/tr[3]/td[6]/span[2]")
	private WebElement health_price;
	
	@FindBy(id="//h1[text()='Shopping cart']/../following-sibling::div[1]/div/form/table/tbody/tr[1]/td[1]/input")
	private WebElement computer_cbox;
	
	@FindBy(xpath="//h1[text()='Shopping cart']/../following-sibling::div[1]/div/form/table/tbody/tr[2]/td[1]/input")
	private WebElement fiction_cbox;
	
	@FindBy(xpath="//h1[text()='Shopping cart']/../following-sibling::div[1]/div/form/table/tbody/tr[3]/td[1]/input")
	private WebElement health_cbox;
	
	@FindBy(xpath="//input[@value='Update shopping cart']")
	private WebElement updateshopping_btn;
	
	
	
	public PomClass_SmokeComapareData(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement login_Link()
	{
		return login_link;
	}
	public WebElement email_text()
	{
		return email_text;
	}
	public WebElement pass_text()
	{
		return pass_text;
	}
	public WebElement login_btn()
	{
		return log_btn;
	}
	public WebElement books_tab()
	{
		return books_tab;
	}
	public WebElement sortby_drop()
	{
		return sortby_drop;
	}
	public WebElement display_drop()
	{
		return display_drop;
	}
	public WebElement view_drop()
	{
		return view_drop;
	}
	public WebElement computing_addbtn()
	{
		return computing_addbtn;
	}
	public WebElement fiction_addbtn()
	{
		return fiction_addbtn;
	}
	public WebElement health_addbtn()
	{
		return health_addbtn;
	}
	public WebElement fiction_scrollby()
	{
		return fiction_scrollby;
	}
	public WebElement shoppingcart_btn()
	{
		return shoppingcart_btn;
	}
	public WebElement computer_price()
	{
		return computer_price;
	}
	
	public WebElement fiction_price()
	{
		return fiction_price;
	}
	public WebElement health_price()
	{
		return health_price;
	}
	public WebElement computer_cbox()
	{
		return computer_cbox;
	}
	public WebElement fiction_cbox()
	{
		return fiction_cbox;
	}
	public WebElement health_cbox()
	{
		return health_cbox;
	}
	public WebElement updateshopping_btn()
	{
		return updateshopping_btn;
	}
	
}
