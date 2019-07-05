package pl.b2b.net.pocztowy24.page.confirmPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmObject {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public ConfirmObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = ConfirmData.CONFIRM_BUTTON)
    private WebElement confirmButton;

    @FindBy(xpath = ConfirmData.CONFIRMATION_TEXT)
    private WebElement confirmationText;

    @FindBy(xpath = ConfirmData.SIGN_BUTTON)
    private WebElement signButton;

    @FindBy(xpath = ConfirmData.END_BUTTON)
    private WebElement endButton;

    @FindBy(xpath = ConfirmData.HISTORY_TAB)
    private WebElement historyTab;


    private void clickOnConfirmButton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(confirmButton));
        confirmButton.click();
    }

    public boolean isTabDisplayed(){
        return historyTab.isDisplayed();
    }

    private void clickOnSignButton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(signButton));
        signButton.click();
    }

    private void clickOnEndButton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(endButton));
        endButton.click();
    }

    public void confirmPayment(){
        clickOnConfirmButton();
        clickOnSignButton();
        clickOnEndButton();
    }




}
