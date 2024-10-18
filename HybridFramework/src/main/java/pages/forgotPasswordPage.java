package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonUtils;
import utils.ElementUtils;

public class forgotPasswordPage {
	WebDriver driver;
	private ElementUtils elementUtils;
	public forgotPasswordPage(WebDriver driver) 
	   {
			this.driver = driver;
			PageFactory.initElements(driver,this);
			elementUtils = new ElementUtils(driver);
			
		}
		
	@FindBy(id="Input_Email")
	private WebElement emailField;

	@FindBy(id="myInput")
	private WebElement passwordField;

	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginButton;
			
	public void enterEmailAddress(String emailText) {
//		emailField.sendKeys(emailText);
		elementUtils.typeTextIntoElement(emailField, emailText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}

	public void enterPassword(String passwordText) {
//		passwordField.sendKeys(passwordText);
		elementUtils.typeTextIntoElement(passwordField, passwordText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}

	public void clickOnLoginButton() {
//		loginButton.click();
		System.out.println("shiva");
		elementUtils.clickOnElement(loginButton,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		System.out.println("shiva");
		
	}
}
