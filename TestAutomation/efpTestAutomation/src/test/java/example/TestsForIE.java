package example;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EFP.*;
import com.tieto.asap.CommonFunctions;
import com.tieto.asap.Driver;
import com.tieto.asap.Global;

public class TestsForIE {
	
	//Variables
	String className;
	String dataSheetName;
	String env;
	String buildNumber;
	String jobName;
	
	//Instances
	Driver asapDriver;
	WebDriver driver;
	CommonFunctions objCommon;

	
  @BeforeClass
  public void beforeClass() throws IOException
  {
	  System.out.println("Before Class Test For Easy Financing Portal");
	  	
	  //Set the DataSheet name by getting the class name
	  String[] strClassNameArray = this.getClass().getName().split("\\.");
	  className = strClassNameArray[strClassNameArray.length-1];
	  Global.Environment.put("CLASSNAME", className);		
	  	 
	   //Initiate asapDriver
	   asapDriver = new Driver();	   	  
	   
		//Check if POM has env, if null, get it from config file
	   if(System.getProperty("envName")== null) 		   
		   env = asapDriver.fGetEnv();	  		   
	   else 
		   env = System.getProperty("envName");		
	  
		
		//Add env global environments
		Global.Environment.put("ENV_CODE", env);
				
		//Create folder structure
		asapDriver.createExecutionFolders();	 		  
		
	   //Get Environment Variables
	   asapDriver.fetchEnvironmentDetails();
     
	   //Create HTML Summary Report
	   Global.Reporter.fnCreateSummaryReport();
	   
	   //Update Jenkins report
	   Global.Reporter.fnJenkinsReport();
	   
	   //Initiate WebDriver
	   Global.webDriver = asapDriver.fGetWebDriver();
	   driver = Global.webDriver;
	   
	   //Set implicit time
	   if(driver != null) driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   //Initialize Common functions
	   objCommon = new CommonFunctions();
	   
   }
	   
   @BeforeMethod
   public void beforeMethod(Method method)
   {	   
	   //Get the test name
	   String testName = method.getName();
	   
	   System.out.println("Before Method" + testName);
	   
	   //Get the data from DataSheet corresponding to Class Name & Test Name
	   asapDriver.fGetDataForTest(testName);	    
	   
	   //Create Individual HTML Report	
	   Global.Reporter.fnCreateHtmlReport(testName);	  
   }
	   
