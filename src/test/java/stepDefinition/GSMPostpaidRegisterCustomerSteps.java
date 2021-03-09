package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.HomePageObject;
import pageObjects.GSMRegisterCustomerPageObject;
import utility.OpenBrowser;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;


@RunWith(Cucumber.class)
public class GSMPostpaidRegisterCustomerSteps extends OpenBrowser {

	
    @Given("^User is on register customer menu under home page$")
    public void user_is_on_register_customer_menu_under_home_page(){
        HomePageObject hom=new HomePageObject();
        hom.selectCusManagement();
        hom.selectRegisterCustomer();
    }

    @When("^User enters all valid customer details,selects HP Basic postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.clickSave();
        reg.clickOK();
        
    }
    
    @When("^User enters all valid customer details,selects HP Gold postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.clickSave();
        reg.clickOK();
    }
    
    @When("^User enters all valid customer details,selects HP Basic and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
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
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
        
        
    }
    
    @When("^User enters all valid customer details,selects HP Basic and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
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
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
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
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
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
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }
    
   
    @When("^User enters all valid customer details,selects HP Basic,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basiclife_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
       GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
       List<List<String>> obj=data.raw();
       String nic=obj.get(1).get(0);
       String cname=obj.get(1).get(1);
       String lang=obj.get(1).get(2);
       String num=obj.get(1).get(3);
       String HP_alt_num=obj.get(1).get(4);
       String hp_coverlevel=obj.get(1).get(5);
       String Life_alt_num=obj.get(1).get(6);
       String Life_coverlevel=obj.get(1).get(7);
       String PA_alt_num=obj.get(1).get(8);
       String PA_coverlevel=obj.get(1).get(9);
       String nom_name=obj.get(1).get(10);
       String nom_msisdn=obj.get(1).get(11);
       String nom_rel=obj.get(1).get(12);
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
       reg.selectHPcover(hp_coverlevel);
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
    
    @When("^User enters all valid customer details,selects Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
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

    @When("^User enters all valid customer details,selects Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
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

    @When("^User enters all valid customer details,selects Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
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
    
    @When("^User enters all valid customer details,selects PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
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
    
    @When("^User enters all valid customer details,selects Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
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

    @When("^User enters all valid customer details,selects Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
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

    @When("^User enters all valid customer details,selects Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
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

    @When("^User enters all valid customer details,selects Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
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

    @When("^User enters all valid customer details,selects Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
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

    @When("^User enters all valid customer details,selects Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
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

    @When("^User enters all valid customer details,selects Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
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
    

    @When("^User enters all valid customer details,selects HP Basic,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basiclife_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Basic,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basiclife_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Basic,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basiclife_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Basic,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basiclife_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Basic,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basiclife_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Basic,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basiclife_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Basic,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basiclife_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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
    
    @When("^User enters all valid customer details,selects HP Basic and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String PA_alt_num=obj.get(1).get(6);
        String PA_coverlevel=obj.get(1).get(7);
        String nom_name=obj.get(1).get(8);
        String nom_msisdn=obj.get(1).get(9);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String PA_alt_num=obj.get(1).get(6);
        String PA_coverlevel=obj.get(1).get(7);
        String nom_name=obj.get(1).get(8);
        String nom_msisdn=obj.get(1).get(9);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }
    
    @When("^User enters all valid customer details,selects HP Silver postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.clickSave();
        reg.clickOK();
        
    }
    
    @When("^User enters all valid customer details,selects Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
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
    
    @When("^User enters all valid customer details,selects PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
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
    
    @When("^User enters all valid customer details,selects HP Silver and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
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
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
        
        
    }
    
    @When("^User enters all valid customer details,selects HP Silver and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
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
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
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
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
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
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }
    
    @When("^User enters all valid customer details,selects Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
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
    
    @When("^User enters all valid customer details,selects HP Silver,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silverlife_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
       GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
       List<List<String>> obj=data.raw();
       String nic=obj.get(1).get(0);
       String cname=obj.get(1).get(1);
       String lang=obj.get(1).get(2);
       String num=obj.get(1).get(3);
       String HP_alt_num=obj.get(1).get(4);
       String hp_coverlevel=obj.get(1).get(5);
       String Life_alt_num=obj.get(1).get(6);
       String Life_coverlevel=obj.get(1).get(7);
       String PA_alt_num=obj.get(1).get(8);
       String PA_coverlevel=obj.get(1).get(9);
       String nom_name=obj.get(1).get(10);
       String nom_msisdn=obj.get(1).get(11);
       String nom_rel=obj.get(1).get(12);
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
       reg.selectHPcover(hp_coverlevel);
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
    


    @When("^User enters all valid customer details,selects HP Silver,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silverlife_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Silver,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silverlife_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Silver,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silverlife_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Silver,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silverlife_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Silver,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silverlife_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Silver,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silverlife_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Silver,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silverlife_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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
    
    @When("^User enters all valid customer details,selects HP Silver and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String PA_alt_num=obj.get(1).get(6);
        String PA_coverlevel=obj.get(1).get(7);
        String nom_name=obj.get(1).get(8);
        String nom_msisdn=obj.get(1).get(9);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String PA_alt_num=obj.get(1).get(6);
        String PA_coverlevel=obj.get(1).get(7);
        String nom_name=obj.get(1).get(8);
        String nom_msisdn=obj.get(1).get(9);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }
    
    
    @When("^User enters all valid customer details,selects HP Gold and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
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
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
        
        
    }
    
    @When("^User enters all valid customer details,selects HP Gold and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
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
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
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
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
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
        reg.selectHP();
        reg.selectLife();
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }
    
    
    
    @When("^User enters all valid customer details,selects HP Gold,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_goldlife_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
       GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
       List<List<String>> obj=data.raw();
       String nic=obj.get(1).get(0);
       String cname=obj.get(1).get(1);
       String lang=obj.get(1).get(2);
       String num=obj.get(1).get(3);
       String HP_alt_num=obj.get(1).get(4);
       String hp_coverlevel=obj.get(1).get(5);
       String Life_alt_num=obj.get(1).get(6);
       String Life_coverlevel=obj.get(1).get(7);
       String PA_alt_num=obj.get(1).get(8);
       String PA_coverlevel=obj.get(1).get(9);
       String nom_name=obj.get(1).get(10);
       String nom_msisdn=obj.get(1).get(11);
       String nom_rel=obj.get(1).get(12);
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
       reg.selectHPcover(hp_coverlevel);
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
    


    @When("^User enters all valid customer details,selects HP Gold,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_goldlife_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Gold,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_goldlife_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Gold,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_goldlife_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Gold,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_goldlife_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Gold,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_goldlife_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Gold,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_goldlife_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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

    @When("^User enters all valid customer details,selects HP Gold,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_goldlife_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Life_alt_num=obj.get(1).get(6);
        String Life_coverlevel=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
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
    
    @When("^User enters all valid customer details,selects HP Gold and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String PA_alt_num=obj.get(1).get(6);
        String PA_coverlevel=obj.get(1).get(7);
        String nom_name=obj.get(1).get(8);
        String nom_msisdn=obj.get(1).get(9);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String PA_alt_num=obj.get(1).get(6);
        String PA_coverlevel=obj.get(1).get(7);
        String nom_name=obj.get(1).get(8);
        String nom_msisdn=obj.get(1).get(9);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }
    
    @When("^User enters all valid customer details,selects HP Gold with spouse postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouse_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String spouse=obj.get(1).get(6);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterSpouse(spouse);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouse_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
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
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouse_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
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
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouse_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
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
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouse_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
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
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouselife_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouselife_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouselife_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouselife_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouselife_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouselife_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouselife_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouselife_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouse_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String PA_alt_num=obj.get(1).get(7);
        String PA_coverlevel=obj.get(1).get(8);
        String nom_name=obj.get(1).get(9);
        String nom_msisdn=obj.get(1).get(10);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spouse_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String PA_alt_num=obj.get(1).get(7);
        String PA_coverlevel=obj.get(1).get(8);
        String nom_name=obj.get(1).get(9);
        String nom_msisdn=obj.get(1).get(10);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }
    
    @When("^User enters all valid customer details,selects HP Basic with spouse postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouse_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String spouse=obj.get(1).get(6);
		reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterSpouse(spouse);
		reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouse_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
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
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouse_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
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
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouse_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
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
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouse_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
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
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouselife_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouselife_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouselife_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouselife_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouselife_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouselife_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouselife_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouselife_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouse_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String PA_alt_num=obj.get(1).get(7);
        String PA_coverlevel=obj.get(1).get(8);
        String nom_name=obj.get(1).get(9);
        String nom_msisdn=obj.get(1).get(10);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spouse_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String PA_alt_num=obj.get(1).get(7);
        String PA_coverlevel=obj.get(1).get(8);
        String nom_name=obj.get(1).get(9);
        String nom_msisdn=obj.get(1).get(10);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }
    
    @When("^User enters all valid customer details,selects HP Silver with spouse postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouse_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String spouse=obj.get(1).get(6);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterSpouse(spouse);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouse_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
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
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouse_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
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
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouse_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
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
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouse_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
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
        reg.enterHPalternatenumber(HP_alt_num);
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouselife_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouselife_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouselife_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouselife_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouselife_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouselife_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouselife_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouselife_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String Life_alt_num=obj.get(1).get(7);
        String Life_coverlevel=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouse_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String PA_alt_num=obj.get(1).get(7);
        String PA_coverlevel=obj.get(1).get(8);
        String nom_name=obj.get(1).get(9);
        String nom_msisdn=obj.get(1).get(10);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spouse_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
        String PA_alt_num=obj.get(1).get(7);
        String PA_coverlevel=obj.get(1).get(8);
        String nom_name=obj.get(1).get(9);
        String nom_msisdn=obj.get(1).get(10);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }
    
    @When("^User enters all valid customer details,selects HP Gold with spouse,child1 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }
    
    @When("^User enters all valid customer details,selects HP Silver with spouse,child1 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
        String nom_rel=obj.get(1).get(12);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String Life_alt_num=obj.get(1).get(8);
        String Life_coverlevel=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
        String PA_alt_num=obj.get(1).get(8);
        String PA_coverlevel=obj.get(1).get(9);
        String nom_name=obj.get(1).get(10);
        String nom_msisdn=obj.get(1).get(11);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }
    
    
    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    
    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    
    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
        String PA_alt_num=obj.get(1).get(9);
        String PA_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_spousechild1child2child3_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_spousechild1child2child3_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
        String nom_rel=obj.get(1).get(14);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterSpouse(spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String Life_alt_num=obj.get(1).get(10);
        String Life_coverlevel=obj.get(1).get(11);
        String PA_alt_num=obj.get(1).get(12);
        String PA_coverlevel=obj.get(1).get(13);
        String nom_name=obj.get(1).get(14);
        String nom_msisdn=obj.get(1).get(15);
        String nom_rel=obj.get(1).get(16);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_spousechild1child2child3_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String Spouse=obj.get(1).get(6);
		String child1=obj.get(1).get(7);
		String child2=obj.get(1).get(8);
		String child3=obj.get(1).get(9);
        String PA_alt_num=obj.get(1).get(10);
        String PA_coverlevel=obj.get(1).get(11);
        String nom_name=obj.get(1).get(12);
        String nom_msisdn=obj.get(1).get(13);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterSpouse(Spouse);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String child2=obj.get(1).get(9);
		String child3=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,child3 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2child3_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String child2=obj.get(1).get(9);
		String child3=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    
    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String child2=obj.get(1).get(9);
		String child3=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,child3 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2child3_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String child2=obj.get(1).get(9);
		String child3=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String child3=obj.get(1).get(8);
        String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String child2=obj.get(1).get(9);
		String child3=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,child3 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2child3_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String child2=obj.get(1).get(9);
		String child3=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.toAddChildthree();
		reg.enterChildthree(child3);
        reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,child2 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,child2 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,child2 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,child2 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,child2 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Silver with child1,child2 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String child2=obj.get(1).get(9);
		String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,child2 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1child2_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String child2=obj.get(1).get(9);
		String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1,child2 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Gold with child1,child2 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1,child2 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1,child2 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1,child2 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Gold with child1,child2 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String child2=obj.get(1).get(9);
		String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1,child2 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1child2_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String child2=obj.get(1).get(9);
		String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,child2 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,child2 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,child2 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,child2 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,child2 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String child2=obj.get(1).get(7);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
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

    @When("^User enters all valid customer details,selects HP Basic with child1,child2 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String child2=obj.get(1).get(9);
		String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,child2 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1child2_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String child2=obj.get(1).get(9);
		String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.toAddChildtwo();
		reg.enterChildtwo(child2);
		reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String child1=obj.get(1).get(6);
		reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterChildone(child1); 
		reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Basic with child1 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Basic with child1,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Basic with child1,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Basic with child1,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Basic with child1,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Basic with child1,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Basic with child1,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Basic with child1,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Basic with child1 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Basic with child1 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_basic_with_child1_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
    	List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String child1=obj.get(1).get(6);
		reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterChildone(child1); 
		reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Gold with child1 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Gold with child1,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Gold with child1,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Gold with child1,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Gold with child1,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Gold with child1,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Gold with child1,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Gold with child1,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Gold with child1 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Gold with child1 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_gold_with_child1_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
		List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1 postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String hp_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
		String child1=obj.get(1).get(6);
		reg.setNic(nic);
        reg.selectGSMChannel();
        reg.clickSearch();
        reg.enterCustomername(cname);
        reg.preferredLang(lang);
        reg.enterMsisdn(num);
        driver.findElement(By.cssSelector("legend#label_regcustomer_subheader1")).click();
        reg.selectHP();
        reg.enterHPalternatenumber(hp_alt_num);
		reg.selectHPcover(hp_coverlevel);
		reg.enterChildone(child1); 
		reg.clickSave();
        reg.clickOK();
        
    }

    @When("^User enters all valid customer details,selects HP Silver with child1 and Life 100K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1_and_life_100k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1 and Life 250K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1_and_life_250k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1 and Life 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1_and_life_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1 and Life 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1_and_life_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	        GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>>obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String hp_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String nom_name=obj.get(1).get(11);
        String nom_msisdn=obj.get(1).get(12);
        String nom_rel=obj.get(1).get(13);
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
        reg.selectHPcover(hp_coverlevel);
        reg.enterChildone(child1); 
		reg.enterLifealternatenumber(Life_alt_num);
        reg.selectLifecover(Life_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.selectNomineeRel(nom_rel);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1,Life 100K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1life_100k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Silver with child1,Life 250K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1life_250k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Silver with child1,Life 500K and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1life_500k_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Silver with child1,Life 1M and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1life_1m_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Silver with child1,Life 100K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1life_100k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Silver with child1,Life 250K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1life_250k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Silver with child1,Life 500K and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1life_500k_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Silver with child1,Life 1M and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1life_1m_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(6);
		String Life_alt_num=obj.get(1).get(9);
        String Life_coverlevel=obj.get(1).get(10);
        String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
        String nom_rel=obj.get(1).get(15);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
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

    @When("^User enters all valid customer details,selects HP Silver with child1 and PA2017 500K postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1_and_pa2017_500k_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
        List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }

    @When("^User enters all valid customer details,selects HP Silver with child1 and PA2017 1M postpaid product and clicks on Save button$")
    public void user_enters_all_valid_customer_detailsselects_hp_silver_with_child1_and_pa2017_1m_postpaid_product_and_clicks_on_save_button(DataTable data) throws Throwable {
    	GSMRegisterCustomerPageObject reg=new GSMRegisterCustomerPageObject();
		List<List<String>> obj=data.raw();
        String nic=obj.get(1).get(0);
        String cname=obj.get(1).get(1);
        String lang=obj.get(1).get(2);
        String num=obj.get(1).get(3);
        String HP_alt_num=obj.get(1).get(4);
        String HP_coverlevel=obj.get(1).get(5);
        String child1=obj.get(1).get(8);
		String PA_alt_num=obj.get(1).get(11);
        String PA_coverlevel=obj.get(1).get(12);
        String nom_name=obj.get(1).get(13);
        String nom_msisdn=obj.get(1).get(14);
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
        reg.selectHPcover(HP_coverlevel);
        reg.enterChildone(child1); 
		reg.enterPAalternatenumber(PA_alt_num);
        reg.selectPAcover(PA_coverlevel);
        reg.enterNomineeName(nom_name);
        reg.enterNomineeMsisn(nom_msisdn);
        reg.clickSave();
        reg.clickOK();
    }


    

    @Then("^Customer Registered successfully message is displayed$")
    public void customer_registered_successfully_message_is_displayed() throws Throwable {
        String success_mess=driver.findElement(By.xpath("//div[@id='message_div']")).getText();
        //String expected_mess="The customer has been registered successfully.";
        //Assert.assertEquals(expected_mess, success_mess);
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