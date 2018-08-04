package week3.day2;


import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateTestLead extends ProjectMethods{

	@Test(groups= {"smoke"},dataProvider ="fetchData")
	public void createLead(String Name, String fName, String lName) {
		WebElement clickk = locateElement("linktext", "Create Lead");
		click(clickk);
		WebElement companyname = locateElement("id", "createLeadForm_companyName");
		type(companyname,Name );
		WebElement firstname = locateElement("id", "createLeadForm_firstName");
		type(firstname,fName );
		WebElement Lastname = locateElement("id", "createLeadForm_lastName");
		type(Lastname,lName );
		WebElement leadSub = locateElement("class","smallSubmit");
		click(leadSub);
	}

	@DataProvider(name = "fetchData")
	public Object[][] dataProvider() {
		Object[][] data = new Object[2][3];
		
		data[0][0]="tcs";
		data[0][1]="John";
		data[0][2]="wick";

		data[1][0]="cts";
		data[1][1]="goku";
		data[1][2]="saiyan";


		return data;
	}

}
