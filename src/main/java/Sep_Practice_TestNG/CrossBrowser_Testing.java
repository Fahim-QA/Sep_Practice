/**
 * 
 */
package Sep_Practice_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Fahim
 *
 */
public class CrossBrowser_Testing {

	/**
	 * @param args
	 */
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void browserLaunch(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");	
		} else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",  System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.navigate().to("http://google.com");
		} else if(browserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.navigate().to("http://google.com");
		}
		
	}

}
