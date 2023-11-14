package tests;

import com.relevantcodes.extentreports.LogStatus;
import common.base.BaseTest;
import common.config.DriverFactory;
import login.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
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
        logger.log(LogStatus.PASS, "username is passed");
        login().password(password);
        logger.log(LogStatus.PASS, "password is passed");
        login().clickSignInBtn();
        logger.log(LogStatus.PASS, "button is clicked");
    }



    @Test(description = "Negative Flow")
    @Parameters({"username","password"})
    public void negativeLogIn(String username, String password) throws InterruptedException {
        login().username(username);
        logger.log(LogStatus.PASS, "username is passed");
        login().password(password);
        logger.log(LogStatus.PASS, "password is passed");
        login().clickSignInBtn();
        logger.log(LogStatus.PASS, "button is clicked");

        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        Thread.sleep(2000);
        logger.log(LogStatus.PASS, "HomePage is displayed");
    }

//    @Test(description = "Happy Flow")
//    public void clickForgotPassword(){
//        login().clickForgotPassword();
//    }


//    @Test(description = "Happy Flow")
//    @Parameters({"username"})
//    public void validateForgotPassword(String username){
//        login().validateForgotPassword(username);
//    }
    @DataProvider(name = "LoginPage object")
    public Object[] loginInstance() {
        LoginPage login = new LoginPage();
        return new Object[]{new Object[]{login}};
    }

}
