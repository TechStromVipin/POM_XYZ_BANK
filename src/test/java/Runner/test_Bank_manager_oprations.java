package Runner;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import baking_basePackage.bank_manageroprations;
import roughwork.writeDataInExcelSheet;

public class test_Bank_manager_oprations extends test_user_logoutOprations {

	bank_manageroprations m;
	 Select s;
	 Alert a;
	 static ExtentHtmlReporter reporter;
		static ExtentTest test;
	   
 
	
	
	@Test(description = "Bank Manager Opration Testing Started",priority = 8)
	public void click_bankManagerLogin()
	{
		m=new bank_manageroprations(driver);
		
		m.click_bank_manager_login();
		
		System.out.println("Bank manager login tested successfully");
	}
	
	@Test(description = "Add customer opration testing Started",priority = 9)
	public void test_addCustomer() throws InterruptedException
	{
		
		m.click_onAddCustomer();
		
		Thread.sleep(3000);
		
		//enter fisrt name 
		m.click_enter_firstName();
		
		Thread.sleep(3000);
		
		//enter lastname 
		m.click_enter_LastName();
		
		Thread.sleep(3000);
		
		//enter postal code 
		m.click_enter_PostalCode();
		
		Thread.sleep(3000);
		
		//add customer
		m.click_enter_addcustomerSubmitbtn();
		
		Thread.sleep(3000);
		
		  a=driver.switchTo().alert();
		a.accept();
		
		System.out.println("Add customer opration testing done sucessfully");
	}
	
	
	@Test(description = "Test open Account",priority = 10)
	
	public void test_addcustomer() throws InterruptedException
	{
		 m.click_open_account();
		 Thread.sleep(5000);
	     m.select_customer();
	   	
	}
	
	
	@Test(description = "Test currency",priority = 11)
	public void test_currency() throws InterruptedException
	{
		 Thread.sleep(3000);
		 m.select_currency();
		
	}
	
	@Test(description = "click process",priority = 12)
	public void click_process() throws InterruptedException
	{
		Thread.sleep(3000);
		m.click_process_btn();
		  a=driver.switchTo().alert();
		a.accept();
	}
	
	@Test(description = "click on customers",priority = 13)
	
	public void click_customers()
	{
		m.click_on_customer();
	}
	
	@Test(description = "enter customer name",priority = 14)
	
	public void entercustomer_to_search() throws InterruptedException, IOException
	{
		 m.click_entercustomer();
		 m.Click_delete_button();
		 Thread.sleep(3000);
		 m.Click_onHOmeBtn();
		 
		  writeDataInExcelSheet.UpdateExcel();
		  System.out.println("Data is updated in Excel sheet");
		  
	}
	
	
	
	
	
	
	

	 
	  @AfterClass
	  public void launch_page_verification_ended() throws InterruptedException 
	  {
		  
		  
		 
		
		  Thread.sleep(10000);
		 
		  System.out.println("Starting closing Opration");
		  
		  Thread.sleep(3000);
		  
		  driver.close();
		  
		  
		  
		 
	  }
	
	
	
	
	
	
	
}
