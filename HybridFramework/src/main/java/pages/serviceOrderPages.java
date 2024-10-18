package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class serviceOrderPages 
{
	WebDriver driver;
	private ElementUtils elementUtils;
	
public serviceOrderPages(WebDriver driver) 
   {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
	}


@FindBy(xpath="//span[normalize-space()='Find a service']")
private WebElement clickOnFindAService;
public void clickOnFindAService() {
		elementUtils.clickOnElement(clickOnFindAService,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
//div[contains(text(),'Plumber')]
//div[contains(text(),'Surfing lessons')]

@FindBy(xpath="//div[contains(text(),'Electrician')]")
private WebElement clickToElectrician;
public void clickToElectrician() {
	elementUtils.clickOnElement(clickToElectrician,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
//h3[normalize-space()='Shiva S16']
//h3[normalize-space()='Shiva S9']
@FindBy(xpath="//h3[normalize-space()='Shiva S2']")
private WebElement selectStaff;
public void selectStaff() {
	elementUtils.clickOnElement(selectStaff,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}

@FindBy(xpath="//input[@id='CreditPtAmount']")
private WebElement UseCreditPoint;
public void UseCreditPoint(String amount) {
elementUtils.typeTextIntoElement(UseCreditPoint, amount,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);}

@FindBy(id="btnSubmit")
private WebElement BookService;
public void BookService() {
	elementUtils.clickOnElement(BookService,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}

@FindBy(xpath="//button[@id='pay-with-wallet']/span")
private WebElement ClickToPay;
public void ClickToPay() {
	elementUtils.clickOnElement(ClickToPay,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
//	driver.get("https://sandbox.payfast.co.za/eng/process/finish/1909c95d-022c-49e0-a06a-2016ad83ca7c");
}
public void AfterPaymentPage() {
driver.get("https://sz-appsrv-qa-210.azurewebsites.net/People/People/SOrderDetail?OrderId=CfDJ8MVh71paVWVAiIdBpV6ZvGIHCES35iVQRXmPrz-snWiCvgBfNWYgwBiMnWw3Qdplb66wmFpxklGJma2eRRybdstE48i5NGIsDYbbGw0zU96Ys8aVjP4eG8WufQBEblD25pI0K5g-mbcbwK3WChq0HCHHID8XQbkwTE3p8zl7vm4l");
}

//label[@id='txtMessage']
//Amount can not be less than R 70.0000

}
