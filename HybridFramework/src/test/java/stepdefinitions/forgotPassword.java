package stepdefinitions;

import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.forgotPasswordPage;

public class forgotPassword {

	WebDriver driver;
	private forgotPasswordPage Fp;
	@Given("First step for forgot password")
	public void First_step_for_forgot_password() {
		driver = DriverFactory.getDriver();
	    Fp =new forgotPasswordPage(driver);
	    System.out.println("script in progress");
	    
	}

	@When("Second step for forgot {string} and {string} password")
	public void second_step_for_forgot_and_password(String string, String string2) throws Exception {
//		
		System.out.println("script in progress");
	   
	}

	@Then("Third step for forgot password")
	public void Third_step_for_forgot_password() {

		System.out.println("script in progress");
		
	}
}
