package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_01_AccountRegistrationTest extends BaseClass {
	
	@Test
	void test_account_registration() {
		
		logger.info("*** started TC_01_AccountRegistrationTest ***");
		
		try {
			
		//*** creating object of HomePage class and clicking on Create Account button ***
		HomePage hp = new HomePage(driver);
		hp.clickCreateAccount();
		logger.info("*** clicked on create account link ***");
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		logger.info("*** providing the details to create account ***");
		
		
		//*** entering required details and clicking on create account button ***
		regpage.setFirstName("abc");
		regpage.setLastName("def");
		regpage.setEmail(randomAlphaNumeric()+"@gmail.com");
		regpage.setPassword("abcd1234@");
		regpage.setConfirmPassword("abcd1234@");
		regpage.clickCreate();
		logger.info("*** clicked on create account button ***");
		
		String confirmsg = regpage.getConfirmationMsg();
		
		Assert.assertEquals(confirmsg, "My Account", "Test failed");
		
		}catch (Exception e) {
			logger.error("*** Test failed ***");
			Assert.fail();
		}
	}

}
