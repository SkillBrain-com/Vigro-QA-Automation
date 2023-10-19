package tests;

import driverFactory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Test {
    static WebDriver driver = DriverFactory.setUp();
    public static void main(String[] args) throws InterruptedException {
        DriverFactory.setUp().get("https://www.saucedemo.com/");
        //s-a deschis o instanta de chrome; in consola de la IJ apare mesajul ChromeDriver was started successfully
        System.out.println(DriverFactory.setUp().getTitle());
        //retrieve the title of the current webpage---> ca o masura suplimentara ca Selenium a lucrat conform asteptarii
        Thread.sleep(5000);
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).click();
        Thread.sleep(5000);

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).click();
        Thread.sleep(5000);
        WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Assert.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
        //DriverFactory.setUp().quit(); //terminate the WebDriver session.
    }
}
