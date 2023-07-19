package baking_basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class user_oprations_customerLogout {

	WebDriver driver;
	
	@FindBy(xpath = "//button[@class='btn logout']")
	private WebElement logout;
	
	@FindBy(xpath = "//button[text()='Home']")
	private WebElement homebtn;
	
	
	
	public user_oprations_customerLogout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void click_logout_by_customer()
	{
		logout.click();
	}
	
	public void click_on_Homebtn()
	{
		homebtn.click();
		
	}
	
	
}
