package ComAmazon.FuntionalTest;



import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Browsers {
	
	
	public static WebDriver driver;
	
	@BeforeClass
	@Parameters ({"url", "browser"})
	public void beforeClass(String website, String browser_link) {
		  
		  if (browser_link.equalsIgnoreCase("chrome")) {
			  
		  System.setProperty("webdriver.chrome.driver", "\"C;\\Users\\Enkhbold\\Downloads\\chromedriver.exe\"");
		  driver = new ChromeDriver();
		  driver.navigate().to(website);
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  //driver.manage().window().maximize();
		  
		  } else if (browser_link.equalsIgnoreCase("firefox")){
			  
			  System.setProperty("webdriver.gecko.driver", "C;\\Users\\Enkhbold\\Downloads\\chromedriver.exe\"");
			  driver = new FirefoxDriver();
			  driver.navigate().to(website);
			  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			  //driver.manage().window().maximize();
		  }  
		  
  else {
	  System.out.println("You need change your browser!!!!!!!!!!!!!!!!!!");
}
	}
@AfterClass
public void afterClass() throws IOException {


}

public void screenshots() throws IOException {
	 
File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(shots,new File("C:\\Users\\Enkhbold\\Documents\\Selenium_Practice\\"+timestamp()+"screenshot.png"));
		}
public String timestamp() {
return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}

}

