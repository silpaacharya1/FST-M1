package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs");
        WebElement job = driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Jobs')]"));
        job.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#search_keywords")));
        WebElement serachtxtbox = driver.findElement(By.cssSelector("input#search_keywords"));
        WebElement serach = driver.findElement(By.xpath("//input[@value='Search Jobs']"));
        serachtxtbox.sendKeys("BankingTester2");
        serach.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        List<WebElement> jobList = driver.findElements(By.xpath("//ul[@class='job_listings']/li/a"));

        System.out.println("Job list size is "+jobList.size());
        jobList.get(0).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Apply for job']")));
        WebElement applyJob = driver.findElement(By.xpath("//input[@value='Apply for job']"));
        applyJob.click();;
      //  Assert.assertEquals(myAccountHeading.getText(), "My Account");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='job_application_email']")));

        WebElement email = driver.findElement(By.xpath("//a[@class='job_application_email']"));
      System.out.println("email is :"+email.getAttribute("text"));


driver.close();;
    }

}
