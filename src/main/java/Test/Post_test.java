package Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.path.json.JsonPath;
import org.json.simple.JSONObject;
public class Post_test

{

    private JSONObject requestParameters;
    public String base;
    private Response response;
    public JsonPath jpath;
    public void setbase_url(String str)
        {

            base=str;
        }

    public Response make_request(String arr[])
    {
        RestAssured.baseURI=base;
        RequestSpecification httprequest = RestAssured.given();
        requestParameters=new JSONObject();
        requestParameters.put("FirstName",arr[0]);
        requestParameters.put("LastName",arr[1]);
        requestParameters.put("UserName",arr[2]);
        requestParameters.put("Password",arr[3]);
        requestParameters.put("Email",arr[4]);

        httprequest.header("Content-Type","application/json");
        httprequest.body(requestParameters.toJSONString());

        response= httprequest.post();
        return response;


    }

    public int get_statuscode(Response rp)
    {
        return rp.getStatusCode();

    }

    public  String get_valuebykey(Response rp,String s)
    {

        jpath=rp.jsonPath();
        return jpath.get(s);

    }

}
