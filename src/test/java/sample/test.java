package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{

	
	public static void main(String[] args)
	{
		 // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");  
	    WebDriver driver=new ChromeDriver();  
	      
	// Launch website  
	    driver.navigate().to("http://www.google.com/");  
	          
	}
}
