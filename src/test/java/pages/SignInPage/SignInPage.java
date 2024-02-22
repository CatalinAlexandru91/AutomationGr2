package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;


    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private By signInButton = By.id("btn1");
    private By logo = By.id("logo");
    private By emailField = By.xpath("//input[@ng-model='Email']");
    private By passwordField = By.xpath("//input[@ng-model='Password']");
    private By enterButton = By.id("enterbtn");
    private By skipSignInButton = By.id("btn2");
    private By emailInputField = By.id("email");
    private By signup = By.id("email");
    private By registerButton = By.id("enterimg");

    public void clickSignInButton() {
        LOG.info("Click 'Sign in' button");
        driver.findElement(signInButton).click();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if 'Sign in' button is displayed");
        return driver.findElement(signInButton).isDisplayed();

    }

    public boolean isLogoDisplayed() {
        LOG.info("Verify if Logo image is displayed");
        return driver.findElement(logo).isDisplayed();

    }

    public void insertEmail(String Email) {
        LOG.info("input 'Email' in field");
        driver.findElement(emailField).sendKeys("Email");

    }

    public void insertPassword(String Password) {
        LOG.info("input 'Password' in field");
        driver.findElement(passwordField).sendKeys("Password");

    }

    public void clickEnterButton() {
        LOG.info("Click 'Enter' button");
        driver.findElement(enterButton).click();

    }

    public void clickBack() {
        LOG.info("Click back in browser");
        driver.navigate().back();

    }

    public void clickSkipSignInButton() {
        LOG.info("Click 'Skip Sign In' button");
        driver.findElement(skipSignInButton).click();
    }

    public void email(String email) {
        LOG.info("Insert email adress");
        driver.findElement(signup).sendKeys(email);
    }

    public void clickRegisterButton() {
        LOG.info("Click Register button");
        driver.findElement(registerButton).click();

    }


}
    





