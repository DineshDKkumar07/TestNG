package parllel.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

   
public class Launchquit {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void google_search(String nameofbrowser) throws InterruptedException {
		
		if(nameofbrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
			
			
		}
		
		if(nameofbrowser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
			
		}
	
		
		if(nameofbrowser.equals("edge"))
		{
			driver=new EdgeDriver();
			
			
		}

	

	}
	
	@AfterMethod
	public void post_condition() {
		
		driver.close();
	}

	 
	}


		
		
		
		

