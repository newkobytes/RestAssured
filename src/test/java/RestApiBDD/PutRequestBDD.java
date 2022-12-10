package RestApiBDD;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutRequestBDD {
	
	@Test
	public void Test1()
	{
	Map<String,Object> mapObj = new HashMap<String,Object> ();
	mapObj.put("name", "Shiv");
	mapObj.put("salary", "1000"); 
	RestAssured.given().baseUri("http://localhost:3000/")
	.contentType(ContentType.JSON)
	.accept(ContentType.JSON)
	.body(mapObj)
	.when().put("employees/1").then().log().all().statusCode(200);
}
}