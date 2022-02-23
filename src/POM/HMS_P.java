
package POM;

import org.testng.annotations.Test;

public class HMS_P extends BasePage
{
	public HMS_PR hms= new HMS_PR();
	@Test
	public void launchUrl()
	
	{
		OpenBrowser();
		openUrl("http://selenium4testing.com/hms");
		
	}
	@Test
	public void login() {
		entertext(hms.username, "admin");
		entertext(hms.password, "admin");
		click(hms.login);
		
		
	}
	

}