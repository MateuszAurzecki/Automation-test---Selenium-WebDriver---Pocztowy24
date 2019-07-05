package pl.b2b.net.pocztowy24.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SingletonWebDriver {

    private static SingletonWebDriver singletonWebDriver;
    private static WebDriverWait webDriverWait;
    private static WebDriver webDriver;

    private SingletonWebDriver(String driverPath) {
        //konstruktor
        System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY, driverPath);
        webDriver = new FirefoxDriver();
        webDriverWait = new WebDriverWait(webDriver, 10);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }

    public static void initialize(String driverPath) {
        if (singletonWebDriver == null) {
            singletonWebDriver = new SingletonWebDriver(driverPath);
        }
    }

    public static WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void quitWebDriver() {
        webDriver.quit();
        webDriver = null;
        webDriverWait = null;
        singletonWebDriver = null;
    }
}
