package Maven.Maven_Project;

import org.testng.annotations.Test;

public class GroupTestExample {
	@Test(groups = "mobile")
	public void mobiles() {
		
		
		System.out.println("apple");

	}
	
	
	@Test(groups = "mobile")
	public void mobile2() {
		
		System.out.println("samsung");

	}
	@Test(groups = "laptop")
	public void laptop() {
		
		System.out.println("hp");
		

	}
	@Test(groups = "laptop")
    public void lap() {
    	
    	System.out.println("lenevo");

	}
}
