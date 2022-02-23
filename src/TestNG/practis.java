package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class practis {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriver driver;
	  System.setProperty("webdriver,chrome.driver", "C:\\liabrary\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("http://selenium4testing.com/hms");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
