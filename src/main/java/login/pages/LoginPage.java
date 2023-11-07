package login.pages;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonMethods {
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement userName;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginBtn;
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    private WebElement dasboardText;

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

}
