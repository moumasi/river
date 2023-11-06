package boishak_pageAction;

import boishak_Utility.boishak_Base;
import boishak_Utility.boishak_Utiliti;
import boishak_pageLocator.boishak_ContactPagelocator;

public class boishak_ContactPageAction extends boishak_Base {
	

	boishak_ContactPagelocator ContactPagelocator=new boishak_ContactPagelocator();
	
	public void Verifyafterclickcontactpageisdisplay() {
		 ContactPagelocator.contactpage.click();
		 driver.switchTo().alert().accept();
		 boishak_Utiliti.takeMyScreenshot(driver, "Contact page");
	}

}
