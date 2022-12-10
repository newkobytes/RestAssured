package RestAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {

	@Test
	public void Test1()
	{
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("employees");
		System.out.println(response.getBody().asString());
	}
}
