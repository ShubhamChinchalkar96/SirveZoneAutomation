package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class promoterPage {

	WebDriver driver;
	private ElementUtils elementUtils;
	
public promoterPage(WebDriver driver) 
   {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
	}

@FindBy(xpath="//a[normalize-space()='Promoter']")
private WebElement promoterDropDown;
@FindBy(xpath="//a[normalize-space()='Promoter Dashboard']")
private WebElement PromoterDashboard;
@FindBy(xpath="//div[@class='ddParent actDD']//a[normalize-space()='Transaction Journal']")
private WebElement PtransationJournal;
@FindBy(xpath="//div[@class='ddParent actDD']//a[normalize-space()='Invite user to become a merchant']")
private WebElement InviteAsMerchant;
@FindBy(xpath="//a[normalize-space()='Add Store']")
private WebElement AddStore;
@FindBy(xpath="//a[normalize-space()='Invite staff & add zonewise qualification']")
private WebElement Invitestaff;
@FindBy(xpath="//a[normalize-space()='Promoter']")
private WebElement PromoterQR;
@FindBy(xpath="//a[normalize-space()='View Easy Add Requests']")
private WebElement EasyAddRequests;

public void promoterDropDown() {
	elementUtils.clickOnElement(promoterDropDown,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

public void PromoterDashboard() {
	elementUtils.clickOnElement(PromoterDashboard,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

public void PtransationJournal() {
	elementUtils.clickOnElement(PtransationJournal,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

public void InviteAsMerchant() {
	elementUtils.clickOnElement(InviteAsMerchant,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}
public void AddStore() {
	elementUtils.clickOnElement(AddStore,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

public void InviteAsstaff() {
	elementUtils.clickOnElement(Invitestaff,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}
public void PromoterQR() {
	elementUtils.clickOnElement(PromoterQR,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

public void EasyAddRequests() {
	elementUtils.clickOnElement(EasyAddRequests,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

	}
