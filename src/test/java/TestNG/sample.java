package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class sample {

	
	
	@Test
	public void display() {
		
		
		Assert.assertEquals(false, true, "This is not correct");
	}
}
