package Maven.Maven_Project;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependencyTestExample {
	
	
	//@Ignore  // hole program a stop akidum
	 @Test
	public void test5() {
		
		System.out.println("Mobile");
		

	}
	@Test(dependsOnMethods = "test5")
	public void test6() {
		
		System.out.println("Laptop");

	}
	
	@Test
	public void test7() {
		
		System.out.println("Cart");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
