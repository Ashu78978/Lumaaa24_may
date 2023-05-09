package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='New Luma Yoga Collection']") // MyAccount Page heading
	WebElement msgHeading;
	
	
	//@FindBy(xpath = "//span[@class='customer-name active']//button[@type='button']") // dropdown element
	//WebElement dropdown;
	
	
@FindBy(xpath="//span[@class='customer-name active']//button[@type='button']")
WebElement split_button;
	

@FindBy(xpath= "//div[@aria-hidden='false']//a[normalize-space()='Sign Out']") // logout element
WebElement logout;

	
	//split_button = driver.find_element(By.ID, "split-button")
		//	split_button.click()

	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	

public void dropdownbutton()
{
	split_button.click();
	
	
}


public void logoutbutton()
{
	logout.click();
}


}
