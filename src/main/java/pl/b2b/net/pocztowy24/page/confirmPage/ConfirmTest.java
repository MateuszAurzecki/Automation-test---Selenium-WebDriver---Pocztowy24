package pl.b2b.net.pocztowy24.page.confirmPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2b.net.pocztowy24.config.SingletonWebDriver;

public class ConfirmTest {

    private ConfirmObject confirmObject;

    @BeforeClass
    private void setUp() {
        confirmObject = new ConfirmObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(confirmObject);
    }

    @Test
    public void confirmButtonTest(){
        confirmObject.confirmPayment();
        Assert.assertTrue(confirmObject.isTabDisplayed());
    }


}
