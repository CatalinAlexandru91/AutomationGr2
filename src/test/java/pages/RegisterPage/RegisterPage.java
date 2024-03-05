package pages.RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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

    private By inputFirstName = By.xpath("//input[@ng-model='FirstName']");
    private By inputLastName = By.xpath("//input[@ng-model='LastName']");
    private By inputAddress = By.xpath("//textarea[@ng-model='Adress']");
    private By inputEmail = By.xpath("//input[@type='email']");
    private By inputPhoneNUmber = By.xpath("//input[@ng-model='Phone']");
    private By maleGender = By.xpath("//input[@value='Male']");
    private By femaleGender = By.xpath("//input[@value='FeMale']");
    private By cricketCheckmarks = By.id("checkbox1");
    private By moviesCheckmarks = By.id("checkbox2");
    private By hockeyCheckmarks = By.id("checkbox3");
    private By languageField = By.id("msdd");
    String selectLanguage = "//a[contains(text(), '%s')]";
    private By selectSkills = By.id("Skills");
    private By selectCountry = By.xpath("//span[@role='combobox']");
    private By insertCountry = By.xpath("//input[@role='textbox']");
    private By selectYear = By.id("yearbox");
    private By selectMonth = By.xpath("//select[@ng-model='monthbox']");
    private By selectDay = By.id("daybox");
    private By chooseFile = By.id("imagesrc");
    private By passwordField = By.id("firstpassword");
    private By confirmPassword = By.id("secondpassword");
    private By submitButton = By.id("submitbtn");
    private By refreshButton = By.xpath("//button[@value=\"Refresh\"]");

    public void insertFullName(String fName, String lName) {
        LOG.info("Inserting FirstName and LastName");
        driver.findElement(inputFirstName).sendKeys(fName);
        driver.findElement(inputLastName).sendKeys(lName);

    }

    public void insertAddress(String address) {
        LOG.info("Insert address");
        driver.findElement(inputAddress).sendKeys(address);
    }

    public void insertEmail(String email) {
        LOG.info("Insert email");
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void insertPhoneNUmber(String phone) {
        LOG.info("Insert phone number");
        driver.findElement(inputPhoneNUmber).sendKeys(phone);
    }

    public void setMaleGender() {
        LOG.info("Clicking the Male radio button");
        driver.findElement(maleGender).click();
    }

    public void setFemaleGender() {
        LOG.info("Clicking the Female radio button");
        driver.findElement(femaleGender).click();
    }

    public void clickCricket() {
        LOG.info("Clicking Cricket checkmark");
        driver.findElement(cricketCheckmarks).click();
    }

    public void clickMovies() {
        LOG.info("Clicking Movies checkmark");
        driver.findElement(moviesCheckmarks).click();
    }

    public void clickHockey() {
        LOG.info("Clicking Hockey checkmark");
        driver.findElement(hockeyCheckmarks).click();
    }

    public void selectLanguage(String language) {
        LOG.info("Selecting a language");
        driver.findElement(languageField).click();
        driver.findElement(By.xpath(String.format(selectLanguage, language)));
    }

    public void selectSkills(String skill) {
        LOG.info("Selecting a skill");
        Select newSkill = new Select(driver.findElement(selectSkills));
        newSkill.selectByValue(skill);
    }

    public void selectCountry(String country) {
        LOG.info("Selecting Country");
        driver.findElement(selectCountry).click();
        driver.findElement(insertCountry).sendKeys(country);
        driver.findElement(selectCountry).sendKeys(Keys.ENTER);
    }

    public void setDateOfBirth(String year, String month, String day) {
        LOG.info("Selecting date of birth");
        Select newYear = new Select(driver.findElement(selectYear));
        newYear.selectByValue(year);
        Select newMonth = new Select(driver.findElement(selectMonth));
        newMonth.selectByValue(month);
        Select newDay = new Select(driver.findElement(selectDay));
        newDay.selectByValue(day);
    }

    public void chooseFile() {
        LOG.info("Upload file");
        WebElement fileInput = driver.findElement(chooseFile);
        fileInput.sendKeys("C:/Users/PC/Desktop/Ronnie-Coleman-7.webp");

    }

    public void inputPassword(String password) {
        LOG.info("Input password in field");
        driver.findElement(passwordField).sendKeys(password);

    }

    public void confirmPassword(String confirmpassword) {
        LOG.info("Confirm password in field");
        driver.findElement(confirmPassword).sendKeys(confirmpassword);

    }

    public void clickSubmitButton() {
        sleep(3000);
        LOG.info("Clicking 'Submit' button");
        driver.findElement(submitButton).click();

    }

    public void clickRefreshButton() {
        LOG.info("Clicking 'Refresh' button");
        driver.findElement(refreshButton).click();


    }
}


