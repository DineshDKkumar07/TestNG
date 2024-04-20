package parllel.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class Testcase_4 extends Launchquit{

	public void scenario4() {
	driver.get("https://www.nykaa.com");
	WebElement search=driver.findElement(By.name("search-suggestions-nykaa"));
	search.sendKeys("gun");
	search.sendKeys(Keys.ENTER);
	
}
}
