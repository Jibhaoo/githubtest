package appium;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class Swipe {
	DesiredCapabilities dc= new DesiredCapabilities();
AndroidDriver<WebElement> driver;
	
  @Test
  public void f() throws Exception {
	
	 
	 driver.swipe(12,430,528,568,1000);
	  Thread.sleep(1000);
	  driver.swipe(12, 430,528,568 , 1000);
	  Thread.sleep(1000);
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
  
  dc=new DesiredCapabilities();
	 
 	dc.setCapability("deviceName", "ZX1PC22R7C");
 	  dc.setCapability("platformVersion", "5.1");
 	  dc.setCapability("platformName", "Android");
 	  dc.setCapability("appPackage", "com.android.launcher");
 	  dc.setCapability("appActivity", "com.android.launcher2.Launcher");
 	  AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
 	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 	 WebElement element = driver.findElement(By.name("Apps"));
	  element.click();
	  Thread.sleep(20000);
  }
  @AfterTest
  public void afterTest() {
  }

}
