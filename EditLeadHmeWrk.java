package week3.day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadHmeWrk {

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
		
		//Enter First Name
//		List<WebElement> findElementsByName = driver.findElementsByName("firstName");
//		for(int i=1;i<findElementsByName.size();i++)
//		{
//			driver.findElementByName("firstName").
//		}
		//driver.findElementByXPath("//div[@id = 'x-form-el-ext-gen255']/*").sendKeys("Boj");
		//WebElement cls=ff.findElement(By.xpath("//*[starts-with(@id,'u_')   and ends-with(@id, '_5']"));
		//driver.findElement(By.xpath("//*[starts-with(@id,'ext-gen')"));
		//div[@class = 'subSectionBlock']//form//div
		driver.findElementByXPath("(//div[@class = 'subSectionBlock']//input//preceding::input)[36]").sendKeys("Shaktdi");
		  
		//Click Find Leads Button
		driver.findElementByXPath("//div[@class = 'x-panel-footer x-panel-footer-noborder']/*/*/*/*/*/*").click(); 
		
		//Click on First Resulting output
		//driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]/*/*/*/*/*)[1]").click();
		//driver.findElementByXPath("//a[text() = '10160']").click();
		//driver.findElementByXPath("//a [@href = '/crmsfa/control/viewLead?partyId=10160']").click();
		//driver.findElementByLinkText("BNY Mellon Technologies").click();
		Thread.sleep(4000);
		driver.findElementByXPath("(//div[@class = 'x-panel x-grid-panel']//table/following::div/*//td/*/a)[1]").click();
		
		// Verify title of the page
		String verifyTitle = driver.getTitle();
		
		if (verifyTitle.equalsIgnoreCase("View Lead | opentaps CRM")) 
		{
			System.out.println("Title Verified and Passed");
		} else 
		{
			System.out.println("Title Verified and Failed");
		}
		
		// Click on Edit Button
		
		driver.findElementByXPath("//a[text()='Edit']").click();
		
		// Edit Company Name
		
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Inautix Technologies");
		
		// Click Update Button
		
		driver.findElementByXPath("(//input[@class = 'smallSubmit'])[1]").click();
		
		// Confirm the Name is changed
		
		String companyName = driver.findElementById("viewLead_companyName_sp").getText();
		
		if (companyName.equalsIgnoreCase("Inautix Technologies (10098)")) {
			System.out.println("Company Name Verified and Passed");
		} else 
		{
			System.out.println("Company Name Verified and Failed");
		}
	
		// Close the Browser
		
		driver.quit();
		
	}
		
}

