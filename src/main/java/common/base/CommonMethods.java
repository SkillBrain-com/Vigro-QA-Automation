package common.base;

import common.config.DriverFactory;
import common.constants.CommonConstants;
import common.enums.EnviromentErrorMessages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;

public class CommonMethods {
    protected WebDriver driver;
    public CommonMethods()  {
        driver = DriverFactory.driver;
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
        //locator.clear();
        locator.sendKeys(inputText);
    }

    protected String getUrl() {
        return driver.getCurrentUrl();
    }
    protected void clear(WebElement locator) {
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

    protected void moveElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
}
