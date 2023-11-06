package boishak_StepDefinition;

import boishak_Utility.boishak_Base;
import boishak_Utility.boishak_Utiliti;
import boishak_pageAction.boishak_HomepageAction;
import boishak_pageAction.boishak_SignupPageAction;
import cucumber.api.java.en.Then;

public class boishak_Signup extends boishak_Base{
	
	boishak_HomepageAction HomepageAction=new boishak_HomepageAction();
	boishak_SignupPageAction SignupPageAction =new boishak_SignupPageAction();
	
	
	@Then("^Click on sign up link$")
	public void click_on_sign_up_link() throws Throwable {
		HomepageAction.Clickonsignuplink();
	   
	}

	@Then("^Enter boiusername passward and click signup$")
	public void enter_boiusername_passward_and_click_signup() throws Throwable {
		
		SignupPageAction.Enterboiusernamepasswardandclicksignup();
	}

	@Then("^Verify boiuser can signup$")
	public void verify_boiuser_can_signup() throws Throwable {
		HomepageAction.Verifyboiusercansignup();
		 
	}



}
