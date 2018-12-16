package com.EFP;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tieto.asap.*;


public class efpHomePage {
	
	
	private Reporting Reporter;
	private WebDriver driver;
	private HashMap<String, String> Dictionary;
	private HashMap<String, String> Environment;
	private CommonFunctions objCommon = new CommonFunctions();
	
	//Define the constructor
	public efpHomePage()
	{
		System.out.println("Inside constructor");
		Reporter = Global.Reporter;
		driver = Global.webDriver;
		Dictionary = Global.Dictionary;
		Environment = Global.Environment;
	}
	
	//object Properties
    public String edtLogin = "Name:=userId";
    public String edtPassword = "id:=password";
    public String webbtnLogin = "id:=kc-login";
    public String pinCodeText = "id:=pin-code";
    public String AlandsBankUserName = "id:=encapUsername";
    public String AlandsBankUserNameText = "id:=username";
    public String AlandsBank = "xpath:=.//*[@id='kc-form-login']//div[@class='tupas-login__logo-alandsbanken']";
    public String NordeaBank = "xpath:=//*[@id=kc-form-login]/div[1]/div[1]/div";
   // public String NordeaBank = "xpath:=.//*[@id='kc-content']//div[@class='tupas-login__logo-nordea']";
    public String AktiaBank = "xpath:=.//*[@id='kc-content']//div[@class='tupas-login__logo-aktia']";
    public String AktiaBankLogo = "xpath:=//div[2]/div/div[2]/div/div/div/form/div[3]/div[1]/div/div/div";
    public String HandlesBank= "xpath:=.//*[@id='kc-form-login']//div[@class='tupas-login__logo-handelsbanken']";
    public String SastopankkiBank= "xpath:=.//*[@id='kc-form-login']//div[@class='tupas-login__logo-sastopankki']";
    public String SpankkiBank= "xpath:=.//*[@id='kc-form-login']//div[@class='tupas-login__logo-spankki']";
    public String OaspBank= "xpath:=.//*[@id='kc-form-login']//div[@class='tupas-login__logo-omasp']";
    public String OPBank= "xpath:=.//*[@id='kc-form-login']//div[@class='tupas-login__logo-op']";
    public String AlandsBankLoginButton = "xpath:=.//button[@name='btn_log_in']";
    public String AlandsBankPINTANLoginButton = "xpath:=.//*[@id='PIN_TAN']//form[@name='loginForm']//div[2]/button";
    public String AlandsBankConfirmButton = "xpath:=.//button[@name='btn_confirm']";
    public String NordeaBankOKButton="xpath:=.//*[@id='content']//input[contains(@value,'OK')]";
    public String NordeaBankOKButton2="xpath:=//input[contains(@value,'OK')]";
    public String AlandsBankPinTab="xpath:=.//*[@id='external-services']//a[contains(@href,'PIN_TAN')]";
    
    
    //OPBank
    public String OPUserNameText = "id:=kr-id";
    public String OPPasswordText = "id:=kr-password";
    public String OPLoginButton="xpath:=.//input[@class='opux-btn opux-btn-primary']";
    public String OPPinText = "id:=keycode-input-1";
    public String OPPinButton="xpath:=.//*[@id='lomake']/div[2]/div[2]/input";
    public String OPLoginFinalButton ="name:=act_hyvaksy";    
    public String OPLoginFinalLink ="xpath:=./div[1]//p[2]";
    		
    //POP Panniki
    public String PopPannikiLogo = "xpath:=.//*[@id='kc-form-login']//div[@class='tupas-login__logo-poppankki']";
    public String PopPannikiUsername = "id:=focusField";
    public String PopPannikiPassword= "xpath:=.//div[@id='password']//input";
    public String PopPannikiSubmitButton = "id:=submitbutton";    
    public String PopPannikiSecurityKeyText= "name:=SECURITYKEY";
    public String PopPannikiSecurityKeyButton= "xpath:=.//button[@class='SubmitButton']";
    public String PopPannikiLoginLink = "id:=retlink";
  
    
    //OMASP    
    public String OmaspLogo = "xpath:=.//*[@id='kc-form-login']//div[@class='tupas-login__logo-omasp']";
    public String OmaspUsername = "id:=focusField";
    public String OmaspPassword= "id:=passWd";
    public String OmaspSubmitButton = "id:=submitbutton";    
    public String OmaspSecurityKeyText= "name:=SECURITYKEY";
    public String OMaspSecurityKeyButton= "xpath:=.//div[@class='padding-b-5']//button";
    public String OMaspLoginLink = "id:=retlink";
    
