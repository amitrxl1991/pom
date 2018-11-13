package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC001_CreateLead";
		testDescription = "To Login and CreateLead6";
		category= "Smoke";
		authors	="Nesa";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String cName, String firstName, String lastName, String pNumber, String sourceOption,
			String accountpNumber,String birthDate) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA().clickLead()
		.clickCreateLead().typeCname(cName)
		.typeFname(firstName).typeLname(lastName)
		.selectSourceOption(sourceOption).clickParentAccountIcon()
		.clickPhoneNumber().enterPhoneNumber(accountpNumber).clickFindAccount().clickAccountId()
		.typeeBirthdate(birthDate).clickCreateLeadButton();	
		
		
	}

}
