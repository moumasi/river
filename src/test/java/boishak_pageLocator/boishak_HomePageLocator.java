package boishak_pageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import boishak_Utility.boishak_Base;

public class boishak_HomePageLocator extends boishak_Base {

	public  boishak_HomePageLocator() {
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(id= "login2")
	public WebElement link;

	
	@FindBy(id= "signin2")
	public WebElement boisignuplink;	
	
	@FindBy(xpath="//a[text()='Contact']")
	public WebElement boicontactlink;
	
	
	@FindBy(xpath="//a[text()='About us']")
	public WebElement link2;
	
	
	
}