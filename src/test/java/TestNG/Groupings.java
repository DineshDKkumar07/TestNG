package TestNG;

import org.testng.annotations.Test;

public class Groupings {
	
	
	@Test(groups={"Apple"})
	public void apple1() {
		
		System.out.println("This is apple1");
	}
	@Test(groups={"Apple"})
	public void apple2() {
		
		System.out.println("This is apple2");
	}
	@Test(groups={"moto"})
	public void moto1() {
		System.out.println("This is moto1");
		
	}
	@Test(groups={"moto"})
	public void moto2() {
		System.out.println("This is moto2");
		
	}
	@Test(groups={"oppo"})
	public void oppo1() {
		System.out.println("This is oppo1");
		
	}
	@Test(groups={"oppo"})
	public void oppo2() {
		System.out.println("This is oppo2");
		
	}

}
