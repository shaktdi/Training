package week8.day15and16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UipathProject{
	
	@Test
	public void uiPath(){
    		
		// set Chrome driver
				System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				// Launch the Browser
				driver.get("https://acme-test.uipath.com/account/login");
				
				// implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				// Enter User Name
				driver.findElementById("email").sendKeys("shaktdimohandass@gmail.com");
				
				// Enter Password
				driver.findElementById("password").sendKeys("abcd@12345");
				
				//CLick Login
				driver.findElementById("buttonLogin").click();
				
				// mouse hover on vendors
				Actions builder = new Actions(driver);
				WebElement vendor = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");
			    builder.moveToElement(vendor).perform();
				
				WebDriverWait wbwait = new WebDriverWait(driver,20);
			    WebElement searchClick = driver.findElementByLinkText("Search for Vendor");
			    //samClick.click();
			    wbwait.until(ExpectedConditions.elementToBeClickable(searchClick)).click();

			    // enter tax id
			    driver.findElementById("vendorTaxID").sendKeys("IT754893");
			    
			    //click search
			    driver.findElementById("buttonSearch").click();
			    
			    //get the name
			    System.out.println(driver.findElementByXPath("(//table/tbody/tr)[2]/td").getText());
			    
			    // go to Home page
			    driver.findElementByLinkText("Home").click();
			      
	}  
    		

}