    //SPanki    
    public String SpankiLogo = "xpath:=.//*[@id='kc-form-login']//div[@class='tupas-login__logo-spankki']";
    public String SpankiUsername = "id:=username";
    public String SpankiPassword= "id:=password";
    public String SpankiSubmitButton = "name:=btn_login";    
    public String SpankiSecurityKeyText= "id:=pin-code";
    public String SpankiSecurityKeyButton= "name:=btn_continue";
    public String SpankiLoginLink = "name:=btn_confirm";
  
    //Aktia
    public String AktiaUsername = "id:=IDToken1";
    public String AktiaPassword = "id:=IDToken2";
    public String AktiaSubmitButton = "xpath:=.//*[@id='submitButton']"; 
    public String AktiaFinalLink ="xpath:=.//*[@id='null']/div/input[1]";
    
    //Terms and Condition Page
    public String TermsAndConditionHeading = "xpath:=//span[contains(text(),'K�ytt�ehdot')]";
    public String TermsAndConditionHeadingLabel= "xpath:=//strong[contains(text(),'TERMS AND CONDITIONS FOR USING THE SERVICE')]";
    public String TermsAndConditionContinue="xpath:=//div[@class='terms__button text-center']//button[1]";
    public String TermsAndConditionCancel="xpath:=//div[@class='terms__button text-center']//button[2]";
    public String ReturnToHomeButton= "xpath:=.//*[@id='container']//button";
  
  
    
    //Method to launch the application
        
    public String getTitle()
	{
		return driver.getTitle();
	}

