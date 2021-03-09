package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObjects.LoginPageObject;
import utility.OpenBrowser;

public class Hooks extends OpenBrowser{
		
		@Before("@hpPostpaidreg")
		public void beforetest()
		{
			OpenBrowser.openUrl();
		}
		
		
		@Before("@Smoke, @Regression")
		public void beforePrepaidreg()
		{
			OpenBrowser.openUrl();
			LoginPageObject lp=new LoginPageObject();
	    	lp.setUsername("DA2919");
	        lp.setPassword("Dialog123!");
	        lp.clickLogin();
		}
		
		@Before("@lifepostpaidreg")
		public void beforeHMP()
		{
			OpenBrowser.openUrl();
			LoginPageObject lp=new LoginPageObject();
	    	lp.setUsername("DA2919");
	        lp.setPassword("Dialog123!");
	        lp.clickLogin();
		}
		@Before("@papostpaidreg")
		public void beforeHPSilver()
		{
			OpenBrowser.openUrl();
			LoginPageObject lp=new LoginPageObject();
	    	lp.setUsername("DA2919");
	        lp.setPassword("Dialog123!");
	        lp.clickLogin();
		}
		@Before("@lifepapostpaidreg")
		public void beforelifepa()
		{
			OpenBrowser.openUrl();
			LoginPageObject lp=new LoginPageObject();
	    	lp.setUsername("DA2919");
	        lp.setPassword("Dialog123!");
	        lp.clickLogin();
		}
		
		@Before("@hpbasiclifepostpaidreg")
		public void beforelifehpbasic()
		{
			OpenBrowser.openUrl();
			LoginPageObject lp=new LoginPageObject();
	    	lp.setUsername("DA2919");
	        lp.setPassword("Dialog123!");
	        lp.clickLogin();
		}
		
		@Before("@hpbasicwithSpouseCheck")
		public void beforehpbasicwithSpouse()
		{
			OpenBrowser.openUrl();
			LoginPageObject lp=new LoginPageObject();
	    	lp.setUsername("DA2919");
	        lp.setPassword("Dialog123!");
	        lp.clickLogin();
		}
		
		
		
		
		@Before("@Goldupgrade")
		public void beforeHPGold()
		{
			OpenBrowser.openUrl();
			LoginPageObject lp=new LoginPageObject();
	    	lp.setUsername("DA2919");
	        lp.setPassword("Dialog123!");
	        lp.clickLogin();
		}
		
		@Before("@Basicupgrade")
		public void beforeHPBasic()
		{
			OpenBrowser.openUrl();
			LoginPageObject lp=new LoginPageObject();
	    	lp.setUsername("DA2919");
	        lp.setPassword("Dialog123!");
	        lp.clickLogin();
		}
		
		@After("@hppostpaidregnewa")
		public void Aftertest() throws Throwable
		{
			driver.close();
			System.out.println("Test case Execution completed..");

		}
		
		@After("@papostpaidreg")
		public void AfterHPSilver() throws Throwable
		{
			driver.close();
			System.out.println("Test case Execution completed..");

		}
		
		@After("@Smoke, @Regression")
		public void AfterHPGold() throws Throwable
		{
			driver.close();
			System.out.println("Test case Execution completed..");

		}
		
		@After("@lifepapostpaidreg")
		public void Afterlifepa() throws Throwable
		{
			driver.close();
			System.out.println("Test case Execution completed..");

		}
		
		@After("@hpbasiclifepostpaidreg")
		public void Afterhpbasiclife() throws Throwable
		{
			driver.close();
			System.out.println("Test case Execution completed..");

		}
		
		//@After("@hpbasicwithSpouseCheck")
		public void AfterhpbasicwithSpouse() throws Throwable
		{
			driver.close();
			System.out.println("Test case Execution completed..");

		}
		
		
		
		
		@After("@Basicupgrade")
		public void AfterHPBasic() throws Throwable
		{
			driver.close();
			System.out.println("Test case Execution completed..");

		}
		
		@After("@LTEupgrade")
		public void AfterHMP() throws Throwable
		{
			driver.close();
			System.out.println("Test case Execution completed..");

		}
		
		@After("@SanityTes")
		public void AfterPrepaidreg() throws Throwable
		{
			driver.close();
			System.out.println("Test case Execution completed..");

		}

	}


