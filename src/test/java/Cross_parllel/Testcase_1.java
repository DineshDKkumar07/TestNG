package Cross_parllel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase_1 extends Launchquit {

@Test
	
	public void scenario1() throws InterruptedException {
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.flipkart.com");
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("mouse");
	search.sendKeys(Keys.ENTER);
	
		
	}
}
