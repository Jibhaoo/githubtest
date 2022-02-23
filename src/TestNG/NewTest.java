package TestNG;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;


public class NewTest{

	WebDriver driver;
	


  @Test
 //TestScenario
  public void login() {

	  driver.findElement(By.name("username")).sendKeys("admin");

	  driver.findElement(By.name("password")).sendKeys("admin");
	
  driver.findElement(By.name("submit")).click(); 
 
 }

  
  @BeforeTest 
// Precondition
  public void beforeTest() {
	
  System.setProperty("webdriver.chrome.driver", "C:\\liabrary\\chromedriver.exe");

	  driver=new ChromeDriver();
	 
 driver.manage().window().maximize();

	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
  driver.get("http://selenium4testing.com/hms");
	
  
  }


  @AfterTest 
//Post Condition
  public void afterTest() {
	
  //driver.quit();
  
}


}


