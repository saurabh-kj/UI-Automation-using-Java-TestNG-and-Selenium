package mobile_pagefactory.ProductListing;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ProductListPageAPF {

    @FindBy(xpath = "//div[contains(text(),'Insight Cosmetics Nail Polish Remover Wipes - 30 S')]")
    WebElement Get_ProductTextOnCartPage;

    @FindBy(xpath = "(//img[@alt='img'])[1]")
    WebElement btn_ClickOnProduct;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/img[1]")
    WebElement btn_ExpertReview;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[2]/div[8]/div[1]")
    WebElement btn_AdditionalInformation;

    @FindBy(xpath = "//span[contains(text(),'Sort')]")
    WebElement btn_sort;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/button[1]/span[2]")
    WebElement clk_BestSeller;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/button[1]/span[2]")
    WebElement clk_Discount;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[3]/button[1]")
    WebElement clk_Relevance;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[4]/button[1]")
    WebElement clk_LowtoHigh;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[5]/button[1]")
    WebElement clk_HightoLow;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[6]/button[1]")
    WebElement clk_AlphabeticallyAZ;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[7]/button[1]")
    WebElement clk_HightoLowZA;

    @FindBy(xpath = "//span[contains(text(),'Filter')]")
    WebElement btn_Filter;

    @FindBy(xpath = "//span[contains(text(),'Biotique')]")
    WebElement select_Brand;

    @FindBy(xpath = "//button[contains(text(),'Category')]")
    WebElement Clk_CategoryBtn;

    @FindBy(xpath = "//button[contains(text(),'Gender')]")
    WebElement Clk_GenderBtn;

    @FindBy(xpath = "//button[contains(text(),'Price')]")
    WebElement Clk_PriceBtn;

    @FindBy(xpath = "//button[contains(text(),'Skin Type')]")
    WebElement Clk_SizeTypeBtn;

    @FindBy(xpath = "//body/div[@id='root']/aside[2]/div[1]/div[2]/div[2]/form[1]/ul[1]/li[1]/button[1]")
    WebElement Choose_Category;

    @FindBy(xpath = "//span[contains(text(),'Female')]")
    WebElement Choose_Gender;

    @FindBy(xpath = "//span[contains(text(),'All Skin types')]")
    WebElement Choose_SizeType;

    @FindBy(xpath = "//span[contains(text(),'200-300')]")
    WebElement Choose_PriceRange;

    @FindBy(xpath = "//span[contains(text(),'Apply')]")
    WebElement btn_apply;

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement btn_SearchField;

    @FindBy(xpath = "//a[contains(text(),'Complete Makeup Collection')]")
    WebElement btn_Category;


    AppiumDriver driver;

    public ProductListPageAPF(AppiumDriver driver) {
        this.driver = driver;

        //PageFactory.initElements(driver, LoginWebPF.class);
        //AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void ValidateBestSellerProduct(){
        System.out.println("Bestsellers produt should be show first then Top-rated then more products should be shown");
    }

    public void ValidateProductPageValidation(){
        System.out.println("All details should be show of products with picure, offers, Add to bag, Save options and similar products should be show in bottm");
    }

    public void ValidateWishListTag(){
        System.out.println("Product should be added to whish-list and colour of whish-list icon should be change in to orrange");

    }

    public void ClickOnProduct(){
        btn_ClickOnProduct.click();
    }

    public void AddProductPageWishListValidation(){
        System.out.println("Product should be Added from whish-list from product page");
    }

    public void RemoveProductPageWishListValidation(){
        System.out.println("Product should be Removed from whish-list from product page");
    }

    public void ExpertReview(){
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Similar Products')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        //actions.click();
        actions.perform();
        btn_ExpertReview.click();

    }
    public void AdditionalInformation(){
        WebElement element = driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[2]/div[8]/div[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        //actions.click();
        actions.perform();
        btn_AdditionalInformation.click();
    }

    public void BestSeller(){
        btn_sort.click();
        clk_BestSeller.click();
        btn_sort.click();
        clk_Discount.click();
        btn_sort.click();
        clk_Relevance.click();

        btn_sort.click();
        clk_HightoLow.click();
        btn_sort.click();
        clk_LowtoHigh.click();
        btn_sort.click();
        clk_AlphabeticallyAZ.click();
        btn_sort.click();
        clk_HightoLowZA.click();

    }

    public void FilterPage(){
        btn_Filter.click();
        select_Brand.click();
        btn_apply.click();


    }

    public void CategoryFilterPage() throws InterruptedException {
        btn_Filter.click();
        Clk_CategoryBtn.click();
        Choose_Category.click();
        btn_apply.click();
        Thread.sleep(5000);


    }
    public void GenderFilterPage() throws InterruptedException {
        btn_Filter.click();
        Clk_GenderBtn.click();
        Choose_Gender.click();
        btn_apply.click();
        Thread.sleep(5000);


    }

    public void PriceFilterPage() throws InterruptedException {
        btn_Filter.click();
        Clk_PriceBtn.click();
        Choose_PriceRange.click();
        btn_apply.click();
        Thread.sleep(5000);


    }
    public void SizeTypeFilterPage() throws InterruptedException {
        btn_Filter.click();
        Clk_SizeTypeBtn.click();
        Choose_PriceRange.click();
        btn_apply.click();
        Thread.sleep(5000);


    }
    public void SearchFieldValue(){
//        btn_SearchField.click();
//        driver.hideKeyboard();
        btn_SearchField.sendKeys("Lotus");
        btn_SearchField.click();
        btn_SearchField.sendKeys("Lotus");
        btn_SearchField.sendKeys(Keys.ENTER);

    }

    public void ClickCategory(){
        btn_Category.click();
    }



}
