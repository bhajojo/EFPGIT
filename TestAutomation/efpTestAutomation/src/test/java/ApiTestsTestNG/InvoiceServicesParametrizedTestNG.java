package ApiTestsTestNG;

//import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.mapper.ObjectMapper;
import com.jayway.restassured.response.Response;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class InvoiceServicesParametrizedTestNG {

	@DataProvider
	 public static Object[][] InvoiceData() {
	 
		Object[][] data = new Object[3][2];
		
		//1st Data Set - Nordea
		data[0][0]="23306607123450";	
		data[0][1]="2102819988";
	
			
		//3rd Data Set
		data[1][0]="23306607123451";
		data[1][1]="010170960F";

		//3rd Data Set
		data[2][0]="23306607123452";
		data[2][1]="010170999R";
		
				
		return data;
	  }
	
	//Create the instance of the intereface
	ApiDetails Api;
	
			
	@Test(dataProvider="InvoiceData")
	public void InvoiceServiceVerification(String AccNum, String UserID)
	{		
		
		//Set the Invoice API
		RestAssured.baseURI  = Api.Invoices;
		
		//Create object of JsonBody
		InvoicesExample jsonBody = new InvoicesExample();
		
		//Set the Data from the data provider annotation
		jsonBody.setAccountNumber(AccNum);
		jsonBody.setCardNumber("");
		jsonBody.setBrand("Joustorahoitus");		
		jsonBody.setUserId(UserID);
		
		//Generate the response
		Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
		String body = res.getBody().asString();	
		System.out.println(body);	
		
		//Verify the Response Code
		Assert.assertEquals(res.getStatusCode(), 200);
		
		//Get the Data from the Response
		InvoicesResponses TL=res.as(InvoicesResponses.class,ObjectMapper.GSON);
		List<InvoiceListResponse> Items =  TL.getInvoiceList();
		for (InvoiceListResponse item: Items) {
			System.out.println(item.getAccountNumber().toString());
			System.out.println(item.getCardHolderName().toString());
				
			//Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
			
		}
	}	

}
	


