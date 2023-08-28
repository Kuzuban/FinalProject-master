package testCases;
import Pages.ClickOnProductsPage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.BasePage;
import org.testng.Assert;

public class RemoveProductFromCartTest extends BasePage {

    private ClickOnProductsPage clickOnProductsPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        clickOnProductsPage = new ClickOnProductsPage(driver);
    }

    @Test
    public void RemoveProductFromCartTest() throws InterruptedException {

        clickOnProductsPage.ClickOnFirstProduct();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div > div.col.col-lg-2.text-center.col > button:nth-child(2) > svg")).click();
        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg")).click();
driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-1.row-cols-lg-1.row-cols-md-1.row-cols-sm-1.row-cols-1 > div > div > div > div:nth-child(5) > button > svg > path")).click();


        String elem;
        elem = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div.text-center.container")).getAttribute("innerHTML");
        Assert.assertEquals("How about adding some products in your cart?", elem);
    }

}