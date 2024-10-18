package parallel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	 private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	    public static WebDriver getDriver() {
	        if (driver.get() == null) {
	            // Set the driver instance (e.g., new ChromeDriver())
	            driver.set(new ChromeDriver());
	        }
	        return driver.get();
	    }

	    public static void setDriver(WebDriver driverInstance) {
	        driver.set(driverInstance);
	    }

	    public static void removeDriver() {
	        driver.get().quit();
	        driver.remove();
	    }

}
