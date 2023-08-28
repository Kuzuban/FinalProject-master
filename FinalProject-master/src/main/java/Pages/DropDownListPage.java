package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownListPage extends BasePage {

        public DropDownListPage(WebDriver driver) {
            super(driver);
        }
            By SelectDropDownList = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select");
            public void ClickOnSelectDropDownList () {
                driver.findElement(SelectDropDownList).click();
            }

    By SelectZtoA = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select > option:nth-child(2)");
    public void ClickOnZtoA (){driver.findElement(SelectZtoA).click();}


    By SelectLowtoHigh = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select > option:nth-child(2)");
    public void ClickLowtoHigh (){driver.findElement(SelectLowtoHigh).click();}



}
