package Activities;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Activity4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs/");
        WebElement secondCours = driver.findElement(By.xpath("//h2[contains(text(),'Quia quis non')]"));
        Assert.assertEquals(secondCours.getAttribute("innerText"), "Quia quis non");
        System.out.println("pass");
        driver.close();

    }
}
