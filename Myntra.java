package week5.day9and10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	
	public static void main(String[] args) throws InterruptedException {
		
		// launch the browser and disable Notifications
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("https://www.myntra.com/");

		// Mouse Over on Men
		
		Actions builder = new Actions(driver);
		WebElement eleMen = driver.findElementByLinkText("Men");
		builder.moveToElement(eleMen).perform();
		
		// Click on Jackets
		driver.findElementByLinkText("Jackets & Coats").click();

		// Find the count of Jackets
		
		WebElement eleJacketCnt = driver.findElementByXPath("//input[@value='Jackets']/following-sibling::span");
		String jacketCnt = eleJacketCnt.getText().replaceAll("\\D", "");
		System.out.println(jacketCnt);
		
		// Click on Jackets and confirm the count is same
		driver.findElementByXPath("//label[text()='Jackets']").click();

		// Wait for some time
		Thread.sleep(5000);

		// Check the count
		WebElement elejacketCntTop = driver.findElementByXPath("//h1[text() = 'Men Jackets Coats']/following-sibling::span");
		String jacketCntTop = elejacketCntTop.getText().replace("- ", "");
		String jacketCntTop1 = jacketCntTop.replace(" items", "");
		System.out.println(jacketCntTop1);
		
		// If both count matches, say success
		if(jacketCnt.equals(jacketCntTop1)) {
			System.out.println("The count matches on either case");
		}else {
			System.err.println("The count does not match");
		}

//		// Click on Offers
//		driver.findElementByXPath("//h3[text()='Offers']").click();

//		// Find the costliest Jacket
		
		List<WebElement> eleCostlyJacket = driver.findElementsByXPath("//span[@class='product-discountedPrice']");
		List<String> costlyJacketList = new ArrayList<String>();
		
		for (WebElement eleFindCostlyJacket : eleCostlyJacket) {
			costlyJacketList.add(eleFindCostlyJacket.getText().replace("Rs. ", ""));
		}
		
		//System.out.println("String List Output " + costlyJacketList);
		
		List<Integer> jacketCostInt = new ArrayList<Integer>();
		
		for(String numeric : costlyJacketList)
		{
			jacketCostInt.add(Integer.parseInt(numeric));
		}
		
		System.out.println("Int List Output" +jacketCostInt);
		
		// Sort them 
		int max = Collections.max(jacketCostInt);
		
		// Find the top one
		System.out.println(max);
		
		//Click on Search Box and type Allen
		//driver.findElementByXPath("(//div[@class='filter-search-filterSearchBox']//span)[1]").click();
	    //driver.findElementByXPath("//input[@placeholder='Search for Brand']").sendKeys("Allen");
		
		//click on Fort Collins Brand
		driver.findElementByXPath("//input[@value='Fort Collins']/following-sibling::div").click();

//		// Find the costliest Jacket
		List<WebElement> fortCollinsPrices = driver.findElementsByXPath("//span[@class='product-discountedPrice']");
        List<String> fortCollinsList = new ArrayList<String>();

		for (WebElement elefortCollins : fortCollinsPrices) {
			fortCollinsList.add(elefortCollins.getText().replaceAll("Rs. ", ""));
		}
         System.out.println(fortCollinsList);
         
		// Get the minimum Price 
        List <Integer> fortCollinsIntList = new ArrayList<Integer>();
        
        for (String numeric1 : fortCollinsList) {
        	fortCollinsIntList.add(Integer.parseInt(numeric1));
		}
        
       int min = Collections.min(fortCollinsIntList);
       
		// Find the lowest priced Allen Solly
		System.out.println(min);
	}

}
