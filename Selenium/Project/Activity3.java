package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs/");
        WebElement image= driver.findElement(By.xpath("//img[contains(@class,'attachment-large size-large')]"));
       String src = image.getAttribute("src");
        System.out.println( "url of Image:  "+src);
        driver.close();
    }
}
