package utils;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverClass implements WebDriver {

    WebDriver driver = null;

    public DriverClass(WebDriver driver) {
        this.driver = driver;
    }

    public DriverClass() {

    }

    public DriverClass(WebDriver driver, WebDriver driver1) {
        this.driver = driver;
        this.driver = driver1;
    }

    public void get(String s) {

    }

    public String getCurrentUrl() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public List<WebElement> findElements(By by) {
        return null;
    }

    public WebElement findElement(By by) {
        return null;
    }

    public String getPageSource() {
        return null;
    }

    public void close() {

    }

    public void quit() {
        driver.quit();
    }

    public Set<String> getWindowHandles() {
        return null;
    }

    public String getWindowHandle() {
        return null;
    }

    public TargetLocator switchTo() {
        return null;
    }

    public Navigation navigate() {
        return null;
    }

    public Options manage() {
        return null;
    }

    public void waitForElementToBeClickable(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(ele));
    }

   /* public void waitForElementToBeVisible(WebElement ele){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated())
    }*/

    public void waitForStaleElementToDisappear(WebElement ele){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.stalenessOf(ele));
    }

    public void waitForElementToDisappear(WebElement ele){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated((By) ele)));
    }


    public void waitForPageToLoad(WebDriver driver) {
        ExpectedCondition<Boolean> javascriptDone = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                try {
                    return ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete");
                } catch (Exception e) {
                    return Boolean.FALSE;
                }
            }
        };
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(javascriptDone);
    }

    public void clickOnElement(WebElement ele) {
        ele.click();
    }
}
