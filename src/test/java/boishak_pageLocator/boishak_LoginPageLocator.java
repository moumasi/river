package boishak_pageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import boishak_Utility.boishak_Base;

public class boishak_LoginPageLocator extends boishak_Base {
	
	public  boishak_LoginPageLocator() {
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(id= "loginusername")
	public WebElement boiusername;

	
	@FindBy(id= "loginpassword")
	public WebElement boipassward;	
	
	@FindBy(xpath= "//button[text()='Log in']")
	public WebElement logButton;
	
	
}


