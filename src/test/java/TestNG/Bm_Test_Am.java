package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bm_Test_Am{	
	
	@Test
	public void test1() {
		
		System.out.println("TC1");
	}
	@Test
	public void test2() {
		
		System.out.println("TC2");
	}
	@Test
	public void test3() {
		
		System.out.println("TC3");
	}
	
	@BeforeMethod
	
	public void login() {
		
		System.out.println("Bf");
		
		
	}

	@AfterMethod
	
	public void logout()
	{
		System.out.println("Af");
		
		
	}
}