	public LandingPageCheck loginEFPApplication() {
		
		System.out.println("Inside Login Method");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
		//Select Tab Password
//		if (objCommon.fGuiClick("xpath:=.//li[2]//a[@class='link']","Password Tab" )==false)
//    	{
//    		return null;
//    	}
		System.out.println("Inside Java Script executor Method");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementsByClassName('link').item(1).click()");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		//Switch to iframe		
		driver.switchTo().frame(0);
		objCommon.WaitForExpectedElement(".//input[@id='username']");
		
        if (objCommon.fGuiEnterText("xpath:=.//input[@id='username']",Dictionary.get("SSN"),"User Name")==false)
        {
        	return null;
        }
        
    	//Enter Password
        if (objCommon.fGuiEnterText(edtPassword,Dictionary.get("PASSWORD"), "Password")==false)
        {
        	return null;
        }        
    	
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //driver.switchTo().defaultContent();
    	//Click on the sign in button. This will return 
        //driver.switchTo().frame(0);
//    	if (objCommon.fGuiClick(webbtnLogin ,"Login Button" )==false)
//    	{
//    		return null;
//    	}//
        
        driver.findElement(By.id("kc-login")).sendKeys(Keys.RETURN);
        
    	return new LandingPageCheck();
		
	}


	
	public LandingPageCheck loginNordeaBank() {
		
		//Switch to iframe 
		driver.switchTo().frame(0);
		System.out.println("PageSource:"+ driver.getPageSource());
		
		//objCommon.fGuiCheckObjectExistence("xpath:=//div/div/div[1]/div[2]/h2", "Heading");
		
		objCommon.fGuiCheckObjectExistence(NordeaBank, "Heading");
		
		if (objCommon.fGuiClick(NordeaBank,"Nordea Bank Logo")==false)
    	{
    		return null;
    	}
		
		driver.switchTo().defaultContent();
	        
        if (objCommon.fGuiClick(NordeaBankOKButton , "OK Button UsersNordea Page")==false)
    	{
    		return null;
    	}
                       
        if (objCommon.fGuiClick(NordeaBankOKButton2 , "OK Button Token Nordea Page")==false)
    	{
    		return null;
    	}
                
        try 
        { 
            //driver.switchTo().alert(); 
            driver.switchTo().alert().accept();
            System.out.println(" Alert Present");
        }  
        catch (NoAlertPresentException e) 
        { 
            System.out.println("No Alert Present");
        }  
       
        
        return new LandingPageCheck();
		
	}
	

	
	public LandingPageCheck LoginBankAlandan() {
		
		//Switch to iframe
		driver.switchTo().frame(1);
		
		if (objCommon.fGuiClick(AlandsBank, "Alands bank Logo")==false)
    	{
    		return null;
    	}
		
		driver.switchTo().defaultContent();
	        
		
		//Switch the Tabs
		if (objCommon.fGuiClick(AlandsBankPinTab ,"Alands Pin Text")==false)
	    {
	    		return null;
	    }
		
	
		if (objCommon.fGuiEnterText(AlandsBankUserNameText, "12345678", "Alands Bank Username")==false)
    	{
    		return null;
    	}
		
		if (objCommon.fGuiEnterText(edtPassword, "1234", "Alands Password")==false)
    	{
    		return null;
    	}
		
        if (objCommon.fGuiClick(AlandsBankPINTANLoginButton, "Pin Login button")==false)
    	{
    		return null;
    	}
        
        if (objCommon.fGuiEnterText(pinCodeText, "1234", "Alands Pin Text" )==false)
    	{
    		return null;
    	}
                       
                       
        if (objCommon.fGuiClick(AlandsBankLoginButton, "Bank Login Button")==false)
    	{
    		return null;
    	}
        
        //Click on Confirm
        if (objCommon.fGuiClick(AlandsBankConfirmButton , "Alands Confirm Button")==false)
    	{
    		return null;
    	}
        
    
        
        return new LandingPageCheck();
		
	}
	
//	public String OPUserNameText = "id:=kr-id";
//    public String OPPasswordText = "id:=kr-password";
//    public String OPLoginButton="xpath:=.//input[@class='opux-btn opux-btn-primary']";
//    public String OPPinText = "id:=keycode-input-1";
//    public String OPPinButton="xpath:=.//*[@id='lomake']/div[2]/div[2]/input";
//    public String OPLoginFinalButton ="name:=act_hyvaksy";    
//    public String OPLoginFinalLink ="xpath:=./div[1]//p[2]"
	
