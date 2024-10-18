package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class signupPage 
{
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public signupPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
	}
	
	@FindBy(xpath="//a[@aria-label='login button']")
	private WebElement landingPageloginButton;
	public void landingPageloginButton() {
		elementUtils.clickOnElement(landingPageloginButton,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}
	
	@FindBy(xpath="//button[normalize-space()='Log in with email']")
	private WebElement loginWithEmailButton;
	public void loginWithEmailButton() {
		//loginButton.click();
		elementUtils.clickOnElement(loginWithEmailButton,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}
	
	@FindBy(xpath="(//input[@id='registerBtn'])[1]")
	private WebElement registerBtn;
	public void ClickToRegisterBtn() {
		//registerBtn.click();
		
		elementUtils.clickOnElement(registerBtn,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}
	
	
	@FindBy(xpath="//a[normalize-space()='Sign Up now']")
	private WebElement signupPageButton;
	public void clickOnsignupPageButton() {
		//loginButton.click();
		elementUtils.clickOnElement(signupPageButton,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}
	
			
	@FindBy(id="emailInput")
	private WebElement emailField;
	public void enterEmailAddress(String emailText) {
		//emailField.sendKeys(emailText);
		elementUtils.typeTextIntoElement(emailField, emailText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		}

	@FindBy(id="myInput1")
	private WebElement passwordField;
	public void enterPassword(String passwordText) {
		//passwordField.sendKeys(passwordText);
		elementUtils.typeTextIntoElement(passwordField, passwordText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	 }
	
	@FindBy(id="myInput1")
	private WebElement ConfmpasswordField;
	public void enterConfmpasswordField(String passwordText) {
		//passwordField.sendKeys(passwordText);
		elementUtils.typeTextIntoElement(passwordField, passwordText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	 }

	

	@FindBy(xpath="//p[@id='emailV']")
	private WebElement wrongEmailPassErrorMessage;
	public String wrongEmailErrorMessage() {
		return elementUtils.getTextFromElement(wrongEmailPassErrorMessage,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

	@FindBy(xpath="//span[@id='myInput1-error']")
	private WebElement emptyPassErrorMessage;
	public String emptyPassErrorMessage() {
		return elementUtils.getTextFromElement(emptyPassErrorMessage,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

	@FindBy(xpath="//span[@id='myInput2-error']")
	private WebElement paswordNotMatchErrorMessage;
	public String paswordNotMatchErrorMessage() {
		return elementUtils.getTextFromElement(paswordNotMatchErrorMessage,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

	@FindBy(xpath="//span[@data-valmsg-for='Input.Email']")
	private WebElement emptyEmailerrorMessage;
	public String emptyEmailerrorMessage() {
		return elementUtils.getTextFromElement(emptyEmailerrorMessage,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

	

	

	

	
}
