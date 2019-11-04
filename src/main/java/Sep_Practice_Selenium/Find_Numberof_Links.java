/**
 * 
 */
package Sep_Practice_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Fahim
 *
 */
public class Find_Numberof_Links {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8888");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		driver.findElement(By.id("submitButton")).click();
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		 
		int Total_Links = linkList.size();
		
		System.out.println(Total_Links);
		
		for(int i=0; i<=Total_Links-1; i++) {
			
			WebElement webLink = linkList.get(i);
			
			String txt_linkName = webLink.getText();
			
			System.out.println(txt_linkName);
			
		}
		
	}

}
