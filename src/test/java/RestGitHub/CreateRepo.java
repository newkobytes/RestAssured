package RestGitHub;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateRepo {

	@Test
	public void Test1()
	{
	File datafile =new File("data1.json");
	RestAssured.given()
	.auth()
	.oauth2("dummy token") //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 - my token (give the dummy token here since we r about to push our codes in github oubkic repo))
	.baseUri("https://api.github.com")
	.contentType(ContentType.JSON)
	.accept(ContentType.JSON)
	.body(datafile)
	.when()
	.post("user/repos")
	.then()
	.log()
	.all()
	.statusCode(201);

		
	}
}
