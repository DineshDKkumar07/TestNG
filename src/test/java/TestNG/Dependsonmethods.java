package TestNG;

import org.testng.annotations.Test;

public class Dependsonmethods {

	
	@Test(enabled=true)
	public void go_to_school() {
		
		System.out.println("went to school");
		
	}
	@Test(dependsOnMethods="go_to_school")
	public void Read() {
		
		System.out.println("he read");
		
	}
	@Test(dependsOnMethods="Read")
	public void go_to_home() {
		
		System.out.println("went to home");
		
	}
}
