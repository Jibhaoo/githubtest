package appium;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class whatsapp_msg {
	WebDriver driver;
	DesiredCapabilities dc;
	
  @Test
  public void f() throws Exception{
	  driver.findElement(By.id("com.whatsapp:id/tab")).click();
	  driver.findElement(By.id("com.whatsapp:id/contact_row_container")).click();
	  driver.findElement(By.id("com.whatsapp:id/entry")).sendKeys("welcome to appium");
	  driver.findElement(By.id("com.whatsapp:id/send")).click();
	 
  }
@BeforeTest
  public void beforeTest() throws Exception {
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "ZX1PC22R7C");
	  dc.setCapability("platformVersion", "5.1");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.Main");
	  driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	 driver.quit();
  }

}
