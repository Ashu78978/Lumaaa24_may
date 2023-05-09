package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationtTest extends BaseClass{
	@Test(groups= {"Regression","Master"})
	public void test_account_Registration() throws InterruptedException
	{
		logger.debug("application logs");
		logger.info("starting TC_001_AccountRegistrationtTest");
		try {
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on create account link");
	//	hp.clickRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
      logger.info("providing customer details"); 
		regpage.setFirstName(randomeString().toUpperCase());
		
		regpage.setLastName(randomeString().toUpperCase());
		
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		
	
		
		String password=randomAlphaNumeric();
		regpage.setPassword(password);
		Thread.sleep(3000);
		regpage.setConfirmPassword(password);
		Thread.sleep(3000);

		
		
		regpage.clickContinue();
		Thread.sleep(3000);

		
		String confmsg=regpage.getConfirmationMsg();
		logger.info("validating expected message");
		
		Assert.assertEquals(confmsg, "My Account");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	logger.info("**** finished *****");
	}
	
	
}

