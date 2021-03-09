package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.LoginPageObject;
import utility.OpenBrowser;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

@RunWith(Cucumber.class)
public class LoginPageSteps extends OpenBrowser {
	
	
    
    @Given("^User is on Lanka MIP Platform$")
    public void user_is_on_lanka_mip_platform() throws Throwable {
        System.out.println("Page Title :"+ driver.getTitle());
    }

    @When("^User enters valid (.+) and valid (.+)$")
    public void user_enters_valid_and_valid(String username, String password) throws Throwable {
    	LoginPageObject lp=new LoginPageObject();
    	lp.setUsername(username);
        lp.setPassword(password);
        
    }

    @When("^User enters invalid (.+) and valid (.+)$")
    public void user_enters_invalid_and_valid(String username, String password) throws Throwable {
    	LoginPageObject lp=new LoginPageObject();
    	lp.setUsername(username);
        lp.setPassword(password);
        
    }

    @When("^User enters valid (.+) and invalid (.+)$")
    public void user_enters_valid_and_invalid(String username, String password) throws Throwable {
    	LoginPageObject lp=new LoginPageObject();
    	lp.setUsername(username);
        lp.setPassword(password);
        
    }

    @When("^User enters invalid (.+) and invalid (.+)$")
    public void user_enters_invalid_and_invalid(String username, String password) throws Throwable {
    	LoginPageObject lp=new LoginPageObject();
    	lp.setUsername(username);
        lp.setPassword(password);
        
    }

    @When("^User click on forgot password link$")
    public void user_click_on_forgot_password_link() throws Throwable {
    	LoginPageObject lp=new LoginPageObject();
    	lp.clickforgotpassowrd();
    }

    @Then("^User clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
    	LoginPageObject lp=new LoginPageObject();
    	lp.clickLogin();
    }

    @Then("^User clicks on clear button$")
    public void user_clicks_on_clear_button() throws Throwable {
    	LoginPageObject lp=new LoginPageObject();
    	lp.clickClear();
    }

    @Then("^user enters the loginid and submit$")
    public void user_enters_the_loginid_and_submit() throws Throwable {
        throw new PendingException();
    }

    @And("^User must be successfully logged in$")
    public void user_must_be_successfully_logged_in() throws Throwable {
        String text=driver.findElement(By.xpath("//a[@class='selectedMenu']")).getText();
        if(text.contains("Home"))
        {
        	System.out.println("User successfully logged into the portal");
        }
    }

    @And("^User must be displayed with appropriate error message$")
    public void user_must_be_displayed_with_appropriate_error_message() throws Throwable {
    	LoginPageObject lp=new LoginPageObject();
    	lp.iserrordisplayed();
    }

    @And("^login credentials must be cleared$")
    public void login_credentials_must_be_cleared() throws Throwable {
    	LoginPageObject lp=new LoginPageObject();
    	lp.isUsernamecleared();
    	lp.isPasswordcleared();
    	
    }

    @And("^User must succesfully reset the password$")
    public void user_must_succesfully_reset_the_password() throws Throwable {
        throw new PendingException();
    }

}