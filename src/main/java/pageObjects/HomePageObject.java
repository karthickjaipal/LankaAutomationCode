package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.OpenBrowser;

public class HomePageObject extends OpenBrowser {
	
	@FindBy(xpath="//li[@id='menu5']")
	WebElement customerManagement;
	@FindBy(xpath="//li[@id='submenu22']")
	WebElement RegisterCustomer;
	@FindBy(xpath="//li[@id='submenu24']")
	WebElement DeregisterCustomer;
	@FindBy(xpath="//li[@id='submenu51']")
	WebElement UpdateHPLevel;
	@FindBy(xpath="//li[@id='submenu54']")
	WebElement UpdateLifeLevel;
	@FindBy(xpath="//li[@id='submenu53']")
	WebElement UpdatePALevel;
	@FindBy(xpath="//li[@id='submenu52']")
	WebElement UpdateHMPLevel;
	
	public HomePageObject(){
		PageFactory.initElements(driver, this);
	}
	
	public void selectCusManagement()
	{
		customerManagement.click();
	}
	public void selectRegisterCustomer()
	{
		RegisterCustomer.click();
	}
	public void selectDeregisterCustomer()
	{
		DeregisterCustomer.click();
	}
	public void selectUpdateHPlevel()
	{
		UpdateHPLevel.click();
	}
	public void selectUpdateLifelevel()
	{
		UpdateLifeLevel.click();
	}
	public void selectUpdatePAlevel()
	{
		UpdatePALevel.click();
	}
	public void selectUpdateHMPlevel()
	{
		UpdateHMPLevel.click();
	}
	
}
