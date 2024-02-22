package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private By consentButton = By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']");
    private By inputFirstName = By.xpath("//input[@ng-model='FirstName']");
    private By inputLastName = By.xpath("//input[@ng-model='LastName']");
    private By inputAddress = By.xpath("//textarea[@ng-model='Adress']");
    private By inputEmailAddress = By.xpath("ng-model='EmailAdress']");
    private By inputPhoneNumber = By.xpath("//input[@ng-model='Phone']");
    private By selectGender = By.xpath("//input[@ng-model='radiovalue'][1]");
    private By selectHobby = By.id("checkbox1");
    private By inputLanguages = By.id("msdd");
    private By selectLanguage1 = By.xpath("//a[@class='ui-corner-all' and text()='Romanian']");
    private By selectLanguage2 = By.xpath("//a[@class='ui-corner-all' and text()='English']");
    private By selectSkill = By.id("//option[@value='Java']");

    public void clickConsentButton() {
        LOG.info("Click 'Consent' button");
        driver.findElement(consentButton).click();
    }

    public void insertFullName(String fName, String lName) {
        LOG.info("Inserting FirstName and LastName");
        driver.findElement(inputFirstName).sendKeys(fName);
        driver.findElement(inputLastName).sendKeys(lName);
    }

    public void insertAddress(String address) {
        LOG.info("Inserting Address");
        driver.findElement(inputAddress).sendKeys(address);

    }

    public void insertEmailAddress(String emailaddress) {
        LOG.info("Inserting Email Address");
        driver.findElement(inputAddress).sendKeys(emailaddress);

    }

    public void insertPhoneNumber(String phonenumber) {
        LOG.info("Inserting Phone Number");
        driver.findElement(inputPhoneNumber).sendKeys(phonenumber);

    }

    public void clickSelectGender() {
        LOG.info("Click 'Male' option");
        driver.findElement(selectGender).click();

    }

    public void clickSelectHobby() {
        LOG.info("Click 'Cricket' option");
        driver.findElement(selectHobby).click();

    }

    public void clickLanguagesField() {
        LOG.info("Click 'Languages' field");
        driver.findElement(inputLanguages).click();

    }

    public void selectLanguages() {
        LOG.info("Select Languages");
        driver.findElement(selectLanguage1).click();
        driver.findElement(selectLanguage2).click();


    }


}