   //Test To Verify The Home Page
   @Test (priority=1,enabled=true)
   public void LoginVerifyLandingPage()
   {
	   System.out.println("Login into Easy Financing Portal");		   
	   
	   //Create object of Launch Application classgit.etb.tieto.com
		LaunchApplication launchApplication = new LaunchApplication();
		
		//Call  the function to launch the application url that return MyPagesLogin object
		efpHomePage MyPagesLogin= launchApplication.openApplication();
				
		//Login into the application
		LandingPageCheck LoginPage= MyPagesLogin.loginEFPApplication();
				 
		//if the returned object is null then return false		 	
		Assert.assertNotNull(MyPagesLogin, "Assert My Pages Home Page is not null");

		//Verify the Home Page from the 
	    VerifyHomePage HomePage = new VerifyHomePage();
		VerifyHomePage LoansVerified = HomePage.PageVerification(); 
		HomePage.VerifyRecentTransaction();
		HomePage.VerifyNaviagtionsfromHomePage();
		
		
		 Assert.assertNotNull("Login Page Vereified", "Assert My Pages Home Page Object is not null");
   }
//   
//   @Test (priority=2,enabled=false)
//   public void VerifyTransactions()
//   {
//	   System.out.println("Login into Easy Financing Portal");		   
//	   
//	   //Create object of Launch Application	 class
//		LaunchApplication launchApplication = new LaunchApplication();
//		
//		//Call  the function to launch the application url that return MyPagesLogin object
//		MyPagesHomePage MyPagesLogin= launchApplication.openApplication();
//		
//		
//		//Login into the application
//		 //LandingPageCheck LoginPage= MyPagesLogin.loginNordeaBank();
//		
//		LandingPageCheck LoginPage= MyPagesLogin.loginAktiaBank();
//				 
//		//if the returned object is null then return false		 	
//		Assert.assertNotNull(MyPagesLogin, "Assert My Pages Home Page is not null");
//		
//		//Verify the Transaction Page
//		 MyPagesTransactionPage VerifyTransPage = new MyPagesTransactionPage();
//		 
//		 VerifyTransPage.OpenTransactionPage();
//		 
//		 VerifyTransPage.VerifyTransactionPage();		 
//		 
//		 VerifyTransPage.VerifyTransactionSearch();
//		 
//		 VerifyTransPage.OpenTransactionPage();
//		 
//		 VerifyTransPage.VerifyTransactionPage();	
//		 
//		 VerifyTransPage.VerifyTransactionSearchAmount();
//		 
//		 //Verify Transaction Sorting By Amount
//		 VerifyTransPage.VerifyTransactionSortingByAmount();
//		 
//		 VerifyTransPage.VerifyTransactionSortingByAmountAscending();
//		 
//		 VerifyTransPage.VerifyMoreButton();
//
//		 VerifyTransPage.VerifyExportToExcel();
//		 
//		 VerifyTransPage.VerifyTransactionDetails();
//		 			 
//   }
//
//   @Test (priority=3,enabled=false)
//   public void VerifyPreferences()
//   {
//	   System.out.println("Login into Easy Financing Portal");		   
//	   
//	   //Create object of Launch Application	 class
//	   	LaunchApplication launchApplication = new LaunchApplication();
//		
//		//Call  the function to launch the application url that return MyPagesLogin object
//		MyPagesHomePage MyPagesLogin= launchApplication.openApplication();
//		
//		
//		//Login into the application
//		LandingPageCheck LoginPage= MyPagesLogin.loginNordeaBank();
//				 
//		//if the returned object is null then return false		 	
//		//Assert.assertNotNull(MyPagesLogin, "Assert My Pages Home Page is not null");
//		
//	    MyPagesProfilePage ProfilePage = new MyPagesProfilePage();
//	    ProfilePage.VerifyPreferences();	
//	    ProfilePage.VerifyQuickLinks();
//	    
//	    //Verify Profile Page
//	    ProfilePage.VerifyProfilePage();
//	    
//		ProfilePage.EditMobileNumber();	
//		
//   }
//   
//   
//   @Test (priority=4,enabled=false)
//   public void VerifyInvoices()
//   {	   	
//	   //Create object of Launch Application class
//	   	LaunchApplication launchApplication = new LaunchApplication();
//	   	
//		
//		//Call  the function to launch the application url that return MyPagesLogin object
//		MyPagesHomePage MyPagesLogin= launchApplication.openApplication();		
//		
//	   	//Login into the application
//		LandingPageCheck LoginPage= MyPagesLogin.loginNordeaBank();
//		
//			
//		MyPagesInvoices Invoices = new MyPagesInvoices();
//	   
//		Invoices.VerifyInvoicePage();
//		
//		//Verify Invoices Details
//		Invoices.VerifyInvoiceDetailsPage();
//		
//	    
//   }
//     
//   @Test (priority=5, enabled=false)
//   public void VerifySecureMail()
//   {
//	   		System.out.println("Login into Easy Financing Portal");		   
//	   
//	   		//Create object of Launch Application	 class
//			LaunchApplication launchApplication = new LaunchApplication();
//			
//			//Call  the function to launch the application url that return MyPagesLogin object
//			MyPagesHomePage MyPagesLogin= launchApplication.openApplication();
//			
//			
//			//Login into the application
//			LandingPageCheck LoginPage= MyPagesLogin.loginNordeaBank();
//				 
//			//MyPagesLogin.loginAktiaBank();
//			//if the returned object is null then return false		 	
//			//Assert.assertNotNull(MyPagesLogin, "Assert My Pages Home Page is not null");
//		
//			//Verify the Transaction Page
//			MyPagesSecureMail VerifySecureMailPage = new MyPagesSecureMail();
//			
//			//Verify the SecureMail Page
//			Assert.assertTrue(VerifySecureMailPage.VerifySecureMailPage());	
//			
//			//Get the Message from the Page and Delete the same Mail
//			String sMessageSubject = VerifySecureMailPage.CreateNewMessage();
//			if (sMessageSubject!=null)
//			{
//				VerifySecureMailPage.DeleteNewMessage(sMessageSubject);
//			}
//			
//			Assert.assertTrue(VerifySecureMailPage.VerifyBreadCrumbs());
//			Assert.assertTrue(VerifySecureMailPage.VerifyMoreButton());
//			
//		}
//   
//   
//   @Test (priority=6, enabled=false)
//   public void VerifyCreditTermination()
//   {
//	   		System.out.println("Login into Easy Financing Portal");		   
//	   
//	   		//Create object of Launch Application	 class
//			LaunchApplication launchApplication = new LaunchApplication();
//			
//			//Call  the function to launch the application url that return MyPagesLogin object
//			MyPagesHomePage MyPagesLogin= launchApplication.openApplication();
//			
//				 
//			MyPagesLogin.loginAktiaBank();
//			//if the returned object is null then return false		 	
//			//Assert.assertNotNull(MyPagesLogin, "Assert My Pages Home Page is not null");
//		
//			//Verify the Transaction Page
//			MyPagesSettingsPage VerifySettingsPageObject = new MyPagesSettingsPage();
//			VerifySettingsPageObject.VerifySettingPage();
//			VerifySettingsPageObject.TerminateCards();
//			
//			//Verify the Close Cards
//			VerifySettingsPageObject.CloseCards();			
//		}
//   
//   @Test (priority=6, enabled=false)
//   public void VerifyTermsAndCondition()
//   {
//	   		System.out.println("Login into Easy Financing Portal");		   
//	   
//	   		//Create object of Launch Application	 class
//			LaunchApplication launchApplication = new LaunchApplication();
//			
//			//Call  the function to launch the application url that return MyPagesLogin object
//			
//			//Open Keycloak application
//		  	launchApplication.openKeyCloakApplication();
//		  	MyPagesHomePage MyPagesLogin= launchApplication.openApplication1();
//		   
//			
//		   	launchApplication.openApplication();
//			MyPagesLogin.loginAktiaBank();
//			
//		
//			//Verify the Terms and Condition Page
//			MyPagesLogin.AcceptTermCondition();
//					
//	}
//   
//   @Test (priority=6, enabled=false)
//   public void VerifyCreditLimit()
//   {
//	   		System.out.println("Login into Easy Financing Portal");		   
//	   
//	   		//Create object of Launch Application	 class
//			LaunchApplication launchApplication = new LaunchApplication();
//			
//			//Call  the function to launch the application url that return MyPagesLogin object
//			
//			//Open Keycloak application
//		  	//launchApplication.openKeyCloakApplication();
//		  	MyPagesHomePage MyPagesLogin= launchApplication.openApplication1();
//		   
//			
//		   	launchApplication.openApplication();
//			MyPagesLogin.loginAktiaBank();			
//		
//			//Verify the Credit Limit Page
//			MyPagesCreditLimitPage VerifyCreditLimit = new MyPagesCreditLimitPage();
//			
//			Assert.assertTrue(VerifyCreditLimit.OpenCreditLimitPage());
//			Assert.assertTrue(VerifyCreditLimit.VerifyCreditLimitPage());
//			
//		}
//   
//   @Test (priority=6, enabled=false)
//   public void VerifyInstallmentPercantageChange()
//   {
//	   		System.out.println("Login into Easy Financing Portal");		   
//	   
//	   		//Create object of Launch Application	 class
//			LaunchApplication launchApplication = new LaunchApplication();
//			
//			//Call  the function to launch the application url that return MyPagesLogin object
//			
//			//Open Keycloak application
//		  	//launchApplication.openKeyCloakApplication();
//		  	MyPagesHomePage MyPagesLogin= launchApplication.openApplication1();
//		   
//			
//		   	launchApplication.openApplication();
//			MyPagesLogin.loginAktiaBank();			
//		
//			//Verify the Credit Limit Page
//			MyPagesInstalmentPercentageChange VerifyPage = new MyPagesInstalmentPercentageChange();
//			
//			Assert.assertTrue(VerifyPage.OpenInstallmentPercentageChangePage());
//			Assert.assertTrue(VerifyPage.VerifyInstalmentPercentageChangePage());
//			Assert.assertTrue(VerifyPage.VerifyInstalmentMailSent());
//			
//		}
//   
  
  
  	   
