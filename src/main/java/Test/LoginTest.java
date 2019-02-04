package Test;
import Action.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.net.URL;


import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public WebDriver driver = null;

    public static void main(String[] args) {

      /*  System.setProperty("webdriver.chrome.driver", "/Users/kamalkant/ROAST/kant/WebDriver/chromedriver");
        LoginTest lt = new LoginTest();
        lt.driver = new ChromeDriver();
        lt.driver.get("https://dashboard.razorpay.com");

        // LoginPage lp= new LoginPage();
        // lp.get_email(lt.driver).sendKeys("qa@razorpay.com");
        //lp.get_password(lt.driver).sendKeys("r@zorp@y123");
        //lp.get_button(lt.driver).click();


        //  Action.Actions ac=new Action.Actions();
        // ac.getmsg();
        Pages.Link l = new Pages.Link();

        List<WebElement> total = l.get_link(lt.driver);


        System.out.println("Total link is ->" + total.size());
        for (WebElement element12 :total)
        {
            System.out.println("link" +element12.getAttribute("href"));
        }

        for (WebElement element : total) {

            try {

                System.out.println("URL: " + element.getAttribute("href") + " returned " + l.isLinkBroken(new URL(element.getAttribute("href"))));


            } catch (Exception exp) {

                System.out.println("At " + element.getAttribute("innerHTML") + " Exception occured -&gt; " + exp.getMessage());

            }


        }*/


      Action.Post_method pm=new Action.Post_method();
      pm.intialize();
      pm.test1();




    }
}
