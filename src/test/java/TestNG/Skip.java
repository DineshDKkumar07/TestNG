package TestNG;

import org.testng.annotations.Test;

public class Skip {//default value=True

	@Test(priority = 2)
	public void Tc1() {

		System.out.println("This is first TC1");

	}
	
	@Test(priority = 4, enabled=false)
	public void Tc4() {

		System.out.println("This is first Hi");

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
