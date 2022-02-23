package appium;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class whtps {
	DesiredCapabilities dc;
	WebDriver driver;
	
  @Test
  public void f() throws Exception{
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "ZX1PC22R7C");
	  dc.setCapability("platformVersion", "5.1");
	  dc.setCapability("platformName", "Android");
	  
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.Main");
	  driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	  
	  
  }
}