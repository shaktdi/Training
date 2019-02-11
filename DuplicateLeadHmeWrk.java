package week3.day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLeadHmeWrk {

	public static void main(String[] args) throws InterruptedException {
		// set Chrome driver
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Launch the Browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Enter User Name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		// Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		// LoginClick
		driver.findElementByClassName("decorativeSubmit").click();
		
		//crmsfa click
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click Leads Link
		driver.findElementByLinkText("Leads").click();
		
		//Click Find Leads Link
		driver.findElementByLinkText("Find Leads").click();
		
		//Click on EMail tab
		driver.findElementByXPath("//span[text() = 'Email']").click();
		
		//Enter Email Address
		driver.findElementByName("emailAddress").sendKeys("gayatri@testleaf.com");
		
		//Click Find Leads Button
		driver.findElementByXPath("(//button[@class = 'x-btn-text'])[7]").click();
		Thread.sleep(4000);
		
		// Capture Name of First resulting lead
        String naMe = driver.findElementByXPath("(//div[@class = 'x-panel x-grid-panel']//table/following::div/*//td/*/a)[3]").getText();
        System.out.println("Name of First Resulting Lead is " + naMe);
        		
		// Click on First Resulting lead
		driver.findElementByXPath("(//div[@class = 'x-panel x-grid-panel']//table/following::div/*//td/*/a)[1]").click();
		
		// Click Duplicate lead
		driver.findElementByXPath("((//div[@class = 'frameSectionExtra'])[2]/a)[1]").click();
		
		//Verify Page title
		String titleChk = driver.getTitle();
		
		if (titleChk.contains("Duplicate Lead")) {
			System.out.println("Title verified and Passed");
		} else {
			System.out.println("Title verified and Failed");
		}
		
		//Click on create Lead
		driver.findElementByXPath("(//input[@name = 'submitButton'])[1]").click();
		
		// Get the Duplicated Lead Name
		String dupLeadName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println("Name of duplicate Lead is "+ dupLeadName);
		
		if (naMe.equalsIgnoreCase(dupLeadName)) {
			System.out.println("Name Verified and Test Case Passed");
		} else {
			System.out.println("Name Verified and Test case Failed");
		}
		
	    // Close the Browser	
		driver.quit();
		
	}
		
}

