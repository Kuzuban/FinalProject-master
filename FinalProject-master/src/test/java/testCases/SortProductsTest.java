package testCases;
import Pages.BasePage;
import Pages.DropDownListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SortProductsTest extends BasePage {

private DropDownListPage dropDownListPage;

        @BeforeClass
        public void setUp() {
            super.setUp();
            dropDownListPage = new DropDownListPage(driver);
        }
            @Test
                    public void SortProductsZtoA() throws InterruptedException {
dropDownListPage.ClickOnSelectDropDownList();
dropDownListPage.ClickOnZtoA();


                WebElement resultElement = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select > option:nth-child(2)"));
                String actualResultText = resultElement.getText();
                String expectedResultText = "Sort by name (Z to A)";

                Assert.assertEquals(resultElement.getText(), "Sort by name (Z to A)");

            }

    @Test
    public void SortProductsLowtoHigh() throws InterruptedException {

        dropDownListPage.ClickOnSelectDropDownList();
        dropDownListPage.ClickLowtoHigh();

        WebElement resultElement = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select > option:nth-child(3)"));
        String actualResultText = resultElement.getText();
        String expectedResultText = "Sort by price (low to high)";

        Assert.assertEquals(resultElement.getText(), "Sort by price (low to high)");

    }
}
