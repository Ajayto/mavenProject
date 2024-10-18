package TestPkg;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestPkg.MyListeners.class)
public class DemoTest2 {	
  @Test()
  public void addUser() {
	  System.out.println("this is add user test"+Thread.currentThread().getId());
	  assertEquals(false, true);
  }
  @Test( )
  public void editUser() {
	  System.out.println("this is edit user test"+Thread.currentThread().getId());
  }
  @Test()
  public void viewUser() {
	  System.out.println("this is view user test"+Thread.currentThread().getId());
	 
  }
  
  @Test()
  public void deleteUser() {
	  System.out.println("this is delete user test"+Thread.currentThread().getId());
	  
  }
  
  @Test()
  public void changePassword() {
	  System.out.println("this is changePassword"+Thread.currentThread().getId());
  } 
}
