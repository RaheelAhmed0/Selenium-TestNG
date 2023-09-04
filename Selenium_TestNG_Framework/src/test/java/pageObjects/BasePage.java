package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	//*** creating driver instance which will be common in all pageObject classes. ***
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
}
