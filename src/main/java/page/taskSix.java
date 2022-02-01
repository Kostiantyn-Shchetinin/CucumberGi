package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class taskSix extends BasePage{
    public taskSix(WebDriver driver) {
        super(driver);
    }

    public void fillInLogin(String login){
        writeText(By.xpath("//input [@id = 'LoginForm__username']"), login);
    }

    public void fillInPassword(String password){
        writeText(By.xpath("//input [@id = 'LoginForm__password']"), password);
    }

    public void clickTheLoginButton(){
        driver.findElement(By.xpath("//button [@type = 'submit']")).click();
    }

    public void checkIfTheLinkAppeared(){
        isElementDisplayed(By.xpath("//a [@id = 'logout']"));
    }


}
