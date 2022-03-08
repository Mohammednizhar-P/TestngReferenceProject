package Maven.Maven_Project;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class AssertTestExample {
	
	String actual = "Bala";
	String expected ="bala";
	
	
	/*@Test          // hard assert is for validation
	public void test1() {
		
		System.out.println("test 1 started");
		Assert.assertEquals(actual, expected);
		System.out.println("test 2 completed");

	}*/
	
	
	
	
	
	@Test
	public  void test2() {
		
		SoftAssert sa = new SoftAssert();
		System.out.println("test 1 started");
		sa.assertEquals(actual, expected);
		System.out.println("test 2 completed");
	sa.assertAll(); 


	}
	
	
	
	
	
	

}
