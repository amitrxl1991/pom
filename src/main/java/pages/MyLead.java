package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import freemarker.core.ReturnInstruction.Return;
import wdMethods.ProjectMethods;

public class MyLead extends ProjectMethods{
	
	public MyLead(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
		@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	public CreateLead clickCreateLead() {
		click(eleCreateLead);
		return new CreateLead(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleClickFindLead;
	
	public FindLead clickFindLead(){
		
	click(eleClickFindLead);
	
	return new FindLead(driver, test);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
