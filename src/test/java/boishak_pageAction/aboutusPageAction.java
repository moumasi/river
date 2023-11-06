package boishak_pageAction;

import boishak_Utility.boishak_Base;
import boishak_pageLocator.aboutusPagelocator;

public class aboutusPageAction extends boishak_Base {
	
	aboutusPagelocator boiAboutus= new aboutusPagelocator ();
	
    public void  Verifyusercanclickonlink() {
    	boiAboutus.aboutuspage.click();
    	
    }

}
