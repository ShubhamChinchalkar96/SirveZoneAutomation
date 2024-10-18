package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class landingPage {

	WebDriver driver;
	private ElementUtils elementUtils;
	
public landingPage(WebDriver driver) 
   {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
	}

@FindBy(xpath="//a[@aria-label='login button']")
private WebElement landingPageloginButton;
public void landingPageloginButton() {
	elementUtils.clickOnElement(landingPageloginButton,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//a[normalize-space()='About us']")
private WebElement AboutUs;
public void AboutUsOption() {
	elementUtils.clickOnElement(AboutUs,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//h2[normalize-space()='Earn Sirve Zone Chams']")
private WebElement AboutUsPageHeading;
public void AboutUsPageHeading() {
	elementUtils.clickOnElement(AboutUsPageHeading,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//a[normalize-space()='Contact us']")
private WebElement ContactUsOption;
public void ContactUsOption() {
	elementUtils.clickOnElement(ContactUsOption,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//b[normalize-space()='Get quick answers about Sirve Zone']")
private WebElement ContactUsPageHeading;
public void ContactUsPageHeading() {
	elementUtils.clickOnElement(ContactUsPageHeading,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//a[normalize-space()='1.What is Sirve Zone?']")
private WebElement ContactUsPageFirstQuestion;
public void ContactUsPageFirstQuestion() {
	elementUtils.clickOnElement(ContactUsPageFirstQuestion,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//a[normalize-space()='Blog']")
private WebElement BlogOption;
public void BlogOption() {
	elementUtils.clickOnElement(BlogOption,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//h2[normalize-space()='Keep busy with our latest blogs']")
private WebElement BlogPageHeading;
public void BlogPageHeading() {
	elementUtils.clickOnElement(BlogPageHeading,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//a[normalize-space()='Show all']")
private WebElement ShowAllServices;
public void ShowAllServices() {
	elementUtils.clickOnElement(ShowAllServices,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//div[@class='searchFilter']//b[contains(text(),'Electrician')]")
private WebElement ElectricianService;
public void ElectricianService() {
	elementUtils.clickOnElement(ElectricianService,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//div[contains(text(),'Hermanus')]")
private WebElement HermanusZone;
public void HermanusZone() {
	elementUtils.clickOnElement(HermanusZone,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//h3[normalize-space()='Shiva S2']")
private WebElement SelectS2Staff;
public void SelectS2Staff() {
	elementUtils.clickOnElement(SelectS2Staff,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="//h2[normalize-space()='Shiva S2']")
private WebElement StaffHeading;
public void StaffHeading() {
	elementUtils.clickOnElement(StaffHeading,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="(//a[@class='btn btnSecondary w-100 d-block mt-4'][normalize-space()='LOGIN TO BOOK PRO'])[1]")
private WebElement LoginToBookPro;
public void LoginToBookPro() {
	elementUtils.clickOnElement(LoginToBookPro,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="(//a[normalize-space()='By zone']")
private WebElement ByZoneServices;
public void ByZoneServices() {
	elementUtils.clickOnElement(ByZoneServices,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="(//a[@class='blankLink'])[2]")
private WebElement ByZoneHermanus;
public void ByZoneHermanus() {
	elementUtils.clickOnElement(ByZoneHermanus,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	}

@FindBy(xpath="(//a[@class='blankLink'])[2]")
private WebElement ByZoneHermanusElectrician;
public void ByZoneHermanusElectrician() {
	elementUtils.clickOnElement(ByZoneHermanusElectrician,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);}

@FindBy(xpath="//a[@href='/home/water-info']//span[@class='tLinkText']")
private WebElement GetWter;
public void GetWter() {
	elementUtils.clickOnElement(GetWter,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);}

@FindBy(xpath="//h2[normalize-space()='Giveaway information']")
private WebElement GetWterPageHeading;
public void GetWterPageHeading() {
	elementUtils.clickOnElement(GetWterPageHeading,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);}

@FindBy(xpath="(//span[@class='tLinkText'])[3]")
private WebElement TalkToChami;
public void TalkToChami() {
	elementUtils.clickOnElement(TalkToChami,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);}

@FindBy(xpath="//h2[@class='mdTitle primaryClr smBold']")
private WebElement TalkToChamiHeading;
public void TalkToChamiHeading() {
	elementUtils.clickOnElement(TalkToChamiHeading,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);}

@FindBy(xpath="//a[@href='/home/list-your-services']//span[@class='tLinkText']")
private WebElement ListAservice;
public void ListAservice() {
	elementUtils.clickOnElement(ListAservice,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);}

@FindBy(xpath="//h2[normalize-space()='Benefits of listing your services']")
private WebElement ListAserviceHeading;
public void ListAserviceHeading() {
	elementUtils.clickOnElement(ListAserviceHeading,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);}

@FindBy(xpath="//a[@href='/home/collect-chams']//span[@class='tLinkText']")
private WebElement CollectChams;
public void CollectChams() {
	elementUtils.clickOnElement(CollectChams,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);}

@FindBy(xpath="//h2[normalize-space()='Earn Sirve Zone Chams']")
private WebElement CollectChamsHeading;
public void CollectChamsHeading() {
	elementUtils.clickOnElement(CollectChamsHeading,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);}

@FindBy(xpath="//div[@aria-label='Next slide']")
private WebElement NextSlidArrow;
public void NextSlidArrow() {
	elementUtils.clickOnElement(NextSlidArrow,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);}


}
