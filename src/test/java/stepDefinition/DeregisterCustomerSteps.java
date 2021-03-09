package stepDefinition;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.DeregisterCustomerPageObject;
import pageObjects.HomePageObject;
import utility.OpenBrowser;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

@RunWith(Cucumber.class)
public class DeregisterCustomerSteps extends OpenBrowser {
	
	    @Given("^User is on Deregister Customer menu under Home Page$")
	    public void user_is_on_deregister_customer_menu_under_home_page() throws Throwable {
	        HomePageObject home=new HomePageObject();
	        home.selectCusManagement();
	        home.selectDeregisterCustomer();
	    }

	    @When("^User enters nic and selects the HP,clicks on Deregister button$")
	    public void user_enters_nic_and_selects_the_hpclicks_on_deregister_button(DataTable data) throws Throwable {
	    	DeregisterCustomerPageObject dereg=new DeregisterCustomerPageObject();
	    	List<List<String>> obj=data.raw();
	    	String nic=obj.get(1).get(0);
	    	dereg.setNic(nic);
	    	dereg.selectGSM();
	    	dereg.clickSearch();
	    	dereg.selectDeregProductasHP();
	    	dereg.clickDeregister();
	    	dereg.clickOK();
	    }
	    
	    @When("^User enters nic and selects the Life,clicks on Deregister button$")
	    public void user_enters_nic_and_selects_the_lifeclicks_on_deregister_button(DataTable data) throws Throwable {
	    	DeregisterCustomerPageObject dereg=new DeregisterCustomerPageObject();
	    	List<List<String>> obj=data.raw();
	    	String nic=obj.get(1).get(0);
	    	dereg.setNic(nic);
	    	dereg.selectGSM();
	    	dereg.clickSearch();
	    	dereg.selectDeregProductasLife();
	    	dereg.clickDeregister();
	    	dereg.clickOK();
	    }
	    
	    @When("^User enters nic and selects the PA,clicks on Deregister button$")
	    public void user_enters_nic_and_selects_the_paclicks_on_deregister_button(DataTable data) throws Throwable {
	    	DeregisterCustomerPageObject dereg=new DeregisterCustomerPageObject();
	    	List<List<String>> obj=data.raw();
	    	String nic=obj.get(1).get(0);
	    	dereg.setNic(nic);
	    	dereg.selectGSM();
	    	dereg.clickSearch();
	    	dereg.selectDeregProductasPA();
	    	dereg.clickDeregister();
	    	dereg.clickOK();
	    }
	    
	    @When("^User enters nic and selects HP and PA,clicks on Deregister button$")
	    public void user_enters_nic_and_selects_hp_and_paclicks_on_deregister_button(DataTable data) throws Throwable {
	    	DeregisterCustomerPageObject dereg=new DeregisterCustomerPageObject();
	    	List<List<String>> obj=data.raw();
	    	String nic=obj.get(1).get(0);
	    	dereg.setNic(nic);
	    	dereg.selectGSM();
	    	dereg.clickSearch();
	    	dereg.selectDeregProductasHP();
	    	dereg.selectDeregProductasPA();
	    	dereg.clickDeregister();
	    	dereg.clickOK();
	    }
	    
	    @When("^User enters nic and selects Life and PA,clicks on Deregister button$")
	    public void user_enters_nic_and_selects_life_and_paclicks_on_deregister_button(DataTable data) throws Throwable {
	    	DeregisterCustomerPageObject dereg=new DeregisterCustomerPageObject();
	    	List<List<String>> obj=data.raw();
	    	String nic=obj.get(1).get(0);
	    	dereg.setNic(nic);
	    	dereg.selectGSM();
	    	dereg.clickSearch();
	    	dereg.selectDeregProductasLife();
	    	dereg.selectDeregProductasPA();
	    	dereg.clickDeregister();
	    	dereg.clickOK();
	    }
	    
	    @When("^User enters nic and selects Life and HP,clicks on Deregister button$")
	    public void user_enters_nic_and_selects_life_and_hpclicks_on_deregister_button(DataTable data) throws Throwable {
	    	DeregisterCustomerPageObject dereg=new DeregisterCustomerPageObject();
	    	List<List<String>> obj=data.raw();
	    	String nic=obj.get(1).get(0);
	    	dereg.setNic(nic);
	    	dereg.selectGSM();
	    	dereg.clickSearch();
	    	dereg.selectDeregProductasLife();
	    	dereg.selectDeregProductasHP();
	    	dereg.clickDeregister();
	    	dereg.clickOK();
	    }
	    
	    @When("^User enters nic and selects Life,PA and HP,clicks on Deregister button$")
	    public void user_enters_nic_and_selects_lifepa_and_hpclicks_on_deregister_button(DataTable data) throws Throwable {
	    	DeregisterCustomerPageObject dereg=new DeregisterCustomerPageObject();
	    	List<List<String>> obj=data.raw();
	    	String nic=obj.get(1).get(0);
	    	dereg.setNic(nic);
	    	dereg.selectGSM();
	    	dereg.clickSearch();
	    	dereg.selectDeregProductasLife();
	    	dereg.selectDeregProductasHP();
	    	dereg.selectDeregProductasPA();
	    	dereg.clickDeregister();
	    	dereg.clickOK();
	    }


	    @Then("^Deregister Success message is displayed$")
	    public void deregister_success_message_is_displayed() throws Throwable {
	        String success_mes=driver.findElement(By.xpath("//div[@id='message_div']")).getText();
	        if(success_mes.contentEquals("Your request to de-register is successfully processed."))
	        		{
	        	       
	        	       System.out.println("Deregistration Successful");
	        		}
	        else
	        {
	        	System.out.println("Deregistration failed");
	        }
	    }

	}


