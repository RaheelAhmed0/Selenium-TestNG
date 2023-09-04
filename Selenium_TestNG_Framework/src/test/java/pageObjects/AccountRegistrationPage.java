package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	//*** creating WebElements with locators with PageFactory ***
	
	@FindBy(name = "firstname")
	WebElement txtFirstName;
	
	@FindBy(name = "lastname")
	WebElement txtLastName;
	
	@FindBy(name = "email")
	WebElement txtEmail;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(name = "password_confirmation")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//button[@title='Create an Account']")
	WebElement btnCreate;
	
	@FindBy(xpath = "//span[@class='base']")      //div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']
	WebElement msgConfirmation;
	
	
	//*** creating different methods using the above locators ***
	
	
	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void setConfirmPassword(String password) {
		txtConfirmPassword.sendKeys(password);
	}
	
	public void clickCreate() {
		btnCreate.click();
	}
	
	
	//*** checking if the account is actually created with confirmation ***
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch(Exception e) {
			return (e.getMessage());
		}
	}

}
