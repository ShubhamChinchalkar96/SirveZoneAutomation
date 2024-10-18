package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.signupPage;
import utils.CommonUtils;

public class signup {
	
	WebDriver driver;
	private signupPage SignupPage;
	private CommonUtils commonUtils;
	
	@Given("The user should be on registration page")
	public void the_user_should_be_on_registration_page(){
		driver = DriverFactory.getDriver();
		SignupPage = new signupPage(driver);
		SignupPage.landingPageloginButton();
		SignupPage.loginWithEmailButton();
		SignupPage.clickOnsignupPageButton();
	}
	
	@When("^Enter invalid emailid (.+) into email field$")
	public void User_enters_valid_email_address_into_email_field(String emailText) {
		
		SignupPage.enterEmailAddress(emailText);		
	}
		
	@And ("Hit the signup button")
	public void Hit_the_signup_button() {
		//SignupPage.ClickToRegisterBtn(); 
		System.out.println("button should non clickable");
		}
	
	@Then ("verify the alert message {string}")
	public void verify_the_alert_message(String message) {
		Assert.assertTrue(SignupPage.wrongEmailErrorMessage().contains("The Email field is not a valid e-mail address."));
		}
	
	

}

