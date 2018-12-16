package ApiTests;

//import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.mapper.ObjectMapper;
import com.jayway.restassured.response.Response;

//import org.junit.Test;
//import org.junit.Before;
import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.equalTo;
//import com.jayway.restassured.JsonSchemaValidator.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CardsServicesTestNG {

	
	//private String CustomerView= "https://api-nordea.apiconnect.ibmcloud.com/obi-dev/external-test/customer/view";
	private String CardsList= "https://api-nordea.apiconnect.ibmcloud.com/obi-dev/external-test/card/cardlist";
	public String generateStringFromResource(String path) throws IOException {

	    return new String(Files.readAllBytes(Paths.get(path)));

	}
	@Test
	public void CardListHandelBank()
	{		
		RestAssured.baseURI  = CardsList;
		String jsonBody;
		try {
			jsonBody = generateStringFromResource("C:\\Tieto_Projects\\Nordea\\MyPages-Finland\\TestAutomationProjectNew\\mypages\\Testing\\nff-mypages\\nffAutomation\\src\\test\\java\\example\\CardsPayLoadHandelBank.json");
			Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
		    String body = res.getBody().asString();
		    Example CL=res.as(Example.class,ObjectMapper.GSON);
		    List<ApiTests.CardsList> Items =  CL.getCardsList();
		    for (ApiTests.CardsList item: Items) {
		    	System.out.println(item.getCardHolderName().toString());
		    	System.out.println(item.getAccountNumber().toString());
		    	System.out.println(item.getSsn().toString());
		    	System.out.println(item.getCardLevel().toString());
		    	Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
		    
		    }
		   
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}	
	
	@Test
	public void CardListAktia()
	{		
		RestAssured.baseURI  = CardsList;
		String jsonBody;
		try {
			jsonBody = generateStringFromResource("C:\\Tieto_Projects\\Nordea\\MyPages-Finland\\TestAutomationProjectNew\\mypages\\Testing\\nff-mypages\\nffAutomation\\src\\test\\java\\example\\CardsPayLoadAktia.json");
			Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
		    String body = res.getBody().asString();
		    Example CL=res.as(Example.class,ObjectMapper.GSON);
		    List<ApiTests.CardsList> Items =  CL.getCardsList();
		    for (ApiTests.CardsList item: Items) {
		    	System.out.println(item.getCardHolderName().toString());
		    	System.out.println(item.getAccountNumber().toString());
		    	System.out.println(item.getSsn().toString());
		    	System.out.println(item.getCardLevel().toString());
		    	Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
		    
		    }
		   
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}	
	
	@Test
	public void CardListAlandsBank()
	{		
		RestAssured.baseURI  = CardsList;
		String jsonBody;
		try {
			jsonBody = generateStringFromResource("C:\\Tieto_Projects\\Nordea\\MyPages-Finland\\TestAutomationProjectNew\\mypages\\Testing\\nff-mypages\\nffAutomation\\src\\test\\java\\example\\CardsPayLoadAlandBank.json");
			Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
		    String body = res.getBody().asString();
		    Example CL=res.as(Example.class,ObjectMapper.GSON);
		    List<ApiTests.CardsList> Items =  CL.getCardsList();
		    for (ApiTests.CardsList item: Items) {
		    	System.out.println(item.getCardHolderName().toString());
		    	System.out.println(item.getAccountNumber().toString());
		    	System.out.println(item.getSsn().toString());
		    	System.out.println(item.getCardLevel().toString());
		    	Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
		    
		    }
		   
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}	
	
	@Test
	public void CardListNordea()
	{		
		RestAssured.baseURI  = CardsList;
		String jsonBody;
		try {
			jsonBody = generateStringFromResource("C:\\Tieto_Projects\\Nordea\\MyPages-Finland\\TestAutomationProjectNew\\mypages\\Testing\\nff-mypages\\nffAutomation\\src\\test\\java\\example\\CardsPayLoadNordea.json");
			Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
		    String body = res.getBody().asString();
		    Example CL=res.as(Example.class,ObjectMapper.GSON);
		    List<ApiTests.CardsList> Items =  CL.getCardsList();
		    for (ApiTests.CardsList item: Items) {
		    	System.out.println(item.getCardHolderName().toString());
		    	System.out.println(item.getAccountNumber().toString());
		    	System.out.println(item.getSsn().toString());
		    	System.out.println(item.getCardLevel().toString());
		    	Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
		    	
		    
		    }
		   
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}	
		
	
//		
//	@Test
//	public void TransactionList()
//	{		
//		RestAssured.baseURI  = TransactionList;
//		String jsonBody;
//		try {
//			jsonBody = generateStringFromResource("C:\\Tieto_Projects\\Nordea\\MyPages-Finland\\TestAutomationProjectNew\\mypages\\Testing\\nff-mypages\\nffAutomation\\src\\test\\java\\example\\CardsPayLoad.json");
//			Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
//		    String body = res.getBody().asString();
//		    Example CL=res.as(Example.class,ObjectMapper.GSON);
//		    List<example.CardsList> Items =  CL.getCardsList();
//		    for (example.CardsList item: Items) {
//		    	System.out.println(item.getCardHolderName().toString());
//		    	System.out.println(item.getAccountNumber().toString());
//		    	System.out.println(item.getSsn().toString());
//		    	System.out.println(item.getCardLevel().toString());
//		    	if (item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"))
//		    	{
//		    		System.out.println("Cards Level are matching");		    	
//		    	}
//		    	else
//		    	{
//		    		System.out.println("Cards Level are not matching");
//		    	}
//		    
//		    }
//		   
//		} catch (IOException e) {
//		
//			e.printStackTrace();
//		}   
//		
//	}
	        
	
	    
	}
	
//	@Test
//	public void UpcomingPaymentCheck()
//	{		
//		RestAssured.baseURI  = UpcomingPaymentsEndPoint;
//	    Response res = RestAssured.given().contentType("application/json").body("{\"brand\":\"no example\",\"accountNumber\":\"1122334455\"}").when().post("");
//	    String body = res.getBody().asString();
//	    System.out.println(body);
//	    res.then().body("minAmountPayment",equalTo("200"));
//	 
//	}
//	
//	@Test
//	public void Invoice()
//	{		
//		RestAssured.baseURI  = InvoicesPaymentsEndPoint;
//	    Response res = RestAssured.given().contentType("application/json").body("{\"brand\":\"no example\"}").when().post("");
//	    String body = res.getBody().asString();
//	    System.out.println(body);
//	}
//	
//	@Test
//	public void Preferences()
//	{		
//		RestAssured.baseURI  = PreferencesEndPoint; 
//	    Response res = RestAssured.given().contentType("application/json").body("{\"brand\":\"no example\"}").when().post("");
//	    String body = res.getBody().asString();
//	    System.out.println(body);
//	}
	
//	@Test
//	public void GetQuickLinks()
//	{		
//		RestAssured.baseURI  = QuickLinksEndPoint; 
//	    Response res = RestAssured.given().contentType("application/json").body("{\"brand\":\"no example\"}").when().post("");
//	    String body = res.getBody().asString();
//	    System.out.println(body);
//	}
//	@Test
//	public void InvoiceDataValidation()
//	{		
//		RestAssured.baseURI  = InvoicesPaymentsEndPoint;
//	    Response res = RestAssured.given().contentType("application/json").body("{\"brand\":\"no example\"}").when().post("");
//	    System.out.println(res.getBody().jsonPath().getString("invoices.invoicePeriod"));
//	   
//	}
//	
	


