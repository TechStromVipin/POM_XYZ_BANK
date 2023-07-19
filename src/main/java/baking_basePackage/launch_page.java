package baking_basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class launch_page {

	WebDriver driver;
	
	@FindBy(xpath="//button[text()='Customer Login']")
	private WebElement customer_login;
	
	@FindBy(xpath="//button[@class='btn home']")
	private WebElement home_btn;
	
	@FindBy(xpath="//button[text()='Bank Manager Login']")
	private WebElement bank_manager_login;
	
	public launch_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void click_on_customerLogIn() throws InterruptedException
	{
		customer_login.click();
		System.out.println("customer login button is verified");
		Thread.sleep(10000);
	}
	
	public void click_on_home_btn()
	{
		home_btn.click();
		
	}
	
	public void click_bank_manager_login() throws InterruptedException
	{
		bank_manager_login.click();
		System.out.println("Bank Manager LoginBtn is verified");
		Thread.sleep(10000);
	}
	
	
	
}
