package wdMethods;

import java.awt.geom.IllegalPathStateException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	public static RemoteWebDriver driver ;
	int i = 1;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();			
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				driver = new FirefoxDriver();		
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" is Launched Successfully");
		}catch(IllegalPathStateException e) {
			System.err.println("Path specified is incorrect causing Illegal PATHSTATE EXCEPTION");
			throw new RuntimeException();
		}catch(WebDriverException e) {
			System.err.println("Webdriver exception has occurred");
		}
		catch(Exception e) {
			System.err.println("Exception has occurred");
		}finally {
			takeSnap();
		}	
	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);	
			case "linktext": return driver.findElementByLinkText(locValue);	
			}
		} catch (NoSuchElementException e) {
			System.err.println("Null pointer Exception has occured");
			throw new RuntimeException();
		}catch(Exception e) {
			System.err.println("Exception has occurred");
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The Data "+data+" is Entered Successfully");
		}catch(WebDriverException e) {
			System.err.println("No such element exception occurred");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception has occurred");
		}finally {
			takeSnap();
		}
		
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element "+ele+" is clicked Successfully");
		} catch (Exception e) {
			System.err.println("Exception has occurred");
		}finally {
			takeSnap();	
		}
	}

	public String getText(WebElement ele) {
		try {
			String text = ele.getText();
		} catch (Exception e) {
			System.out.println("Exception occurred in GetText");
		}
		return null;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		Select selec = new Select(ele);
		selec.selectByVisibleText(value);
		takeSnap();
		System.out.println("The dropdown value "+ value +" is clicked Successfully");
	}
	public void selectDropDownUsingValue(WebElement ele, String value) {
		Select selec = new Select(ele);
		selec.selectByValue(value);
		System.out.println(ele.getText());
		takeSnap();
		System.out.println("The dropdown value "+ value +" is clicked Successfully");
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select selec = new Select(ele);
		selec.selectByIndex(index);		
		takeSnap();

		System.out.println("The dropdown value "+ index +" is clicked Successfully");
	}

	public boolean verifyTitle(String expectedTitle) {
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		if(ele.getText().equals(expectedText)) {
			System.out.println(" The element" + ele + "is verified ");
		} else {
			System.out.println(" The element" + ele + "is not verified ");
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		ele.getText().contains(expectedText);
}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		ele.getAttribute(attribute).equals(value);
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		ele.getAttribute(attribute).contains(value);
	}

	public void verifySelected(WebElement ele) {
		ele.isSelected();
	}

	public void verifyDisplayed(WebElement ele) {
		ele.isDisplayed();
	}

	public void switchToWindow(int index) {
		Set<String> window = driver.getWindowHandles();
		List< String> allwindow = new ArrayList<String> ();
		allwindow.addAll(window);
		driver.switchTo().window(allwindow.get(index));
	}

	public void switchToFrame(WebElement ele) {
		Alert alt = driver.switchTo().alert();
		String txt = alt.getText();
	}

	public void acceptAlert() {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	public void dismissAlert() {
		Alert alt = driver.switchTo().alert();
		alt.accept();

	}

	public String getAlertText() {
		Alert alt = driver.switchTo().alert();
		alt.getText();
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();
		System.out.println("The browser is closed");
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
		System.out.println("The driver is quit");
	}

}
