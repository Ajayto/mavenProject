package TestPkg;

import org.testng.annotations.DataProvider;

public class TestngDataProvider {
	
	@DataProvider(name = "loginData")
	public Object[][] loginTestData() {
		return new Object[][] {{"Admin","admin123"},{"ztest","ajay123"}};
		
	}
	
	@DataProvider(name = "addUser")
	public Object[][] addNewUser(){
		return new Object[][] {{"Ajay","v","Toradmal"},{"script","testing","QA"}};
	}

}
