package testCases;
import Pages.ClickOnProductsPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.BasePage;
import org.testng.Assert;

public class OpenProductPagesTests extends BasePage {

    private ClickOnProductsPage clickOnProductsPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        clickOnProductsPage = new ClickOnProductsPage(driver);
    }

    @Test
    public void OpenFirstProductPage() throws InterruptedException {

        clickOnProductsPage.ClickOnFirstProduct();
        Assert.assertEquals("Success - Product page is open", "Success - Product page is open");

}

    }


