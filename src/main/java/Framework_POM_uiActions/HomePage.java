/**
 * 
 */
package Framework_POM_uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_POM.TestBase;

/**
 * @author Fahim
 *
 */
public class HomePage extends TestBase {
	
	@FindBy(name="user_name")
	WebElement uname;
	
	@FindBy(name="user_password")
	WebElement upaswd;
	
	@FindBy(id="submitButton")
	WebElement submitbutton;
	
	@FindBy(xpath="//tr[@id='headerrow_13']")
	WebElement dragElement;
	
	@FindBy(xpath="//tr[@id='headerrow_12']")
	WebElement dropElement;
	
	public void userLogin_Application() throws Exception {
		uname.sendKeys(getPropertyName("username"));
		upaswd.sendKeys(getPropertyName("userpaswd"));
		submitbutton.click();
	}
	
	public void dragAndDrop() throws Exception {
		Actions obj = new Actions(driver);
		System.out.println("Start dragAndDrop");
		obj.dragAndDrop(dragElement, dropElement).build().perform();
		Thread.sleep(3000);
		System.out.println("End dragAndDrop");
	}
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
