package Maven.Maven_Project;

import org.testng.annotations.*;

public class SimpleAnnotationTestExample {

	@BeforeSuite
	public void test1() {


		System.out.println("open browser");


	}
	@BeforeTest
	public void test2() {

		System.out.println("url");

	}
	@BeforeClass
	public void test3() {
		System.out.println("homepage");

	}

	@BeforeMethod
	public void test4() {
		System.out.println("username and pswd");
	}

	@Test
	public void test5() {
		System.out.println("mobile");
	}
	@Test
	public  void test6() {
		System.out.println("laptop");
	}
	@AfterMethod
	public void test7() {
		System.out.println("cart");
	}
	@AfterClass
	public void test8() {
		System.out.println("order");

	}
	@AfterTest
	public void test9() {
		System.out.println("buy now");
		

	}
	@AfterSuite
	public void test10() {
		System.out.println("cokkies");



	}









}
