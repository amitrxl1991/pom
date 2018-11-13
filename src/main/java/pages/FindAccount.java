package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindAccount extends ProjectMethods {
	
	public FindAccount(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);				
	}
	
	@FindBy(how=How.LINK_TEXT,using="Phone")
	private WebElement elePhoneNumber;
	
	public FindAccount clickPhoneNumber() {
		click(elePhoneNumber);
		return this;
	}
	
	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement elePhoneNumbertext;
	
	public FindAccount enterPhoneNumber(String accountpNumber) {
		type(elePhoneNumbertext, accountpNumber);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="x-btn-center")
		private WebElement eleClickFindAccount;
		
		public FindAccount clickFindAccount(){
			
			click(eleClickFindAccount);
			return this;	
		}
		
		@FindBy(how=How.CLASS_NAME,using="linktext")
		
		private WebElement eleAccountId;
		
		public CreateLead clickAccountId(){
			click(eleAccountId);
			switchToWindow(0);
			return new CreateLead(driver, test);
		}
	
}
