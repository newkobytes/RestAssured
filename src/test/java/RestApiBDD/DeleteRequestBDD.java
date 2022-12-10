package RestApiBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequestBDD {

	@Test
public void Test1()
{
	
	RestAssured.given().baseUri("http://localhost:3000/")
	.contentType(ContentType.JSON)
	.accept(ContentType.JSON)
	//.body("employees")
	.when().delete("employees/2").then().log().all().statusCode(200);
}
}