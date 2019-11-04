/**
 * 
 */
package DragAndDrop;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework_POM.TestBase;
import Framework_POM_uiActions.HomePage;

/**
 * @author Fahim
 *
 */
public class TC001_verify_dragAndDrop extends TestBase {
	
HomePage homepage;
	
	@BeforeClass
	public void setUp() {
		init();
	}
	
	@Test
	public void verify_DragAndDrop() throws Exception {
		homepage = new HomePage(driver);
		homepage.userLogin_Application();
		System.out.println("verify drag n drop");
		homepage.dragAndDrop();
		System.out.println("verify drag n drop");
	}
	
	/*@AfterClass
	public void closeBrowser() {
		close_application();
	}*/

}
