package appium;


import java.net.URL;

import java.util.concurrent.TimeUnit;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
   
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;


public class Home{
	  DesiredCapabilities dc= new DesiredCapabilities();
	AndroidDriver<WebElement> driver;
	 
	
  @Test
  public void f() throws Exception {
	  
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

	
	 //((AndroidDriver<WebElement>) driver).pressKeyCode(AndroidKeyCode.HOME);
	//Thread.sleep(1000);
	// driver.findElementByAndroidUIAutomator("UiSelector().text(\"Phone \")").click();
	  //((AndroidDriver<WebElement>) driver).pressKeyCode(AndroidKeyCode.KEYCODE_MENU);
	  //((AndroidDriver<WebElement>) driver).pressKeyCode(AndroidKeyCode.KEYCODE_MENU);
	 // Thread.sleep(10000);
	  //driver.swipe(417, 430, 528, 568, 1000);
	// driver.findElementByAndroidUIAutomator("UiSelector().text(\"Adobe Reader\")").click();
	 // Thread.sleep(10000);
	  
  }
  @BeforeTest
  public void beforeTest()  {
	  
	
  }

  @AfterTest
  public void afterTest() {
  }

}