	public LandingPageCheck LoginBankOP() {
		
		//Switch to iframe
		driver.switchTo().frame(1);
		
		if (objCommon.fGuiClick(OPBank, "OP bank Login")==false)
    	{
    		return null;
    	}
		
		driver.switchTo().defaultContent();
	        
		if (objCommon.fGuiEnterText(OPUserNameText, "123456" , "OPUserName")==false)
    	{
    		return null;
    	}
		
		if (objCommon.fGuiEnterText(OPPasswordText, "7890", "OPPassword" )==false)
    	{
    		return null;
    	}
		
        if (objCommon.fGuiClick(OPLoginButton, "OP Login button")==false)
    	{
    		return null;
    	}
        
        if (objCommon.fGuiEnterText(OPPinText, "1234", "OP Pin Text" )==false)
    	{
    		return null;
    	}
                       
                       
        if (objCommon.fGuiClick(OPPinButton, "OP Pin Button")==false)
    	{
    		return null;
    	}
        
        //Click on Confirm
        if (objCommon.fGuiClick(OPLoginFinalButton ,"OP Login Final")==false)
    	{
    		return null;
    	}
        
//        if (objCommon.fGuiClick(OPLoginFinalLink)==false)
//    	{
//    		return null;
//    	}
        
    
        
        return new LandingPageCheck();
		
	}


	
	public LandingPageCheck LoginBankPOPPanniki() {
		
		//Switch to iframe
		driver.switchTo().frame(1);
		
		if (objCommon.fGuiClick(PopPannikiLogo, "Pop paniki Logo")==false)
    	{
    		return null;
    	}
		
		driver.switchTo().defaultContent();
	        
		if (objCommon.fGuiEnterText(PopPannikiUsername, "11111111", "POP UserName" )==false)
    	{
    		return null;
    	}
		
		if (objCommon.fGuiEnterText(PopPannikiPassword, "123456", "Pop Password" )==false)
    	{
    		return null;
    	}
		
        if (objCommon.fGuiClick(PopPannikiSubmitButton, "Pop  Paniki Submit button")==false)
    	{
    		return null;
    	}
        
        if (objCommon.fGuiEnterText(PopPannikiSecurityKeyText, "123456", "Pop Security Text")==false)
    	{
    		return null;
    	}
                       
                       
        if (objCommon.fGuiClick(PopPannikiSecurityKeyButton, "Pop Paniki Security button")==false)
    	{
    		return null;
    	}
        
        
        if (objCommon.fGuiClick(PopPannikiSecurityKeyButton, "Pop Paniki Security button ")==false)
		{
			return null;
		}
        
        //Click on Confirm
        if (objCommon.fGuiClick(PopPannikiLoginLink, "Pop Login link")==false)
    	{
    		return null;
    	}
        
      
        return new LandingPageCheck();
		
	}
	
		  
	 	
	public LandingPageCheck LoginBankOMASP() {
		
		//Switch to iframe
		driver.switchTo().frame(1);
		
		if (objCommon.fGuiClick(OmaspLogo, "Omasp Logo")==false)
    	{
    		return null;
    	}
		
		driver.switchTo().defaultContent();
	        	
		if (objCommon.fGuiEnterText(OmaspUsername, "11111111", "Omasp UserName" )==false)
    	{
    		return null;
    	}
		
		if (objCommon.fGuiEnterText(OmaspPassword, "123456" ,"OMasp Password" )==false)
    	{
    		return null;
    	}
		
        if (objCommon.fGuiClick(OmaspSubmitButton, "Omasp Submit button")==false)
    	{
    		return null;
    	}
        
        if (objCommon.fGuiEnterText(OmaspSecurityKeyText, "123456", "OMasp Pin" )==false)
    	{
    		return null;
    	}
                       
                       
        if (objCommon.fGuiClick(OMaspSecurityKeyButton, "Omasp Sucurity key button")==false)
    	{
    		return null;
    	}
        
        if (objCommon.fGuiClick(OMaspSecurityKeyButton,"Omasp Sucurity key button")==false)
		{
			return null;
		}
        
        
        
        if (objCommon.fGuiClick(OMaspLoginLink, "Omasp Login Link")==false)
		{
			return null;
		}
      
        
        return new LandingPageCheck();
		
	}
		

	public LandingPageCheck LoginBankSPanki() {
		
		//Switch to iframe
		driver.switchTo().frame(1);
		
		if (objCommon.fGuiClick(SpankiLogo, "Logo Spanki")==false)
    	{
    		return null;
    	}
		
		driver.switchTo().defaultContent();
	        	
		if (objCommon.fGuiEnterText(SpankiUsername, "12345678", "Spanki UserName" )==false)
    	{
    		return null;
    	}
		
		if (objCommon.fGuiEnterText(SpankiPassword, "123456", "Spanki Password" )==false)
    	{
    		return null;
    	}
		
        if (objCommon.fGuiClick(SpankiSubmitButton, "Spanki Submit button")==false)
    	{
    		return null;
    	}
        
        if (objCommon.fGuiEnterText(SpankiSecurityKeyText, "1234", "Spanki Security Text")==false)
    	{
    		return null;
    	}
                       
                       
        if (objCommon.fGuiClick(SpankiSecurityKeyButton, "Spanki Security Button")==false)
    	{
    		return null;
    	}
        
        if (objCommon.fGuiClick(SpankiLoginLink,"Spanki Login link")==false)
		{
			return null;
		}
                
        if (objCommon.fGuiClick(OMaspLoginLink,"OMasp Login")==false)
		{
			return null;
		}
      
        
        return new LandingPageCheck();
		
	}
	
