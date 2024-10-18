package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class StaffPage {

	WebDriver driver ;
	private ElementUtils elementUtils;
	
	public StaffPage(WebDriver driver) 
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
	}
	
	
	@FindBy(id="ab")
	private WebElement  ab;
	
	@FindBy(xpath="//div[@class='container']//span[@class='sidebarText'][normalize-space()='Messages']")
	private WebElement ClickToNotification;
	
	@FindBy(linkText="Select")
	private WebElement  selectOrderNotification;
	
	@FindBy(xpath="//b[normalize-space()='Accept']")
	private WebElement AcceptOrder;
	
	
	@FindBy(xpath="//b[normalize-space()='Reject']")
	private WebElement RejectOrder;
	
	@FindBy(linkText="Back to list")
	private WebElement  BackToServiceOrder;
	
	@FindBy(xpath="//a[normalize-space()='Out for delivery']")
	private WebElement OutForDelivery;
	
	@FindBy(xpath="//a[normalize-space()='Work in progress']")
	private WebElement WorkInProgress;
	
	@FindBy(xpath="//a[normalize-space()='Staff completed']")
	private WebElement StaffComplete;
	
	
	public void ClickToNotification()
	{
//		ClickToNotification.click();
		elementUtils.clickOnElement(ClickToNotification,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	    driver.get("https://sz-appsrv-qa-210.azurewebsites.net/People/People/ShowNotification");

	}
	public void selectOrderNotification()
	{
//		selectOrderNotification.click();
		elementUtils.clickOnElement(selectOrderNotification,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}
	public void AcceptServiceOrderRequest()
	{
//		AcceptOrder.click();
		elementUtils.clickOnElement(AcceptOrder,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	public void RejectServiceOrderRequest()
	{
//		RejectOrder.click();
		elementUtils.clickOnElement(RejectOrder,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	public void BackToServiceOrder()
	{
//		BackToServiceOrder.click();
		elementUtils.clickOnElement(BackToServiceOrder,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	public void OutForDelivery()
	{
//		OutForDelivery.click();
		elementUtils.clickOnElement(OutForDelivery,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.acceptAlert(5);
	}
	public void WorkInProgress()
	{
//		WorkInProgress.click();
		elementUtils.clickOnElement(WorkInProgress,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.acceptAlert(5);
	}
	public void StaffComplete()
	{
//		StaffComplete.click();
		elementUtils.clickOnElement(StaffComplete,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.acceptAlert(5);
	}
	 
}


