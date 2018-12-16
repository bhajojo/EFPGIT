package ApiTests;

import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.mapper.ObjectMapper;
import com.jayway.restassured.response.Response;

import org.junit.Test;
import org.junit.Before;
import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.equalTo;
//import com.jayway.restassured.JsonSchemaValidator.*;

public class CardsListService {

	
	private String CardListEndPoint= "http://nff-dev.se.teco.online/nffin-card-service/card/cardlist";
	private String UpcomingPaymentsEndPoint= "http://nff-dev.se.teco.online/nffin-card-service/card/upcomingpayment";
	private String InvoicesPaymentsEndPoint= "http://nff-dev.se.teco.online/nffin-card-service/card/invoices";
	private String PreferencesEndPoint= "http://nff-dev.se.teco.online/nffin-preferences-service/preferences";
	private String QuickLinksEndPoint= "http://nff-dev.se.teco.online/nffin-preferences-service/preferences/quicklinks";
	
	@Test
	public void CardsListCheck()
	{		
		RestAssured.baseURI  = CardListEndPoint;
	    Response res = RestAssured.given().contentType("application/json").body("{\"brand\":\"no example\"}").when().post("");
	    String body = res.getBody().asString();
	    Example CL=res.as(Example.class,ObjectMapper.GSON);
	    
	    
	    System.out.println(body);	
	    //System.out.println(res.body().path(path, arguments));
	        
	    //System.out.println(res.path("cardList.ssn"));
	    //res.then().body("ssn",equalTo("1234567890"));
//	    res.then().body("yearOfSaving",equalTo("2018"));
//	    res.then().body("paymentsRemaining",equalTo("47"));
//	    res.then().body("creditAvailable",equalTo("85000.0"));
//	    res.then().body("cardCurrency",equalTo("SEK"));
//	    
		
	    
	}
	
	@Test
	public void UpcomingPaymentCheck()
	{		
		RestAssured.baseURI  = UpcomingPaymentsEndPoint;
	    Response res = RestAssured.given().contentType("application/json").body("{\"brand\":\"no example\",\"accountNumber\":\"1122334455\"}").when().post("");
	    String body = res.getBody().asString();
	    System.out.println(body);
	    res.then().body("minAmountPayment",equalTo("200"));
	 
	}
	
	@Test
	public void Invoice()
	{		
		RestAssured.baseURI  = InvoicesPaymentsEndPoint;
	    Response res = RestAssured.given().contentType("application/json").body("{\"brand\":\"no example\"}").when().post("");
	    String body = res.getBody().asString();
	    System.out.println(body);
	}
	
	@Test
	public void Preferences()
	{		
		RestAssured.baseURI  = PreferencesEndPoint; 
	    Response res = RestAssured.given().contentType("application/json").body("{\"brand\":\"no example\"}").when().post("");
	    String body = res.getBody().asString();
	    System.out.println(body);
	}
	
	@Test
	public void GetQuickLinks()
	{		
		RestAssured.baseURI  = QuickLinksEndPoint; 
	    Response res = RestAssured.given().contentType("application/json").body("{\"brand\":\"no example\"}").when().post("");
	    String body = res.getBody().asString();
	    System.out.println(body);
	}
	@Test
	public void InvoiceDataValidation()
	{		
		RestAssured.baseURI  = InvoicesPaymentsEndPoint;
	    Response res = RestAssured.given().contentType("application/json").body("{\"brand\":\"no example\"}").when().post("");
	    System.out.println(res.getBody().jsonPath().getString("invoices.invoicePeriod"));
	   
	}
	
	

	

}
