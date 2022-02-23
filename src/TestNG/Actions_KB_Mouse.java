package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Actions_KB_Mouse {
	WebDriver driver;
	
  @Test
  public void f() throws Exception{
	  Actions a=new Actions(driver);
	  a.moveToElement(driver.findElement(By.xpath("//*[@id=\"footer-headings\"]/td[1]"))).build().perform();
	  Thread.sleep(10000);
	  driver.findElement(By.linkText("Careers")).click();
	  Thread.sleep(10000);
	  a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	  Thread.sleep(10000);
	  a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\liabrary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://spicejet.com");
	 // driver.findElement(By.linkText("Desktop Site")).click();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
