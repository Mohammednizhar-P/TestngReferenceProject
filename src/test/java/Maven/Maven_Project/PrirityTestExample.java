package Maven.Maven_Project;

import org.testng.annotations.Test;

public class PrirityTestExample {


@Test
	public void laptop() {
		System.out.println("hp");

	}
@Test(priority = 2)
	public void mobile() {
		System.out.println("apple");
	}

@Test
	public void tv() {

		System.out.println("sony");
	}

@Test(priority = 2)
	public void watch() {

		System.out.println("rolax");

	}












}
