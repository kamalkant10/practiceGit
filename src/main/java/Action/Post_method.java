package Action;
import Test.Post_test;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Post_method
{

    public String baseUrl="http://restapi.demoqa.com/customer/register";
    public  Response rp;
    public String data1[]={"kamaqw","qwe","xqal1023","kwq1235","awqbc@gmail.com"};
    public Post_test ps=new Post_test();


    @BeforeTest
    public void intialize()
    {
        ps.setbase_url(baseUrl);
        rp=ps.make_request(data1);


    }

    @AfterTest
    public void clear()
    {}


    @Test
    public void test1()
    {
         //String msg=ps.get_valuebykey(rp,"Message");

         Assert.assertEquals(ps.get_statuscode(rp),200,"Correct status code");
         //System.out.println("Message received is->"+msg);
         // System.out.println("Status code is:"+ps.get_statuscode(rp));
         //   System.out.println("Response body is :"+rp.getBody().asString());
         //Assert.assertEquals(ps.get_valuebykey(rp,"SuccessCode"),"OPERATION_SUCCESS");
         //Assert.assertEquals(ps.get_valuebykey(rp,"Message"),"Operation completed successfully");
    }
}
