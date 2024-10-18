package parallel;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParallelTest {
  @Test
  public void a() throws InterruptedException {
	  DriverManager.getDriver().findElement(By.xpath("//span[text()='Admin']")).click();
		String bgColor= DriverManager.getDriver().findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).getCssValue("background-color");
		System.out.println("color"+bgColor);
		Thread.sleep(3000);
  }
  
  @Test
  public void e() throws InterruptedException {
	  DriverManager.getDriver().findElement(By.xpath("//span[text()='PIM']")).click();
		String bgColor= DriverManager.getDriver().findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).getCssValue("background-color");
		System.out.println("color"+bgColor);
		Thread.sleep(3000);
  }
  
  @Test
  public void b() {
	  System.out.println(Thread.currentThread().getId());
  }
  @Test
  public void c() {
	  System.out.println(Thread.currentThread().getId());
  }
  @Test
  public void d() {
	  System.out.println(Thread.currentThread().getId());
  }
  
  @BeforeMethod
  public void beforeMethod() {
	DriverManager.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	DriverManager.getDriver().manage().window().maximize();
	DriverManager.getDriver().findElement(By.name("username")).sendKeys("Admin");
	DriverManager.getDriver().findElement(By.name("password")).sendKeys("admin123");
	DriverManager.getDriver().findElement(By.xpath("//button[text()=' Login ']")).click();
  }
  
  @AfterMethod
  public void afterMthod() {
	  DriverManager.removeDriver();
  }

}
