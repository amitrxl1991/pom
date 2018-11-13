package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='createLeadForm_companyName']")
	private WebElement eleCname;
	public CreateLead typeCname(String cName) {
		type(eleCname, cName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='createLeadForm_firstName']")
	private WebElement eleFname;
	public CreateLead typeFname(String FName) {
		type(eleFname, FName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='createLeadForm_lastName']")
	private WebElement eleLname;
	public CreateLead typeLname(String LName) {
		type(eleLname, LName);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement eleprimaryPhoneNumber;
	public CreateLead typePrimaryPhoneNumber(String PNumber) {
		type(eleprimaryPhoneNumber,PNumber);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	
	private WebElement elesourceOption;
	public CreateLead selectSourceOption(String sourceOption){
	selectDropDownUsingText(elesourceOption,sourceOption);
	return this;	
	}
	
@FindBy(how=How.XPATH,using="(//a/img)[4]")
	
	private WebElement eleParentAccount;
	public FindAccount clickParentAccountIcon(){
	click(eleParentAccount);
	switchToWindow(1);
	return new FindAccount(driver, test);	
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='submitButton']")
	
	private WebElement createLeadButton;
	
	public CreateLead clickCreateLeadButton(){
		click(createLeadButton);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_birthDate")
	private WebElement eleBirthdate;
	public CreateLead typeeBirthdate(String birthDate){
		type(eleBirthdate, birthDate);
		return this;
		
	}
}
