package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='nodeaction-add sprite-nodeaction-square-world-add big-node-action nodeaction']")
    WebElement btnPlus;

    public void clickPlusBtn()
    {
        btnPlus.click();
    }

    @FindBy(xpath = "//div[@class='icon sprite-creator-add_page']")
    WebElement webPage;

    public void clickWebPage()
    {
        webPage.click();
    }

    @FindBy(xpath = "//input[@id='search-input']")
    WebElement txtSearchURL;

    public void searchURL(String url)
    {
        txtSearchURL.sendKeys(url);
    }

    @FindBy(xpath = "//div[@class='loader-container']")
    WebElement btnAdd;

    public void clickAddBtn()
    {
        btnAdd.click();
    }







}
