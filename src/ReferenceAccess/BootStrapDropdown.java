package ReferenceAccess;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {

	public static void main(String[] args) {
		
		WebDriver driver;

		//initialize chrome driver
		
		System.setProperty("webdriver.chrome.driver", "C://Rahul//Selenium//Selenium Total Backup//Selenium//Drivers//chromedriver.exe//");
	    driver= new ChromeDriver();
	     driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/ ");   //Enter the url
		 
	     //Click on the drop down list
	     
	     driver.findElement(By.xpath("//button[contains(@class,'btn btn-secondary dropdown-toggle') and @id='dropdownMenuButton' ]")).click();
	     
	     
	     //now after clicked 
	     
	  List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//a"));
	
	    System.out.println("The size of list :-"+list.size());
	    
	    for(int i=0;i<list.size();i++)
	    {
	    	System.out.println("List of element:-"+list.get(i).getText());
	    	if(list.get(i).getText().contains("Action"))	//Action need to select from the Drop
	    	{
	    		list.get(i).click();
	    		System.out.println("Selected drop down list is :-"+list.get(i).getText());
	    		break;
	    	}
	    	
	    }
	
	
	}

}
