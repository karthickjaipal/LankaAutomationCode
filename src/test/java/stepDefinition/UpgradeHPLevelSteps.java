package stepDefinition;
    
    import cucumber.api.DataTable;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.junit.Cucumber;
import pageObjects.HomePageObject;
import pageObjects.UpgradeHPPageObject;
import utility.OpenBrowser;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

	@RunWith(Cucumber.class)
	public class UpgradeHPLevelSteps extends OpenBrowser {

	    @Given("^User is on Upgrade HP Level menu under Customer Management$")
	    public void user_is_on_upgrade_hp_level_menu_under_customer_management() throws Throwable {
	    	HomePageObject home=new HomePageObject();
	    	home.selectCusManagement();
	        home.selectUpdateHPlevel();
	    }

	    @When("^User selects the HP Silver level and click on save button$")
	    public void user_selects_the_hp_silver_level_and_click_on_save_button(DataTable data) throws Throwable {
	        UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clickSave();
	        ref.clickOK();
	        
	    }
	    
	    @When("^User selects the HP Silver level with spouse and click on save button$")
	    public void user_selects_the_hp_silver_level_with_spouse_and_click_on_save_button(DataTable data) throws Throwable {
	        UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String spouse=obj.get(1).get(2);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearSpouse();
	        ref.enterSpouseName(spouse);
	        ref.clickSave();
	        ref.clickOK();
	        
	    }
	    
	    @When("^User selects the HP Silver level with spouse,child1 and click on save button$")
	    public void user_selects_the_hp_silver_level_with_spousechild1_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String spouse=obj.get(1).get(2);
	        String child1=obj.get(1).get(3);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearSpouse();
	        ref.enterSpouseName(spouse);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Silver level with spouse,child1,child2 and click on save button$")
	    public void user_selects_the_hp_silver_level_with_spousechild1child2_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String spouse=obj.get(1).get(2);
	        String child1=obj.get(1).get(3);
	        String child2=obj.get(1).get(4);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearSpouse();
	        ref.enterSpouseName(spouse);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.toAddSecondChild();
	        ref.clearSecondChild();
	        ref.enterSecondChildName(child2);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Silver level with spouse,child1,child2,child3 and click on save button$")
	    public void user_selects_the_hp_silver_level_with_spousechild1child2child3_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String spouse=obj.get(1).get(2);
	        String child1=obj.get(1).get(3);
	        String child2=obj.get(1).get(4);
	        String child3=obj.get(1).get(5);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearSpouse();
	        ref.enterSpouseName(spouse);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.toAddSecondChild();
	        ref.clearSecondChild();
	        ref.enterSecondChildName(child2);
	        ref.toAddThirdChild();
	        ref.clearThirdChild();
	        ref.enterThirdChildName(child3);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    
	    @When("^User selects the HP Silver level with child1 and click on save button$")
	    public void user_selects_the_hp_silver_level_with_child1_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String child1=obj.get(1).get(2);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Silver level with child1,child2 and click on save button$")
	    public void user_selects_the_hp_silver_level_with_child1child2_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String child1=obj.get(1).get(2);
	        String child2=obj.get(1).get(3);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.toAddSecondChild();
	        ref.clearSecondChild();
	        ref.enterSecondChildName(child2);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Silver level with child1,child2,child3 and click on save button$")
	    public void user_selects_the_hp_silver_level_with_child1child2child3_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String child1=obj.get(1).get(2);
	        String child2=obj.get(1).get(3);
	        String child3=obj.get(1).get(4);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.toAddSecondChild();
	        ref.clearSecondChild();
	        ref.enterSecondChildName(child2);
	        ref.toAddThirdChild();
	        ref.clearThirdChild();
	        ref.enterThirdChildName(child3);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Gold level and click on save button$")
	    public void user_selects_the_hp_gold_level_and_click_on_save_button(DataTable data) throws Throwable {
	    	  UpgradeHPPageObject ref=new UpgradeHPPageObject();
		    	List<List<String>> obj =data.raw();
		        String nic=obj.get(1).get(0);
		        String val=obj.get(1).get(1);
		        ref.setNic(nic);
		        ref.selectGSM();
		        ref.clickSearch();
		        ref.selectNewOfferCover(val);
		        ref.clickSave();
		        ref.clickOK();
		        
	    }
	    
	    @When("^User selects the HP Gold level with spouse and click on save button$")
	    public void user_selects_the_hp_gold_level_with_spouse_and_click_on_save_button(DataTable data) throws Throwable {
	        UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String spouse=obj.get(1).get(2);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearSpouse();
	        ref.enterSpouseName(spouse);
	        ref.clickSave();
	        ref.clickOK();
	        
	    }
	    
	    @When("^User selects the HP Gold level with spouse,child1 and click on save button$")
	    public void user_selects_the_hp_gold_level_with_spousechild1_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String spouse=obj.get(1).get(2);
	        String child1=obj.get(1).get(3);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearSpouse();
	        ref.enterSpouseName(spouse);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Gold level with spouse,child1,child2 and click on save button$")
	    public void user_selects_the_hp_gold_level_with_spousechild1child2_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String spouse=obj.get(1).get(2);
	        String child1=obj.get(1).get(3);
	        String child2=obj.get(1).get(4);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearSpouse();
	        ref.enterSpouseName(spouse);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.toAddSecondChild();
	        ref.clearSecondChild();
	        ref.enterSecondChildName(child2);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Gold level with spouse,child1,child2,child3 and click on save button$")
	    public void user_selects_the_hp_gold_level_with_spousechild1child2child3_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String spouse=obj.get(1).get(2);
	        String child1=obj.get(1).get(3);
	        String child2=obj.get(1).get(4);
	        String child3=obj.get(1).get(5);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearSpouse();
	        ref.enterSpouseName(spouse);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.toAddSecondChild();
	        ref.clearSecondChild();
	        ref.enterSecondChildName(child2);
	        ref.toAddThirdChild();
	        ref.clearThirdChild();
	        ref.enterThirdChildName(child3);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Gold level with child1 and click on save button$")
	    public void user_selects_the_hp_gold_level_with_child1_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String child1=obj.get(1).get(2);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Gold level with child1,child2 and click on save button$")
	    public void user_selects_the_hp_gold_level_with_child1child2_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String child1=obj.get(1).get(2);
	        String child2=obj.get(1).get(3);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.toAddSecondChild();
	        ref.clearSecondChild();
	        ref.enterSecondChildName(child2);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Gold level with child1,child2,child3 and click on save button$")
	    public void user_selects_the_hp_gold_level_with_child1child2child3_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String child1=obj.get(1).get(2);
	        String child2=obj.get(1).get(3);
	        String child3=obj.get(1).get(4);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.toAddSecondChild();
	        ref.clearSecondChild();
	        ref.enterSecondChildName(child2);
	        ref.toAddThirdChild();
	        ref.clearThirdChild();
	        ref.enterThirdChildName(child3);
	        ref.clickSave();
	        ref.clickOK();
	    }
	     
	    @When("^User selects the HP Basic level and click on save button$")
	    public void user_selects_the_hp_basic_level_and_click_on_save_button(DataTable data) throws Throwable {
	    	  UpgradeHPPageObject ref=new UpgradeHPPageObject();
		    	List<List<String>> obj =data.raw();
		        String nic=obj.get(1).get(0);
		        String val=obj.get(1).get(1);
		        ref.setNic(nic);
		        ref.selectGSM();
		        ref.clickSearch();
		        ref.selectNewOfferCover(val);
		        ref.clickSave();
		        ref.clickOK();
		        
	    }
	    
	    @When("^User selects the HP Basic level with spouse and click on save button$")
	    public void user_selects_the_hp_basic_level_with_spouse_and_click_on_save_button(DataTable data) throws Throwable {
	        UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String spouse=obj.get(1).get(2);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearSpouse();
	        ref.enterSpouseName(spouse);
	        ref.clickSave();
	        ref.clickOK();
	        
	    }
	    
	    @When("^User selects the HP Basic level with spouse,child1 and click on save button$")
	    public void user_selects_the_hp_basic_level_with_spousechild1_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String spouse=obj.get(1).get(2);
	        String child1=obj.get(1).get(3);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearSpouse();
	        ref.enterSpouseName(spouse);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Basic level with spouse,child1,child2 and click on save button$")
	    public void user_selects_the_hp_basic_level_with_spousechild1child2_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String spouse=obj.get(1).get(2);
	        String child1=obj.get(1).get(3);
	        String child2=obj.get(1).get(4);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearSpouse();
	        ref.enterSpouseName(spouse);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.toAddSecondChild();
	        ref.clearSecondChild();
	        ref.enterSecondChildName(child2);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Basic level with spouse,child1,child2,child3 and click on save button$")
	    public void user_selects_the_hp_basic_level_with_spousechild1child2child3_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String spouse=obj.get(1).get(2);
	        String child1=obj.get(1).get(3);
	        String child2=obj.get(1).get(4);
	        String child3=obj.get(1).get(5);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearSpouse();
	        ref.enterSpouseName(spouse);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.toAddSecondChild();
	        ref.clearSecondChild();
	        ref.enterSecondChildName(child2);
	        ref.toAddThirdChild();
	        ref.clearThirdChild();
	        ref.enterThirdChildName(child3);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Basic level with child1 and click on save button$")
	    public void user_selects_the_hp_basic_level_with_child1_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String child1=obj.get(1).get(2);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Basic level with child1,child2 and click on save button$")
	    public void user_selects_the_hp_basic_level_with_child1child2_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String child1=obj.get(1).get(2);
	        String child2=obj.get(1).get(3);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.toAddSecondChild();
	        ref.clearSecondChild();
	        ref.enterSecondChildName(child2);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    @When("^User selects the HP Basic level with child1,child2,child3 and click on save button$")
	    public void user_selects_the_hp_basic_level_with_child1child2child3_and_click_on_save_button(DataTable data) throws Throwable {
	    	UpgradeHPPageObject ref=new UpgradeHPPageObject();
	    	List<List<String>> obj =data.raw();
	        String nic=obj.get(1).get(0);
	        String val=obj.get(1).get(1);
	        String child1=obj.get(1).get(2);
	        String child2=obj.get(1).get(3);
	        String child3=obj.get(1).get(4);
	        ref.setNic(nic);
	        ref.selectGSM();
	        ref.clickSearch();
	        ref.selectNewOfferCover(val);
	        ref.clearFirstChild();
	        ref.enterFirstChildName(child1);
	        ref.toAddSecondChild();
	        ref.clearSecondChild();
	        ref.enterSecondChildName(child2);
	        ref.toAddThirdChild();
	        ref.clearThirdChild();
	        ref.enterThirdChildName(child3);
	        ref.clickSave();
	        ref.clickOK();
	    }
	    
	    

	    @Then("^Customer upgraded successfully message must be displayed$")
	    public void customer_upgraded_successfully_message_must_be_displayed() throws Throwable {
	        boolean text=driver.findElement(By.xpath("//div[contains(text(),'The customer benefit level has been updated successfully')]")).isDisplayed();
	        if(text==true)
	        {
	    	System.out.println("HP Upgrade Successfull");
	        }
	    	else
	    	{
	    		System.out.println("upgrade failure");
	    	}

	    }
	}


