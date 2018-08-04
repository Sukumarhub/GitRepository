package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProjectMethods extends SeMethods{

	@Parameters({"url", "uName", "pwd"})
	@BeforeMethod(groups= {"smoke","sanity"})
	public void  loginn (String url, String uName, String pwd) {
		startApp("chrome", url);
		WebElement locateEle = locateElement("id", "username");
		type(locateEle, uName);
		WebElement passwd = locateElement("id", "password");
		type(passwd, pwd);
		WebElement loginbtn = locateElement("class", "decorativeSubmit");
		click(loginbtn);

		WebElement click = locateElement("linktext", "CRM/SFA");
		click(click);
	}

	@AfterMethod(groups= {"smoke","sanity"})
	public void closebbrowser() {
	 closeBrowser();
	}
	
}
