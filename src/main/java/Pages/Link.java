package Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class Link

{
    public WebDriver driver=null;

    public List get_link(WebDriver driver) {
        List<WebElement> ele=new ArrayList<WebElement>();



        ele = driver.findElements(By.tagName("a"));
        List<WebElement> finalList=new ArrayList<WebElement>();

        for (WebElement element : ele)

        {

            if(element.getAttribute("href") != null)

            {

                finalList.add(element);

            }

        }
        return finalList;

    }



    public static String isLinkBroken(URL url) throws Exception

    {

        //url = new URL("https://yahoo.com");

        String response = "";

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try

        {

            connection.connect();

            response = connection.getResponseMessage();

            connection.disconnect();

            return response;

        }

        catch(Exception exp)

        {

            return exp.getMessage();

        }

    }

}
