package ApiTestsEFPServices;

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

public class TransactionServicesParametrizedTestNG {

	
	
	//Create the instance of the intereface
	//ApiDetails Api;
	
			
	@Test()
	public void TransactionServiceVerification()
	{		
		
		//Set the TransactionList API
		RestAssured.baseURI  = "https://nff-dev.se.teco.online/nffin-preferences-service/preferences/quicklinks";
		
		//Create object of JsonBody
		
		String token="eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJuUGEtR05iYWpuSjVPS0liTl9MeVRDdjNWQTVsRkFvZFpnMHJuVlVGX2tvIn0.eyJqdGkiOiI0MjkwNWNjNC04MTNkLTRhYTgtOTZiOS0yYjViODUwYzA5NzAiLCJleHAiOjE1MzMyMTc4OTAsIm5iZiI6MCwiaWF0IjoxNTMzMjE3MjkwLCJpc3MiOiJodHRwczovL25mZi1kZXYuc2UudGVjby5vbmxpbmUvYXV0aC9yZWFsbXMvbXlwYWdlcyIsImF1ZCI6Im15cGFnZXMtcG9ydGFsIiwic3ViIjoiZjo5MzQyYTdkNy0yNWU5LTRkM2YtYThmZS0wYmJkODJhZjAyN2Y6MiIsInR5cCI6IkJlYXJlciIsImF6cCI6Im15cGFnZXMtcG9ydGFsIiwibm9uY2UiOiJiODU3YWZkNC0yMTk2LTRlYzktODVlMy03Yjc0YmI5MWQ1M2EiLCJhdXRoX3RpbWUiOjE1MzMyMTcyODAsInNlc3Npb25fc3RhdGUiOiJkYWEzOGE0Yy0yY2UwLTQzMzAtYTkzOC0xYWNjZjkxMTJkNWIiLCJhY3IiOiIwIiwiY2xpZW50X3Nlc3Npb24iOiI3ZDg4MDViZS01MWY0LTRhMTAtYjNjZS0xZjEzMTY4YTc2YmEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiKiIsImh0dHBzOi8vbmZmLWRldi5zZS50ZWNvLm9ubGluZS8iXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsInZpZXctcHJvZmlsZSJdfX0sIkxBU1RfQVVUSF9NRVRIT0QiOiJha3RpYSIsIm5hbWUiOiLDhFlSw4RNw5YgVEVTVEkiLCJUQ19BQ0NFUFRFRCI6dHJ1ZSwicHJlZmVycmVkX3VzZXJuYW1lIjoiMDEwMTcwOTk5UiIsImdpdmVuX25hbWUiOiLDhFlSw4RNw5YiLCJmYW1pbHlfbmFtZSI6IlRFU1RJIiwiTEFTVF9CUkFORF9MT0dJTiI6Im5vcmRlYSJ9.YcIX-OAqKaId1hlCUxx2nk3GWctbA-_AXv48UheIXA9RSfj4skDxZ6_layKIqmH1Kcx2hAzh0td8JyvmYJ2Sqk9smaS1vNgVutpkV-8VBm4STl0Wn1rCr4u5oThTRC0TJSi1hD4AmJGss9vYaKLN1KuRi550MMCS2yu1KK7TK01ERwvexJ4VtGoF4vixUC8YWjgIokp3qEAFdh4Pm-5-04La4Bz8YtQ193Vhf5RE0rvb9wIDJVqV70ZOBk7fdafBysxasJ_umBRVvFnuiXfpgs4ge80PfYXN5QMdcwYMWK9Bcwv0rOMyoXqYregadFxB4-roJBZ_VVGSELHinnZztA";
		
		//Generate the response
		Response res = RestAssured.given()
				.headers("Content-Type","application/json","Authorization", "Bearer" + token).body("{\"brand\":\"NORDEA\"}").when().post();
		String body = res.getBody().asString();	
		System.out.println(body);	
		
		//Verify the Response Code
		Assert.assertEquals(res.getStatusCode(), 200);
		
		//Get the Data from the Response
		
//		for (TransactionList_ item: Items) {
//			System.out.println(item.getAccountNumber().toString());
//			System.out.println(item.getBeneficiaryText().toString());
//		
//			
//		}
	}	

}
	


