package login.pages;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Login extends CommonMethods {
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    private WebElement loginButton;
    @FindBy(xpath = "//p[@class= 'oxd-text oxd-text--p orangehrm-login-forgot-header']")
    private WebElement forgotPassword;
    @FindBy(xpath = "//input[@name = 'username']")
    private WebElement usernameAfterForgotPassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonResetPassword;
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    private WebElement messageForgotPassword;

    public void setUsername(String username) {
        click(this.username);
        addText(username, this.username);
    }

    public void setPassword(String password) {
        click(this.password);
        addText(password, this.password);
    }

    public void setLoginButton() {
        click(this.loginButton);
        Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", getUrl());
    }

    public void setForgotPassword() {
        click(this.forgotPassword);
        Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode", getUrl());
    }

    public void setUsernameAfterForgotPassword(String username) {
        click(usernameAfterForgotPassword);
        addText(username, usernameAfterForgotPassword);
    }

    public void setButtonResetPassword() {
        click(this.buttonResetPassword);
    }

    //Reset Password link sent successfully   DE CAPTURAT SI DE FACUT ASSERT
    //Obiect de tip Login si apelam metodele


}
