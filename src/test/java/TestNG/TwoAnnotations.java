package TestNG;

import org.testng.annotations.Test;

public class TwoAnnotations {

	@Test(priority = 2 , invocationCount = 7)
	
	public void Sc1() {
		
		System.out.println("This is Sc1");
	}
    @Test
	
	public void Sc2() {
	
		System.out.println("This is Sc2");
	}
}
