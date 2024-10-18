package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.DriverSetup.getDriver;

public class BasePage {
    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }

    public void writeOnElement(By locator, String text){
        getElement(locator).sendKeys();
    }

    public String getLoadedPageUrl(){
       return getDriver().getCurrentUrl();
    }

    public String getLoadedPageTitle(){
        return getDriver().getTitle();
    }

    public void submitForm(By locator) { getElement(locator).submit(); }

    public void clearTextBox(By locator) { getElement(locator).clear(); }
}
