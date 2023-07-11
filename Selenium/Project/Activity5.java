package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs");
        WebElement job = driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Jobs')]"));
        job.click();
       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement myAccountHeading = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.uagb-ifb-title")));
        System.out.println(myAccountHeading.getText());
        Assert.assertEquals(myAccountHeading.getText(), "My Account");*/
        Thread.sleep(2000);
        String title= driver.getTitle();
        Assert.assertEquals(title,"Jobs – Alchemy Jobs");
        System.out.println("Verified user navigated to Jobs Page");
        driver.close();

    }
}
