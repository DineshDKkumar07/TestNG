package TestNG;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launchquit {
	
	ChromeDriver driver;
	@BeforeMethod
	public void precondition() {
		

		 driver = new ChromeDriver();
		driver.navigate().to("https://www,google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void post_condition() {
		
		driver.close();
	}

}
