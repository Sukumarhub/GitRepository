package week3.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompatibleBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementByLinkText("Contact Us").click();
		driver.findElementByLinkText("Compatible Browser").click();

		Set<String> window = driver.getWindowHandles();
		List< String> allwindow = new ArrayList<String> ();
		allwindow.addAll(window);
		driver.switchTo().window(allwindow.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());


		driver.switchTo().window(allwindow.get(2));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());

		driver.switchTo().window(allwindow.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());


		WebElement browser = driver.findElementByXPath("//div[@class='container']/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/ul/li[1]");
		System.out.println(browser.getText());
		WebElement browser1 = driver.findElementByXPath("//div[@class='container']/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/ul/li[2]");
		System.out.println(browser1.getText());
		WebElement browser2 = driver.findElementByXPath("//div[@class='container']/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/ul/li[3]");
		System.out.println(browser2.getText());
		WebElement browser3 = driver.findElementByXPath("//div[@class='container']/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/ul/li[4]");
		System.out.println(browser3.getText());
		WebElement browser4 = driver.findElementByXPath("//div[@class='container']/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/ul/li[5]");
		System.out.println(browser4.getText());


		driver.close();
		/*String firstPage = driver.getWindowHandle();
		System.out.println(firstPage);
		driver.findElementByLinkText("Contact Us").click();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String secondPage = driver.getWindowHandle();
		System.out.println(secondPage);

		driver.switchTo().window(firstPage);
		driver.findElementByLinkText("Compatible Browser").click();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String thirdPage = driver.getWindowHandle();
		System.out.println(thirdPage);
		//System.out.println(driver.getWindowHandle());
		System.out.println(driver.findElementByXPath("/html/body/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/ul/li[1]"));
		driver.switchTo().window(firstPage);*/




	}

}
