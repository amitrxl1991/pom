package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_DeleteLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004";
		testCaseName = "TC001_DeleteLead";
		testDescription = "To Login and CreateLead6";
		category= "Smoke";
		authors	="Nesa";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String pNumber,String vPNumber,String expectedText) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA().clickLead().clickFindLead().clickPhNumber().clickTypePhNumber(pNumber)
		.clickfindLeadsButton().clickLeadId().clickDeleteLead().clickFindLead().clickPhNumber()
		.clickTypePhNumber(vPNumber).clickfindLeadsButton().VerifyDeletedLead(expectedText);
		
		
	}

}
