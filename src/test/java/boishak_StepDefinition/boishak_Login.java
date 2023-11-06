package boishak_StepDefinition;

import boishak_Utility.boishak_Base;
import boishak_Utility.boishak_Utiliti;
import boishak_pageAction.boishak_HomepageAction;
import boishak_pageAction.boishak_LoginPageAction;
import boishak_pageAction.boishak_ProfilepageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class boishak_Login extends boishak_Base {
     
	boishak_HomepageAction HomepageAction = new boishak_HomepageAction ();
	boishak_LoginPageAction LoginPageAction = new boishak_LoginPageAction();
	boishak_ProfilepageAction ProfilepageAction = new boishak_ProfilepageAction();
	
	@Given("^Launch <\"([^\"]*)\"> boi$")
	public void launch_boi(String url) throws Throwable {
		boilaunchurl(url);
		 boishak_Utiliti.takeMyScreenshot(driver, "Home page");
	}
	@Then("^click boilogin link$")
	public void click_boilogin_link() throws Throwable {
		HomepageAction.clickboiloginlink();
	  
	}


	@Then("^Type username and passward click login$")
	public void type_username_and_passward_click_login() throws Throwable {
		 LoginPageAction.Typeusernameandpasswardclicklogin(boipro.getProperty("Boiusername"), boipro.getProperty("Boipassword"));
		 
	  
	}

	@Then("^verify user can log in successfully$")
	public void verify_user_can_log_in_successfully() throws Throwable {
		ProfilepageAction.verifyusercanloginsuccessfully();
	   
	}
	@Then("^Logout the site$")
	public void logout_the_site() throws Throwable {
		ProfilepageAction.Logoutthesite();
	}




}
