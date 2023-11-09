package common.base;

import common.config.DriverFactory;
import common.constants.CommonConstants;
import common.enums.EnviromentErrorMessages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CommonMethods {

    public String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    protected WebDriver driver = DriverFactory.setUp();
    public CommonMethods() {
        PageFactory.initElements(driver, this);
    }

    protected WebElement find(WebElement locator) {
        waitPage().until(ExpectedConditions.visibilityOf(locator));
        return locator;
    }

    protected void click(WebElement locator) {
        clickAble(locator).click();
    }

    protected WebElement returnElementFromList(List<WebElement> elements, String option) {
        for (WebElement element : elements) {
            if (element.getText().equalsIgnoreCase(option)) {
                return element;
            }
        }
        return (WebElement) new NoSuchElementException("Element is not available in the list.");
    }
    protected void addText(String inputText, WebElement locator) {
        clear(locator);
        locator.sendKeys(inputText);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
    private void clear(WebElement locator) {
        click(locator);
        if (getOperationSystem().contains("Windows")) {
            locator.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        } else if (getOperationSystem().contains("MAC OS")) {
            locator.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        } else {
            throw new RuntimeException(EnviromentErrorMessages.ERROR_OPERATING_SYSTEM.getErrorMessage());
        }
    }

    private String getOperationSystem() {
        return System.getProperty(CommonConstants.OS_NAME);
    }
    private WebDriverWait waitPage() {
        return new WebDriverWait(driver, CommonConstants.WEB_DRIVER_WAIT_DURATION);
    }
    private WebElement clickAble(WebElement locator) {
        waitPage().until(ExpectedConditions.elementToBeClickable(locator));
        return locator;
    }

    public void openNewTab(){
        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
        driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
    }
}
