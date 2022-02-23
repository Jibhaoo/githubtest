package TestNG;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Ajax_Control {
	WebDriver driver;
	ExtentReports extent;
	 ExtentTest logger;
	 
 @Test
 
 public void f() throws Exception {
	
  driver.findElement(By.name("q")).sendKeys("selenium");
  logger = extent.startTest("passTest");
	  Thread.sleep(2000);

	  String str=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]")).getText();
	  Thread.sleep(2000);
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");

 System.out.println(str);

	  String[] s=str.split("\n");
	System.out.println(s);
  System.out.println(s.length);
	 
 for (int i = 0; i < s.length; i++)
 {
		 
 if(s[i].contains("selenium tutorial"))
	
	  {
		
	  System.out.println(s[i]);
	  Thread.sleep(2000);

		  driver.findElement(By.name("q")).clear();
		  Thread.sleep(2000);

		  driver.findElement(By.name("q")).sendKeys(s[i]);
		  extent.flush();
		  extent.close();

	  }
	
}

  }

	  
  
  @BeforeTest
  public void beforeTest()  throws IOException{
	  System.setProperty("webdriver.chrome.driver", "C:\\liabrary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://google.co.in");
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extent = new ExtentReports ("F:\\library\\testreport.html");
		extent
        .addSystemInfo("Host Name", "SoftwareTestingMaterial")
        .addSystemInfo("Environment", "Automation Testing")
        .addSystemInfo("User Name", "Rajkumar SM");
        //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
        //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
        extent.loadConfig(new File("F:\\library\\extentreports-java-2.41.2\\extent-config.xml"));
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
