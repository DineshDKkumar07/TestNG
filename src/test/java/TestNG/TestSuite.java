package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

public class TestSuite {

	long start_time;
	long end_time;
	WebDriver driver;
	//WebElement search;

	@BeforeSuite
	public void openbrowser() {
		

		start_time = System.currentTimeMillis();
		 driver = new ChromeDriver();		
	}

	@Test
	public void openamazon() {

		
		driver.get("https://www.amazon.com");

	}

	@Test
	public void openflipkart() {

		driver.get("https://www.flipkart.com");

	}
	@Test
	public void openbookmyshow() {

		driver.get("https://www.bookmyshow.com");
	}

	@AfterSuite
	public void closebrowser() {

		driver.quit();
		end_time = System.currentTimeMillis();
		long Totaltime = end_time - start_time;
		System.out.println(Totaltime);
	}
}
