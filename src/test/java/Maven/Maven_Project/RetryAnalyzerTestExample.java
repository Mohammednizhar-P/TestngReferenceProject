package Maven.Maven_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerTestExample {
	
	
	@Test(retryAnalyzer = MyRetry.class)
	public void userNameValidation() {
		
		Assert.assertEquals("a","A");
		
		
		
		

	}
	
	
	@Test
	public void test() {
		
		System.out.println("truestatement");

	}
	
	
	
	
	
	
	
	

}
