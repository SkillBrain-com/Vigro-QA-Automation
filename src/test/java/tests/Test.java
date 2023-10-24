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
        System.out.println(DriverFactory.setUp().getTitle());
        //retrieve the title of the current webpage---> ca o masura suplimentara ca Selenium a lucrat conform asteptarii
        Thread.sleep(3000);
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
        Assert.assertEquals("https://www.saucedemo.com/v1/inventory.html", driver.getCurrentUrl());

        String[] numeProduse = {"Backpack", "Light", "Bolt", "Onesie"}; //am ales 4 produse care contin aceste nume

        List<String> numeProduseAsList = Arrays.asList(numeProduse);
        Thread.sleep(3000);
        List<WebElement> listaProduse = driver.findElements(By.xpath("//div[@class='inventory_item']//div[@class='inventory_item_label']//div[@class='inventory_item_name']"));
        int count = 0;
        for (int i = 0; i < listaProduse.size(); i++) {
            String numeProdus = listaProduse.get(i).getText();
            System.out.println(listaProduse.get(i).getText());
            if (numeProduseAsList.contains(listaProduse.get(i).getText())) {
                count++;
                Thread.sleep(5000);
                WebElement elem = driver.findElements(By.xpath("//div[@class='inventory_item']//button")).get(i);
                elem.click();
                /*
                nu imi da click pe niciunul din cele 4 butoane pentru produsele selectate din lista ca sa pot
                sa le comand pe site. De ce oare? Mersi!
                 */
                if (count == numeProduse.length) {
                    break;
                }
            }
        }

//        driver.findElement(By.xpath("(//div[@class='inventory_item']//button)[1]")).click();
//        driver.findElement(By.xpath("(//div[@class='inventory_item']//button)[2]")).click();
//        driver.findElement(By.xpath("(//div[@class='inventory_item']//button)[3]")).click();
//        driver.findElement(By.xpath("(//div[@class='inventory_item']//button)[4]")).click();
//        driver.findElement(By.xpath("(//div[@class='inventory_item']//button)[5]")).click();
//        driver.findElement(By.xpath("(//div[@class='inventory_item']//button)[6]")).click();
//        driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
//        Thread.sleep(3000);
//        Assert.assertEquals("https://www.saucedemo.com/v1/cart.html", driver.getCurrentUrl());
//
//        List<WebElement> listaProduseSelectata = driver.findElements(By.xpath("//div[@class='cart_list']//div[@class='cart_item']//button"));
//        int index = new Random().nextInt(6) + 1;
//        WebElement randomButonRemove = listaProduseSelectata.get(index);
//        randomButonRemove.click();
//        Thread.sleep(3000);
//
//        List<WebElement> listaProduseRamasa = driver.findElements(By.xpath("//div[@class='cart_list']//div[@class='cart_item']//button"));
//
//        if (listaProduseSelectata.size() != listaProduseRamasa.size()) {
//            System.out.println("Acesta functionalitate a decurs asa cum ne-am asteptat!");
//        }

        //driver.quit(); //terminate the WebDriver session.
    }
}
