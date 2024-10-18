package TestPkg;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestPkg.MyListeners.class)
public class DemoTest3 {	
  @Test()
  public void a() {
	  System.out.println("a="+Thread.currentThread().getId());
	  assertEquals(false, true);
  }
  @Test( )
  public void b() {
	  System.out.println("b="+Thread.currentThread().getId());
  }
}
