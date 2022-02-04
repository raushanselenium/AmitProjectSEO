package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PremiumPage {

    WebDriver driver;

    public PremiumPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "close-button-container")
    WebElement crossMark;

    public void clickCrossMark()
    {
        crossMark.click();
    }


}
