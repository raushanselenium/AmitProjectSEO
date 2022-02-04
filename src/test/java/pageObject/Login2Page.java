package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2Page {

    WebDriver driver;

    public Login2Page(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "log_username")
    WebElement txtUserName;

    @FindBy(id="log_password")
    WebElement txtPassword;

    @FindBy(xpath = "//div[@id='signin-button']")
    WebElement btnLogin;

    public void setUserName(String un)
    {
        txtUserName.sendKeys(un);
    }

    public void setPassword(String pwd)
    {
        txtPassword.sendKeys(pwd);
    }

    public void  clickLogin()
    {
        btnLogin.click();
    }

}
