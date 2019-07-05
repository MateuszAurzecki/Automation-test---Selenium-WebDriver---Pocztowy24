package pl.b2b.net.pocztowy24.page.logout;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2b.net.pocztowy24.config.SingletonWebDriver;

public class LogoutTest {

    private LogoutObject logoutObject;

    @BeforeClass
    private void setUp() {
        logoutObject = new LogoutObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(logoutObject);
    }

    @Test
    public void logoutTest() {
        logoutObject.clickLogout();
        Assert.assertTrue(logoutObject.isLogoutTextDisplayed());
    }
}
