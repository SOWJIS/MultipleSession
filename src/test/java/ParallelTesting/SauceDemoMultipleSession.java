package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SauceDemoMultipleSession {
	WebDriver driver;
	   @Test(priority=1)   
	   public void executeSessionOne(){
	          //First session of WebDriver
	           driver = new EdgeDriver();
	           //Goto guru99 site
	           driver.get("http://demo.guru99.com/V4/");            
	       }
	      
	   @Test(priority=2)   
	       public void executeSessionTwo(){
	   	 //Second session of WebDriver
	       System.setProperty("C:\\Program Files\\Java\\chromedriver","chromedriver.exe"); 
	       driver = new ChromeDriver();
	        //Goto guru99 site
	       driver.get("http://demo.guru99.com/V4/");   
	       }
	      
	   @Test(priority=3)  
	       public void executeSessionThree(){
	       //Third session of WebDriver
	       driver = new FirefoxDriver();
	       //Goto guru99 site
	       driver.get("http://demo.guru99.com/V4/");
	       }       
	}


