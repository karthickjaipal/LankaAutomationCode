package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.HomePageObject;
import pageObjects.UpgradeLifePageObject;
import utility.OpenBrowser;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

@RunWith(Cucumber.class)
public class UpgradeLifeLevelSteps extends OpenBrowser {

    @Given("^User is on Upgrade Life Level menu under Customer Management$")
    public void user_is_on_upgrade_life_level_menu_under_customer_management() throws Throwable {
        HomePageObject home=new HomePageObject();
        home.selectCusManagement();
        home.selectUpdateLifelevel();
    }

    @When("^User selects the Life 250K level and click on save button$")
    public void user_selects_the_life_250k_level_and_click_on_save_button(DataTable data) throws Throwable {
        UpgradeLifePageObject lif=new UpgradeLifePageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String val=obj.get(1).get(1);
        lif.setNic(nic);
        lif.selectGSM();
        lif.clickSearch();
        lif.selectNewOfferCover(val);
        lif.clickSave();
        
        
    }

    @When("^User selects the Life 500K level and click on save button$")
    public void user_selects_the_life_500k_level_and_click_on_save_button(DataTable data) throws Throwable {
    	UpgradeLifePageObject lif=new UpgradeLifePageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String val=obj.get(1).get(1);
        lif.setNic(nic);
        lif.selectGSM();
        lif.clickSearch();
        lif.selectNewOfferCover(val);
        lif.clickSave();
     
    }

    @When("^User selects the Life 1M level and click on save button$")
    public void user_selects_the_life_1m_level_and_click_on_save_button(DataTable data) throws Throwable {
    	UpgradeLifePageObject lif=new UpgradeLifePageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String val=obj.get(1).get(1);
        lif.setNic(nic);
        lif.selectGSM();
        lif.clickSearch();
        lif.selectNewOfferCover(val);
        lif.clickSave();
       
    }

    @When("^User selects the Life 100K level and click on save button$")
    public void user_selects_the_life_100k_level_and_click_on_save_button(DataTable data) throws Throwable {
    	UpgradeLifePageObject lif=new UpgradeLifePageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String val=obj.get(1).get(1);
        lif.setNic(nic);
        lif.selectGSM();
        lif.clickSearch();
        lif.selectNewOfferCover(val);
        lif.clickSave();
       
    }

    @Then("^Customer Life upgraded successfully message must be displayed$")
    public void customer_life_upgraded_successfully_message_must_be_displayed() throws Throwable {
    	boolean text=driver.findElement(By.xpath("//div[contains(text(),'The customer benefit level has been updated successfully')]")).isDisplayed();
        if(text==true)
        {
    	System.out.println("Life Upgrade Successfull");
        }
    	else
    	{
    		System.out.println("upgrade failure");
    	}
    }

}