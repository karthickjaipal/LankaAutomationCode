package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.HomePageObject;
import pageObjects.GSMRegisterCustomerPageObject;
import utility.OpenBrowser;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;


@RunWith(Cucumber.class)
public class GSMPrepaidRegisterCustomerSteps extends OpenBrowser {

    @Given("^User is on Register customer menu under home page$")
    public void user_is_on_register_customer_menu_under_home_page() throws Throwable {
        HomePageObject home=new HomePageObject();
        home.selectCusManagement();
        home.selectRegisterCustomer();
    }

    @When("^User enters all valid customer details,selects HP product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String alt_num=obj.get(1).get(4);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(alt_num);
        reg.clickSave();
        reg.clickOK();
        
    }
    
    @When("^User enters all valid customer details,selects Life 100K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_100k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String alt_num=obj.get(1).get(4);
        String coverlevel=obj.get(1).get(5);
        String nom_name=obj.get(1).get(6);
        String nom_msisdn=obj.get(1).get(7);
        String rel=obj.get(1).get(8);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectLife();
        reg.enterLifealternatenumber(alt_num);
        reg.selectLifecover(coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(rel);
        reg.clickSave();
        reg.clickOK();
    }
    
    @When("^User enters all valid customer details,selects PA2017 500K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_pa2017_500k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String alt_num=obj.get(1).get(4);
        String coverlevel=obj.get(1).get(5);
        String nom_name=obj.get(1).get(6);
        String nom_msisdn=obj.get(1).get(7);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectPA2017();
        reg.enterPAalternatenumber(alt_num);
        reg.selectPAcover(coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }
    
    @When("^User enters all valid customer details,selects HP and Life 100K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_and_life_100k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String Life_alt_num=obj.get(1).get(5);
        String Life_coverlevel=obj.get(1).get(6);
        String nom_name=obj.get(1).get(7);
        String nom_msisdn=obj.get(1).get(8);
        String nom_rel=obj.get(1).get(9);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
        
        
    }
    
    @When("^User enters all valid customer details,selects HP and Life 250K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_and_life_250k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String Life_alt_num=obj.get(1).get(5);
        String Life_coverlevel=obj.get(1).get(6);
        String nom_name=obj.get(1).get(7);
        String nom_msisdn=obj.get(1).get(8);
        String nom_rel=obj.get(1).get(9);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP and Life 500K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_and_life_500k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String Life_alt_num=obj.get(1).get(5);
        String Life_coverlevel=obj.get(1).get(6);
        String nom_name=obj.get(1).get(7);
        String nom_msisdn=obj.get(1).get(8);
        String nom_rel=obj.get(1).get(9);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP and Life 1M product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_and_life_1m_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String Life_alt_num=obj.get(1).get(5);
        String Life_coverlevel=obj.get(1).get(6);
        String nom_name=obj.get(1).get(7);
        String nom_msisdn=obj.get(1).get(8);
        String nom_rel=obj.get(1).get(9);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }
    
    @When("^User enters all valid customer details,selects Life 100K and PA2017 500K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_100k_and_pa2017_500k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String Life_alt_num=obj.get(1).get(4);
        String Life_coverlevel=obj.get(1).get(5);
        String PA_alt_num=obj.get(1).get(6);
        String PA_coverlevel=obj.get(1).get(7);
        String nom_name=obj.get(1).get(8);
        String nom_msisdn=obj.get(1).get(9);
        String nom_rel=obj.get(1).get(10);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectPA2017();
        reg.selectLife();
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }
    
    @When("^User enters all valid customer details,selects HP,Life 100K and PA2017 500K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hplife_100k_and_pa2017_500k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
       GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
       List<List<String>> obj=data.raw();
       String nic=obj.get(1).get(0);
       String cname=obj.get(1).get(1);
       String lang=obj.get(1).get(2);
       String num=obj.get(1).get(3);
       String HP_alt_num=obj.get(1).get(4);
       String Life_alt_num=obj.get(1).get(5);
       String Life_coverlevel=obj.get(1).get(6);
       String PA_alt_num=obj.get(1).get(7);
       String PA_coverlevel=obj.get(1).get(8);;
       String nom_name=obj.get(1).get(9);
       String nom_msisdn=obj.get(1).get(10);
       String nom_rel=obj.get(1).get(11);
       reg.setNic(nic);
       reg.selectGSMChannel();
       reg.clickSearch();
       reg.enterCustomername(cname);
       reg.preferredLang(lang);
       reg.enterMsisdn(num);
       driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
       reg.selectHP();
       reg.selectLife();
       reg.selectPA2017();
       reg.enterHPalternatenumber(HP_alt_num);
       reg.enterLifealternatenumber(Life_alt_num);
       reg.selectLifecover(Life_coverlevel);
       reg.enterPAalternatenumber(PA_alt_num);
       reg.selectPAcover(PA_coverlevel);
       reg.enterNomineeName(nom_name);
       reg.enterNomineeMsisn(nom_msisdn);
       reg.selectNomineeRel(nom_rel);
       reg.clickSave();
       reg.clickOK();
       
       
    }
    
    @When("^User enters all valid customer details,selects Life 250K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_250k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String alt_num=obj.get(1).get(4);
        String coverlevel=obj.get(1).get(5);
        String nom_name=obj.get(1).get(6);
        String nom_msisdn=obj.get(1).get(7);
        String rel=obj.get(1).get(8);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectLife();
        reg.enterLifealternatenumber(alt_num);
        reg.selectLifecover(coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects Life 500K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_500k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String alt_num=obj.get(1).get(4);
        String coverlevel=obj.get(1).get(5);
        String nom_name=obj.get(1).get(6);
        String nom_msisdn=obj.get(1).get(7);
        String rel=obj.get(1).get(8);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectLife();
        reg.enterLifealternatenumber(alt_num);
        reg.selectLifecover(coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects Life 1M product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_1m_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String alt_num=obj.get(1).get(4);
        String coverlevel=obj.get(1).get(5);
        String nom_name=obj.get(1).get(6);
        String nom_msisdn=obj.get(1).get(7);
        String rel=obj.get(1).get(8);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectLife();
        reg.enterLifealternatenumber(alt_num);
        reg.selectLifecover(coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(rel);
        reg.clickSave();
        reg.clickOK();
    }
    
    @When("^User enters all valid customer details,selects PA2017 1M product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_pa2017_1m_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String alt_num=obj.get(1).get(4);
        String coverlevel=obj.get(1).get(5);
        String nom_name=obj.get(1).get(6);
        String nom_msisdn=obj.get(1).get(7);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectPA2017();
        reg.enterPAalternatenumber(alt_num);
        reg.selectPAcover(coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }
    
    @When("^User enters all valid customer details,selects Life 250K and PA2017 500K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_250k_and_pa2017_500k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String Life_alt_num=obj.get(1).get(4);
        String Life_coverlevel=obj.get(1).get(5);
        String PA_alt_num=obj.get(1).get(6);
        String PA_coverlevel=obj.get(1).get(7);
        String nom_name=obj.get(1).get(8);
        String nom_msisdn=obj.get(1).get(9);
        String nom_rel=obj.get(1).get(10);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectPA2017();
        reg.selectLife();
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects Life 500K and PA2017 500K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_500k_and_pa2017_500k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String Life_alt_num=obj.get(1).get(4);
        String Life_coverlevel=obj.get(1).get(5);
        String PA_alt_num=obj.get(1).get(6);
        String PA_coverlevel=obj.get(1).get(7);
        String nom_name=obj.get(1).get(8);
        String nom_msisdn=obj.get(1).get(9);
        String nom_rel=obj.get(1).get(10);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectPA2017();
        reg.selectLife();
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects Life 1M and PA2017 500K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_1m_and_pa2017_500k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String Life_alt_num=obj.get(1).get(4);
        String Life_coverlevel=obj.get(1).get(5);
        String PA_alt_num=obj.get(1).get(6);
        String PA_coverlevel=obj.get(1).get(7);
        String nom_name=obj.get(1).get(8);
        String nom_msisdn=obj.get(1).get(9);
        String nom_rel=obj.get(1).get(10);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectPA2017();
        reg.selectLife();
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects Life 100K and PA2017 1M product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_100k_and_pa2017_1m_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String Life_alt_num=obj.get(1).get(4);
        String Life_coverlevel=obj.get(1).get(5);
        String PA_alt_num=obj.get(1).get(6);
        String PA_coverlevel=obj.get(1).get(7);
        String nom_name=obj.get(1).get(8);
        String nom_msisdn=obj.get(1).get(9);
        String nom_rel=obj.get(1).get(10);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectPA2017();
        reg.selectLife();
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects Life 250K and PA2017 1M product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_250k_and_pa2017_1m_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String Life_alt_num=obj.get(1).get(4);
        String Life_coverlevel=obj.get(1).get(5);
        String PA_alt_num=obj.get(1).get(6);
        String PA_coverlevel=obj.get(1).get(7);
        String nom_name=obj.get(1).get(8);
        String nom_msisdn=obj.get(1).get(9);
        String nom_rel=obj.get(1).get(10);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectPA2017();
        reg.selectLife();
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects Life 500K and PA2017 1M product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_500k_and_pa2017_1m_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String Life_alt_num=obj.get(1).get(4);
        String Life_coverlevel=obj.get(1).get(5);
        String PA_alt_num=obj.get(1).get(6);
        String PA_coverlevel=obj.get(1).get(7);
        String nom_name=obj.get(1).get(8);
        String nom_msisdn=obj.get(1).get(9);
        String nom_rel=obj.get(1).get(10);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectPA2017();
        reg.selectLife();
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects Life 1M and PA2017 1M product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_1m_and_pa2017_1m_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String Life_alt_num=obj.get(1).get(4);
        String Life_coverlevel=obj.get(1).get(5);
        String PA_alt_num=obj.get(1).get(6);
        String PA_coverlevel=obj.get(1).get(7);
        String nom_name=obj.get(1).get(8);
        String nom_msisdn=obj.get(1).get(9);
        String nom_rel=obj.get(1).get(10);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectPA2017();
        reg.selectLife();
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }
    

    @When("^User enters all valid customer details,selects HP,Life 250K and PA2017 500K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hplife_250k_and_pa2017_500k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String Life_alt_num=obj.get(1).get(5);
        String Life_coverlevel=obj.get(1).get(6);
        String PA_alt_num=obj.get(1).get(7);
        String PA_coverlevel=obj.get(1).get(8);;
        String nom_name=obj.get(1).get(9);
        String nom_msisdn=obj.get(1).get(10);
        String nom_rel=obj.get(1).get(11);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.selectLife();
        reg.selectPA2017();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP,Life 500K and PA2017 500K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hplife_500k_and_pa2017_500k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String Life_alt_num=obj.get(1).get(5);
        String Life_coverlevel=obj.get(1).get(6);
        String PA_alt_num=obj.get(1).get(7);
        String PA_coverlevel=obj.get(1).get(8);;
        String nom_name=obj.get(1).get(9);
        String nom_msisdn=obj.get(1).get(10);
        String nom_rel=obj.get(1).get(11);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.selectLife();
        reg.selectPA2017();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP,Life 1M and PA2017 500K product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hplife_1m_and_pa2017_500k_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String Life_alt_num=obj.get(1).get(5);
        String Life_coverlevel=obj.get(1).get(6);
        String PA_alt_num=obj.get(1).get(7);
        String PA_coverlevel=obj.get(1).get(8);;
        String nom_name=obj.get(1).get(9);
        String nom_msisdn=obj.get(1).get(10);
        String nom_rel=obj.get(1).get(11);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.selectLife();
        reg.selectPA2017();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP,Life 100K and PA2017 1M product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hplife_100k_and_pa2017_1m_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String Life_alt_num=obj.get(1).get(5);
        String Life_coverlevel=obj.get(1).get(6);
        String PA_alt_num=obj.get(1).get(7);
        String PA_coverlevel=obj.get(1).get(8);;
        String nom_name=obj.get(1).get(9);
        String nom_msisdn=obj.get(1).get(10);
        String nom_rel=obj.get(1).get(11);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.selectLife();
        reg.selectPA2017();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP,Life 250K and PA2017 1M product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hplife_250k_and_pa2017_1m_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String Life_alt_num=obj.get(1).get(5);
        String Life_coverlevel=obj.get(1).get(6);
        String PA_alt_num=obj.get(1).get(7);
        String PA_coverlevel=obj.get(1).get(8);;
        String nom_name=obj.get(1).get(9);
        String nom_msisdn=obj.get(1).get(10);
        String nom_rel=obj.get(1).get(11);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.selectLife();
        reg.selectPA2017();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP,Life 500K and PA2017 1M product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hplife_500k_and_pa2017_1m_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String Life_alt_num=obj.get(1).get(5);
        String Life_coverlevel=obj.get(1).get(6);
        String PA_alt_num=obj.get(1).get(7);
        String PA_coverlevel=obj.get(1).get(8);;
        String nom_name=obj.get(1).get(9);
        String nom_msisdn=obj.get(1).get(10);
        String nom_rel=obj.get(1).get(11);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.selectLife();
        reg.selectPA2017();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP,Life 1M and PA2017 1M product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hplife_1m_and_pa2017_1m_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String Life_alt_num=obj.get(1).get(5);
        String Life_coverlevel=obj.get(1).get(6);
        String PA_alt_num=obj.get(1).get(7);
        String PA_coverlevel=obj.get(1).get(8);;
        String nom_name=obj.get(1).get(9);
        String nom_msisdn=obj.get(1).get(10);
        String nom_rel=obj.get(1).get(11);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.selectLife();
        reg.selectPA2017();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
        
    }

    @Then("^Customer registered successfully message is displayed$")
    public void customer_registered_successfully_message_is_displayed() throws Throwable {
        String success_mess=driver.findElement(By.xpath("//div[@id='message_div']")).getText();
    	if(success_mess.contentEquals("The customer has been registered successfully."))
    	{
    	System.out.println("The customer has been registered successfully.");
        }
    	else
    	{
    		System.out.println("Customer Registration Failed");	
    	}
    	}

}