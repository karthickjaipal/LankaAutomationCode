package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.HomePageObject;
import pageObjects.UpgradePAPageObject;
import utility.OpenBrowser;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

@RunWith(Cucumber.class)
public class UpgradePALevelSteps extends OpenBrowser{

    @Given("^User is on Upgrade PA Level menu under Customer Management$")
    public void user_is_on_upgrade_pa_level_menu_under_customer_management() throws Throwable {
    	HomePageObject home=new HomePageObject();
        home.selectCusManagement();
        home.selectUpdatePAlevel();
    }

    @When("^User selects the PA 1M level and click on save button$")
    public void user_selects_the_pa_1m_level_and_click_on_save_button(DataTable data) throws Throwable {
    	UpgradePAPageObject pa=new UpgradePAPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String val=obj.get(1).get(1);
        pa.setNic(nic);
        pa.selectGSM();
        pa.clickSearch();
        pa.selectNewOfferCover(val);
        pa.clickSave();
    }

    @When("^User selects the PA 500K level and click on save button$")
    public void user_selects_the_pa_500k_level_and_click_on_save_button(DataTable data) throws Throwable {
    	UpgradePAPageObject pa=new UpgradePAPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String val=obj.get(1).get(1);
        pa.setNic(nic);
        pa.selectGSM();
        pa.clickSearch();
        pa.selectNewOfferCover(val);
        pa.clickSave();
    }

    @Then("^Customer PA upgraded successfully message must be displayed$")
    public void customer_pa_upgraded_successfully_message_must_be_displayed() throws Throwable {
    	boolean text=driver.findElement(By.xpath("//div[contains(text(),'The customer benefit level has been updated successfully')]")).isDisplayed();
        if(text==true)
        {
    	System.out.println("PA Upgrade Successfull");
        }
    	else
    	{
    		System.out.println("upgrade failure");
    	}
    }

}

