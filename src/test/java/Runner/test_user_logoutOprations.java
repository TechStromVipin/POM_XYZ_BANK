package Runner;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import baking_basePackage.user_oprations_customerLogout;

public class test_user_logoutOprations extends test_user_oprations {

 
	user_oprations_customerLogout o;
	 static ExtentHtmlReporter reporter;
		static ExtentTest test;
	   
    
	
	
	@Test(description = "Customer is logging out",priority = 7)
	public void Click_on_logout_by_customer()
	{
		 
		  
		  o= new user_oprations_customerLogout(driver);
		  
		  o.click_logout_by_customer();
		  
		  System.out.println("customer sucessfully log out from his account");
		
		  o.click_on_Homebtn();
		  
		  
 
		  
		  
		
		
	}
	
	
	
	 
	 
	
	
}
