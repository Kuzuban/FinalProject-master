package testCases;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RefreshButtonTest extends BasePage {

    @Test
    public void RefreshButton() throws InterruptedException {

        driver.findElement(By.cssSelector("#root > div > div:nth-child(3) > nav > div > div > div:nth-child(2) > button")).click();

        String elem;
        elem = driver.findElement(By.cssSelector("#root > div > div:nth-child(3) > nav > div > div > div:nth-child(2) > button")).getAttribute("innerHTML");

        Assert.assertTrue(elem.contains("http://www.w3.org/2000/svg"));

    }


}
