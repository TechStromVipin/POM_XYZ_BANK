package baking_basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class bank_manageroprations {

	WebDriver driver;
	Select s;
	 @FindBy(xpath = "//button[text()='Bank Manager Login']")
	 private WebElement bank_manager_login;
	
	 @FindBy(xpath = "//button[@ng-class=\"btnClass1\"]")
	 private WebElement addcustomer;
	
	 @FindBy(xpath = "//input[@ng-model=\"fName\"]")
	 private WebElement firstname;
	 
	 @FindBy(xpath = "//input[@ng-model=\"lName\"]")
	 private WebElement lastname;
	 
	 @FindBy (xpath="//input[@ng-model=\"postCd\"]")
	 private WebElement postalcode;
	 
	 @FindBy (xpath = "//button[text()=\"Add Customer\"]")
	 private WebElement addcustomersbmtbtn;
	
	 @FindBy(xpath="//button[@ng-class=\"btnClass2\"]")
	 private WebElement OpenAccount;
	 
	 @FindBy(xpath="//select[@name=\"userSelect\"]")
	 private WebElement customer;
	 
	 @FindBy (xpath = "//select[@name=\"currency\"]")
	 private WebElement currency;
	 
	 @FindBy(xpath = "//button[text()=\"Process\"]")
	 private WebElement process;
	 
	 @FindBy(xpath = "//button[@ng-class=\"btnClass3\"]")
	 private WebElement customer1;
	 
	 @FindBy(xpath="//input[@placeholder=\"Search Customer\"]")
	 private WebElement entercustomername;
	 
	 @FindBy(xpath = "//button[text()='Delete']")
	 private WebElement click_deletebtn;
	 
	 @FindBy(xpath="//button[text()='Home']")
	 private WebElement click_on_homebtn;
	
	public bank_manageroprations(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		 
		
	}
	
	public void click_bank_manager_login()
	{
		
		bank_manager_login.click();
		
	}
	
	public void click_onAddCustomer()
	{
		addcustomer.click();
		
	}
	
	public void click_enter_firstName()
	{
		firstname.click();
		
		firstname.sendKeys("charli");
	}
	
	public void click_enter_LastName()
	{
		lastname.click();
		
		lastname.sendKeys("motherfuckeer");
	}
	public void click_enter_PostalCode()
	{
		postalcode.click();
		
		postalcode.sendKeys("698998");
		
	}
	public void click_enter_addcustomerSubmitbtn()
	{
		addcustomersbmtbtn.click();
	}
	
	public void click_open_account()
	{
		OpenAccount.click();
		  
		
	}
	
	public void select_customer()
	{
		 customer.click();
		 s = new Select(customer);
		 s.selectByIndex(2);
	
	}
	
	public void select_currency()
	{
		currency.click();
		s= new Select(currency);
		s.selectByIndex(1);
		
	}
	
	public void click_process_btn()
	{
		process.click();
	}
	
	public void click_on_customer()
	{
		customer1.click();
	}
	
	public void click_entercustomer() throws InterruptedException
	{
		entercustomername.click();
		entercustomername.sendKeys("Harry");
		 
		
		Thread.sleep(5000);
		
		
	}
	
	public void Click_delete_button()
	{
		click_deletebtn.click();
	}
	
	public void Click_onHOmeBtn()
	{
		click_on_homebtn.click();
	}
	
	
}
