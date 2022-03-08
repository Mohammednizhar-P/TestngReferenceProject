package Maven.Maven_Project;

import org.testng.annotations.*;

public class IgnoreTestExample {
	
	@Ignore
    @Test
	public void samsung() {
		
		System.out.println("search samsung");
		
		

	}
    @Test
    public void iphone() {
    	System.out.println("search iphone");

	}
	
	@Test(enabled=false)
	public  void realme() {
		
		System.out.println("search realme");

	}
	@Test
   public void oppo() {
	   System.out.println("search oppo");
	   

}
	
	
	

}
