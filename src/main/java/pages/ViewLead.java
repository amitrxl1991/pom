package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods {

	
	ViewLead(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);		
	}
	
	
@FindBy(how=How.LINK_TEXT,using="Delete")
	
	private WebElement elecDeleteLead;
	
	public MyLead clickDeleteLead(){
		click(elecDeleteLead);
		return new MyLead(driver, test);
	}
@FindBy(how=How.LINK_TEXT,using="Edit")
	
	private WebElement eleclickEditLead;
	
	public EditLead clickEditLead(){
		click(eleclickEditLead);
		return new EditLead(driver, test);
	}
}
