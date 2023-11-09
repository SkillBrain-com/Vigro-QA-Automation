package login.pages;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;

public class LoginPage extends CommonMethods {
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement userName;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginBtn;
//    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
//    private WebElement dasboardText;
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    private WebElement forgotPassword;
    @FindBy(xpath = "//input[@name='username']")
    private WebElement userNameForgotPassword;
    @FindBy(xpath="//button[@type='submit']")
    private WebElement buttonResetPassword;
//    @FindBy (xpath = "//div[@class='orangehrm-card-container']//h6")
//    private WebElement textResetPasswordSuccessfully;
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

    public void clickForgotPassword() {
        click(forgotPassword);
        Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode", driver.getCurrentUrl());
    }
    public void validateForgotPassword(String username) {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode");
        click(userNameForgotPassword);
        addText(username, userNameForgotPassword);
        click(buttonResetPassword);
        Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/sendPasswordReset", driver.getCurrentUrl());
    }

}
