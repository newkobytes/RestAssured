package RestAPI;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequestWithMap {

	@Test
	public void Test1()
	{
		Map<String,Object> mapObj = new HashMap<String,Object> ();
		mapObj.put("name", "Sharmila");
		mapObj.put("salary", "150000");
	RestAssured.baseURI="http://localhost:3000/";
	RequestSpecification request = RestAssured.given();
	
	Response response = request
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(mapObj)
			.post("employees/create");

System.out.println(response.getBody().asString());

int responseCode = response.getStatusCode();
Assert.assertEquals(201, responseCode);

}
}
