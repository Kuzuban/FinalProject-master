package testCases;

import Pages.BasePage;
import Pages.DropDownListPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchWithBugTest extends BasePage {

    private DropDownListPage dropDownListPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        dropDownListPage = new DropDownListPage(driver);
    }

    @Test
    public void SearchWithBug() throws InterruptedException {
        driver.findElement(By.cssSelector("#input-search")).sendKeys("Practical");
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(1) > button")).click();
        dropDownListPage.ClickOnSelectDropDownList();
        dropDownListPage.ClickOnZtoA();


        String elem;
        elem = driver.findElement(By.cssSelector(" #root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div > div > div.text-center.card-body > a")).getAttribute("innerHTML");
        Assert.assertTrue(elem.contains("Practical Metal Mouse"));


    }

}
