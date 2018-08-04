package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class Login extends ProjectMethods {

@Test(groups= {"sanity"})
	
	public  void logiin() {
	WebElement clickk = locateElement("linktext", "Create Lead");
	click(clickk);

	WebElement companyname = locateElement("id", "createLeadForm_companyName");
	type(companyname, "Testleaf");
	WebElement firstname = locateElement("id", "createLeadForm_firstName");
	type(firstname, "John");
	WebElement Lastname = locateElement("id", "createLeadForm_lastName");
	type(Lastname, "Wick");
	
	
	WebElement leadSub = locateElement("class","smallSubmit");
	click(leadSub);		
		
	
}
}
