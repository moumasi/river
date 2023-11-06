package boishak_pageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import boishak_Utility.boishak_Base;

public class aboutusPagelocator extends boishak_Base{
	
	public void  aboutusPagelocato() {
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath="/html/body/div[4]/div/div/div[3]/button")
	public WebElement aboutuspage;



}
