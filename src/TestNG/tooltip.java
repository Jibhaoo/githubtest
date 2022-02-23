package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class tooltip {
	WebDriver driver;

	  @Test(description="Print the display names of Gmail, GoogleSearch and tooltip of Google image")
	  public void f() throws Exception {

		  String str;
		  
	str=driver.findElement(By.linkText("Gmail")).getText();
		
	  System.out.println("The gmail link is: "+str);
		
	  String str1=driver.findElement(By.name("btnK")).getAttribute("value");
		
	  System.out.println("GoogleSearch display name is: "+str1);
		 Thread.sleep(4000);
		 Actions a =new Actions(driver);
		 WebElement str2=driver.findElement(By.name("q")); //.getAttribute("title");
	a.moveToElement(str2).build().perform();
	 String tooltip = str2.getText();
	 Thread.sleep(2000);

	 System.out.println("Tooltip is :"+str2);
	  
	}

	  
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\liabrary\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.get("http://google.co.in");

		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
  }

  @AfterTest
  public void afterTest() {
  }

}
