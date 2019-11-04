/**
 * 
 */
package Sep_Practice_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Fahim
 *
 */
public class DependsOnMethods {
	
	@Test
	public void test1() {
		Assert.assertTrue(true);
		System.out.println("test1");
	}
	
	@Test(dependsOnMethods= {"test1", "test4"})
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(dependsOnMethods= {"test4"})
	public void test3() {
		System.out.println("test3");
	}
	
	@Test
	public void test4() {
		Assert.assertTrue(false);
		System.out.println("test4");
	}

}
