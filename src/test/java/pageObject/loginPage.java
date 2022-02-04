package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    WebDriver driver;

    public loginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "username")
    WebElement txtUserName;

    @FindBy(id="email")
    WebElement txtEmail;

    @FindBy(id="password")
    WebElement txtPassword;

    @FindBy(xpath = "//span[normalize-space()='Log in']")
    WebElement btnLogin;

    public void setUserName(String un)
    {
        txtUserName.sendKeys(un);
    }

    public void setEmail(String email)
    {
        txtEmail.sendKeys(email);
    }

    public void setPassword(String pwd)
    {
        txtPassword.sendKeys(pwd);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }


}
