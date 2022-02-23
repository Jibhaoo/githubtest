
package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasePage {
	public static WebDriver driver;
	@BeforeTest
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\library\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
	public void openUrl(String url)
	{
		driver.get(url);
	
	}
	
	public void entertext(By loc , String data) {
		driver.findElement(loc).sendKeys(data);

	}
	
	public void click(By loc) {
		driver.findElement(loc).click();
		
		
}
}
	