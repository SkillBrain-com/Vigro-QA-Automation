package tests;

import com.relevantcodes.extentreports.LogStatus;
import common.base.CommonMethods;
import common.config.DriverFactory;
import login.pages.LoginPage;
import login.pages.PersonalDetails;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyInfoTest extends DriverFactory {


    public PersonalDetails myInfo(){
        return new PersonalDetails();
    }

    public LoginPage login(){
        return new LoginPage();
    }



    @Test(description = "Happy Test MyInfo Page")
    @Parameters({"name", "lastname", "license", "nationality", "maritalStatus"
            ,"gender", "bloodType", "typeOfRunning"})
    public void myInfoPage(String name, String lastname, String license, String nationality,
                           String maritalStatus, String gender, String bloodType, String typeOfRunning){

        login().username("Admin");
        logger.log(LogStatus.PASS, "Entering valid username");
        login().password("admin123");
        logger.log(LogStatus.PASS, "Entering valid password");
        login().clickSignInBtn();
        logger.log(LogStatus.PASS, "Clicking Sign in button");

        /* pentru driver-ul de remote
         */
        //Assert.assertEquals(driver_remote.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        /* pentru driver ul de local
         */
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        logger.log(LogStatus.PASS, "HomePage is displayed");
        logger.log(LogStatus.PASS, "HomePage is displayed");
        myInfo().goToPage();
        myInfo().name(name);
        myInfo().middleName(lastname);
        myInfo().driverLicense(license);
        myInfo().licenseDate();
        myInfo().nationality(nationality);
        myInfo().maritalStatus(maritalStatus);
        myInfo().dateofBirth();
        myInfo().gender(gender);
        myInfo().smoker();
        myInfo().save();
//        myInfo().bloodType(bloodType);
    }
}
