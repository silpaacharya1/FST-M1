package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs/");
        WebElement heading= driver.findElement(By.cssSelector("h1.entry-title"));
        Assert.assertEquals(heading.getText(),"Welcome to Alchemy Jobs");
        System.out.println("pass");
        driver.close();

    }
}
