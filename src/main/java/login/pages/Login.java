package login.pages;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends CommonMethods {
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    private WebElement loginButton;
    @FindBy(xpath = "//p[@class= 'oxd-text oxd-text--p orangehrm-login-forgot-header']")
    private WebElement forgotPassword;

    public void setUsername(String username) {
        click(this.username);
        addText(username, this.username);
    }

}
