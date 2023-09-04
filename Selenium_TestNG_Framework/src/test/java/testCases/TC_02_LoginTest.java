package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_02_LoginTest extends BaseClass {
	
	@Test
	public void test_login() {
		
		try {
		logger.info("**** Starting TC_02_LoginTest ****");
		
		
		//*** creating object of HomePage class and clicking on SignIn button ***
		HomePage hp = new HomePage(driver);
		hp.clickSignIn();
		
		
		//*** creating object of LoginPage class, entering details and clicking on SignIn button ***
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		lp.setPassword(rb.getString("password"));
		lp.clickSignIn();
		
		
		//*** verifying My Account page ***
		MyAccountPage macp = new MyAccountPage(driver);
		boolean target = macp.isMyAccountPageOpen();
		Assert.assertEquals(target, true);
		
		}catch (Exception e){
			Assert.fail();
		}
		
		logger.info("**** Finished TC_02_LoginTest ****");
	}

}
