package Cross_parllel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase_3 extends Launchquit{

	
@Test
	
	public void scenario3() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.nykaa.com");
		WebElement search=driver.findElement(By.name("search-suggestions-nykaa"));
		search.sendKeys("gun");
		search.sendKeys(Keys.ENTER);
		
	}
}
