package Runner;
 

 

import static org.testng.Assert.assertEquals;

 
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseBrowser.baseclass;
import baking_basePackage.launch_page;
 

public class test_launch_page extends BaseBrowser.baseclass {

	launch_page l;
	 
	 
	    @BeforeClass
	    public void launch_page_verification_started()
	    {
	    	 System.out.println("Landing page testing is started");
	    	  
	    }
	 
	  	 
	  	 @Test (description="launching the Browser",priority = 0)
	  	 public void test_launch_site()
	  	 {
	  		//Start the Browser
	 		baseclass.startChrome();
	 		//baseclass.startEdge();
	  		
	  		//verify current Url
	  		String currenturl= driver.getCurrentUrl();
	  		System.out.println(currenturl);
	  		
	       assertEquals("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login","https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login","verified sucessfully");
	  	   System.out.println("current Url is verified");
	  		//verify current Title
	  		String title=driver.getTitle();
	  		System.out.println(title);
	  		assertEquals("XYZ Bank", "XYZ Bank", "title verified");
	  		System.out.println("page title is verified");
	  		
	  	 }  
	  	 
	  	 
	  	 @Test(description="Testing customer button",priority = 1)
	  	 public void test_customerLoginbtn() throws InterruptedException
	  	 {
	  		Thread.sleep(3000); 
	  		
	  		l = new launch_page(driver);
	  		l.click_on_customerLogIn();
	  		
	  		//home button clicked and verified
	  		l.click_on_home_btn();
	  	 } 

	  	 @Test(description="Testing bank manager Login button",priority = 2)
	  		public void Test_BankmanagerLoginbtn() throws InterruptedException
	  		{
	  		//click_bank_manager button clicked and verified
	  			l.click_bank_manager_login();
	  			
	  			l.click_on_home_btn();
	  			
	  			 Thread.sleep(3000);
	  			 
	  		}
	  		 
	 
	  	 
	   
	 
	
	
} 
