package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Gmail_login {
	WebDriver driver;

	@Test
  public void f() throws Exception 
  {
	  driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("seleniumbyjibhaoo@gmail.com");
      Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
      
      String expectedTitle = "Welcome";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      System.out.println(actualTitle);
  }
  @BeforeMethod
  public void verifyHomepageTitle() {
	  
      String expectedTitle = "Gmail";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() 
  	{
	    System.setProperty("webdriver.chrome.driver","D:\\Appium live project\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
    }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
