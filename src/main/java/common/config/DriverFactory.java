package common.config;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.ReadingFile;

import java.io.IOException;

public class DriverFactory {
    public static ExtentTest logger;
    public static ExtentReports report;

    public static final String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public static WebDriver driver = null;

    @BeforeMethod(alwaysRun = true)
    public static void setUp(ITestContext context) {

            System.setProperty("webdriver.chrome.driver", /*"src/test/resources/drivers/chromedriver.exe"*/ getChromeDriverPath() + "\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(URL);
            context.setAttribute("WebDriver", driver);

    }

//    @AfterMethod(alwaysRun = true)
//    public void tearDown() {
////        driver.close();
//    }

    public void reportLog(String message) {
        Reporter.log(message);
    }

    private static String getChromeDriverPath() {
        return System.getProperty("user.dir");
    }
}
