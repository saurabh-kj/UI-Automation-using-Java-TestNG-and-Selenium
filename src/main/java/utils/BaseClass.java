package utils;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class BaseClass {
    private String browserName;
    private String env;
    private final ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public BaseClass(String env, String browserName) {
        this.env = env;
        this.browserName = browserName;
    }

    public void chromeDriverManager(String env) throws IOException {
        WebDriverFactory webDriverFactory = new WebDriverFactory();

        webDriverFactory.setDriver(this.browserName);
        driver.set(webDriverFactory.getDriver());
        driver.get().get(ReadConfig.getInstance("config-" + env + ".properties").getUrl());
    }

    public void FirefoxDriverManager(String env) throws IOException {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        webDriverFactory.setDriver(this.browserName);
        driver.set(webDriverFactory.getDriver());
        driver.get().get(ReadConfig.getInstance("config-" + env + ".properties").getUrl());
    }


    public WebDriver getDriver() {
        return driver.get();
    }
}
