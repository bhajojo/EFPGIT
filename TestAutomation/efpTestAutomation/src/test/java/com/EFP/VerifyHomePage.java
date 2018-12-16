package com.EFP;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tieto.asap.*;

public class VerifyHomePage {
	
	private Reporting Reporter;
	private WebDriver driver;
	private HashMap<String, String> Dictionary;
	private HashMap<String, String> Environment;
	private CommonFunctions objCommon = new CommonFunctions();
	
	//Define the constructor
	public VerifyHomePage()
	{
		Reporter = Global.Reporter;
		driver = Global.webDriver;
		Dictionary = Global.Dictionary;
		Environment = Global.Environment;
	}
		
	//object Properties
    public String MenuButton = "xpath:=.//*[@id='container']//div[@class='top-header__logo col']//span";
    public String CardLogoLink = "xpath:=.//*[@id='container']//a[@class='top-header__logo-link']";
    public String LanguageSelectionOption="xpath:=.//select[@class='select top-header__lang-select']";
    public String FirstCard="xpath:=.//div[contains(@class,'swiper-slide cards-list__card')][1]//div[@class='cards-list__card__details'][1]";
    public String SecondCard="xpath:=.//div[contains(@class,'swiper-slide cards-list__card')][2]//div[@class='cards-list__card__details'][1]";
    public String UsedLimitHeading="xpath:=//div[@class='accounts__colums'][1]/div[@class='accounts__title']//span";
    public String UnUsedLimitHeading="xpath:=//div[@class='accounts__colums'][2]/div[@class='accounts__title']//span";
    public String CardHeading="xpath:=//div[@class='accounts__colums'][3]/div[@class='accounts__title']//span";
    public String CardType="xpath:=//div[@class='accounts__colums'][3]//div[@class='accounts__amount']//span";
    public String CreditLimitMiddleLink="xpath:=//div[@class='cards_list']//li//a[contains(@href,'credit_limit')]";
    public String SecurityMiddleLink="xpath:=//div[@class='cards_list']//li//a[contains(@href,'security')]";
    public String UpcomingPayments="xpath:=//div[@class='upcoming-payment']";
    public String TransactionList="xpath:=//div[@class='list']";
    public String TransactionListLink="xpath:=//div[@class='list']//a";
    public String MoreTransactionLink="xpath:=.//a[@class='homepage__moretransaction']";
    public String ShorcutsHeader="xpath:=//h2[@class='homepage__headers']//span[contains(.,'Genvägar')]";
    public String ProfileQuickLinks="xpath:=//a[contains(@href,'profile')]";
    public String ProfilePageHeading="xpath:=//h1[@class='header__page-title header__page-title--profile']";
    public String TransactionPageHeading="xpath:=//h1[@class='header__page-title header__page-title--transactions']";
    public String InvoicesPageHeading="xpath:=//h1[@class='header__page-title header__page-title--payments']";	
  
	public  VerifyHomePage PageVerification()
    {
		//Verify Different Objects on the Home Page using assertions
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().defaultContent();
		
		objCommon.WaitForExpectedElement(".//*[@id='container']//div[@class='top-header__logo col']//span");
		Assert.assertNotNull(objCommon.getObject(MenuButton), "Menu button is avaliable");
		Assert.assertNotNull(objCommon.getObject(CardLogoLink), "Card Logo is avaliable");
		Assert.assertNotNull(objCommon.getObject(LanguageSelectionOption), "LanguageSelection dropdown is avaliable");
		Assert.assertNotNull(objCommon.getObject(FirstCard), "First Card is avaliable");
		Assert.assertNotNull(objCommon.getObject(SecondCard), "Second Card is avaliable");
		Assert.assertNotNull(objCommon.getObject(UsedLimitHeading), "Used Limit Heading is avaliable");
		Assert.assertNotNull(objCommon.getObject(CardHeading), "Unused Limit Header is avaliable");
		Assert.assertNotNull(objCommon.getObject(CardType), "Card Type Header is avaliable");
		Assert.assertNotNull(objCommon.getObject(CreditLimitMiddleLink), "Credit Limit Middle Link is avaliable");
		Assert.assertNotNull(objCommon.getObject(SecurityMiddleLink), "Security Middle Link is avaliable");
		Assert.assertNotNull(objCommon.getObject(TransactionList), "Transaction List Table is avaliable");
		Assert.assertNotNull(objCommon.getObject(TransactionListLink), "Transaction Links are avaliable");
		Assert.assertNotNull(objCommon.getObject(MoreTransactionLink), "More Transaction Link is avaliable");
		Assert.assertNotNull(objCommon.getObject(ShorcutsHeader), "Short Cut Header is avaliable");
		Assert.assertNotNull(objCommon.getObject(ProfileQuickLinks), "Profile Quick Link is avaliable");
		
		return new VerifyHomePage();
    }
	
