package TestPkg;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoParametersXML {
	
   	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
  @Test()
  @Parameters({"userName","password"})
  public void LoginTest(String userName, String password) {
	  driver.findElement(By.name("username")).sendKeys(userName);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	  boolean isLogo=driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
	  String adminText=driver.findElement(By.xpath("//span[text()='Admin']")).getText();
	  assertEquals(isLogo, true);
	  assertEquals(adminText, "Admin","tab name is not match");
	  
	  
  }
  
 
  @AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
  
  @AfterSuite
  public void closeBrowser() {
	  driver.quit();
  }
}
