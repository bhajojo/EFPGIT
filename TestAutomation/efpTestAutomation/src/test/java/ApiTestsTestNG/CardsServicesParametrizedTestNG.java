package ApiTestsTestNG;

//import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.mapper.ObjectMapper;
import com.jayway.restassured.response.Response;

import java.util.List;

public class CardsServicesParametrizedTestNG {

	@DataProvider
	 public static Object[][] CardsData() {
	 
		Object[][] data = new Object[12][2];
		
		//1st Data Set - Nordea
		data[0][0]="23306607123450";	
		data[0][1]="2102819988";
	
		//2nd Data Set
		data[1][0]="23306607123457";
		data[1][1]="2102819988";
		
		//3rd Data Set
		data[2][0]="23306607123451";
		data[2][1]="010170960F";
		
		//4th Data Set
		data[3][0]="23306607123452";
		data[3][1]="010170960F";
		
		//5th Data Set
		data[4][0]="23306607123458";
		data[4][1]="2102819988";
		
		//6th Data Set
		data[5][0]="23306607123453";
		data[5][1]="010101123N";
		
		//7th Data Set
		data[6][0]="23306607123454";
		data[6][1]="010101123N";
	
		//8th Data Set
		data[7][0]="23306607123455";
		data[7][1]="010101123N";
		
		//9th Data Set
		data[8][0]="23306607123459";
		data[8][1]="010101123N";

		//10th Data Set
		data[9][0]="23306607123456";
		data[9][1]="010170999R";

		//11th Data Set
		data[10][0]="23306607123460";
		data[10][1]="0811819984";

		//12th Data Set
		data[11][0]="23306607123461";
		data[11][1]="0811819984";
		
		return data;
	  }
	 
	//Create the instance of the intereface
	ApiDetails Api;
	
	//Call the Cards Services annotated with DataProvider
	@Test(dataProvider="CardsData")
	public void CardListServiceValidation(String AccNum, String UserID)
	{		
		RestAssured.baseURI  = Api.CardsList;	
	
		//Set the User defined data
		CardsReq_2 jsonBody = new CardsReq_2();
		jsonBody.setAccountNumber(AccNum);	
		jsonBody.setCardNumber("");
		jsonBody.setLocale("sv");
		jsonBody.setUserId(UserID);
		jsonBody.setIsShort(null);
			
		Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
	    String body = res.getBody().asString();
	    CardsListExample CL=res.as(CardsListExample.class,ObjectMapper.GSON);
	    List<ApiTestsTestNG.CardsList> Items =  CL.getCardsList();
	    for (ApiTestsTestNG.CardsList item: Items) {
	    	
	    	//Assert the Cards Level Status
	    	Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
	    
	    }
		   
	}
	
}
		
