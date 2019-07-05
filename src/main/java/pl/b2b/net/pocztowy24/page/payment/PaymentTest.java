package pl.b2b.net.pocztowy24.page.payment;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pl.b2b.net.pocztowy24.config.SingletonWebDriver;

public class PaymentTest {

    private PaymentObject paymentObject;

    @BeforeClass
    private void setUp(){
        paymentObject = new PaymentObject(SingletonWebDriver.getWebDriver(),SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(paymentObject);
    }

    @Test
    @Parameters({"name", "indentity", "phoneNumber", "amount", "emailAddress"})
    public void paymentTest(String name, String indentity, String phoneNumber, String amount, String emailAddress){
        paymentObject.paymentMethods(name,indentity,phoneNumber,amount,emailAddress);
        Assert.assertTrue(paymentObject.isEditButtonDisplayed(),"Edit Button was not displayed on page");
    }


}
