package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);                 //*** calling the driver instance from parent class i.e. BasePage ***
	}
	
	@FindBy(id = "email")
	WebElement linkemail;
	
	@FindBy(id = "pass")
	WebElement linkpassword;
	
	@FindBy(id = "send2")
	WebElement btnSignIn;
	
	
	//*** entering values in email and password fields ***
	
	public void setEmail(String email) {
		linkemail.sendKeys(email);
	}
	
	public void setPassword(String pass) {
		linkpassword.sendKeys(pass);
	}
	
	public void clickSignIn() {
		btnSignIn.click();
	}
}
