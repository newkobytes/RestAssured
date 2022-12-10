package RestAPI;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {
	
	@Test
	public void Test1()
	{
		Map<String,Object> mapObj = new HashMap<String,Object> ();
		mapObj.put("name", "Appa");
		mapObj.put("salary", "20000");
	RestAssured.baseURI="http://localhost:3000/";
	RequestSpecification request = RestAssured.given();
	
	Response response = request
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(mapObj)
			.put("employees/10");

System.out.println(response.getBody().asString());

int responseCode = response.getStatusCode();
Assert.assertEquals(200, responseCode); 
	}
	
}
