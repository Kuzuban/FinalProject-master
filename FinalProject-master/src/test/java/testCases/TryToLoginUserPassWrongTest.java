package testCases;
import Pages.BasePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TryToLoginUserPassWrongTest extends BasePage {

    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        loginPage = new LoginPage(driver);

    }
    @Test
    public void TryToLoginUserPassTest () throws InterruptedException {
        loginPage.ClickOnLoginPage();
        driver.findElement(By.cssSelector("#user-name")).sendKeys("Dragos");
        driver.findElement(By.cssSelector("#password")).sendKeys("dragos");
        driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > button")).click();
        WebElement Error = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > p"));

        String elem;
        elem = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > p")).getAttribute("innerHTML");

        Assert.assertTrue(elem.contains("Incorrect username or password!"));
    }
}
