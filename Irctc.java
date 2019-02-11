package week3.day5;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// set Chrome driver
	      System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      // Load URL
	      driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
	      // Input User Name
	      WebElement userId = driver.findElementById("userRegistrationForm:userName");
	      userId.sendKeys("saimohan50");
	      //Click on Check Availability
	      WebElement checkAvail = driver.findElementById("userRegistrationForm:checkavail");
	      checkAvail.click();
	      // Input Password
	      WebElement passWord = driver.findElementById("userRegistrationForm:password");
	      passWord.sendKeys("xyz@345");
	      // Input Confirm Password
	      WebElement confPwd = driver.findElementById("userRegistrationForm:confpasword");
	      confPwd.sendKeys("xyz@345");
	      //Select the second value from Security Qn dropdown
	      WebElement secQnDrpDown = driver.findElementById("userRegistrationForm:securityQ");
	      Select secDrp = new Select (secQnDrpDown);
	      secDrp.selectByIndex(1);
	      //Input Security Answer
	      WebElement SecAns = driver.findElementById("userRegistrationForm:securityAnswer");
	      SecAns.sendKeys("Tinku");
	      // Select Preferred Language
	      WebElement preLangDrpDown = driver.findElementById("userRegistrationForm:prelan");
	      Select preDrp = new Select (preLangDrpDown);
	      preDrp.selectByIndex(1);
	      // Input First Name
	      WebElement firstName = driver.findElementById("userRegistrationForm:firstName");
	      firstName.sendKeys("Shaktdi");
	      // Input Middle Name
	      WebElement middName = driver.findElementById("userRegistrationForm:middleName");
	      middName.sendKeys("Dhur");
	      // Input Last Name
	      WebElement lastName = driver.findElementById("userRegistrationForm:lastName");
	      lastName.sendKeys("Mohandass");
	      // Select Gender
	      WebElement genDer = driver.findElementById("userRegistrationForm:gender:0");
	      genDer.click();
	      // Select Marital Status
	      WebElement marStatus = driver.findElementById("userRegistrationForm:maritalStatus:0");
	      marStatus.click();
	      // Select Day
	      WebElement daTe = driver.findElementById("userRegistrationForm:dobDay");
	      Select dateDrpDwn = new Select(daTe);
	      dateDrpDwn.selectByIndex(5);
	      // Select Month
	      WebElement monTh = driver.findElementById("userRegistrationForm:dobMonth");
	      Select monThDrpDwn = new Select (monTh);
	      monThDrpDwn.selectByVisibleText("OCT");
	      // Select Year
	      WebElement yeAr = driver.findElementById("userRegistrationForm:dateOfBirth");
	      Select yeArDrpDwn = new Select (yeAr);
	      yeArDrpDwn.selectByIndex(15);
	      //Select Occupation
	      WebElement occuPation = driver.findElementById("userRegistrationForm:occupation");
          Select occuPDrpDwn = new Select (occuPation);
          occuPDrpDwn.selectByVisibleText("Professional");
          //Select Country
          WebElement counTry = driver.findElementById("userRegistrationForm:countries");
          Select counTryDrpDwn = new Select (counTry);
          counTryDrpDwn.selectByIndex(1);
          // Input Email
          WebElement eMail = driver.findElementById("userRegistrationForm:email");
          eMail.sendKeys("ShaktdiMohandass@gmail.com");
          // Input ISD
          //WebElement iSd = driver.findElementById("userRegistrationForm:isdCode");
          //iSd.sendKeys("+91");
          // Input Mobile
          WebElement moBile = driver.findElementById("userRegistrationForm:mobile");
          moBile.sendKeys("9790910085");
          // Select Nationality
          WebElement natioNality = driver.findElementById("userRegistrationForm:nationalityId");
          Select natioDrpDwn = new Select(natioNality);
          natioDrpDwn.selectByVisibleText("India");
          // Input Flat/Door/Bock
          WebElement flAt = driver.findElementById("userRegistrationForm:address");
          flAt.sendKeys("No1 Flat D");
          //Input city Name
          WebElement ciTy = driver.findElementById("userRegistrationForm:cityName");
          ciTy.sendKeys("Chennai");
          // Input Pincode
          WebElement pIn = driver.findElementById("userRegistrationForm:pincode");
          pIn.sendKeys("600073",Keys.TAB);
          Thread.sleep(5000);
          // Input State
          //WebElement stAte = driver.findElementById("userRegistrationForm:statesName");
          //stAte.sendKeys("Tamil Nadu");
          //Thread.sleep(5000);
          // Select City/Town
          WebElement ciTy1 = driver.findElementById("userRegistrationForm:cityName");
          Select ciTyDrpDwn = new Select (ciTy1);
          ciTyDrpDwn.selectByIndex(1);
          Thread.sleep(5000);
          // Select Post Office
          WebElement poSt = driver.findElementById("userRegistrationForm:postofficeName");
          Select poStDrpDwn = new Select (poSt);
          poStDrpDwn.selectByIndex(1);
          Thread.sleep(5000);
          // Input Phone
          WebElement lAn = driver.findElementById("userRegistrationForm:landline");
          lAn.sendKeys("04426589200");
	}

}
