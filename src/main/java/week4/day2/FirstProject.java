package week4.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FirstProject {

	@Test
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Entering URl
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		//Entering Username and password
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Contact").click();

		driver.findElementById("firstNameField").sendKeys("John");
		driver.findElementById("lastNameField").sendKeys("Wick");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("John");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("Wick");

		driver.findElementById("createContactForm_personalTitle").sendKeys("Mr.");

		driver.findElementById("createContactForm_birthDate").sendKeys("07/19/93");

		driver.findElementById("createContactForm_generalProfTitle").sendKeys("Doctor");

		driver.findElementById("createContactForm_departmentName").sendKeys("Police");

		WebElement eleCurrency = driver.findElementById("createContactForm_preferredCurrencyUomId");

		Select selec = new Select(eleCurrency);
		selec.selectByValue("INR");

		driver.findElementById("createContactForm_description").sendKeys("The Elite police officer who is in undercover ops");

		driver.findElementById("createContactForm_importantNote").sendKeys("John wick is a FBI Agent");

		//Contact Info
		driver.findElementById("createContactForm_primaryPhoneCountryCode").sendKeys("1");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("12345");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("9876543219");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("04324");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("04324");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("johnwick@mail.com");

		//Primary Address


		driver.findElementByXPath("	//input[@id='createContactForm_generalAttnName']").sendKeys("Pot");
		driver.findElementByXPath("	//input[@id='createContactForm_generalAddress1']").sendKeys("Flat 5 Kekaran Mekaran ");
		driver.findElementByXPath("	//input[@id='createContactForm_generalAddress2']").sendKeys("Cross Street Road");
		driver.findElementByXPath("	//input[@id='createContactForm_generalCity']").sendKeys("Chennai");
		WebElement country = driver.findElementById("createContactForm_generalCountryGeoId");
		Select cc = new Select(country);
		cc.selectByValue("IND");	
		Thread.sleep(3000);
		WebElement province = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select state = new Select(province);
		state.selectByValue("IN-TN");

		driver.findElementById("createContactForm_generalPostalCode").sendKeys("253641");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("005");
		driver.findElementByClassName("smallSubmit").click();

		//View Contact page
		WebElement eleFullId = driver.findElementById("viewContact_fullName_sp");
		String fullName = eleFullId.getText();

		WebElement eleFirstName = driver.findElementById("viewContact_firstName_sp");
		String firstName = eleFirstName.getText();

		if(fullName.contains(firstName)) {
			System.out.println("First name is Matched");
		}else {
			System.out.println("First name is not Matched");
		}
		
		driver.findElementByLinkText("Edit").click();

		
		//Edit Contact Page
		
		WebElement marketingDD = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		String market2 = marketingDD.getText();
		System.out.println(market2);
		Select sel = new Select(marketingDD);
		sel.selectByValue("CATRQ_AUTOMOBILE");
		driver.findElementByXPath("(//input[@class='smallSubmit'])[2]").click();
		driver.findElementByXPath("(//input[@class='smallSubmit'])").click();
		
		//update page
		
		

		WebElement elemarket1 = driver.findElementById("viewContact_marketingCampaigns_sp");
		String market1 = elemarket1.getText();
		
		if(market2.contains(market1)) {
			System.out.println("Marketing Campaigns is Matched");
		}else {
			System.out.println("Marketing Campaigns is not Matched");	
		}
		
		
		
		
		
	}

}
