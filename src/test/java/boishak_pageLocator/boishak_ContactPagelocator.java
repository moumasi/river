package boishak_pageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import boishak_Utility.boishak_Base;

public class boishak_ContactPagelocator extends boishak_Base {
	
	public  boishak_ContactPagelocator() {
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath="//button[text()='Send message']")
	public WebElement contactpage;


}
