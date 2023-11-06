package boishak_StepDefinition;

import boishak_Utility.boishak_Base;
import boishak_pageAction.aboutusPageAction;
import boishak_pageAction.boishak_HomepageAction;
import cucumber.api.java.en.Then;

public class boishak_aboutus extends boishak_Base {
	boishak_HomepageAction HomepageAction = new boishak_HomepageAction ();
	 aboutusPageAction  PageAction = new  aboutusPageAction();
	@Then("^Click on About us link$")
	public void click_on_About_us_link() throws Throwable {
		HomepageAction.ThenClickonAboutuslink();
	}

	@Then("^Verify user can click on link$")
	public void verify_user_can_click_on_link() throws Throwable {
		
		PageAction.Verifyusercanclickonlink();
	}



}
