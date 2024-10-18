package TestPkg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener {
	
	public  void onTestStart(ITestResult result) {
	   System.out.println(result.getName()+":onTestStart");
	  }
	
    public void onTestSuccess(ITestResult result) {
	    System.out.println(result.getName()+":is test is pass");
	  }
	
    public void onTestFailure(ITestResult result) {
	   System.out.println(result.getName()+":test is fail");
	  }
	
    public void onTestSkipped(ITestResult result) {
	    System.out.println(result.getName()+": test is Skipped");
	  }
	
	
    public void onStart(ITestContext context) {
	    System.out.println(context.getName()+":onStart");
	  }
	
	
    public void onFinish(ITestContext context) {
    	System.out.println(context.getName()+":onFinish");
	  }
}
