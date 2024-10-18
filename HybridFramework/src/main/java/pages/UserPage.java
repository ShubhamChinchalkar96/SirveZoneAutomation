package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class UserPage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
public UserPage(WebDriver driver) 
   {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
	}

@FindBy(xpath="//img[@alt='User']")
private WebElement profilePicture;

public void profilePicture() {
	elementUtils.clickOnElement(profilePicture,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//input[@value='Logout']")
private WebElement logoutButton;

public void logoutButton() {
	elementUtils.clickOnElement(logoutButton,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//a[@class='active']//span[@class='sidebarText'][normalize-space()='Home']")
private WebElement GotoHome;
public void GotoHome() {
	elementUtils.clickOnElement(GotoHome,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}	
    
@FindBy(linkText="Location")
private WebElement clickToLocation;
public void clickToLocation() {
	elementUtils.clickOnElement(clickToLocation,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(linkText="Wallet")
private WebElement clickTowallet;
public void clickTowallet() {
	elementUtils.clickOnElement(clickTowallet,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}
    
@FindBy(linkText="Messages")
private WebElement clickToNotification;
public void clickToNotification() {
	elementUtils.clickOnElement(clickToNotification,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}
    








}
