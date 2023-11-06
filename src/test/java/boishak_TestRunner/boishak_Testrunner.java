package boishak_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import boishak_Utility.boishak_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/boishak_features"},
plugin = {"json:target/cucumber.json"},
glue = "boishak_StepDefinition",tags = {"@Honey"})

public class boishak_Testrunner extends AbstractTestNGCucumberTests {

   @BeforeTest
   public void boiStarturl() {
	  boishak_Base boi= new boishak_Base();
	  boi.boibrowser();
   }
	
   
  @AfterTest
   public void boiCloseurl() {
	  boishak_Base boi= new boishak_Base();
     boi.driver.quit();
   }
	
	
	
	
	
	
	
	
	
	
}
