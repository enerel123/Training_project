

package ComAmazon.FuntionalTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreenShots {
	
	public static WebDriver driver;
	
	@FindBy (id = "email") WebElement email_id;
	@FindBy (id = "pass") WebElement pass_word;
	@FindBy (xpath = "//*[@aria-label = 'Log In']") WebElement login_button;
	
	public ScreenShots(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void email_field(String email) {

	}}
