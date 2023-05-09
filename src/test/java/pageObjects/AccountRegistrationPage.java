package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	// Elements
		@FindBy(name = "firstname")
		WebElement txtFirstname;

		@FindBy(name = "lastname")
		WebElement txtLasttname;

		@FindBy(name = "email")
		WebElement txtEmail;

	

		@FindBy(name = "password")
		WebElement txtPassword;

		@FindBy(name =  "password_confirmation")
		WebElement txtConfirmPassword;


		@FindBy(xpath = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
		WebElement btnContinue;

		@FindBy(xpath = "//span[@class='base']")
		WebElement msgConfirmation;

		public void setFirstName(String fname) {
			txtFirstname.sendKeys(fname);

		}

		public void setLastName(String lname) {
			txtLasttname.sendKeys(lname);

		}

		public void setEmail(String email) {
			txtEmail.sendKeys(email);

		}

	

		public void setPassword(String pwd) {
			txtPassword.sendKeys(pwd);

		}

		public void setConfirmPassword(String pwd) {
			txtConfirmPassword.sendKeys(pwd);

		}

	

		public void clickContinue() {
			btnContinue.click();
			

			
		}

		public String getConfirmationMsg() {
		try {
				return (msgConfirmation.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}

		}
}