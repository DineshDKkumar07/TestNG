package TestNG;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 2)
	public void Tc1() {

		System.out.println("This is first TC1");

	}
	
	@Test(enabled = true )
	public void TC7() {
		
		System.out.println("skipped");
	}

	@Test(priority = 1)
	public void Tc2() {
		System.out.println("This is first TC2");

	}

	@Test(priority = 3)
	public void Tc3() {

		System.out.println("This is first TC3");
	}

}
