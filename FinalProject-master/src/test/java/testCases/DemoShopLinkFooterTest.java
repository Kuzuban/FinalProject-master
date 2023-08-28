package testCases;
import Pages.ClickOnProductsPage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.BasePage;
import org.testng.Assert;

public class DemoShopLinkFooterTest extends BasePage {

    private ClickOnProductsPage clickOnProductsPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        clickOnProductsPage = new ClickOnProductsPage(driver);
    }

    @Test
    public void DemoShopLinkFooter() throws InterruptedException {

        clickOnProductsPage.ClickOnFirstProduct();

        driver.findElement(By.cssSelector("#root > div > div:nth-child(3) > nav > nav > div > div > a")).click();

        String elem;
        elem = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(1) > div > div > div > h1 > small")).getAttribute("innerHTML");

        Assert.assertTrue(elem.contains("Products"));

    }


}
