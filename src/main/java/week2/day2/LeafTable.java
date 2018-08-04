package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();

	/*	WebElement table = driver.findElementByXPath("//section[@class='innerblock']/div/table");
		List<WebElement> row = table.findElements(By.tagName("tr"));
	
		System.out.println(row.size());*/
		
		
		WebElement table1 = driver.findElementByXPath("//section[@class='innerblock']/div/table//tr[2]");
		List<WebElement> row1 = table1.findElements(By.tagName("td"));
		System.out.println(row1.size());
		


		String table2 = driver.findElementByXPath("//tbody/tr[3]/td[2]").getText();
	//	List<WebElement> row2 = table2.findElements(By.tagName("td"));
	//	System.out.println(row2.get(2));
		
		
		
		String text = table1.findElements(By.tagName("td")).get(2).getText();
		System.out.println(table2);
		
		
		
	}

}
