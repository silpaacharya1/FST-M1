package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Post a Job')]")));
        WebElement postjob = driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Post a Job')]"));
        postjob.click();

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#job_title")));

        WebElement yourEmail = driver.findElement(By.cssSelector("input#create_account_email"));
        yourEmail.sendKeys( "silpa.@sil.com");

        WebElement jobTitle = driver.findElement(By.cssSelector("input#job_title"));
        int min = (int) Math.pow(10, 3 - 1);
        int max = (int) Math.pow(10, 3);
        Random random = new Random();
        String str = Integer.toString(random.nextInt(max - min) + min);
        jobTitle.clear();
        jobTitle.sendKeys(str + "BankingTester4");

        WebElement descFrame = driver.findElement(By.cssSelector("iframe#job_description_ifr"));
        driver.switchTo().frame(descFrame);
        System.out.println("Entered into frame"+"******");
        WebElement desc = driver.findElement(By.cssSelector("//*[@id='tinymce']/p"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", desc);

      if(desc.isDisplayed())  {
          desc.click();
          desc.sendKeys(str + "BankingTester4");
          System.out.println("Eleemnt diplayed and clicked, send"+"******");
      }
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       // desc.click();
      //  desc.sendKeys(str + "BankingTester4");
        driver.switchTo().defaultContent();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
/*
        WebElement email = driver.findElement(By.cssSelector("input#application"));
        email.sendKeys(str + ".@sil.com");

        WebElement companyName = driver.findElement(By.cssSelector("input#company_name"));
        companyName.sendKeys("IBM");

        WebElement preview = driver.findElement(By.xpath("//input[@value='Preview']"));
        preview.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#job_preview_submit_button")));
        WebElement submitlist = driver.findElement(By.cssSelector("input#job_preview_submit_button"));
        submitlist.click();

        WebElement postajobmsg = driver.findElement(By.xpath("//*[@class='entry-content clear']/text()[1]"));
        if (postajobmsg.getAttribute("innerText").contains("Job listed successfully. To view your listing")) {
            System.out.println("Job posted");
        }
//verify added job
        WebElement job = driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Jobs')]"));
        job.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#search_keywords")));
        WebElement serachtxtbox = driver.findElement(By.cssSelector("input#search_keywords"));
        WebElement serach = driver.findElement(By.xpath("//input[@value='Search Jobs']"));
        serachtxtbox.sendKeys(str + "BankingTester4");
        serach.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        List<WebElement> jobList = driver.findElements(By.xpath("//ul[@class='job_listings']/li/a"));

        System.out.println("Job list size is " + jobList.size());
        if (jobList.get(0).getAttribute("innerText").contains(str + "BankingTester4")) {
            System.out.println("Passed:Job postedwith title");
        }


        driver.close();
        // System.out.println("pass");
*/

    /*    WebElement Course = driver.findElement(By.xpath("//a[contains(text(),'All Courses')]"));
        Course.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        List<WebElement> listCour = driver.findElements(By.cssSelector("h3.entry-title"));
        System.out.println("Total no. of Courses is: - "+listCour.size());
        for (WebElement list: listCour) {

            System.out.println("All of Courses text  is: - "+list.getText());
        }
        driver.close();
        System.out.println("pass");
    }*/
    }}
