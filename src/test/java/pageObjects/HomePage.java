package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
	WebElement lnkMyaccount;


  @FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
  
	WebElement signinaccount;

	// Action Methods
	public void clickMyAccount() {
		lnkMyaccount.click();
	}
	
	public void clicksignin() {
		signinaccount.click();
		
	}
		
		
		
		
	}



	
	
	

