package pl.b2b.net.pocztowy24.page.payment;

public class PaymentData {
    public static final String ACCOUNT_BUTTON = "//div[@class = \"form-p-sel-btn left\"]";
    public static final String ACCOUNTS_LIST = "//span[contains(@class, 'pst-cell-top') and  text()='POCZTOWE KONTO STANDARD']";
    public static final String CHOOSE_CELLPHONE = "//span[@id =\"selectczestotliwosc\"]";
    public static final String JANEK_CELLPHONE = "//span[contains(@class, 'form-select-optionlist-option') and text()= 'Komórka Janka']";
    public static final String PHONE_INPUT = "//input[@value=\"Telefon\"]";
    public static final String IDENTITYPSMS = "//input[@value=\"komorka\"]";
    public static final String SELECT_OPERATOR = "//span[@id =\"selectopertator\"]";
    public static final String SELECT_PLUS = "//span[contains(@class, 'form-select-optionlist-option') and text()='Plus na kartę']";
    public static final String PHONE_NUMBER = "//input[@value=\"610345321\"]";
    public static final String CHARGE_AMOUNT = "//input[@value=\"25\"]";
    public static final String CHECKBOX_NOTIFICATION = "//input[@id = \"przelewWlasnyUtworzOperacjeCykliczna\"]";
    public static final String EMAIL = "//input[@value = \"anna@pocztowa.pl\"]";
    public static final String EXECUTE_BUTTON = "//span[contains(@class, 'sm_button_wrap') and text()='Wykonaj']";

    public static final String EDIT_BUTTON="//span[contains(@class,'sm_button_wrap') and text()= 'Modyfikuj']";


    public static final String ACCOUNTS_LIST_LOOP = "//span[@class=\"pst-cell-top\"]";



    //jak element jest uzupelniony to najpier czyscimy metoda clear, jesli chcemy cos wpisac to send keys
}
