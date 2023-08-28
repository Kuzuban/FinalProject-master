package Pages;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By Login = By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span > button");

    public void ClickOnLoginPage() {
        driver.findElement(Login).click();

    }

}
