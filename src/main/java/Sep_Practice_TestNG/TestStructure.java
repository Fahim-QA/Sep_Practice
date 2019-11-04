package Sep_Practice_TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestStructure {


	@BeforeClass
	public void loadData() {
		System.out.println("loaded");
	}

	@BeforeSuite(alwaysRun=true)
	public void loadSysData() {
		System.out.println("loaded2");
	}
	
	@Test(groups={"UAP"})
	public void test1()
	{
		System.out.println("Test 2");
	}


}
