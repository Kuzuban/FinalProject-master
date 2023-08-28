package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductsToCartPage extends BasePage {

    public AddProductsToCartPage (WebDriver driver) {
        super(driver);
    }

    By AddFirstProduct = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path");

    public void AddFirstProduct() {
        driver.findElement(AddFirstProduct).click();

    }

}
