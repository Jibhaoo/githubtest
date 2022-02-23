
package TestNG;


import java.io.File;

import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;


public class capture_screenshot {

WebDriver driver;

public void takeScreenShote(String str) throws Exception{
	SimpleDateFormat df=new SimpleDateFormat("YYYY_MMM_DD_MM-SS");
	Date d=new Date();
	String time=df.format(d);
	System.out.println(time);
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\liabrary\\"+str+time+".png"));
}

  @Test
 
 public void f() throws Exception{

	  driver.findElement(By.linkText("Manual FAQs")).click();

	  takeScreenShote("mFAQs");
	
  driver.findElement(By.linkText("Selenium FAQs")).click();
	
  takeScreenShote("sFAQs");
 
 }

  @BeforeTest
  
public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\liabrary\\chromedriver.exe");

		driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();

		driver.get("http://selenium4testing.com");

		driver.findElement(By.id("closediv")).click();	
	

  }


  @AfterTest

  public void afterTest() {
  
}


}
