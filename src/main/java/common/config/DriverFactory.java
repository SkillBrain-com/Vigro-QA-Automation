package common.config;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import util.ReadingFile;

import java.io.IOException;

public class DriverFactory {
    public static final String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    private static WebDriver driver = null;
    public static WebDriver setUp() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", /*"src/test/resources/drivers/chromedriver.exe"*/ getChromeDriverPath() + "\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver();
            driver.manage().window().setSize(new Dimension(1920, 1080));
            driver.manage().deleteAllCookies();
            driver.get(URL);
        }
        return driver;
    }

    private static String getChromeDriverPath() {
        return System.getProperty("user.dir");
    }
}
