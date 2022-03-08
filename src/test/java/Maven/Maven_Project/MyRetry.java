package Maven.Maven_Project;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {
   int   count = 0;
	int limit = 4;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if (count<limit) {  // we have set limit here also ex 4
			
		count++;
		
		return true;  // return true my test case is pass it will execute
			
		}
		
		return false;     // my test case is fail it will execute
	}
	
	
	
	
	
	
	
	
	
	
	

}
