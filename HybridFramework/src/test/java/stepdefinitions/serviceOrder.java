package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.StaffPage;
import pages.loginPage;
import pages.serviceOrderPages;
import utils.CommonUtils;

public class serviceOrder 
{
	WebDriver driver;
	private loginPage login;
	private CommonUtils commonUtils;
	private boolean acceptNextAlert = true;
	private StaffPage staffpage ;
	private serviceOrderPages orders ;
	
	
	@Given("Navigate to landing page")
	public void navigate_to_landing_page() {
		driver = DriverFactory.getDriver();
		login= new loginPage(driver);
		staffpage = new StaffPage(driver);
	    orders = new serviceOrderPages(driver);
	}

	@Given("click on login button")
	public void click_on_login_button() {
		login.landingPageloginButton();
		login.loginWithEmailButton();
		System.out.println("click on login button");
	}

	@When("login with user  {string} and {string}")
	public void login_with_user_and(String Uid, String Upass) {
		login.enterEmailAddress(Uid);
		login.enterPassword(Upass);
		login.clickOnLoginButton();
	}

	@When("Go for find service")
	public void go_for_find_service() {
		orders.clickOnFindAService();
	}

	@When("select one service")
	public void select_one_service() {
		orders.clickToElectrician();
	}

	@When("select staff")
	public void select_staff() {
		orders.selectStaff();
	}
	
	@When("Enter credit chams {string}")
	public void enter_credit_chams(String chams) {
		orders.UseCreditPoint(chams);
	}

	@When("Click on book service button")
	public void click_on_book_service_button() {
		orders.BookService();
		orders.BookService();
	}

	@When("Make payment")
	public void make_payment() throws InterruptedException {
		orders.ClickToPay();
		Thread.sleep(20000);
	}
	
	@When("Navigate to service order page")
	public void navigate_to_service_order_page() throws InterruptedException {
		//orders.AfterPaymentPage();
		System.out.println("ss");
		}

	@When("log out")
	public void log_out() {
  	    driver.findElement(By.xpath("//img[@alt='User']")).click();
	    driver.findElement(By.xpath("//input[@value='Logout']")).click();
        login.landingPageloginButton();	    
	}

	@When("login with staff {string} and {string}")
	public void login_with_staff_and(String Sid, String Spass) {
		login.loginWithEmailButton();
		login.enterEmailAddress(Sid);
		login.enterPassword(Spass);
		login.clickOnLoginButton();
	}

	@When("click on notification")
	public void click_on_notification() {
		staffpage.ClickToNotification();
	}

	@When("click on select button")
	public void click_on_select_button() {
		staffpage.selectOrderNotification();
	}

	@When("Accept service order")
	public void accept_service_order() {
		staffpage.AcceptServiceOrderRequest();
	}

	@When("click to back to service")
	public void click_to_back_to_service() {
		staffpage.BackToServiceOrder(); 
	}

	@Then("Complete service order")
	public void complete_service_order() {
		staffpage.OutForDelivery();
	    staffpage.WorkInProgress();
	    staffpage.StaffComplete();
	}

	@Then("Negative chams amount should not be accept")
	public void negative_chams_amount_should_not_be_accept() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Negative chams amount should not accept-  Discount amount should not start with -.")
	public void negative_chams_amount_should_not_accept_discount_amount_should_not_start_with() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should not be allow for booking")
	public void user_should_not_be_allow_for_booking() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click on Show all Service option")
	public void click_on_show_all_service_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Cilck on Electrician service")
	public void cilck_on_electrician_service() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click to hermanus zone")
	public void click_to_hermanus_zone() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select S2 staff")
	public void select_s2_staff() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on login to book pro button")
	public void click_on_login_to_book_pro_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
