package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JqueryDroppable {

//	@Test
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/");
		
		driver.findElementByLinkText("Droppable").click();
		
		WebElement eleFrame = driver.findElementByClassName("demo-frame");
		WebElement eleclss = driver.findElementByClassName("ui-widget-content ui-draggable ui-draggable-handle");
		
		driver.switchTo().frame(eleFrame);

		Actions builder = new Actions(driver);
		builder.dragAndDropBy(eleclss, 200, 0).perform();			
		
	}

}