	public LandingPageCheck loginAktiaBank() {
		
		//Switch to iframe
		driver.switchTo().frame("tupas-login-frame");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("document.getElementsByClassName('tupas-login__title').item(4).click()");
		
		if (objCommon.fGuiClick(AktiaBankLogo,"Aktia Bank Logo")==false)
    	{
    		return null;
    	}		
		
		 driver.switchTo().defaultContent();
		if (objCommon.fGuiEnterText(AktiaUsername, "12345678", "Aktia UserName" )==false)
    	{
    		return null;
    	}
		
		if (objCommon.fGuiEnterText(AktiaPassword, "123456", "Aktia Password" )==false)
    	{
    		return null;
    	}
		
        if (objCommon.fGuiClick(AktiaSubmitButton, "Aktia Submit button")==false)
    	{
    		return null;
    	}
	        
        if (objCommon.fGuiEnterText(AktiaUsername, "1234", "Aktia Security Text")==false)
    	{
    		return null;
    	}
                                              
        if (objCommon.fGuiClick(AktiaSubmitButton, "Aktia Security Button")==false)
    	{
    		return null;
    	}
           
                
        if (objCommon.fGuiClick(AktiaFinalLink,"Aktia Final Login")==false)
		{
			return null;
		}
       
       
        return new LandingPageCheck();
		
	}
	
	public LandingPageCheck AcceptTermCondition()
	{
		
		// Verify Accept Terms and condition objects
		Assert.assertNotNull(objCommon.getObject(TermsAndConditionHeading), "Terms and Condition Heading Avaiable");
		
		//Assert.assertNotNull(objCommon.getObject(TermsAndConditionHeadingLabel), "Terms and Condition label is present");
		
		Assert.assertNotNull(objCommon.getObject(TermsAndConditionContinue), "Terms and Condition label is present");
		
		Assert.assertNotNull(objCommon.getObject(TermsAndConditionCancel), "Terms and Condition label is present");
		
		
//		//Click on Cancel
//		if (objCommon.fGuiClick(TermsAndConditionCancel,"Cancel button Click")==false)
//		{
//			return null;
//		}
//		
//		//Click on Return to Login
//		
//		if (objCommon.fGuiClick(ReturnToHomeButton ,"Return to Home button")==false)
//		{
//			return null;
//		}
//		
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//				
//		//driver.switchTo().frame(1);
//		if (objCommon.fGuiClick(AktiaBank,"Aktia Bank Logo")==false)
//    	{
//    		return null;
//    	}		
//		
//		// driver.switchTo().defaultContent();
//		if (objCommon.fGuiEnterText(AktiaUsername, "12345678", "Aktia UserName" )==false)
//    	{
//    		return null;
//    	}
//		
//		if (objCommon.fGuiEnterText(AktiaPassword, "123456", "Aktia Password" )==false)
//    	{
//    		return null;
//    	}
//		
//        if (objCommon.fGuiClick(AktiaSubmitButton, "Aktia Submit button")==false)
//    	{
//    		return null;
//    	}
//	        
//        if (objCommon.fGuiEnterText(AktiaUsername, "1234", "Aktia Security Text")==false)
//    	{
//    		return null;
//    	}
//                                              
//        if (objCommon.fGuiClick(AktiaSubmitButton, "Aktia Security Button")==false)
//    	{
//    		return null;
//    	}
//           
//                
//        if (objCommon.fGuiClick(AktiaFinalLink,"Aktia Final Login")==false)
//		{
//			return null;
//		}   
//        
        
		
		//Click on Continue
        if (objCommon.fGuiClick(TermsAndConditionContinue,"Continue button Click")==false)
		{
			return null;
		}
		 return new LandingPageCheck();
	}
}
