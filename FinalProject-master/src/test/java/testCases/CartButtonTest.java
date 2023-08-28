package testCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartButtonTest extends BasePage {

    @Test
    public void CartButton() throws InterruptedException {

        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg > path")).click();

        String elem;
        elem = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div.text-center.container")).getAttribute("innerHTML");

        Assert.assertTrue(elem.contains("How about adding some products in your cart?"));
    }

    }
