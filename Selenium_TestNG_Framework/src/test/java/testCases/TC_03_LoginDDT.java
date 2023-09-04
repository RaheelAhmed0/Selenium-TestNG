package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_03_LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void test_loginDDT(String email, String password, String expected) {
		
		try {
			logger.info("**** Starting TC_03_LoginDDT ****");
			
			HomePage hp = new HomePage(driver);
			hp.clickSignIn();
			logger.info("clicked sign in");
			
			
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(email);
			lp.setPassword(password);
			lp.clickSignIn();
			logger.info("Signed In");
			
			
			MyAccountPage macp = new MyAccountPage(driver);
			boolean target = macp.isMyAccountPageOpen();
			
			if(expected.equals("Valid")) {
				logger.info("checking in valid if");
				if(target==true) {
					macp.ClickSignOut();
					Assert.assertTrue(true);
				}
				else {
					Assert.assertTrue(false);
				}
			}
			
			if(expected.equals("Invalid")) {
				logger.info("checking in invalid if");
				if(target==true) {
					macp.ClickSignOut();
					Assert.assertTrue(false);
				}
				else {
					Assert.assertTrue(true);
				}
			}
			
			
			
			}catch (Exception e){
				Assert.fail();
			}
			
			logger.info("**** Finished TC_03_LoginDDT ****");

		
	}

}
