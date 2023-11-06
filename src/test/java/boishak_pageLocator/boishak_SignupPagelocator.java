package boishak_pageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import boishak_Utility.boishak_Base;

public class boishak_SignupPagelocator extends boishak_Base{
	
	public   boishak_SignupPagelocator() {
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(id= "sign-username")
	public WebElement boiusername;

	
	@FindBy(id= "sign-password")
	public WebElement boipassward;	
	
	@FindBy(xpath = "//button[text()='Sign up']")
	public WebElement signupbutton;
	

}
