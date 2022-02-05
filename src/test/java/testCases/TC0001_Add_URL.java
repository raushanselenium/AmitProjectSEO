package testCases;

import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.Login2Page;
import pageObject.LoginPage;
import pageObject.PremiumPage;
import testBase.BaseClass;
import utilities.WaitUtility;

public class TC0001_Add_URL extends BaseClass {

    LoginPage lp;
    Login2Page lp2;
    WaitUtility wu;
    PremiumPage pp;
    HomePage hp;

    @Test
    public void test_AddURL() throws InterruptedException {
        driver.get(p.getProperty("url"));

        lp=new LoginPage(driver);
        lp.setUserName(p.getProperty("username"));
        lp.setEmail(p.getProperty("email"));
        lp.setPassword(p.getProperty("password"));
        lp.clickLogin();

        lp2=new Login2Page(driver);
        wu=new WaitUtility(driver);
        wu.waitUtils(lp2.getUserName(),10);

        lp2.setUserName(p.getProperty("username"));
        lp2.setPassword(p.getProperty("password"));
        Thread.sleep(2000);
        lp2.clickLogin();

        pp=new PremiumPage(driver);
        pp.clickCrossMark();

        hp=new HomePage(driver);
        Thread.sleep(2000);
        hp.clickFolder();
        hp.clickPlusAF();
        hp.clickWebPage();
        hp.searchURL(p.getProperty("targeturl"));
        wu.waitUtils(hp.makeAddBtnVisible(),10);
        hp.clickAddBtn();

    }


}
