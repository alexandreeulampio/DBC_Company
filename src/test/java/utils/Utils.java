package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class Utils {
    private static InitBrowser browser=InitBrowser.getInstance();
    private static WebDriver driver;


    public static void wait(int tempo) {
        driver.manage().timeouts().implicitlyWait(tempo, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver(String url) {
        driver = browser.openBrowser();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
