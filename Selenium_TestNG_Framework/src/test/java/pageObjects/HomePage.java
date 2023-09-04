package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);                //*** calling the driver instance from parent class i.e. BasePage ***
		
	}
	
	@FindBy(xpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
	WebElement linkCreateAccount;
	
	@FindBy(xpath = "//div[@class='panel header']//li[@class='authorization-link']")
	WebElement linkSignIn;
	

	public void clickCreateAccount() {
		linkCreateAccount.click();
	}
	
	public void clickSignIn() {
		linkSignIn.click();
	}
	
}
