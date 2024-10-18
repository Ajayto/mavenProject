package TestPkg;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://help.blazemeter.com/");
	  System.out.println("new test");
  }
  
  @Test(groups ={"Regression"})
public void f1() {
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://help.blazemeter.com/");
	  System.out.println("new test");
  }
  @Test
public void f2() {
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://help.blazemeter.com/");
	  System.out.println("new test");
}

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

}