   @AfterMethod
   public void afterMethod(Method method)
   {
	   //System.out.println("After Method");
	   
	   //Get the test name
	   String testName = method.getName();
	   
	   System.out.println("After Method" + testName);
	   	   
	   //Update the KeepRefer Sheet
	   asapDriver.fSetReferenceData();
	   
	   //Call Logout after each Method
	   objCommon.fGuiLogout();
	   
	   //Close Individual Summary Report & Update Summary Report
	   Global.Reporter.fnCloseHtmlReport(testName);
	   
	  
	      	   	   		  
   } 
  
//   @AfterTest
//   public void afterTest(Method method)
//   {
//	   //System.out.println("After Method");
//	   
//	   //Get the test name
//	   String testName = method.getName();
//	   
//	   System.out.println("After Method" + testName);
//	   	   
//	   //Update the KeepRefer Sheet
//	   asapDriver.fSetReferenceData();
//	   
//	   //Close Individual Summary Report & Update Summary Report
//	   Global.Reporter.fnCloseHtmlReport(testName);
//	      	   	   		  
//   } 
  
      	   	   
   @AfterClass
   public void afterClass()
   {
	   System.out.println("After Class Tests for MyPages");
	   
	   //Close HTML Summary report
	   Global.Reporter.fnCloseTestSummary();
	   
	   //Copy reports under build path
	   
	   //QUit webdriver
	   if(Global.webDriver != null) Global.webDriver.quit();
   }
	 
}
