package RestApiBDD;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetRequestBDD {

	@Test
	public void Test1()
	{
		RestAssured.given().baseUri("http://localhost:3000/").when().get("employees").then().log().all().statusCode(200)
		.body("[0].name",Matchers.equalTo("Shiv"));
	}
	@Test
	public void Test2()
	{
		RestAssured.given().baseUri("http://localhost:3000/").when().get("employees/2").then().log().all().statusCode(200);
	}
	
}
