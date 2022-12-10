package RestAPIXml;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.internal.path.xml.NodeChildrenImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class XmlExample {

	@Test
	public void Test1()
	{
		RestAssured.baseURI="https://chercher.tech/sample/api/books.xml";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		System.out.println(response.getBody().asString());
		
	NodeChildrenImpl Allbooks	=response.then().extract().path("bookstore.book.title");
	System.out.println(Allbooks);
	System.out.println("The first book is " + Allbooks.get(0));
	System.out.println("The second book is " + Allbooks.get(1));
		
	System.out.println("The first book language is " + Allbooks.get(0).getAttribute("lang"));
	System.out.println("The second book language is " + Allbooks.get(1).getAttribute("lang"));
	}
}
