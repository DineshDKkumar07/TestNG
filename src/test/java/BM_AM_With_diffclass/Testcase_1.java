package BM_AM_With_diffclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase_1 extends Launchquit {

@Test
	
	public void scenario1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.amazon.com");
	WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("show");
	search.sendKeys(Keys.ENTER);
	
		
	}
}
