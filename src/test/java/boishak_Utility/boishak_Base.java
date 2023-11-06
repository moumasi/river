package boishak_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class boishak_Base {
   public static WebDriver driver;
   public static Properties boipro;
   
   
   public boishak_Base() {
	   try {
		FileInputStream boifle = new FileInputStream(System.getProperty("user.dir")+("//src/test//java/boishak_Config//boishak_Config.Properties"));
		   boipro= new Properties();
		   boipro.load(boifle);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Please look the code");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public void boibrowser() {
	  String boiallBrowser= boipro.getProperty("BoiBrowser1");
	  if(boiallBrowser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+ ("\\boishak\\boishak_ChromeDriver\\chromedriver.exe"));
		  ChromeOptions naz= new ChromeOptions();
		  naz.addArguments("--remote-allow-origins=*");
		  
		  driver= new ChromeDriver();
		  
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));   
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		  driver.manage().window().maximize(); 
	      }
	  else if(boiallBrowser.equalsIgnoreCase("Edge")) {
		  System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+ ("//boishak/boishak_EdgeDriver//msedgedriver.exe"));
		  EdgeOptions naz= new EdgeOptions();
		  naz.addArguments("--remote-allow-origins=*");
		  
		  driver= new EdgeDriver(); 
				  
		  
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(boishak_Utiliti.pageLoadTimeout));   
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(boishak_Utiliti.implicitlyWait)); 
		  driver.manage().window().maximize(); 
	      }
      }
     
     public static void boilaunchurl(String url) {
    	 driver.get(boipro.getProperty("Boiurl"));
     }
   
   
   
}


























