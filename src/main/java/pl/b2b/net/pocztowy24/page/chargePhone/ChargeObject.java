package pl.b2b.net.pocztowy24.page.chargePhone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChargeObject {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public ChargeObject(WebDriver webDriver,WebDriverWait webDriverWait){
        this.webDriver=webDriver;
        this.webDriverWait=webDriverWait;
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(xpath = ChargeData.CHARGE_BUTTON)
    private WebElement chargeButton;

    public void clickChargePhone(){
        webDriverWait.until(ExpectedConditions.visibilityOf(chargeButton));
        chargeButton.click();
    }

}
