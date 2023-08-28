package testCases;
import Pages.ClickOnProductsPage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.BasePage;
import org.testng.Assert;

public class CheckoutFieldsTest extends BasePage {

    private ClickOnProductsPage clickOnProductsPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        clickOnProductsPage = new ClickOnProductsPage(driver);
    }

    @Test
    public void CheckoutFields() throws InterruptedException {

        clickOnProductsPage.ClickOnFirstProduct();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div > div.col.col-lg-2.text-center.col > button:nth-child(2) > svg")).click();
        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > a.btn.btn-success")).click();
        driver.findElement(By.cssSelector("#first-name")).sendKeys("TEST");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("TEST");
        driver.findElement(By.cssSelector("#address")).sendKeys("TEST");
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > form > div > div:nth-child(2) > button")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > a.btn.btn-success")).click();

        String elem;
        elem = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.text-center")).getAttribute("innerHTML");

        Assert.assertTrue(elem.contains("Thank you for your order!"));

    }

}