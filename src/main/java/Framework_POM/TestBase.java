/**
 * 
 */
package Framework_POM;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Fahim
 *
 */
public class TestBase {

	public static WebDriver driver;
	public ExcelRead excel;
	
	
	public void init() {
		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			getUrl(getPropertyName("appurl"));
			implicitWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getUrl(String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void implicitWait(int timeOut, TimeUnit unit) {
		try {
			driver.manage().timeouts().implicitlyWait(timeOut, unit);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getPropertyName(String getText) throws Exception {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/Framework_POM/Config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String propData = prop.getProperty(getText);
		return propData;
	}
	
	public String[][] getData(String excelname, String sheetname) {
		String path = System.getProperty("user.dir") + "/Sep_Practice/src/main/java/Framework_POM_Data/"+excelname;
		try {
			excel = new ExcelRead(path);
			String[][] data = excel.getDataFromSheet(sheetname, excelname);
			return data;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void close_application() {
		driver.close();
	}

}
