package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadDropDown {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		List<WebElement> src =driver.findElementsByTagName("select");
		int size = src.size();
		System.out.println(size);
		src.get(2);
		
//		WebElement dd = driver.findElementById("createLeadForm_dataSourceId");
//		Select drop = new Select(dd);
//		drop.selectByIndex(2);
		
	}

}
