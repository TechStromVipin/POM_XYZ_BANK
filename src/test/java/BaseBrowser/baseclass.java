package BaseBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class baseclass {

	public static WebDriver driver;
	
	
	
	public static WebDriver startChrome()
	{
        System.setProperty("webdriver.chrome.driver","E:\\SOFTWEAR\\eclipse\\eclipse-java-2023-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");		
		
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
        driver= new ChromeDriver(options);
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        
        return driver;
	}
	
	public static WebDriver startEdge() {
	 
			System.setProperty("webdriver.edge.driver", "E:\\SOFTWEAR\\eclipse\\eclipse-java-2023-06-R-win32-x86_64\\eclipse\\edgedriver_win64\\msedgedriver.exe");
			
			 EdgeOptions options = new EdgeOptions();
		     options.addArguments("--remote-allow-origins=*");
			
			driver=new EdgeDriver(options);
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
			
			return driver;
		}	
	 
	 
	
		
	}
	
	
 
	 
		
