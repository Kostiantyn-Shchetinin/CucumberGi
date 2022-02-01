package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BasePage {
    String SITE_URL = "https://testingcup.pgs-soft.com/";

    public Main(WebDriver driver) {
        super(driver);
    }

    public void goTo(){
        driver.get(SITE_URL);
    }

    public void chooseTask(String taskNumber){
        driver.findElement(By.xpath("//h2 [text() = 'Zadanie "+taskNumber+"']")).click();

    }
}
