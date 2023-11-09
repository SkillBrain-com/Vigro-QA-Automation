package tests;

import common.base.BaseTest;
import common.config.DriverFactory;
import login.pages.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogIn extends DriverFactory {
    public LoginPage login(){
        return new LoginPage();
    }
    @Test(description = "Happy Flow")
    @Parameters({"username","password"})
    public void verifyLogIn(String username, String password){
        login().username(username);
        login().password(password);
        login().clickSignInBtn();
    }

//    @Test(description = "Negative Flow")
//    @Parameters({"username","password"})
//    public void negativeLogIn(String username, String password){
//        login().username(username);
//        login().password(password);
//        login().clickSignInBtn();
//    }

//    @Test(description = "Happy Flow")
//    public void clickForgotPassword(){
//        login().clickForgotPassword();
//    }


//    @Test(description = "Happy Flow")
//    @Parameters({"username"})
//    public void validateForgotPassword(String username){
//        login().validateForgotPassword(username);
//    }

}
