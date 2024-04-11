package TestNG;

import org.testng.annotations.Test;

public class Invocationcount {
	
	
	@Test(invocationCount = 2)
	public void Tc1() {

		System.out.println("This is first TC1");
}
	
	@Test(invocationCount  = 3, priority=1)
	 public void Tc2() {
	
		System.out.println("This is first TC2");

	}	
	
	
	
}
