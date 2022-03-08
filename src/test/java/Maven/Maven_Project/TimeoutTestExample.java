package Maven.Maven_Project;

import org.testng.annotations.Test;

public class TimeoutTestExample {


@Test
	public void test5() {


		System.out.println("Mobile");

	}

@Test(timeOut =500)
	public void test6() throws InterruptedException {
		System.out.println("Laptop");
		Thread.sleep(3000);;
	}



@Test(timeOut =4000)
	public void test7() throws InterruptedException {
		System.out.println("Cart");
		Thread.sleep(3000);;
		
	}






















}
