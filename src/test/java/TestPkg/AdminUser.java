package TestPkg;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AdminUser {
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		
	}

	@BeforeMethod
	public void beforeMethod() {
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}


	@Test
	public void adminItem() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		String bgColor= driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).getCssValue("background-color");
		System.out.println("color"+bgColor);
		Thread.sleep(3000);
	}
	
	@Test
	public void pimItem() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.linkText("Logout")).click();
	}


	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

}
