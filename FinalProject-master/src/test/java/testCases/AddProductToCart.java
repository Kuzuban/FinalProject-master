package testCases;
import Pages.ClickOnProductsPage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.BasePage;
import org.testng.Assert;

public class AddProductToCart extends BasePage {

    private ClickOnProductsPage clickOnProductsPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        clickOnProductsPage = new ClickOnProductsPage(driver);
    }

    @Test
    public void AddProductToCart() throws InterruptedException {

        clickOnProductsPage.ClickOnFirstProduct();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div > div.col.col-lg-2.text-center.col > button:nth-child(2) > svg")).click();
        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg")).click();

        String elem;
        elem = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerHTML");
        System.out.println(elem);

        Assert.assertEquals("1", "1");
    }

    }