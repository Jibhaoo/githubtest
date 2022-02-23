package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class create_patient {
	WebDriver driver;
	
	 @Test(description="Verify the login functionality")
	  public void test1()  throws Exception{
		
	  driver.findElement(By.name("username")).sendKeys("admin");
		
	  driver.findElement(By.name("password")).sendKeys("admin");

		  driver.findElement(By.name("submit")).click();
	 
	  }

	  @Test(description="Verify the Permanent Registration functionality")
	  public void test2(){
		
	  driver.findElement(By.linkText("Registration")).click();
		
		driver.findElement(By.linkText("Permanent Registration")).click();
	 
	 }
	 
	 @Test(description="Verify the patient creation in PR")
	  public void test3() throws Exception{
		 new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Insurance");
		  new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		  new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		  driver.findElement(By.name("PNT_NAME")).sendKeys("ravan");
		  new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
		  driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("8888888888");
		  driver.findElement(By.name("LAST_NAME")).sendKeys("xyz");
		  new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		  
		  driver.findElement(By.name("AGE")).sendKeys("26");
		  new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		  new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		


		  driver.findElement(By.name("DOB")).click();
		  
			 driver.findElement(By.name("image")).sendKeys("D:\\shambhu-raje-painting-with-lion.jpg");
		
	  driver.findElement(By.xpath(".//*[@id='form1']/div[1]/table/tbody/tr[18]/td[3]/input")).click();

	  

	}

	  @BeforeTest
	  @Parameters("browser")

	  public void beforeTest(String BrowserName)  throws Exception{
		if(BrowserName.equalsIgnoreCase("firefox"))
		{
	 System.setProperty("webdriver.gecko.driver", "C:\\liabrary\\geckodriver.exe");

		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
			
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				  driver.get("http://selenium4testing.com/hms");
			  
		  Thread.sleep(5000);
		}
		else if(BrowserName.equalsIgnoreCase("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\liabrary\\chromedriver.exe");
			  driver=new ChromeDriver();
		}
		
		  driver.manage().window().maximize();
		
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		  driver.get("http://selenium4testing.com/hms");
	  
	}


	  @AfterTest
	 
	 public void afterTest() {

		//  driver.quit();
	 
	 }


	}
