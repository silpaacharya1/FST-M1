package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs");
    /*    WebElement myAccount = driver.findElement(By.xpath("//a[contains(text(),'All Co Account')]"));
        myAccount.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement myAccountHeading = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.uagb-ifb-title")));
*/
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
    }
}
