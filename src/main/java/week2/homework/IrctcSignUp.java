package week2.homework;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("Lingamkarur");
		driver.findElementById("userRegistrationForm:password").sendKeys("Karur@222");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Karur@222");
		
		
		WebElement elemnt = driver.findElementById("userRegistrationForm:securityQ");
		Select se = new Select(elemnt);
		se.selectByIndex(1);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("brucy");
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Basker");
		WebElement gender = driver.findElement(By.id("userRegistrationForm:gender:1"));
		gender.click();
		

		WebElement marriage = driver.findElement(By.id("userRegistrationForm:maritalStatus:0"));
		marriage.click();

		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select sel = new Select(country);
		sel.selectByIndex(1);
		
		WebElement pin = driver.findElementById("userRegistrationForm:pincode");
		pin.sendKeys("639114");
		pin.sendKeys(Keys.TAB);

	

		
	}

}
