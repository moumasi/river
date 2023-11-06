package boishak_pageAction;

import boishak_Utility.boishak_Base;
import boishak_Utility.boishak_TestData;
import boishak_Utility.boishak_Utiliti;
import boishak_pageLocator.boishak_SignupPagelocator;

public class boishak_SignupPageAction extends boishak_Base{
	
	boishak_SignupPagelocator SignupPagelocator =new boishak_SignupPagelocator ();
	  public void Enterboiusernamepasswardandclicksignup() throws Exception {
		  Thread.sleep(5000);
		  SignupPagelocator.boiusername.sendKeys( boishak_TestData.boiusername2);
		  SignupPagelocator.boipassward.sendKeys( boishak_TestData.boipassward2);
		  SignupPagelocator.signupbutton.click();
		  boishak_Utiliti.takeMyScreenshot(driver, "Signup");
	  }
}
