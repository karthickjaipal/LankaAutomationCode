package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.GenericMethods;
import utility.OpenBrowser;

public class GSMRegisterCustomerPageObject extends OpenBrowser {
	
	@FindBy(xpath="//input[@id='nic']")
	WebElement NIC;
	@FindBy(xpath="//li[@id='searchBtn']")
	WebElement Searchbtn;
	@FindBy(xpath="//input[@id='subscriberChannelId' and @value='1']")
	WebElement GSM;
	@FindBy(xpath="//input[@id='subscriberChannelId' and @value='2']")
	WebElement CDMA;
	@FindBy(xpath="//input[@id='subscriberChannelId' and @value='3']")
	WebElement LTE;
	@FindBy(xpath="//input[@id='subscriberChannelId' and @value='4']")
	WebElement DTV;
	@FindBy(xpath="//input[@id='custName']")
	WebElement customername;
	@FindBy(xpath="//input[@id='referenceNumber']")
	WebElement refno;
	@FindBy(xpath="//input[@id='msisdn']")
	WebElement msisdn;
	@FindBy(xpath="//select[@id='preferredLang']")
	WebElement prefLang;
	@FindBy(xpath="//input[@type='checkbox' and @id='offerId' and @value='2']")
	WebElement HP;
	@FindBy(xpath="//input[@type='checkbox' and @id='offerId' and @value='6']")
	WebElement Life;
	@FindBy(xpath="//input[@type='checkbox' and @id='offerId' and @value='7']")
	WebElement PA;
	@FindBy(xpath="//input[@id='hpAlterContactNumber']")
	WebElement hpalternatecontact;
	@FindBy(xpath="//select[@id='offerCoverIdHP']")
	WebElement hpcoverlevel;
	@FindBy(xpath="//input[@id='spouseName']")
	WebElement spouse;
	@FindBy(xpath="//input[@id='childOne']")
	WebElement childone;
	@FindBy(xpath="//input[@id='childTwo']")
	WebElement childtwo;
	@FindBy(xpath="//input[@id='childThree']")
	WebElement childthree;
	@FindBy(xpath="//div[@id='add-second-icon']")
	WebElement addchildtwo;
	@FindBy(xpath="//div[@id='add-third-icon']")
	WebElement addchildthree;
	@FindBy(xpath="//input[@id='delete-second-icon']")
	WebElement removechildtwo;
	@FindBy(xpath="//input[@id='delete-third-icon']")
	WebElement removechildthree;
    @FindBy(xpath="//input[@id='life2017AlterContactNumber']")
	WebElement lifealternatecontact;
	@FindBy(xpath="//input[@id='nomineeName']")
	WebElement nomineeName;
	@FindBy(xpath="//input[@id='nomineeMsisdn']")
	WebElement nomineeMsisdn;
	@FindBy(xpath="//select[@id='offerCoverIdLife2017']")
	WebElement lifecoverlevel;
	@FindBy(xpath="//select[@id='insRelation']")
	WebElement nomineerelation;
	@FindBy(xpath="//li[@id='saveBtn']")
	WebElement SaveButton;
	@FindBy(xpath="//li[@id='popup_ok']")
	WebElement ConfirmationOK;
	@FindBy(xpath="//select[@id='offerCoverIdPA2017']")
	WebElement PAcoverlevel;
	@FindBy(xpath="//input[@id='pa2017AlterContactNumber']")
	WebElement pa2017AlterContactNumber;
	@FindBy(xpath="//input[@id='spouseMSISDN']")
	WebElement spouseMsisdn;
	@FindBy(xpath="//div[@id='calBut1']")
	WebElement spouseDOB;
	@FindBy(xpath="//div[@id='calBut2']")
	WebElement child1DOB;
	@FindBy(xpath="//div[@id='calBut3']")
	WebElement child2DOB;
	@FindBy(xpath="//div[@id='calBut4']")
	WebElement child3DOB;
	@FindBy(xpath="//legend[@id='label_regcustomer.subheader15']")
	WebElement benefInfo;
	
	
	
