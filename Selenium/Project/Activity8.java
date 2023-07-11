package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs/wp-admin");

        WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement usernameInput = driver.findElement(By.cssSelector("input#user_login"));
        WebElement passwordInput = driver.findElement(By.cssSelector("input#user_pass"));
        WebElement login = driver.findElement(By.cssSelector("input#wp-submit"));
        waitt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#user_login")));
        usernameInput.sendKeys("root");
        passwordInput.sendKeys("pa$$w0rd");
        login.submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement displayName = driver.findElement(By.xpath("(//span[@class='display-name'])[1]"));

        waitt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='display-name'])[1]")));
        if (displayName.getText().contains("root")){
            System.out.println("pass:-User root is logged in");
        }
        else
            System.out.println("Failed: User root is not logged in");
        driver.close();
    /*    WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
        contact.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement eleName = driver.findElement(By.cssSelector("#wpforms-8-field_0"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", eleName);
        //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("#wpforms-8-field_0")));

        WebElement eleEmail = driver.findElement(By.cssSelector("#wpforms-8-field_1"));
        WebElement eleSub = driver.findElement(By.cssSelector("#wpforms-8-field_2"));
        WebElement eleMessaeg = driver.findElement(By.cssSelector("#wpforms-8-field_3"));
        WebElement btnSubmit = driver.findElement(By.cssSelector("button.wpforms-submit"));
        String Nmae = "Silpa ", email = "silpaachary@gmail.com", sub = "check mail";
        Actions act = new Actions(driver);
        act.moveToElement(eleName).click();
        act.build().perform();
        //  eleName.click();
        eleName.sendKeys(Nmae);
        eleEmail.sendKeys(email);
        eleSub.sendKeys(sub);
        eleMessaeg.sendKeys("Hi");
        btnSubmit.submit();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'wpforms-confirmation')]/p")));

        WebElement submissionMess = driver.findElement(By.xpath("//div[contains(@id,'wpforms-confirmation')]/p"));

        Assert.assertTrue(submissionMess.isDisplayed(), "Thanks for contacting us! We will be in touch with you shortly.");
        Assert.assertEquals(submissionMess.getAttribute("innerText"), "Thanks for contacting us! We will be in touch with you shortly.");
        driver.quit();*/
    }
}
