package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    //the method is made to wait visibility of the element located By
    public void waitVisibilityOfElement(By elementBy){
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    //Click method is made to click the element located By
    public void click(By elementBy){
        waitVisibilityOfElement(elementBy);
        driver.findElement(elementBy).click();
    }

    //is element located By displayed
    public void isElementDisplayed(By elementBy){
        waitVisibilityOfElement(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }

    //Waiting until the element is clickable
    public void waitClickable(By elementBy){
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    //Filling the field with a specific string text
    public void writeText(By elementBy, String text){
        isElementDisplayed(elementBy);
        WebElement element = driver.findElement(elementBy);
        element.clear();
        element.sendKeys(text);
    }

    //Checking that the element is truly not displayed
    public void isElementNotDisplayed(By elementBy){
        assertTrue(driver.findElements(elementBy).isEmpty());
    }

    //Checking if the alert appears and getting the text of the alert
    public void textOfTheAlert(String message){
        assertEquals(message, driver.switchTo().alert().getText());
    }
}
