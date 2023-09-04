package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver) {
		super(driver);                     //*** calling the driver instance from parent class i.e. BasePage ***
	}
	
	@FindBy(xpath = "//div[@class=\"panel header\"]//span[@class=\"logged-in\"]")
	WebElement msgHeading;
	
	@FindBy(xpath = "//div[@class='panel header']//button[@type='button']")
	WebElement linknamebtn;
	
	@FindBy(xpath = "//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")
	WebElement btnSignOut;
	
	
	//*** checking if the current open page is My Account page ***
	
	public boolean isMyAccountPageOpen() {
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	
	
	//*** creating method for signing out of logged in account ***
	
	public void ClickSignOut() {
		linknamebtn.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")));
		btnSignOut.click();
	}

}
