package ecolab.koerber.pages.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import ecolab.koerber.base.ConstantUtils;
import ecolab.koerber.base.DriverManager;
import ecolab.koerber.utils.PropertyStorage;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	private static final String LOADING_DETAILS = "//div[@class='slds-spinner_container cEC_CustomLoginForm']";

	@FindBy(xpath = "//input[@class='k-textbox' and @type ='text']")
	WebElement userName;

	@FindBy(xpath = "//input[@class='k-textbox' and @type ='password']")
	WebElement passwordField;

	@FindBy(xpath = "//button[@class='slds-button slds-button_neutral external-wrapper ec_btn_primary align']")
	WebElement primaryContinueButton;

	@FindBy(id = "continue")
	WebElement continueButton;

	@FindBy(xpath = "//button[@class='k-button']")
	WebElement signInButton;

	@FindBy(xpath = "//div[@id='claimVerificationServerError']")
	WebElement invalidCredentialErrorMessage;

	@FindBy(xpath = ".//div[@id='fieldIncorrect']")
	WebElement errorMessage;

	@FindBy(xpath = "//div[text()='Please enter a valid email address.']")
	WebElement invalidEmailidMessage;

	public void enterName(String username) {
		DriverManager.getWrapperClass().waitTillElementClickable(userName);
		userName.clear();
		userName.sendKeys(username);
		ExtentCucumberAdapter.addTestStepLog("Entered Email Id as: " + username + " in email field ");
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
		ExtentCucumberAdapter.addTestStepLog("Entered in password field");
	}

	public void clickContinueButton() {
		DriverManager.getWrapperClass().click(primaryContinueButton);
		ExtentCucumberAdapter.addTestStepLog("Clicked on CONTINUE button");
	}

	public void clickSignInButton() {
		signInButton.click();
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		ExtentCucumberAdapter.addTestStepLog("Clicked on Sign In button");
	}

	public void shouldSeeLoginPage() {
		Assert.assertTrue(DriverManager.getWrapperClass().isPresent(primaryContinueButton),
				"User is not able to See login Page");
//		Assert.assertEquals(DriverManager.getDriver().getTitle(), ConstantUtils.ECOLAB_CONNECT_TITLE,
//				"User is not able to login into application");
	}

	public void waitForLoginPageLoaderToDisappear() {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),
				Duration.ofSeconds(Integer.parseInt(PropertyStorage.getExplicitWait())));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOADING_DETAILS)));
		// DriverManager.getWrapperClass().waitForTimeOutInSec(3);
	}

}
