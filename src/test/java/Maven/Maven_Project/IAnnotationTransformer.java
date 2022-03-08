package Maven.Maven_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IAnnotationTransformer {
	
	@Test
	public void usrnameValidation() {
		
		
		Assert.assertEquals("nizhar","Nizhar");

	}
	
	@Test
	public void passwordValidation() {
		
		
		Assert.assertEquals("123@", "123@n");

	}
	@Test
	public void login() {
		System.out.println("dfghj");

	}
	@Test
	public void validate() {
		
		Assert.assertNotEquals("hi","hello");

	}
	
	
	
	
	
	
	
	
	
	

}
