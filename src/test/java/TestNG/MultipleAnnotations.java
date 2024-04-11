package TestNG;

import org.testng.annotations.Test;

public class MultipleAnnotations {

	
	@Test(invocationCount = 10)
	public void TC1() {
		
		System.out.println("TC1");
	}
	@Test
	public void TC2() {
		
		System.out.println("TC2");
	}
	@Test
	public void TC3() {
		
		System.out.println("TC3");
		
	}
}
