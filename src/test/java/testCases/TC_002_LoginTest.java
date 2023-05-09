package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{
	@Test(groups= {"Sanity","Master"})
	public void test_Login() throws InterruptedException
	{
		
		
		
			
			logger.info("Starting TC_002_LoginTest");
			HomePage hpp=new HomePage(driver);
			
			//hpp.clickMyAccount();
						
			hpp.clicksignin();
			
			LoginPage lpp=new LoginPage(driver);
			
			lpp.setEmail(rb.getString("email")); // valid email, get it from properties file
			
			lpp.setPassword(rb.getString("password")); // valid password, get it from properties file
			
			lpp.clickLogin();
			
			//MyAccountPage maccc=new MyAccountPage(driver);
			
			//maccc.dropdownbutton();
			
			
			//Thread.sleep(2000);
		//	maccc.logoutbutton();
			
			
			
		//	WebElement signout=driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button"));
		//	Select signouts=new Select(signout);
		//signouts.selectByVisibleText("button");
			
			
			
			
			
			
/*			boolean targetpage=maccc.isMyAccountPageExists();
						
			Assert.assertEquals(targetpage, true);
			
		}	
		catch(Exception e)
		{
			Assert.fail();
		}
		*/
		
	
	
	
}
	}






//clickdropdown

//clicklogout