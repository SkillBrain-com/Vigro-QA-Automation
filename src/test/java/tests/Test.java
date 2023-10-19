package tests;

import driverFactory.DriverFactory;

public class Test {
    public static void main(String[] args) {
        DriverFactory.setUp().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //s-a deschis o instanta de chrome; in consola de la IJ apare mesajul ChromeDriver was started successfully
        System.out.println(DriverFactory.setUp().getTitle());
        //retrieve the title of the current webpage---> ca o masura suplimentara ca Selenium a lucrat conform asteptarii
        DriverFactory.setUp().quit(); //terminate the WebDriver session.
    }
}
