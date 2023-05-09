package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "login[username]")
	WebElement txtEmailAddress;

	@FindBy(name = "login[password]")
	WebElement txtPassword;

	@FindBy(xpath = "//fieldset[@class='fieldset login']//button[@id='send2']")
	WebElement btnLogin;


	public void setEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	

}
