package pl.b2b.net.pocztowy24.page.chargePhone;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2b.net.pocztowy24.config.SingletonWebDriver;

public class ChargeTest {

    private ChargeObject chargeObject;

    @BeforeClass
    public void setUp(){
        chargeObject = new ChargeObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(chargeObject);
    }

    @Test
    public void clickOnChargeButton(){
        chargeObject.clickChargePhone();
        Assert.assertNotNull(SingletonWebDriver.getWebDriver().getCurrentUrl());
    }
}
