package pl.b2b.net.pocztowy24.page.logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutObject {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public LogoutObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = LogoutData.LOGOUT_BUTTON)
    private WebElement logoutButton;

    @FindBy(xpath = LogoutData.LOGOUT_TEXT)
    private WebElement logoutText;

    public void clickLogout() {
        webDriverWait.until(ExpectedConditions.visibilityOf(logoutButton));
        logoutButton.click();
    }

    public boolean isLogoutTextDisplayed(){
        return logoutText.isDisplayed();
    }


}
