package boishak_pageAction;

import org.testng.Assert;

import boishak_Utility.boishak_Base;
import boishak_Utility.boishak_Utiliti;
import boishak_pageLocator.boishak_ProfilePageLocator;

public class boishak_ProfilepageAction extends boishak_Base {
	
	boishak_ProfilePageLocator profilpagelocator= new boishak_ProfilePageLocator ();
	 
	public void verifyusercanloginsuccessfully() throws Exception {
		
		Thread.sleep(5000);
    boolean profileverify= profilpagelocator.profile.isDisplayed();
    
		Assert.assertTrue(profileverify);
		 boishak_Utiliti.takeMyScreenshot(driver, "Profile page");
	}
	public void Logoutthesite() throws Exception {
		Thread.sleep(2000);
        profilpagelocator.boilogout.click();
	}
}
