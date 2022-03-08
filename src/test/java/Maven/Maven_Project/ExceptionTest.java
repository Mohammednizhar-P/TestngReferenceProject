package Maven.Maven_Project;

import org.testng.annotations.Test;

public class ExceptionTest {
	
	
	@Test
	public void add() {
		
		int a= 10;
		int b = 20;
		System.out.println("add"+(a+b));

	}
	
	@Test(expectedExceptions = Exception.class)
	public void divided() {
		
		int a= 10;
		int b= a/0;
		System.out.println("divided"+(b));

	}
	  @Test(expectedExceptions = NullPointerException.class)
	public void array() {
		
		int [] a = null;
		System.err.println(a[1]);

	}
	
	
	
	
	
	
	
	
	
	

}
