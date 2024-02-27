package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    String firstName = "Ion";
    String lastName = "Popescu";
    String address = "Bulevardul Ferdinand 97";
    String emailaddress = "xyz@yahoo.com";
    String phonenumber = "0722222222";
    String password = "hahaha123";


    @Test
    public void fillRegister() {
        driver.get(newUrl);
        sleep(3000L);

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

        LOG.info("Select 'Java' skill");
        registerPage.selectJavaSkill();

        LOG.info("Select 'Romania' option");
        registerPage.selectCountry();

        LOG.info("Select '1991' option");
        registerPage.selectBirthYear();

        LOG.info("Select 'July' option");
        registerPage.selectBirthMonth();

        LOG.info("Select '27' option");
        registerPage.selectBirthDay();

        LOG.info("Insert 'Password'");
        signInPage.insertPassword(password);

        LOG.info("Confirm 'Password'");
        signInPage.insertPassword(password);

        LOG.info("Verify if 'Choose file' button is displayed");
        registerPage.isUploadButtonDisplayed();

        LOG.info("Click 'Refresh' button");
        registerPage.clickRefreshButton();

        LOG.info("Click 'Submit' button");
        registerPage.clickSubmitButton();







    }


}
