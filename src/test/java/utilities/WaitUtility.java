package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtility {

    WebDriverWait wait;
    WebDriver driver;

    public WaitUtility(WebDriver driver)
    {
        this.driver=driver;
    }

    public void waitUtils(By element, long sec)
    {
        wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
