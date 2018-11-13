package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_EditLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC005";
		testCaseName = "TC001_EditLead";
		testDescription = "To Login and EditLead";
		category= "Smoke";
		authors	="Nesa";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String userName, String passWord,String firstName) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA().clickLead().clickFindLead().TypeFirstName(firstName).clickfindLeadsButton().clickLeadId().clickEditLead();
		
		
	}

}
