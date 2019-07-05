package pl.b2b.net.pocztowy24.page.payment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PaymentObject {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public PaymentObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = PaymentData.ACCOUNT_BUTTON)
    private WebElement accountButton;

    @FindBy(xpath = PaymentData.ACCOUNTS_LIST)
    private WebElement accountList;

    @FindBy(xpath = PaymentData.CHOOSE_CELLPHONE)
    private WebElement chooseCellPhone;

    @FindBy(xpath = PaymentData.JANEK_CELLPHONE)
    private WebElement janekCellPhone;

    @FindBy(xpath = PaymentData.PHONE_INPUT)
    private WebElement phoneInput;

    @FindBy(xpath = PaymentData.IDENTITYPSMS)
    private WebElement identity;

    @FindBy(xpath = PaymentData.PHONE_NUMBER)
    private WebElement phoneNumber;

    @FindBy(xpath = PaymentData.CHARGE_AMOUNT)
    private WebElement chargeAmount;

    @FindBy(xpath = PaymentData.SELECT_OPERATOR)
    private WebElement operator;

    @FindBy(xpath = PaymentData.SELECT_PLUS)
    private WebElement selectPlus;

    @FindBy(xpath = PaymentData.CHECKBOX_NOTIFICATION)
    private WebElement checkBox;

    @FindBy(xpath = PaymentData.EMAIL)
    private WebElement email;

    @FindBy(xpath = PaymentData.EXECUTE_BUTTON)
    private WebElement executeButton;

    @FindAll(@FindBy(xpath = PaymentData.ACCOUNTS_LIST_LOOP))
    private List<WebElement> accountListLoop;

    @FindBy(xpath = PaymentData.EDIT_BUTTON)
    private WebElement editButton;


    private void clickOnAccountButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(accountButton));
        accountButton.click();
    }

    private void chooseAccount() {
        webDriverWait.until(ExpectedConditions.visibilityOf(accountList));
        accountList.click();
    }

    private void chooseAccountList() {
        for (WebElement webElement : accountListLoop) {
            if(webElement.getText().equals("POCZTOWE KONTO STANDARD")){
                webElement.click();
                break;
            }
        }
    }

    private void clickOnCellPhone() {
        webDriverWait.until(ExpectedConditions.visibilityOf(chooseCellPhone));
        chooseCellPhone.click();
    }

    private void chooseJanekCellPhone() {
        webDriverWait.until(ExpectedConditions.visibilityOf(janekCellPhone));
        janekCellPhone.click();
    }


    private void phoneNumberInput(String chargeId) {
        webDriverWait.until(ExpectedConditions.visibilityOf(phoneInput));
        phoneInput.clear();
        phoneInput.sendKeys(chargeId);
    }

    private void inputIdentity(String identification) {
        webDriverWait.until(ExpectedConditions.visibilityOf(identity));
        identity.clear();
        identity.sendKeys(identification);
    }

    private void chooseOperator() {
        webDriverWait.until(ExpectedConditions.visibilityOf(operator));
        operator.click();
    }

    private void selectPlus() {
        webDriverWait.until(ExpectedConditions.visibilityOf(selectPlus));
        selectPlus.click();
    }

    private void inputPhoneNumber(String phone) {
        webDriverWait.until(ExpectedConditions.visibilityOf(phoneNumber));
        phoneNumber.clear();
        phoneNumber.sendKeys(phone);
    }

    private void chargeAmount(String amount) {
        webDriverWait.until(ExpectedConditions.visibilityOf(chargeAmount));
        chargeAmount.clear();
        chargeAmount.sendKeys(amount);
    }

    private void checkbox() {
        webDriverWait.until(ExpectedConditions.visibilityOf(checkBox));
        checkBox.click();
    }

    private void email(String emailAddress) {
        webDriverWait.until(ExpectedConditions.visibilityOf(email));
        email.clear();
        email.sendKeys(emailAddress);
    }

    private void execute() {
        webDriverWait.until(ExpectedConditions.visibilityOf(executeButton));
        executeButton.click();
    }

    private void edit(){
        editButton.click();
    }

    public void paymentMethods(String name, String indentity, String phoneNumber, String amount, String emailAddress) {
        clickOnAccountButton();
        chooseAccountList();
        clickOnCellPhone();
        chooseJanekCellPhone();
        phoneNumberInput(name);
        inputIdentity(indentity);
        chooseOperator();
        selectPlus();
        inputPhoneNumber(phoneNumber);
        chargeAmount(amount);
        checkbox();
        email(emailAddress);
        execute();
    }

    public boolean isEditButtonDisplayed(){
        return editButton.isDisplayed();
    }

}
