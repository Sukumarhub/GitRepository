package week3.homework;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class draggable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryui.com");
		driver.findElementByLinkText("Draggable").click();
		driver.switchTo().frame(0);
		WebElement abc = driver.findElementByXPath("//div[@id='draggable']/p");
		System.out.println(abc.getText());
	}

}
