package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.OpenBrowser;

public class LoginPageObject extends OpenBrowser {
	
	@FindBy(xpath="//input[@id='loginId']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='userHash']")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[@id='mylink']")
	WebElement forgotpwd;
	
	@FindBy(xpath="//li[@id='clearBtn']")
	WebElement clear;
	
	@FindBy(xpath="//div[@class='error-msg-login']")
	WebElement error_message;
	
	public LoginPageObject()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		loginbtn.click();
	}
	
	public void clickClear()
	{
		clear.click();
	}

	public void clickforgotpassowrd()
	{
		forgotpwd.click();
	}
	
	public void isUsernamecleared()
	{
		String text=username.getText();
		if(text.isEmpty()==true)
		{
			System.out.println("Username field is cleared");
		}
	}
	
	public void isPasswordcleared()
	{
		String text=password.getText();
		if(text.isEmpty()==true)
		{
			System.out.println("Password field is cleared");
		}
	}
	
	public void iserrordisplayed()
	{
		if(error_message.isDisplayed()==true)
		{
			System.out.println("User is displayed with the error message");
		}
	}
	
}
