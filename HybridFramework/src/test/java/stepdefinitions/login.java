package stepdefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.loginPage;
import utils.CommonUtils;

public class login {
	
	
	WebDriver driver;
	private loginPage LoginPage;
	private CommonUtils commonUtils;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page(){
		driver = DriverFactory.getDriver();
		LoginPage = new loginPage(driver);
		LoginPage.landingPageloginButton();
		LoginPage.loginWithEmailButton();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String emailText, String Pass) {
		 
		LoginPage.enterEmailAddress(emailText);
		LoginPage.enterPassword(Pass); 
	}

	@Then("user should be on home page")
	public void user_should_be_on_home_page() {
		LoginPage.clickOnLoginButton();
		}
	
	
	@When("the user enters an invalid email {string}")
	public void the_user_enters_an_invalid_email(String emailText) {
		LoginPage.enterEmailAddress(emailText); }

	@When("the user enters a valid password {string}")
	public void the_user_enters_a_valid_password(String Pass) {
		LoginPage.enterPassword(Pass);  }

	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
	   }

	@Then("the user should see an error message {string}")
	public void the_user_should_see_an_error_message(String string) {
	   }

	@When("the user enters a valid email {string} and an empty password")
	public void the_user_enters_a_valid_email_and_an_empty_password(String emailText) {
		LoginPage.enterEmailAddress(emailText); }

	@When("the user enters a valid email {string} and an incorrect password {string}")
	public void the_user_enters_a_valid_email_and_an_incorrect_password(String emailText, String Pass) {
		LoginPage.enterEmailAddress(emailText);
		LoginPage.enterPassword(Pass); 
		}

	@When("the user enters an empty email and an empty password")
	public void the_user_enters_an_empty_email_and_an_empty_password() {
	   	}

	@When("the user enters a valid email {string} and an incorrect password {string} {int} times")
	public void the_user_enters_a_valid_email_and_an_incorrect_password_times(String emailText, String Pass, Integer int1) {
		LoginPage.enterEmailAddress(emailText);
		LoginPage.enterPassword(Pass); 
		}

	@When("the user clicks the login button each time")
	public void the_user_clicks_the_login_button_each_time() {
	    }

	@Then("the user should be unable to log in for a specified lockout duration")
	public void the_user_should_be_unable_to_log_in_for_a_specified_lockout_duration() {
	    }
	
	@When("the user enters an valid email {string}")
	public void the_user_enters_an_valid_email(String string) {
		LoginPage.enterEmailAddress(string);
	}

	@Then("the user should see an Password error message {string}")
	public void the_user_should_see_an_password_error_message(String string) {
	    LoginPage.emptyPassErrorMessage();
	}

	@Then("the user should see an Email error message {string}")
	public void the_user_should_see_an_email_error_message(String string) {
	    LoginPage.emptyEmailerrorMessage();
	}

	@When("the user enters an empty email and an Correct password {string}")
	public void the_user_enters_an_empty_email_and_an_correct_password(String string) {
	    LoginPage.emptyEmailerrorMessage();

	}

	@When("the user enters non verified email {string} and an Correct password {string}")
	public void the_user_enters_non_verified_email_and_an_correct_password(String string1,String string) {
	    LoginPage.enterEmailAddress(string);
	}
	
	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		
//		Assert.assertTrue(accountPage.displayStatusOfEditYourAccountInformationOption());
	    
	}



}
