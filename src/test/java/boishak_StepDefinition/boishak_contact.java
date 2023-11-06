package boishak_StepDefinition;

import boishak_Utility.boishak_Base;
import boishak_pageAction.boishak_ContactPageAction;
import boishak_pageAction.boishak_HomepageAction;
import cucumber.api.java.en.Then;

public class boishak_contact extends boishak_Base{
	 boishak_HomepageAction  HomepageAction = new  boishak_HomepageAction();
	 boishak_ContactPageAction ContactPageAction =new boishak_ContactPageAction();
	
	@Then("^Click on contact link$")
	public void click_on_contact_link() throws Throwable {
		HomepageAction.Clickoncontactlink();
	    
	}

	@Then("^Verify after click contact page is display$")
	public void verify_after_click_contact_page_is_display() throws Throwable {
		ContactPageAction.Verifyafterclickcontactpageisdisplay();
	}




}
