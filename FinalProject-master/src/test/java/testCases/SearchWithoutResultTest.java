package testCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchWithoutResultTest extends BasePage {

    @Test
    public void SearchWithoutResult() throws InterruptedException {
        driver.findElement(By.cssSelector("#input-search")).sendKeys("Ana");
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(1) > button")).click();

        String elem;
        elem = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row")).getAttribute("innerHTML");
        Assert.assertFalse(elem.contains("Practical Metal Mouse"));

    }

}