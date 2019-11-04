/**
 * 
 */
package Sep_Practice_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

/**
 * @author Fahim
 *
 */
public class BrowserLaunch {

	/**
	 * @param args
	 */

	@Test
	public void browserLaunch() {	
		// ChromeBrowser Launching
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Firefox Browser Launching
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();

		// InternetExplorer Browser Launching
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/drivers/IEDriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();

		// Safari Browser Launching
		System.setProperty("webdriver.safari.driver", System.getProperty("user.dir") + "/drivers/SafariDriver.exe");
		WebDriver driver3 = new SafariDriver();
	}

}
