package week3.day6;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsErail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driv = new ChromeDriver();
		driv.get("https://erail.in/Agent-Registration-Enquiry.aspx");
		
		WebElement ele = driv.findElementById("ddState");
		Select allop=new Select(ele);
		List<WebElement> opt = allop.getOptions();
		System.out.println(opt.size());
		for (WebElement ele1 : opt) {
			System.out.println(ele1.getText());
		}


	}

}
