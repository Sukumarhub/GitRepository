package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JquerySortable {

	@Test
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/");

		driver.findElementByLinkText("Sortable").click();
		WebElement eleframe = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(eleframe);
		
		WebElement item1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		WebElement item5 = driver.findElementByXPath("//ul[@id='sortable']/li[5]");
		int x = item5.getLocation().getX();
		int y = item5.getLocation().getY();
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(item1).moveToElement(item5, x, y).release().perform();
		
	//	builder.dragAndDropBy(source, xOffset, yOffset).perform();
	}

}

