package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	EditLead(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);		
	}
	
	

}
