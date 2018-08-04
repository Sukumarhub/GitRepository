package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");



		driver.switchTo().frame("iframeResult");


		driver.findElementByXPath("//button[text()='Try it']").click();

		Alert alt = driver.switchTo().alert();
		String txt = alt.getText();
		System.out.println(txt);
		alt.accept();
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		Set<String> window = driver.getWindowHandles();
		List< String> allwindow = new ArrayList<String> ();
		allwindow.addAll(window);
		driver.switchTo().window(allwindow.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		driver.switchTo().window(allwindow.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		driver.quit();
	}
}
