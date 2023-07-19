package baking_basePackage;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class user_oprations_customerLogin {

	WebDriver driver;
	String username;
	String sucesstext;
	
	@FindBy(xpath="//select[@id='userSelect']")
	private WebElement your_name;
	
	@FindBy(xpath="//Button[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath="//span[text()='Hermoine Granger']")
	private WebElement user_name_verify;
	
	@FindBy(xpath = "//select[@id='accountSelect']")
	private WebElement accountSelect;
	
	@FindBy(xpath="//button[@ng-class='btnClass2']")
	private WebElement deposit;
	
	@FindBy(xpath="//input[@type='number']")
	private WebElement enteramount;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement depositebtn;
	
	@FindBy(xpath="//span[@ng-show=\"message\"]")
	private WebElement depositesucessmsg;
	
	@FindBy(xpath="//button[@ng-class='btnClass3']")
	private WebElement withdrow;
	
	@FindBy(xpath="//input[@type='number']")
	private WebElement EnteramountWithdrawl;
	
	@FindBy(xpath="//button[text()='Withdraw']")
	private WebElement withdrwalbtn;
	
	@FindBy(xpath = "//button[@ng-click=\"transactions()\"]")
	private WebElement transactions;
	
	@FindBy(xpath = "//a[@ng-click=\"sortType = 'date'; sortReverse = !sortReverse\"]")
	private WebElement click_date_time;
	
	@FindBy(xpath = "//button[@ng-click='reset()']")
	private WebElement resetbtn;
	
	@FindBy(xpath = "//button[@ng-click='back()']")
	private WebElement backbtn;
	
	public user_oprations_customerLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void click_on_yourname()
	{
	    your_name.click();
	    
	    Select s = new Select(your_name);
	    s.selectByVisibleText("Hermoine Granger"); 
	    
	    
	}
	
	public void click_on_Login()
	{
		
		login.click();
		
	}
	
	public String verify_username_afterLogIn()
	{
		username=user_name_verify.getText();
		System.out.println(username);
	    return username;
	}
	
	public void verify_user_all_AccountsAreClickable() throws InterruptedException
	{
		accountSelect.click();
		
		Select a = new Select(accountSelect);
		a.selectByIndex(2);
		Thread.sleep(3000);
		a.selectByIndex(1);
		Thread.sleep(3000);
		a.selectByIndex(0);
		
		
	}
	
	public String verify_trasactions() throws InterruptedException
	{
		deposit.click();
		
		Thread.sleep(4000);
		enteramount.click();
		
		Thread.sleep(4000);
		System.out.println("Entered amount");
		enteramount.sendKeys("5000");
		Thread.sleep(4000);
		System.out.println("click on Deposit");
		depositebtn.click();
		
	    sucesstext=depositesucessmsg.getText();
	    return sucesstext;
		
	}
	
	public void click_on_withdrowl() throws InterruptedException
	{  
		Thread.sleep(2000);
		withdrow.click();
		Thread.sleep(3000);
	 
	}
	
	public void Enter_amount() throws InterruptedException
	{
		enteramount.click();
		Thread.sleep(3000);
		enteramount.sendKeys("200");
		Thread.sleep(3000);
	}
	
	public void click_Withdrawl()
	{
		withdrwalbtn.click();
	}
	
	public void click_transactios()
	{
		transactions.click();
	}
	
	public void date_time()
	{
		click_date_time.click();
	}
	
	public void click_reset()
	{
		resetbtn.click();
	}
	
	public void click_backbtn()
	{
		backbtn.click();
	}
	
}
