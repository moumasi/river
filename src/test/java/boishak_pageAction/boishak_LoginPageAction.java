package boishak_pageAction;

import boishak_Utility.boishak_Base;
import boishak_pageLocator.boishak_LoginPageLocator;

public class boishak_LoginPageAction extends boishak_Base{
	
	boishak_LoginPageLocator loginpagelocator= new boishak_LoginPageLocator();
	
	public void Typeusernameandpasswardclicklogin(String u, String p) throws Exception {
		  Thread.sleep(6000);
	     loginpagelocator.boiusername.sendKeys(u);
	     loginpagelocator.boipassward.sendKeys(p);
	     loginpagelocator.logButton.click();
		
		
	}

}
