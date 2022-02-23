package appium;
import java.net.URL;

import java.util.List;


import io.appium.java_client.android.AndroidDriver;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;



import org.testng.annotations.Test;

import com.steadystate.css.util.ThrowCssExceptionErrorHandler;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
public class PrintAllApp_page1 {  
	AndroidDriver<WebElement> driver;
	
	DesiredCapabilities dc;
@Test
public void f() throws Exception , NoSuchElementException{
	WebElement str= driver.findElement(By.name("Apps"));
	  str.click();
	  Thread.sleep(20000);
	  
	  
	  System.out.println(str.getSize());

	// for(int i=0;i<str.getSize();i++)
	// {
		 //System.out.println(str.get(i).getText());
		 
		 //}
	 }
  @BeforeTest
  public void beforeTest() throws Exception, NoSuchElementException { 
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "ZX1PC22R7C");
	  dc.setCapability("platformVersion", "5.1");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.android.launcher");
	  dc.setCapability("appActivity", "com.android.launcher2.Launcher");
	  driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  Thread.sleep(1000);
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
