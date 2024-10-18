package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;


public class loginPage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
public loginPage(WebDriver driver) 
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

@FindBy(xpath="//input[@value='Log In']")
private WebElement loginButton;
public void clickOnLoginButton() {
		elementUtils.clickOnElement(loginButton,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

	
@FindBy(id="Input_Email")
private WebElement emailField;

@FindBy(id="myInput")
private WebElement passwordField;


@FindBy(xpath="//li[normalize-space()='Either wrong email id or password entered.']")
private WebElement wrongEmailPassErrorMessage;
public void wrongEmailPassErrorMessage() {
	elementUtils.getTextFromElement(wrongEmailPassErrorMessage,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//li[normalize-space()='The Password field is required.']")
private WebElement emptyPassErrorMessage;
public void emptyPassErrorMessage() {
	elementUtils.getTextFromElement(emptyPassErrorMessage,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//li[contains(text(),'You may not have confirmed email,Please check your')]")
private WebElement unconfirmedEmailErrorMessage;
public void unconfirmedEmailErrorMessage() {
	elementUtils.getTextFromElement(unconfirmedEmailErrorMessage,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//li[normalize-space()='The Email field is required.']")
private WebElement emptyEmailerrorMessage;
public void emptyEmailerrorMessage() {
	elementUtils.getTextFromElement(emptyEmailerrorMessage,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

public void enterEmailAddress(String emailText) {
	//emailField.sendKeys(emailText);
	elementUtils.typeTextIntoElement(emailField, emailText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

public void enterPassword(String passwordText) {
	//passwordField.sendKeys(passwordText);
	elementUtils.typeTextIntoElement(passwordField, passwordText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
 }


}
