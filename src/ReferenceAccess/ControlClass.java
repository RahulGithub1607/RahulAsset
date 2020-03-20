package ReferenceAccess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class ControlClass {

	public static void main(String[] args) {
		
		WebDriver driver;

		//initialize chrome driver
		
		System.setProperty("webdriver.chrome.driver", "C://Rahul//Selenium//Selenium Total Backup//Selenium//Drivers//chromedriver.exe//");
	    driver= new ChromeDriver();
	     driver.get("https://www.facebook.com/");   //Enter the url
	     
        //DROP DOWN List Select type
	     
	     WebElement month_drop = driver.findElement(By.id("month"));
	     
	     Select month_dd =new Select(month_drop);
	     
	     month_dd.selectByVisibleText("Jul");  // By text
	     
	     
	     
	    
	}

}
