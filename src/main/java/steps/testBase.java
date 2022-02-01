package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import page.Main;
import page.taskSix;

import java.util.concurrent.TimeUnit;

public class testBase {
    WebDriver driver;
    public Main main;
    public taskSix TaskSix;

    public void start(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        main = PageFactory.initElements(driver, Main.class);
        TaskSix = PageFactory.initElements(driver, taskSix.class);
    }

    public void finish(){
        driver.quit();
    }

}
