package ComAmazon.FuntionalTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Feb14  {
	 WebDriver driver;

  @Test
  public void f() {
	  
	
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver,chrome,driver","C:\\Users\\Enkhbold\\Desktop\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.navigate().to("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
