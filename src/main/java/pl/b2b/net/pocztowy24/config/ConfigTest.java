package pl.b2b.net.pocztowy24.config;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ConfigTest {

    @Test
    @Parameters({"driverPath"})
    public void setUp(String driverPath){
        SingletonWebDriver.initialize(driverPath);
        Assert.assertNotNull(SingletonWebDriver.getWebDriver());
    }

    @Test
    @Parameters({"url"})
    public void openSite(String url){
        SingletonWebDriver.getWebDriver().get(url);
        Assert.assertNotNull(SingletonWebDriver.getWebDriver().getCurrentUrl());
    }

    @Test
    public void tearUp(){
        SingletonWebDriver.quitWebDriver();
        Assert.assertNull(SingletonWebDriver.getWebDriver());
    }
}
