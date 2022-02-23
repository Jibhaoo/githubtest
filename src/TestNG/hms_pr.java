package TestNG;

import org.testng.annotations.Test;

import io.appium.java_client.functions.ExpectedCondition;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class hms_pr {
	WebDriver driver;
	
  @Test
  public void login() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.className("log")).click();
  }
  @Test(description="Verify the Permanent Registration functionality")
  public void test2(){
	
  driver.findElement(By.linkText("Registration")).click();
	
	driver.findElement(By.linkText("Permanent Registration")).click();
 
 }
 
 @Test (description = "login" )
  public void test3()
	{
		
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Staff");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Father");
		new Select(driver.findElement(By.name("TITLE"))).selectByIndex(1);
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("saraswati");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Raju");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByIndex(2);
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("sham");
		driver.findElement(By.name("LAST_NAME")).sendKeys("patil");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("1234567");
		driver.findElement(By.name("DOB")).click();
		driver.findElement(By.className("tcalSelected")).click();
		WebDriverWait wait = new WebDriverWait(driver,10)
			WebElement a = 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		driver.findElement(By.id("tcalPrevYear")).click();
		driver.findElement(By.xpath("//*[@id=\"tcalGrid\"]/tbody/tr[5]/td[4]")).click();
		
		
		
	}

  @BeforeTest
 void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\liabrary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  
	  driver.get("http://selenium4testing.com/hms/");
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
