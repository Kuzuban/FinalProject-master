package Pages;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickOnProductsPage extends BasePage {

    public ClickOnProductsPage(WebDriver driver) {
        super(driver);
    }

    By FirstProduct = By.linkText("Awesome Granite Chips");

    public void ClickOnFirstProduct() {
        driver.findElement(FirstProduct).click();

    }

    By SecondProduct = By.linkText("Awesome Metal Chair");

    public void ClickOnSecondProduct() {
        driver.findElement(SecondProduct).click();

    }

    By ThirdProduct = By.linkText("Awesome Soft Shirt");

    public void ClickOnThirdProduct() {
        driver.findElement(ThirdProduct).click();

    }


    By FourthProduct = By.linkText("Gorgeous Soft Pizza");

    public void ClickOnFourthProduct() {
        driver.findElement(FourthProduct).click();

    }

    By FifthProduct = By.linkText("Incredible Concrete Hat");

    public void ClickOnFifthProduct() {
        driver.findElement(FifthProduct).click();

    }

    By SixthProduct = By.linkText("Licensed Steel Gloves");

    public void ClickOnSixthProduct() {
        driver.findElement(SixthProduct).click();

    }

    By SeventhProduct = By.linkText("Practical Metal Mouse");

    public void ClickOnSeventhProduct() {
        driver.findElement(SeventhProduct).click();

    }

    By EighthProduct = By.linkText("Practical Wooden Bacon");

    public void ClickOnEighthProduct() {
        driver.findElement(EighthProduct).click();

    }

    By NinthProduct = By.linkText("Practical Wooden Bacon");

    public void ClickOnNinthProduct() {
        driver.findElement(NinthProduct).click();

    }

    By TenthProduct = By.linkText("Refined Frozen Mouse");

    public void ClickOnTenthProduct() {
        driver.findElement(TenthProduct).click();

    }

}