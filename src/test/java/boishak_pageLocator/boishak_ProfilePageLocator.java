package boishak_pageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import boishak_Utility.boishak_Base;

public class boishak_ProfilePageLocator extends boishak_Base{
	
	public  boishak_ProfilePageLocator() {
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(id= "nameofuser")
	public WebElement profile;

	
	@FindBy(id= "logout2")
	public WebElement boilogout;	
	
	@FindBy(id= "")
	public WebElement ui;
	

}
