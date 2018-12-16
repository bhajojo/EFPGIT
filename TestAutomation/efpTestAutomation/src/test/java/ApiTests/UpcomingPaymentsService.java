package ApiTests;

import org.junit.Test;

	import com.jayway.restassured.RestAssured;
	import com.jayway.restassured.response.Response;

	import org.junit.Test;
	import org.junit.Before;
	import static com.jayway.restassured.RestAssured.expect;
	import static org.hamcrest.Matchers.equalTo;
	public class UpcomingPaymentsService {
	
		private String ENDPOINT_PURCHASE_PRODUCT_BY_UUID= "http://nff-card-service-nff-mypages-dev.cloudapps.ocp-uat2.uat.mypages.teco.1-3.se.teco.online/nffin-card-service/card/cardlist";
		
		@Test
		public void testGet()
		{
			
			RestAssured.baseURI  = "http://nff-dev.se.teco.online/nffin-mock-service/cp-card-service/card/upcomingpayment"; 
			 
		     Response res = RestAssured.given()	
		     .contentType("application/json").
		     body("{\"brand\":\"no example\",\\\"accountNumber\\\":\\\"1122334455\\}").
		        when().
		        post("");
		 
		     String body = res.getBody().asString();
		     System.out.println(body);
		}
		
		

		

	}
