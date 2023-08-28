package testCases;
import Pages.BasePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.reflect.Array;

public class TryToLoginUserPassGoodTest extends BasePage {

    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        loginPage = new LoginPage(driver);

    }
    @Test
    public void TryToLoginUserPassTest () throws InterruptedException {
        loginPage.ClickOnLoginPage();
        driver.findElement(By.cssSelector("#user-name")).sendKeys("dino");
        driver.findElement(By.cssSelector("#password")).sendKeys("choochoo");
        driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > button")).click();
        WebElement Good = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span > a"));

        String elem;
        elem = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span > a")).getAttribute("innerHTML");

        Assert.assertTrue(elem.contains("dino"));
    }
}