	public VerifyHomePage VerifyNaviagtionsfromHomePage()	
	{
		
		VerifyHomePage obj= new VerifyHomePage();
		//obj.fnVerifyNaviagtionsfromHomePage(UpcomingPayments,InvoicesPageHeading);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementsByClassName('upcoming-payment__link').item(0).click()");
		
		if (objCommon.fGuiIsDisplayed(InvoicesPageHeading))
		{
			Reporter.fnWriteToHtmlOutput("Verify Object on page", "Object Should be present on the page", "Objects is visible" , "Pass");
	    }
		else
		{		
			Reporter.fnWriteToHtmlOutput("Verify Object on page", "Object Should be present on the page", "Objects is not visible" , "Fail");
		}	
		
		//Click on Back To Home Page Objects 
		if (objCommon.fGuiClick(CardLogoLink,"Nordea Bank Logo")==false)
    	{
    		return null;
    	}
		obj.fnVerifyNaviagtionsfromHomePage(ProfileQuickLinks,ProfilePageHeading);
		obj.fnVerifyNaviagtionsfromHomePage(MoreTransactionLink,TransactionPageHeading);
		obj.fnVerifyNaviagtionsfromHomePage(TransactionListLink,TransactionPageHeading);
		return new VerifyHomePage();
	}
	
	
	public VerifyHomePage fnVerifyNaviagtionsfromHomePage(String objClick,String ObjVerify)	
	{
		//Click on Element
		if (objCommon.fGuiClick(objClick,"Object to be Clicked verified")==false)
    	{
    		return null;
    	}
			
		//Verify  the Object on the Page
		if (objCommon.fGuiIsDisplayed(ObjVerify))
		{
			Reporter.fnWriteToHtmlOutput("Verify Object on page", "Object Should be present on the page", "Objects is visible" , "Pass");
	    }
		else
		{		
			Reporter.fnWriteToHtmlOutput("Verify Object on page", "Object Should be present on the page", "Objects is not visible" , "Fail");
		}		
		
		//Click on Back To Home Page Objects 
		if (objCommon.fGuiClick(CardLogoLink,"Nordea Bank Logo")==false)
    	{
    		return null;
    	}
		
		//Verify Home Page		
		VerifyHomePage obj= new VerifyHomePage();
		obj.PageVerification();
		
		return new VerifyHomePage();
		
	}
	
	public VerifyHomePage VerifyRecentTransaction()
    {
		//Get the Count of Recent Transactions	
		int RecentTransactionCount = objCommon.fGuiGetElementCount(TransactionListLink, "Element count in Recent Transaction");
		if (RecentTransactionCount>0 && RecentTransactionCount<=10)
		{
			Reporter.fnWriteToHtmlOutput("Recent Transaction Count Check", "Recent Transaction should be less than 5", "Recent Transaction count is less than 5" , "Pass");
	    }
		else
		{		
			Reporter.fnWriteToHtmlOutput("Recent Transaction Count Check", "Recent Transaction should be less than 5", "Recent Transaction count is not less than 5" , "Fail");
		}	
		return new VerifyHomePage();
    
    }
//	
//	public  VerifyHomePage VerifyMoreTransactionLink()
//    {
//	
//		////Click on More Transaction 
//		if (objCommon.fGuiClick(MoreTransactions, "More Transaction List")==false)
//		{
//			return null;
//    	}
//		
//		//Verify if the Transaction page is Opened
//		MyPagesTransactionPage TP= new MyPagesTransactionPage();
//		TP.VerifyTransactionPage();
//		
//		return new VerifyHomePage();
//    
//    }
//   
//	public  VerifyHomePage MenuClick()
//    {
//				
//		if (objCommon.fGuiClick(MenuBtn, "Menu Button")==false)
//    	{
//    		return null;
//    	}
//
//		return new VerifyHomePage();
//    
//    }
//	
//	public  VerifyHomePage VerifyCreditDashBoardObjects()
//	{
//		if (objCommon.fGuiClick(CardLogoLink,"home Page Selection")==false)
//		{
//			return null;
//		}
//		
//		//Verify Credit Used Heading
//		Assert.assertNotNull(objCommon.getObject(CreditUsedHeading), "Credit Used Heading avaliable");
//		//Verify Cards Heading
//		//Assert.assertNotNull(objCommon.getObject(CardHeadingCreditDB), "Cards Heading");
//		//Verify Installment Free Months HEading
//		Assert.assertNotNull(objCommon.getObject(InstallmentFreeMonthsHeading), "Installment Free Heading");
//		return new VerifyHomePage();
//	}
//	
//	
//	public  VerifyHomePage VerifyCreditDashBoardLink()
//	{		
//		//Click on TransferMoney
//		if (objCommon.fGuiClick(TransferMoneyLink, "Transfer Money")==false)
//    	{
//    		return null;
//    	}
//		
//		//Verify the transfer money page
//		Assert.assertNotNull(objCommon.getObject(TransferMoneyPageHeader), "Transfer Money Heading avaliable");
//		//Click on home Page 
//		if (objCommon.fGuiClick(CardLogoLink,"home Page Selection")==false)
//		{
//			return null;
//		}
//		
//		//Click on New Message Link
//		if (objCommon.fGuiClick(NeweMailLink, "New Email Link")==false)
//    	{
//    		return null;
//    	}
//		
//		//Verify New Message page
//		Assert.assertNotNull(objCommon.getObject(SendMailPageHeader), "Send Mail Heading avaliable");
//		
//		//Click on home Page link
//		if (objCommon.fGuiClick(CardLogoLink,"home Page Selection")==false)
//		{
//			return null;
//		}
//		
//		return new VerifyHomePage();
//		
//		
//	}
    
    public String getTitle()
	{
		return driver.getTitle();
	}

}
