package RestApiBDD;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostRequestBDD {

	@Test
	public void Test1()
	{
		Map<String,Object> mapObj = new HashMap<String,Object> ();
		mapObj.put("name", "Shivu");
		mapObj.put("salary", "150000"); 
		RestAssured.given().baseUri("http://localhost:3000/")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(mapObj)
		.when().post("employees/create").then().log().all().statusCode(201).body("name",Matchers.equalTo("Shivu"));
	}
}
