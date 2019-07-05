package pl.b2b.net.pocztowy24.page.loginPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2b.net.pocztowy24.config.SingletonWebDriver;

public class LoginTest {

    private LoginObject loginObject;

    @BeforeClass
    public void setUp(){
        loginObject = new LoginObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(loginObject);
    }

    @Test
    public void loginToServiceTest(){
        loginObject.clickButton();
        Assert.assertNotNull(SingletonWebDriver.getWebDriver().getCurrentUrl());
    }
}
