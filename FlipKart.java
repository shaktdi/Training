package week3.day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		// set Chrome driver
	      System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      // Load URL
	      driver.get("https://www.flipkart.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.getKeyboard().sendKeys(Keys.ESCAPE);
	      Actions builder = new Actions(driver);
	      WebElement tVAppl = driver.findElementByXPath("//span[text() ='TVs & Appliances']");
	      builder.moveToElement(tVAppl).perform();
	      //Thread.sleep(3000);
	      WebDriverWait wbwait = new WebDriverWait(driver,20);
	      WebElement samClick = driver.findElementByLinkText("Samsung");
	      //samClick.click();
	      wbwait.until(ExpectedConditions.elementToBeClickable(samClick)).click();
	}
}
