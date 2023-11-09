package login.pages;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonMethods {
    public String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement userName;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginBtn;
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    private WebElement dasboardText;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    private WebElement exceptionLogIN;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement forgotPasswordUsername;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']")
    private WebElement resetPasswordBtn;


    public void goToUrl() {
        driver.get(url);
    }

    public void leaveUrl() {
        driver.close();
    }

    public void username(String username) {
        click(userName);
        addText(username, userName);
    }

    public void password(String password) {
        click(this.password);
        addText(password, this.password);
    }

    public void clickSignInBtn() {
        click(loginBtn);
    }

    public void forgotPasswordLinkMethod() {
        click(forgotPasswordLink);
    }

    public void forgotPasswordUsername(String username) {
        click(forgotPasswordUsername);
        addText(username, forgotPasswordUsername);

    }

    public void clickResetBtn() {
        click(resetPasswordBtn);
    }

    public boolean findAlertInvalidCredential() {
        if (exceptionLogIN.isDisplayed()) {
            return true;
        }
        return false;
    }

}
