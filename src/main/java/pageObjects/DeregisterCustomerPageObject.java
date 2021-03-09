package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utility.OpenBrowser;

public class DeregisterCustomerPageObject extends OpenBrowser {
	
	@FindBy(xpath="//input[@id='nic']")
	WebElement nic; 
	@FindBy(xpath="//input[@id='msisdn']")
	WebElement msisdn;
	@FindBy(xpath="//input[@id='subscriberChannelId' and @type='radio' and @value='1']")
	WebElement GSM;
	@FindBy(xpath="//input[@id='subscriberChannelId' and @type='radio' and @value='2']")
	WebElement CDMA;
	@FindBy(xpath="//input[@id='subscriberChannelId' and @type='radio' and @value='3']")
	WebElement LTE;
	@FindBy(xpath="//input[@id='subscriberChannelId' and @type='radio' and @value='4']")
	WebElement DTV;
	@FindBy(xpath="//li[@id='searchBtn']")
	WebElement Search_button;
	@FindBy(xpath="//input[@id='offerId' and @type='checkbox' and @value='2']")
	WebElement HP;
	@FindBy(xpath="//input[@id='offerId' and @type='checkbox' and @value='6']")
	WebElement Life2017;
	@FindBy(xpath="//input[@id='offerId' and @type='checkbox' and @value='7']")
	WebElement PA2017;
	@FindBy(xpath="//li[@id='deregBtn']")
	WebElement dereg_button;
	@FindBy(xpath="//li[@id='backBtn']")
	WebElement back_button;
	@FindBy(xpath="//li[@id='popup_ok']")
	WebElement Confirmation_OK;
	@FindBy(xpath="//li[@id='popup_cancel']")
	WebElement Confirmation_cancel;
	
	
	public DeregisterCustomerPageObject()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setNic(String Nic)
	{
		nic.sendKeys(Nic);
	}
	public void setMsisdn(String Msisdn)
	{
		msisdn.sendKeys(Msisdn);
	}
	public void selectGSM()
	{
		GSM.click();
	}
	public void selectCDMA()
	{
		CDMA.click();
	}
	public void selectLTE()
	{
		LTE.click();
	}
	public void selectDTV()
	{
		DTV.click();
	}
	public void clickSearch()
	{
		Search_button.click();
	}
    public void selectDeregProductasHP()
    {
    	HP.click();
    }
    public void selectDeregProductasLife()
    {
    	Life2017.click();
    }
    public void selectDeregProductasPA()
    {
    	PA2017.click();
    }
    public void clickDeregister()
    {
    	dereg_button.click();
    }
    public void clickOK()
    {
    	Confirmation_OK.click();
    }
    
}
