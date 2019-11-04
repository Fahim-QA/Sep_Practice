/**
 * 
 */
package LoginModule;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework_POM.TestBase;
import Framework_POM_uiActions.HomePage;

/**
 * @author Fahim
 *
 */
public class TC001_VerifyLogin extends TestBase {
	
	HomePage homepage;
	
	@BeforeClass
	public void setUp() {
		init();
	}
	
	@Test
	public void verifyLogin() throws Exception {
		homepage = new HomePage(driver);
		homepage.userLogin_Application();
	}
	
	@AfterClass
	public void closeBrowser() {
		close_application();
	}

}
