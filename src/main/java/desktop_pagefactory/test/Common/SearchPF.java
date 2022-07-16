package desktop_pagefactory.test.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import utils.DriverClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchPF extends DriverClass {

    @FindBy(xpath = "//*[@id='__next']/div[1]/div/div/div[2]/div/div[2]/input")  //when SSR is on
    WebElement search_field;

    @FindBy(xpath = "//div[@class='trendingItems']/button")
    List<WebElement> trendingItem;

    @FindBy(xpath = "//h1[@class='headTitle']")
    WebElement pageTitle;

    @FindBy(xpath = "//ul[@class='suggestedCategory']/button")
    WebElement aggregationBrand;

    //-----------drop-down option------------------//

    @FindBy(xpath = "//a[@class='suggesstionLink']")
    WebElement view_all_elements;



    //---------------Home Page--------------------//

    @FindBy(xpath = "//a[@href='/?root=nav']") //with SSR
    WebElement back_to_home;

    final WebDriver driver;
    public SearchPF(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

    }

    //-----search------//
    public void search() throws InterruptedException {
        try{
            Thread.sleep(3000);
            search_field.click();
        }catch (Exception e){
            driver.navigate().refresh();
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
            search_field.click();
        }

        System.out.println("Search input field clicked");
    }

    //-------Trending Search Items-------------//
    public void trendingItems() throws InterruptedException {
        Thread.sleep(4000);
        search();
        Thread.sleep(2000);
        List<WebElement> buttons = driver.findElements(By.xpath("//button[@class='categoryLink']"));
        System.out.println("Total trending search items are: " + buttons.size());
        for(int i = 0 ; i < trendingItem.size(); i++){
            waitForElementToBeClickable(trendingItem.get(i));
            trendingItem.get(i).click();
            Thread.sleep(3000);
            System.out.println("User is navigated to trending item: " + pageTitle.getText());
            driver.navigate().back();
            Thread.sleep(5000);
            search();
        }
    }

    //-----------search brand-------------//
    public void searchByBrandName(){
        search_field.sendKeys("lakme");
        waitForElementToBeClickable(aggregationBrand);
    }

    public void pressEnterBtn() throws InterruptedException {
        aggregationBrand.click();
        Thread.sleep(5000);
    }

    public void searchBrandByWrongName() throws InterruptedException {
        searchAnyTerm("lakhme");
        waitForElementToBeClickable(aggregationBrand);
    }


    //-----------view all details button showing------------------//
    public void searchProductForViewAllDetailsButton() throws InterruptedException {
        search();
        searchAnyTerm("shampoo");
        waitForElementToBeClickable(aggregationBrand);
    }

    public void viewAllElementsDisplay() {
        view_all_elements.isDisplayed();
    }
    public void viewAllElementShow(){
        waitForElementToBeClickable(aggregationBrand);
        view_all_elements.click();
    }


    //---------------Back to Home--------------------------//
    public void backToHome() throws InterruptedException {
        Thread.sleep(3000);
        back_to_home.click();
    }



//-----------Validations-------------------------------//
    //-----------Search Field------------//
    public void search_validation(){
        Assert.assertTrue(search_field.isEnabled());
        System.out.println(search_field.isEnabled());
    }
    //------For all available Trending Items------------//
    public void trendingItemValidations(){
        for(int i = 0 ; i < trendingItem.size(); i++){
            Assert.assertTrue(trendingItem.get(i).isEnabled());
            System.out.println(trendingItem.get(i).isEnabled());
        }
    }

    //-----------For Search Result Page-----------//
    public void searchResultPageValidation(){
        System.out.println("Current page is: " + pageTitle.getText());
    }

    //-----------Search product and Add to Bag-----------//
    public void searchAnyTerm(String term) throws InterruptedException {
        driver.navigate().refresh();
        search();
        search_field.sendKeys(term);
    }
}