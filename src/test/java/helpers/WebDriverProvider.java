package helpers;

import config.ProjectConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    private ProjectConfig config;

    public WebDriverProvider(){
        this.config= ConfigFactory.create(ProjectConfig.class, System.getProperties());
    }
    @Override
    public WebDriver get(){
        WebDriver driver = createWebDriver();
        driver.get(config.getBaseUrl());
        return driver;
    }
    private WebDriver createWebDriver() {
        if (config.getBrowser().equals(Browser.CHROME.toString())) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        if (config.getBrowser().equals(Browser.FIREFOX.toString())) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        throw new RuntimeException("No such browser");
    }

}
