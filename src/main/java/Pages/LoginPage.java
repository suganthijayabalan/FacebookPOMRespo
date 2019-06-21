package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Bases.Base;

public class LoginPage extends Base {

	@FindBy(how=How.ID,using="username") WebElement eleusername;
	@FindBy(how=How.NAME,using="PASSWORD") WebElement elepassword;
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit") WebElement eleclick;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
	public LoginPage enterUsername(String data){
		eleusername.sendKeys(data);
		return this;
		
			}
	public LoginPage enterPassword(String data){
		elepassword.sendKeys(data);
		return this;
		
	}
	
	public CreateLead clickButton(){
		eleclick.click();
		return new CreateLead();
		
	}
	
}


