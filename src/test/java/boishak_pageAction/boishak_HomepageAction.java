package boishak_pageAction;

import org.testng.Assert;

import boishak_Utility.boishak_Base;
import boishak_Utility.boishak_Utiliti;
import boishak_pageLocator.boishak_HomePageLocator;

public class boishak_HomepageAction extends boishak_Base {
	                                                                                                                                                                       
	boishak_HomePageLocator homepagelocator= new boishak_HomePageLocator();
	
	public void clickboiloginlink() {
		
		homepagelocator.link.click();
		
		
	}
	public void Clickonsignuplink() {
		homepagelocator.boisignuplink.click();
		
	}
	public void Verifyboiusercansignup() throws Exception {
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
		boolean signupsucess=homepagelocator.boisignuplink.isDisplayed();
		Assert.assertTrue(signupsucess);
		 
		 }
	
   public void  Clickoncontactlink() {
	   
    	homepagelocator.boicontactlink.click();
    }
   public void ThenClickonAboutuslink() {
	   homepagelocator.link2.click();
   }

}
