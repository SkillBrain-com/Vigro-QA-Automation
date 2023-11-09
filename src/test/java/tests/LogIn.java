package tests;

import common.base.BaseTest;
import common.config.DriverFactory;
import login.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogIn extends DriverFactory {

    public LoginPage login;
    @Test(description = "Happy Flow", priority = 1)
    @Parameters({"username","password"})
    public void verifyLogIn(String username, String password){
        login.goToUrl();
        login.username(username);
        login.password(password);
        login.clickSignInBtn();
    }

    @BeforeMethod
    public void setUp2() {
        login = new LoginPage();
    }

//    @AfterMethod
//    public void tearDown() {
//        login.leaveUrl();
//    }

    @Test(description = "Login with wrong input - Negative Login", priority = 2)
    @Parameters({"username","password"})
    public void negativeLoginIn(String username, String password){
            login.goToUrl();
            login.username(username);
            login.password(password);
            login.clickSignInBtn();
            Assert.assertTrue(login.findAlertInvalidCredential());
    }

    @Test(description = "forgot password test", priority = 3)
    @Parameters({"username"})
    public void forgotPassword(String username){
        login.goToUrl();
        login.forgotPasswordLinkMethod();
        login.forgotPasswordUsername(username);
        login.clickResetBtn();
    }

}
