package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.GenericMethods;
import utility.OpenBrowser;

public class UpgradeHPPageObject extends OpenBrowser {
	
	@FindBy(xpath="//input[@id='nic']")
	WebElement nic;
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
	@FindBy(xpath="//input[@id='oldOfferCoverId' and @value='4']")
	WebElement oldOfferCoverId;
	@FindBy(xpath="//select[@id='offerCoverId']")
	WebElement newOfferCoverId;
	@FindBy(xpath="//input[@id='spouseName']")
	WebElement Spouse;
	@FindBy(xpath="//input[@id='childOne']")
	WebElement childOne;
	@FindBy(xpath="//input[@id='childTwo']")
	WebElement childTwo;
	@FindBy(xpath="//input[@id='childThree']")
	WebElement childThree;
	@FindBy(xpath="//div[@id='add-icon1']")
	WebElement SecondChild;
	@FindBy(xpath="//div[@id='add-icon2']")
	WebElement ThirdChild;
	@FindBy(xpath="//div[@id='add-icon2']")
	WebElement R_SecondChild;
	@FindBy(xpath="//div[@id='delete-icon3']")
	WebElement R_ThirdChild;
	@FindBy(xpath="//li[@id='saveBtn']")
	WebElement Save_btn;
	@FindBy(xpath="//li[@id='popup_ok']")
	WebElement Confirmation_OK;
	@FindBy(xpath="//li[@id='popup_cancel']")
	WebElement Confirmation_cancel;
	
   public UpgradeHPPageObject()
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void setNic(String Nic)
   {
	   nic.sendKeys(Nic);
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
	public void selectNewOfferCover(String val)
	{
		GenericMethods.dropdownByValue(newOfferCoverId,val);
	}
	public void enterSpouseName(String spouse)
	{
		Spouse.sendKeys(spouse);
	}
	public void enterFirstChildName(String child1)
	{
		childOne.sendKeys(child1);
	}
	public void enterSecondChildName(String child2)
	{
		childTwo.sendKeys(child2);
	}
	public void enterThirdChildName(String child3)
	{
		childThree.sendKeys(child3);
	}
	public void toAddSecondChild()
	{
		SecondChild.click();
	}
	public void toAddThirdChild()
	{
		ThirdChild.click();
	}
	public void toRemoveSecondChild()
	{
		R_SecondChild.click();
	}
	public void toRemoveThirdChild()
	{
		R_ThirdChild.click();
	}
	public void clickSave()
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(Save_btn)).click();
	}
	public void clickOK()
    {
    	Confirmation_OK.click();
    }
	public void clearSpouse()
	{
		if(Spouse.getText()!=null)
		{
		GenericMethods.clearField(Spouse);
		}
	}
	public void clearFirstChild()
	{
		if(childOne.getText()!=null)
		{
		GenericMethods.clearField(childOne);
		}
	}
	public void clearSecondChild()
	{
		if(childTwo.getText()!=null)
		{
		GenericMethods.clearField(childTwo);
		}
	}
	public void clearThirdChild()
	{
		if(childThree.getText()!=null)
		{
		GenericMethods.clearField(childThree);
		}
	}
	
	
	
	
	

}
