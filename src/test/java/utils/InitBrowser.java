package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitBrowser {
    private static InitBrowser instance=null;
    private WebDriver driver;

    private InitBrowser(){

    }

    public WebDriver openBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static InitBrowser getInstance(){
        if(instance==null){
            instance = new InitBrowser();
        }
        return instance;
    }

    public void close() {
        driver.close();
    }
}
