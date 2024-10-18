package TestPkg;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	
	@AfterSuite
	public void afterSuite() {
		System.out.println("-----------@AfterSuite---------");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("------@BeforeTest-------");
	}

	@BeforeClass
	void beforeClass() {
		System.out.println("------@BeforeClass---------");
	}

	@BeforeMethod
	void beforeMethod() {
		System.out.println("--------@BeforeMethod--------");
	}

	@Test
	public void LoginTest() {
		System.out.println("this is my login test");
	}
	
	
	@Test
	public void LoginTest2() {
		System.out.println("this is my login2 test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("----------@AfterMethod-------");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("----------@AfterClass---------");
	}

	
	@AfterTest
	public void afterTest() {
		System.out.println("-------------@AfterTest--------");
	}

	
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("------@BeforeSuite------");
	}

}



