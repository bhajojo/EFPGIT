package ApiTests;

//import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.mapper.ObjectMapper;
import com.jayway.restassured.response.Response;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TransactionServicesTestNG {

	
	//private String CustomerView= "https://api-nordea.apiconnect.ibmcloud.com/obi-dev/external-test/customer/view";
	
	private String TransactionList= "https://api-nordea.apiconnect.ibmcloud.com/obi-dev/external-test/card/transactions";
	
	
	public String generateStringFromResource(String path) throws IOException {

	    return new String(Files.readAllBytes(Paths.get(path)));

	}
	//@Test
//	public void TransactionAktia()
//	{		
//		RestAssured.baseURI  = TransactionList;
//		String jsonBody;
//		try {
//			jsonBody = generateStringFromResource("C:\\Tieto_Projects\\Nordea\\MyPages-Finland\\TestAutomationProjectNew\\mypages\\Testing\\nff-mypages\\nffAutomation\\src\\test\\java\\example\\TransactionPayLoadAktia.Json");
//			Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
//		    String body = res.getBody().asString();	
//		    //System.out.println(body);	
//		    Assert.assertEquals(res.getStatusCode(), 200);
//		    TransactionList TL=res.as(TransactionList.class,ObjectMapper.GSON);
//		    List<TransactionList_> Items =  TL.getTransactionList();
//		    for (TransactionList_ item: Items) {
//		    	System.out.println(item.getAccountNumber().toString());
//		    	System.out.println(item.getCardNumber().toString());
//		    	System.out.println(item.getCardNumber().toString());
//		    	System.out.println(item.getBeneficiaryText().toString());
//		    	System.out.println(item.getBeneficiaryText().toString());
//		    	
//		    	//Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
//		    	
//		    }
//		   
//		} catch (IOException e) {
//		
//			e.printStackTrace();
//		}
//	}	
	
	@Test
	public void TransactionNordea()
	{		
		RestAssured.baseURI  = TransactionList;
		TransactionPayLoadExample jsonBody = new TransactionPayLoadExample();
		jsonBody.setAccountNumber("23306607123450");
		jsonBody.setCardNumber("");
		jsonBody.setIsShort(null);
		jsonBody.setLocale("sv");
		jsonBody.setUserId("2102819988");
		Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
		String body = res.getBody().asString();	
		//System.out.println(body);	
		Assert.assertEquals(res.getStatusCode(), 200);
		TransactionList TL=res.as(TransactionList.class,ObjectMapper.GSON);
		List<TransactionList_> Items =  TL.getTransactionList();
		for (TransactionList_ item: Items) {
			System.out.println(item.getAccountNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getBeneficiaryText().toString());
			System.out.println(item.getBeneficiaryText().toString());
			
			//Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
			
		}
	}	
	
	@Test
	public void TransactionNordea1()
	{		
		RestAssured.baseURI  = TransactionList;
		TransactionPayLoadExample jsonBody = new TransactionPayLoadExample();
		jsonBody.setAccountNumber("23306607123457");
		jsonBody.setCardNumber("");
		jsonBody.setIsShort(null);
		jsonBody.setLocale("sv");
		jsonBody.setUserId("2102819988");
		Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
		String body = res.getBody().asString();	
		//System.out.println(body);	
		Assert.assertEquals(res.getStatusCode(), 200);
		TransactionList TL=res.as(TransactionList.class,ObjectMapper.GSON);
		List<TransactionList_> Items =  TL.getTransactionList();
		for (TransactionList_ item: Items) {
			System.out.println(item.getAccountNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getBeneficiaryText().toString());
			System.out.println(item.getBeneficiaryText().toString());
			
			//Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
			
		}
	}	
	
	@Test
	public void TransactionAland1()
	{		
		RestAssured.baseURI  = TransactionList;
		TransactionPayLoadExample jsonBody = new TransactionPayLoadExample();
		jsonBody.setAccountNumber("23306607123451");
		jsonBody.setCardNumber("");
		jsonBody.setIsShort(null);
		jsonBody.setLocale("sv");
		jsonBody.setUserId("010170960F");
		Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
		String body = res.getBody().asString();	
		//System.out.println(body);	
		Assert.assertEquals(res.getStatusCode(), 200);
		TransactionList TL=res.as(TransactionList.class,ObjectMapper.GSON);
		List<TransactionList_> Items =  TL.getTransactionList();
		for (TransactionList_ item: Items) {
			System.out.println(item.getAccountNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getBeneficiaryText().toString());
			System.out.println(item.getBeneficiaryText().toString());
			
			//Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
			
		}
	}	
	
	@Test
	public void TransactionAland2()
	{		
		RestAssured.baseURI  = TransactionList;
		TransactionPayLoadExample jsonBody = new TransactionPayLoadExample();
		jsonBody.setAccountNumber("23306607123452");
		jsonBody.setCardNumber("");
		jsonBody.setIsShort(null);
		jsonBody.setLocale("sv");
		jsonBody.setUserId("010170960F");
		Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
		String body = res.getBody().asString();	
		//System.out.println(body);	
		Assert.assertEquals(res.getStatusCode(), 200);
		TransactionList TL=res.as(TransactionList.class,ObjectMapper.GSON);
		List<TransactionList_> Items =  TL.getTransactionList();
		for (TransactionList_ item: Items) {
			System.out.println(item.getAccountNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getBeneficiaryText().toString());
			System.out.println(item.getBeneficiaryText().toString());
			
			//Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
			
		}
	}	
	
	@Test
	public void TransactionAland3()
	{		
		RestAssured.baseURI  = TransactionList;
		TransactionPayLoadExample jsonBody = new TransactionPayLoadExample();
		jsonBody.setAccountNumber("23306607123458");
		jsonBody.setCardNumber("");
		jsonBody.setIsShort(null);
		jsonBody.setLocale("sv");
		jsonBody.setUserId("010170960F");
		Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
		String body = res.getBody().asString();	
		//System.out.println(body);	
		Assert.assertEquals(res.getStatusCode(), 200);
		TransactionList TL=res.as(TransactionList.class,ObjectMapper.GSON);
		List<TransactionList_> Items =  TL.getTransactionList();
		for (TransactionList_ item: Items) {
			System.out.println(item.getAccountNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getBeneficiaryText().toString());
			System.out.println(item.getBeneficiaryText().toString());
			
			//Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
			
		}
	}	
	
	@Test
	public void TransactionHandlesBank1()
	{		
		RestAssured.baseURI  = TransactionList;
		TransactionPayLoadExample jsonBody = new TransactionPayLoadExample();
		jsonBody.setAccountNumber("23306607123453");
		jsonBody.setCardNumber("");
		jsonBody.setIsShort(null);
		jsonBody.setLocale("sv");
		jsonBody.setUserId("010101123N");
		Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
		String body = res.getBody().asString();	
		//System.out.println(body);	
		Assert.assertEquals(res.getStatusCode(), 200);
		TransactionList TL=res.as(TransactionList.class,ObjectMapper.GSON);
		List<TransactionList_> Items =  TL.getTransactionList();
		for (TransactionList_ item: Items) {
			System.out.println(item.getAccountNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getBeneficiaryText().toString());
			System.out.println(item.getBeneficiaryText().toString());
			
			
			
		}
	}	
	
	@Test
	public void TransactionHandlesBank2()
	{		
		RestAssured.baseURI  = TransactionList;
		TransactionPayLoadExample jsonBody = new TransactionPayLoadExample();
		jsonBody.setAccountNumber("23306607123454");
		jsonBody.setCardNumber("");
		jsonBody.setIsShort(null);
		jsonBody.setLocale("sv");
		jsonBody.setUserId("010101123N");
		Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
		String body = res.getBody().asString();	
		//System.out.println(body);	
		Assert.assertEquals(res.getStatusCode(), 200);
		TransactionList TL=res.as(TransactionList.class,ObjectMapper.GSON);
		List<TransactionList_> Items =  TL.getTransactionList();
		for (TransactionList_ item: Items) {
			System.out.println(item.getAccountNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getBeneficiaryText().toString());
			System.out.println(item.getBeneficiaryText().toString());
			
			//Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
			
		}
	}	
	
	
	@Test
	public void TransactionHandlesBank3()
	{		
		RestAssured.baseURI  = TransactionList;
		TransactionPayLoadExample jsonBody = new TransactionPayLoadExample();
		jsonBody.setAccountNumber("23306607123455");
		jsonBody.setCardNumber("");
		jsonBody.setIsShort(null);
		jsonBody.setLocale("sv");
		jsonBody.setUserId("010101123N");
		Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
		String body = res.getBody().asString();	
		//System.out.println(body);	
		Assert.assertEquals(res.getStatusCode(), 200);
		TransactionList TL=res.as(TransactionList.class,ObjectMapper.GSON);
		List<TransactionList_> Items =  TL.getTransactionList();
		for (TransactionList_ item: Items) {
			System.out.println(item.getAccountNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getBeneficiaryText().toString());
			System.out.println(item.getBeneficiaryText().toString());
			
			//Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
			
		}
	}	
	
	@Test
	public void TransactionHandlesBank4()
	{		
		RestAssured.baseURI  = TransactionList;
		TransactionPayLoadExample jsonBody = new TransactionPayLoadExample();
		jsonBody.setAccountNumber("23306607123459");
		jsonBody.setCardNumber("");
		jsonBody.setIsShort(null);
		jsonBody.setLocale("sv");
		jsonBody.setUserId("010101123N");
		Response res = RestAssured.given().headers("Content-Type", "application/json", "X-IBM-Client-Id","c6f98744-2b5a-4dd8-b274-7983a6ebd27e","X-IBM-Client-Secret","mJ4oM6fW2nO7fT8lX1pA4vB0iA7pF1dD8fV3rU5dX6pD5yX7iW").body(jsonBody).when().post("");
		String body = res.getBody().asString();	
		//System.out.println(body);	
		Assert.assertEquals(res.getStatusCode(), 200);
		TransactionList TL=res.as(TransactionList.class,ObjectMapper.GSON);
		List<TransactionList_> Items =  TL.getTransactionList();
		for (TransactionList_ item: Items) {
			System.out.println(item.getAccountNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getCardNumber().toString());
			System.out.println(item.getBeneficiaryText().toString());
			System.out.println(item.getBeneficiaryText().toString());
			
			//Assert.assertTrue(item.getCardLevel().toString().equals("S") || item.getCardLevel().toString().equals("M"));
			
		}
	}	
}
	


