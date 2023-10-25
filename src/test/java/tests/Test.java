package tests;

import driverFactory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test {
    static WebDriver driver = DriverFactory.setUp();

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.saucedemo.com/v1/index.html");
        //s-a deschis o instanta de chrome; in consola de la IJ apare mesajul ChromeDriver was started successfully

        System.out.println(driver.getTitle());
        //retrieve the title of the current webpage---> ca o masura suplimentara ca Selenium a lucrat conform asteptarilor

        Thread.sleep(3000);

        loginPage(driver);

        Assert.assertEquals("https://www.saucedemo.com/v1/inventory.html", driver.getCurrentUrl());

        String[] numeProduseDorite = {"Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Fleece Jacket", "Sauce Labs Onesie"};
        List<WebElement> listaProduse = driver.findElements(By.xpath("//div[@class='inventory_item']//div[@class='inventory_item_label']//div[@class='inventory_item_name']"));
        addProduse(driver, numeProduseDorite, listaProduse);

        driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
        Thread.sleep(3000);
        Assert.assertEquals("https://www.saucedemo.com/v1/cart.html", driver.getCurrentUrl());

        List<WebElement> listaProduseSelectata = driver.findElements(By.xpath("//div[@class='cart_list']//div[@class='cart_item']//button"));
        List<WebElement> listaProduseRamasa = driver.findElements(By.xpath("//div[@class='cart_list']//div[@class='cart_item']//button"));
        int indexRandom = new Random().nextInt(listaProduseSelectata.size());

        produsRandomRemoved(driver, listaProduseSelectata, indexRandom);
        Thread.sleep(5000);
        validareFunctionalitate(listaProduseSelectata, listaProduseRamasa);

        driver.quit();
    }

    public static void loginPage(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).click();
        Thread.sleep(3000);
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).click();
        Thread.sleep(3000);
        WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    public static void produsRandomRemoved(WebDriver driver, List<WebElement> lista, int index) throws InterruptedException {
        WebElement randomButonRemove = lista.get(index);
        randomButonRemove.click();
        Thread.sleep(3000);
    }

    public static void validareFunctionalitate(List<WebElement> listaPS, List<WebElement> listaPR) {
        if (listaPS.size() != listaPR.size()) {
            System.out.println("Acesta functionalitate a decurs asa cum ne-am asteptat!");
        } else {
            System.out.println("Ceva nu a mers bine. De verificat!");
        }
    }

    public static void addProduse(WebDriver driver, String[] numeProduse, List<WebElement> listaProduse) throws InterruptedException {
        List<String> numeProduseAsList = Arrays.asList(numeProduse);
        Thread.sleep(3000);

        int count = 0;
        for (int i = 0; i < listaProduse.size(); i++) {
            String numeProdus = listaProduse.get(i).getText();
            //System.out.println(numeProdus); a fost folosit pentru verificarea textului
            if (numeProduseAsList.contains(listaProduse.get(i).getText())) {
                count++;
                Thread.sleep(1000);
                WebElement elem = driver.findElements(By.xpath("//div[@class='inventory_item']//button")).get(i);
                elem.click();
                if (count == numeProduse.length) {
                    break;
                }
            }
        }
    }
}
