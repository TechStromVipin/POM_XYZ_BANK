package Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import baking_basePackage.user_oprations_customerLogin;
 

public class test_user_oprations extends test_launch_page {
	
	 
	user_oprations_customerLogin u;
	 static ExtentHtmlReporter reporter;
		static ExtentTest test;
	   
	 
	 
	 
	
	
	@Test(description="Customer Login Oprations Testing",priority = 3)
	public void costomer_login_oprations() throws InterruptedException
	{
		   		
		 
	    u=new user_oprations_customerLogin(driver);
	    
        l.click_on_customerLogIn();
		
		Thread.sleep(3000);

		//select user name of customer from dropdown
		
		u.click_on_yourname();
		
		Thread.sleep(3000);
		
		u.click_on_Login();
		
		System.out.println("logged in using Hermoine Granger Name");
		
		Thread.sleep(3000);
		
		u.verify_username_afterLogIn( );
		
    	Assert.assertEquals(u.verify_username_afterLogIn(),"Hermoine Granger");  
    	
		System.out.println("user name after log in is verified");
		
		u.verify_user_all_AccountsAreClickable();
		
		System.out.println("user all accounts clicking and switching is verified");
		
	}
	
	
	@Test(description="verify Deposit opration",priority = 4)
	public void depoit_opration() throws InterruptedException
	{
		
	String sucessmsg=u.verify_trasactions();
	
	System.out.println(sucessmsg);
		
	Assert.assertEquals(sucessmsg, "Deposit Successful");
		
	System.out.println("Deposite button verified and opration is successfull"+"Sucessfully Deposited Amount");	
		
	}
	
	@Test(description = "verify Withdrawl oprations sucess",priority = 5)
	public void withdrawl_Opration() throws InterruptedException
	{
		 
		u.click_on_withdrowl();
		
		u.Enter_amount();
		
		u.click_Withdrawl();
		
		Thread.sleep(5000);
		
		WebElement Withdrawlsucess= driver.findElement(By.xpath("//span[text()='Transaction successful']"));
	
	      String sucess= Withdrawlsucess.getText();
	
	   Assert.assertEquals(sucess, "Transaction successful");
		
	}
	
	
	@Test(description = "Test Transactions menu sucessfully Tested",priority = 6)
	public void test_transactions() throws InterruptedException
	{
	
		u.click_transactios();
		
		Thread.sleep(3000);
		
		u.date_time();
		
		Thread.sleep(5000);
		
		u.click_reset();
		
		Thread.sleep(3000);
		
		u.click_backbtn();
		
		
	System.out.println("Client account all oprational Testing done successfully for xyz Bank Application");
	
	
	
	
	 
		
		
		
	 		
	
	
	
	}
	
	
	
 	 
	
	
	
	
	
	
	
	
}
