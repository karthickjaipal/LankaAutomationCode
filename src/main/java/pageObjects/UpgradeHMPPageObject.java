package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.GenericMethods;
import utility.OpenBrowser;

public class UpgradeHMPPageObject extends OpenBrowser {
	
	@FindBy(xpath="//input[@id='nic']")
	WebElement nic;
	@FindBy(xpath="//input[@id='subscriberChannelId' and @type='radio' and @value='2']")
	WebElement CDMA;
	@FindBy(xpath="//input[@id='subscriberChannelId' and @type='radio' and @value='3']")
	WebElement LTE;
	@FindBy(xpath="//li[@id='searchBtn']")
	WebElement Search_button;
	@FindBy(xpath="//select[@id='homeProLevelId']")
	WebElement newOfferCoverId;
	@FindBy(xpath="//li[@id='saveBtn']")
	WebElement Save_btn;
	
	 public UpgradeHMPPageObject()
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void setNic(String Nic)
	   {
		   nic.sendKeys(Nic);
	   }
	  
		public void selectCDMA()
		{
			CDMA.click();
		}
		public void selectLTE()
		{
			LTE.click();
		}
		
		public void clickSearch()
		{
			Search_button.click();
		}
		public void selectNewOfferCover(String val)
		{
			GenericMethods.dropdownByValue(newOfferCoverId,val);
		}
		public void clickSave()
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(Save_btn)).click();
		}

}
