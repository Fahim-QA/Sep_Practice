/**
 * 
 */
package Sep_Practice_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Fahim
 *
 */
public class DataProvider_TestNG {

	@Test(dataProvider="testdata")
	public void test(String user, String paswd) {
		System.out.println("username "+user+" password "+paswd);
	}
	
	@DataProvider(name="testdata")
	public Object[][] testData() {
		
		Object[][] obj = new Object[2][2];
		
		obj[0][0] = "admin";
		obj[0][1] = "admin";
		
		obj[1][0] = "admin1";
		obj[1][1] = "admin1";
		
		return obj;
	}

}
