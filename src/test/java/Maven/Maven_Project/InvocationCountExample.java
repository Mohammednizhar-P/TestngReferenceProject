package Maven.Maven_Project;

import org.testng.annotations.Test;

public class InvocationCountExample {
	
	@Test(invocationCount = 5)
	public void mobile() {
		
		System.out.println("search mobile");

	}
	@Test
	public  void laptop() {
		
		System.out.println("search laptop");
		

	}
	@Test(invocationCount = 3)
	public  void pendrive() {
		
		System.out.println("search pendrive");

	}
	@Test(invocationCount = 2)
	public void books() {
		
		System.out.println("search books");

	}
	
	
	
	
	

}
