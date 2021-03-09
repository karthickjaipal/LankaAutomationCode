package stepDefinition;
	import cucumber.api.DataTable;
    import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.junit.Cucumber;
import pageObjects.HomePageObject;
import pageObjects.UpgradeHMPPageObject;
import utility.OpenBrowser;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

	@RunWith(Cucumber.class)
	public class UpgradeHMPLevelSteps extends OpenBrowser {

	    @Given("^User is on Upgrade HMP Level menu under Customer Management$")
	    public void user_is_on_upgrade_hmp_level_menu_under_customer_management() throws Throwable {
	        HomePageObject home=new HomePageObject();
	        home.selectCusManagement();
	        home.selectUpdateHMPlevel();
	    }

	    @When("^User selects the CDMA,HMP 2M level and click on save button$")
	    public void user_selects_the_cdmahmp_2m_level_and_click_on_save_button(DataTable data) throws Throwable {
	       UpgradeHMPPageObject hmp=new UpgradeHMPPageObject();
	    	List<List<String>> obj=data.raw();
	        String nic= obj.get(1).get(0);
	        String val= obj.get(1).get(1);
	        hmp.setNic(nic);
	        hmp.selectCDMA();
	        hmp.clickSearch();
	        hmp.selectNewOfferCover(val);
	        hmp.clickSave();
	        
	    }

	    @When("^User selects the CDMA,HMP 5M level and click on save button$")
	    public void user_selects_the_cdmahmp_5m_level_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHMPPageObject hmp=new UpgradeHMPPageObject();
	    	List<List<String>> obj=data.raw();
	        String nic= obj.get(1).get(0);
	        String val= obj.get(1).get(1);
	        hmp.setNic(nic);
	        hmp.selectCDMA();
	        hmp.clickSearch();
	        hmp.selectNewOfferCover(val);
	        hmp.clickSave();
	        
	    }

	    @When("^User selects the CDMA,HMP 1M level and click on save button$")
	    public void user_selects_the_cdmahmp_1m_level_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHMPPageObject hmp=new UpgradeHMPPageObject();
	    	List<List<String>> obj=data.raw();
	        String nic= obj.get(1).get(0);
	        String val= obj.get(1).get(1);
	        hmp.setNic(nic);
	        hmp.selectCDMA();
	        hmp.clickSearch();
	        hmp.selectNewOfferCover(val);
	        hmp.clickSave();
	        
	    }

	    @When("^User selects the LTE,HMP 2M level and click on save button$")
	    public void user_selects_the_ltehmp_2m_level_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHMPPageObject hmp=new UpgradeHMPPageObject();
	    	List<List<String>> obj=data.raw();
	        String nic= obj.get(1).get(0);
	        String val= obj.get(1).get(1);
	        hmp.setNic(nic);
	        hmp.selectLTE();
	        hmp.clickSearch();
	        hmp.selectNewOfferCover(val);
	        hmp.clickSave();
	        
	    }

	    @When("^User selects the LTE,HMP 5M level and click on save button$")
	    public void user_selects_the_ltehmp_5m_level_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHMPPageObject hmp=new UpgradeHMPPageObject();
	    	List<List<String>> obj=data.raw();
	        String nic= obj.get(1).get(0);
	        String val= obj.get(1).get(1);
	        hmp.setNic(nic);
	        hmp.selectLTE();
	        hmp.clickSearch();
	        hmp.selectNewOfferCover(val);
	        hmp.clickSave();
	    }

	    @When("^User selects the LTE,HMP 1M level and click on save button$")
	    public void user_selects_the_ltehmp_1m_level_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHMPPageObject hmp=new UpgradeHMPPageObject();
	    	List<List<String>> obj=data.raw();
	        String nic= obj.get(1).get(0);
	        String val= obj.get(1).get(1);
	        hmp.setNic(nic);
	        hmp.selectLTE();
	        hmp.clickSearch();
	        hmp.selectNewOfferCover(val);
	        hmp.clickSave();
	    }

	    
	    @Then("^Customer HMP upgraded successfully message must be displayed$")
	    public void customer_hmp_upgraded_successfully_message_must_be_displayed() throws Throwable {
	    	boolean text=driver.findElement(By.xpath("//div[contains(text(),'The customer benefit level has been updated successfully')]")).isDisplayed();
	        if(text==true)
	        {
	    	System.out.println("HMP Upgrade Successfull");
	        }
	    	else
	    	{
	    		System.out.println("upgrade failure");
	    	}

	    }
	    

}


