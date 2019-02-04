package Action;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;



public class Actions

{
    public  void getmsg() {
        RestAssured.baseURI = "https://api.razorpay.com";
        RequestSpecification httpRequest=RestAssured.given();
        Response response= httpRequest.request(Method.GET);
        int scode=response.getStatusCode();
      //  System.out.println("Status code Received is ->" +scode);
        JsonPath jpath = response.jsonPath();
        String msg=jpath.get("message");
        Assert.assertEquals(scode,200,"Getting Correct status code ");
        Assert.assertEquals(msg,"Welcome to Razorpay API.","Getting correct message");



    }
}


