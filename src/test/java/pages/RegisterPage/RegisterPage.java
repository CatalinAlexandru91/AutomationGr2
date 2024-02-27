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

    private By consentButton = By.xpath("//p[text()='Consent']");
    private By inputFirstName = By.xpath("//input[@ng-model='FirstName']");
    private By inputLastName = By.xpath("//input[@ng-model='LastName']");
    private By inputAddress = By.xpath("//textarea[@ng-model='Adress']");
    private By inputEmailAddress = By.xpath("ng-model='EmailAdress']");
    private By inputPhoneNumber = By.xpath("//input[@ng-model='Phone']");
    private By selectGender = By.xpath("//input[@type = 'radio' and @value = 'Male']");
    private By selectHobby = By.id("checkbox1");
    private By inputLanguages = By.id("msdd");
    private By selectLanguage1 = By.xpath("//a[@class='ui-corner-all' and text()='Romanian']");
    private By selectLanguage2 = By.xpath("//a[@class='ui-corner-all' and text()='English']");
    private By selectSkills = By.id("Skills");
    private By selectCountry = By.id("countries");
    private By selectBirthYear = By.xpath("//select[@id='yearbox']/option[@value='1991']");
    private By selectBirthMonth = By.xpath("//select[@ng-model='monthbox']/option[@value='July']");
    private By selectBirthDay = By.xpath("//select[@id='daybox']/option[@value='27']");
    private By inputPassword = By.id("firstpassword");
    private By confirmPassword = By.id("secondpassword");
    private By uploadPhoto = By.id("imagesrc");
    private By refreshButton = By.id("Button1");
    private By submitButton = By.id("submitbtn");


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

    public void selectJavaSkill() {
        LOG.info("Select 'Java' skill");
        driver.findElement(selectSkills).sendKeys("Java");
    }

    public void selectCountry() {
        LOG.info("Select 'Romania' option");
        driver.findElement(selectCountry).sendKeys("Romania");
    }

    public void selectBirthYear() {
        LOG.info("Select '1991' option");
        driver.findElement(selectBirthYear).click();

    }

    public void selectBirthMonth() {
        LOG.info("Select 'July' option");
        driver.findElement(selectBirthMonth).click();

    }

    public void selectBirthDay() {
        LOG.info("Select '27' option");
        driver.findElement(selectBirthDay).click();
    }

    public void insertPassword(String Password) {
        LOG.info("Input 'Password' in field");
        driver.findElement(inputPassword).sendKeys("Password");

    }

    public void setConfirmPassword(String Password) {
        LOG.info("Confirm 'Password' in field");
        driver.findElement(confirmPassword).sendKeys("Password");

    }

    public boolean isUploadButtonDisplayed() {
        LOG.info("Verify if 'Choose file' button is displayed");
        return driver.findElement(uploadPhoto).isDisplayed();

    }

    public void clickRefreshButton() {
        LOG.info("Click 'Refresh' button");
        driver.findElement(refreshButton).click();

    }

    public void clickSubmitButton() {
        LOG.info("Click 'Submit' button");
        driver.findElement(submitButton).click();

    }
}

