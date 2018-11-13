package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods{
	
	public FindLead(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);		
	}

	@FindBy(how=How.XPATH,using="//span[text() ='Phone']")
	
	private WebElement eleclickPhNumber;
	
	public FindLead clickPhNumber(){
	
		click(eleclickPhNumber);
		
		return this;
	}
	
@FindBy(how=How.XPATH,using="//button[text() = 'Find Leads']")
	
	private WebElement eleclickfindLeadsButton;
	
	public FindLead clickfindLeadsButton(){
		click(eleclickfindLeadsButton);
		return this;
	}

	@FindBy(how=How.XPATH,using="//input[@name ='phoneNumber']")
	
	private WebElement eleTypePhNumber;
	
	public FindLead clickTypePhNumber(String pNumber){
		type(eleTypePhNumber, pNumber);
		return this;
	}
	
@FindBy(how=How.XPATH,using="(//input[@name ='firstName'])[3]")
	
	private WebElement eleTypeFirstName;
	
	public FindLead TypeFirstName(String firstName){
		type(eleTypeFirstName, firstName);
		return this;
	}
	
@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	
	private WebElement eleclickLeadId;
	
	public ViewLead clickLeadId(){
		click(eleclickLeadId);
		return new ViewLead(driver, test);
	}
	
@FindBy(how=How.XPATH,using="//div[text() = 'No records to display']")
	
	private WebElement eleVerifyDeletedLead;
	
	public FindLead VerifyDeletedLead(String expectedText){
		verifyExactText(eleVerifyDeletedLead, expectedText);
		return this;
	}
	
	
}
