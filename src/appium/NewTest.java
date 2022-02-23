package appium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() {
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "");
	  driver=new ChromeDriver();
	  
	  driver.get("http://192.168.1.200:8080/TorenzoPOS/login.jsp");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
