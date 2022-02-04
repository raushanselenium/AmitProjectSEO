package testCases;

import pageObject.LoginPage;
import testBase.BaseClass;

public class TC0001_Add_URL extends BaseClass {

    LoginPage lp;
    
    public void test_AddURL()
    {
        driver.get(p.getProperty("url"));

    }


}
