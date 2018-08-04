package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setHeadless(true);
		ChromeDriver driver = new ChromeDriver(opt);

		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("test");
		driver.findElementById("createLeadForm_firstName").sendKeys("Saravana");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
	
		
		WebElement src = driver.findElementById("createLeadForm_industryEnumId");
		Select dd = new Select(src);
		dd.selectByIndex(8);
		
		
	//	dd.selectByValue("IND_INSURANCE");
		String aa = src.getText();
		System.out.println(aa);
//		List<WebElement> selectoption = dd.getOptions();
//		int size = selectoption.size();
//		System.out.println(size);
		driver.findElementByName("submitButton").click();
	}

}
