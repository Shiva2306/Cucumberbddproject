
	package nammastepdefinitions;

	import java.time.Duration;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {

	    public static WebDriver driver;

	    public void initDriver() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	    public void closeDriver() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


