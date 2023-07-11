package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity1 {
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs/");
        String title= driver.getTitle();
        Assert.assertEquals(title,"Alchemy Jobs – Job Board Application");
        System.out.println("pass");
        driver.close();

    }
}