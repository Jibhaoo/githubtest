package testReport_POI;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class LoginRetesting_Results {

	WebDriver driver;
 
 @Test
 
 public void f() throws Exception {

	  FileInputStream fi=new FileInputStream("C:\\Users\\HP\\Desktop\\SOFTWARE TESTING PROGRAMS\\TestData\\LoginData.xlsx");
	
  XSSFWorkbook w=new XSSFWorkbook(fi);
	
  Sheet s=w.getSheet("login");
	  
System.out.println("No of rows : "+s.getLastRowNum());
	
  
  for (int i = 1; i <= s.getLastRowNum(); i++) 
{

		


	  Row r=s.getRow(i);
	
	  Cell username=r.getCell(0);
	
	  Cell pasword=r.getCell(1);
	
	System.out.println(r.getCell(0).toString());
	
	System.out.println(pasword);
	
	
		 driver.findElement(By.name("username")).sendKeys(r.getCell(0).toString());

		  driver.findElement(By.name("password")).sendKeys(pasword.toString());
		
  driver.findElement(By.name("submit")).click(); 

		  Thread.sleep(2000);
	
	  try{
			 
 driver.findElement(By.linkText("Logout")).click();  
	
   // new Select(driver.findElement(By.name(""))).selectByIndex(i);
		  System.out.println("Valid Credential");
	
		 	
  }
	  catch(Exception e)
{

			  driver.switchTo().alert().accept();
	
		  System.out.println("InValid Credential");
		
	  	
  }
		
 
}
 
 }
 
 @BeforeTest
 
 public void beforeTest() {

	  System.setProperty("webdriver.chrome.driver", "F:\\library\\Chrome\\chromedriver.exe");
	
  driver=new ChromeDriver();
	 
 driver.manage().window().maximize();

	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
  driver.get("http://selenium4testing.com/hms");
 
 }

 
 @AfterTest
 
 public void afterTest() {

	  
 
 }


}
