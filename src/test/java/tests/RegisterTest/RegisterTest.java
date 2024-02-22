package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    String firstName = "Ion";
    String lastName = "Popescu";
    String address = "Bulevardul Ferdinand 97";
    String emailaddress = "xyz@yahoo.com";
    String phonenumber = "0722222222";


    @Test

    public void fillRegister() {
        driver.get(newUrl);

        LOG.info("Click 'Consent' button");
        registerPage.clickConsentButton();

        LOG.info("Typing full name");
        registerPage.insertFullName(firstName, lastName);

        LOG.info("Typing address");
        registerPage.insertAddress(address);

        LOG.info("Typing email address");
        registerPage.insertEmailAddress(emailaddress);

        LOG.info("Typing phone number");
        registerPage.insertPhoneNumber(phonenumber);

        LOG.info("Click 'Male' option");
        registerPage.clickSelectGender();

        LOG.info("Click 'Cricket' option");
        registerPage.clickSelectHobby();

        LOG.info("Click 'Languages' field");
        registerPage.clickLanguagesField();

        LOG.info("Select Languages");
        registerPage.selectLanguages();

    }


}