	//input[@dyc-btn='year']
	
	
	public GSMRegisterCustomerPageObject()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterSpouse(String spousename)
	{
		spouse.sendKeys(spousename);
		benefInfo.click();
		spouseMsisdn.sendKeys("779987546");
		spouseDOB.click();
		driver.findElement(By.xpath("//table[@class='DynarchCalendar-titleCont']/tbody/tr/td/div/div[contains(.,2020)]")).click();
	    WebElement ele=driver.findElement(By.xpath("//input[@dyc-btn='year']"));
	    ele.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
	    ele.sendKeys("1994");
	    driver.findElement(By.xpath("//table[@class='DynarchCalendar-menu-mtable']/tbody/tr/td/div[contains(.,'Jan')]")).click();
	    WebDriverWait wait =new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='DynarchCalendar-bodyTable']/tbody/tr/td[2]/div"))).click();
	}
	
	public void setNic(String nic)
	{
		NIC.sendKeys(nic);
	}
	public void clickSearch()
	{
		Searchbtn.click();
	}
	public void selectGSMChannel()
	{
		GSM.click();
	}
	public void selectCDMAChannel()
	{
		CDMA.click();
	}
	public void selectLTEChannel()
	{
		LTE.click();
	}
	public void enterCustomername(String cname)
	{
		customername.sendKeys(cname);
	}
	public void enterMsisdn(String num)
	{
		msisdn.sendKeys(num);
	}
	public void referenceNum(String refnum)
	{
		refno.sendKeys(refnum);
	}
	public void preferredLang(String value)
	{
		GenericMethods.dropdownByVisibleText(prefLang, value);
	}
	public void selectHP()
	{
		HP.click();
	}
	public void selectPA2017()
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(PA));
		PA.click();
	}
	public void selectLife()
	{
		Life.click();
	}
	public void clickSave()
	{
	    SaveButton.click();
	}
	public void enterHPalternatenumber(String HPAlternatenum)
	{
		hpalternatecontact.sendKeys(HPAlternatenum);
	}
	public void clickOK()
	{
		ConfirmationOK.click();
	}
	public void enterLifealternatenumber(String LifeAlternatenum)
	{
		lifealternatecontact.sendKeys(LifeAlternatenum);
	}
	public void enterPAalternatenumber(String paAlternatenum)
	{
		pa2017AlterContactNumber.sendKeys(paAlternatenum);
	}
	public void selectLifecover(String value)
	{
		GenericMethods.dropdownByValue(lifecoverlevel, value);
	}
	public void selectPAcover(String value)
	{
		GenericMethods.dropdownByValue(PAcoverlevel, value);
	}
	public void enterNomineeName(String nom_name)
	{
		nomineeName.sendKeys(nom_name);
	}
	public void enterNomineeMsisn(String nom_msisdn)
	{
		nomineeMsisdn.sendKeys(nom_msisdn);
	}
	public void selectNomineeRel(String value)
	{
		GenericMethods.dropdownByVisibleText(nomineerelation, value);
	}
	public void selectHPcover(String val)
	{
		GenericMethods.dropdownByValue(hpcoverlevel, val);
	}
	
	public void enterChildone(String childOne) throws InterruptedException
	{
		childone.sendKeys(childOne);
		benefInfo.click();
		child1DOB.click();
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='DynarchCalendar-titleCont']/tbody/tr/td/div/div[contains(.,2020)]"))).click();
		// WebElement ele= driver.findElement(By.xpath("//input[@dyc-btn='year']"));
		// /html/body/table[1]/tbody/tr/td/div/div[4]/table/tbody/tr/td/table[1]/tbody/tr[1]/td/input
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table[2]/tbody/tr/td/div/div[4]/table/tbody/tr/td/table[1]/tbody/tr[1]/td/input"))).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
	    driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/div/div[4]/table/tbody/tr/td/table[1]/tbody/tr[1]/td/input")).sendKeys("2015");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='DynarchCalendar-menu-mtable']/tbody/tr/td/div[contains(.,'Jan')]"))).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='DynarchCalendar-bodyTable']/tbody/tr/td[2]/div"))).click();
	
	}
	public void enterChildtwo(String childTwo)
	{
		childtwo.sendKeys(childTwo);
		benefInfo.click();
		child2DOB.click();
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='DynarchCalendar-titleCont']/tbody/tr/td/div/div[contains(.,2020)]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@dyc-btn='year']"))).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
	    driver.findElement(By.xpath("//input[@dyc-btn='year']")).sendKeys("2015");
	    driver.findElement(By.xpath("//table[@class='DynarchCalendar-menu-mtable']/tbody/tr/td/div[contains(.,'Jan')]")).click();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='DynarchCalendar-bodyTable']/tbody/tr/td[2]/div"))).click();
	
	}
	public void enterChildthree(String childThree)
	{
		childthree.sendKeys(childThree);
		benefInfo.click();
		child3DOB.click();
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='DynarchCalendar-titleCont']/tbody/tr/td/div/div[contains(.,2020)]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@dyc-btn='year']"))).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
	    driver.findElement(By.xpath("//input[@dyc-btn='year']")).sendKeys("2015");
	    driver.findElement(By.xpath("//table[@class='DynarchCalendar-menu-mtable']/tbody/tr/td/div[contains(.,'Jan')]")).click();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='DynarchCalendar-bodyTable']/tbody/tr/td[2]/div"))).click();

	}
	public void toAddChildtwo()
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(addchildtwo)).click();
		//addchildtwo.click();
	}
	public void toAddChildthree()
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(addchildthree)).click();
		//addchildthree.click();
	}
	public void toRemoveChildtwo()
	{
		removechildtwo.click();
	}
	public void toRemoveChildthree()
	{
		removechildthree.click();
	}
	
	
}
