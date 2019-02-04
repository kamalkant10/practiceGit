package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage
{
    public  WebElement get_email(WebDriver driver)
    {
        return driver.findElement(By.xpath("//*[@name=\"loginForm\"]//*[@name=\"email\"]"));





    }


    public WebElement get_password(WebDriver driver)
    {
        return driver.findElement(By.xpath("//*[@name=\"loginForm\"]//*[@name=\"password\"]"));

    }

    public WebElement get_button(WebDriver driver)
    {


        return driver.findElement(By.xpath("//*[@id=\"auth-container\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/form/button"));
    }

}
