package week4.day2;

import wdMethods.SeMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FlipkartCompare extends SeMethods{
	
	
	@Test
	public void television() {
		
		
		startApp("chrome", "https://www.flipkart.com");
		WebElement closeAlert = locateElement("xpath", "//button[text()='✕']");
		click(closeAlert);
		WebElement television = locateElement("xpath", "//span[text()='TVs & Appliances']");
		WebElement eleSamsung = locateElement("xpath", "(//span[text()='Samsung'])[2]");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(television).pause(3000).click(eleSamsung).perform();
		WebElement minDD = locateElement("xpath", "//select[@class='fPjUPw']");
		selectDropDownUsingValue(minDD, "25000");
		WebElement maxDD = locateElement("xpath","(//select[@class='fPjUPw'])[2]" );
		selectDropDownUsingValue(maxDD, "60000");
		
		WebElement screensize = locateElement("xpath", "//*[contains(text(),'Screen Size')]");
		click(screensize);
		WebElement screensizecb = locateElement("xpath", "//*[contains(text(),'Screen Size')]//following::*[@class='_1p7h2j'][3]");
		click(screensizecb);
		
		WebElement firstProd = locateElement("class", "_1UoZlX");
		click(firstProd);
		
		
		
		
	
	}
}
