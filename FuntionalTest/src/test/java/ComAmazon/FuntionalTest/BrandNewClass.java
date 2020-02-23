package ComAmazon.FuntionalTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class BrandNewClass {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement forgotpsswd=driver.findElement(By.linkText("Forgot account?"));
	  Actions window=new Actions(driver);
	  window.keyDown(Keys.SHIFT).click(forgotpsswd).keyUp(Keys.SHIFT).build().perform();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver,chrome,driver","C:\\Users\\Enkhbold\\Desktop\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.navigate().to("https://facebook.com");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
