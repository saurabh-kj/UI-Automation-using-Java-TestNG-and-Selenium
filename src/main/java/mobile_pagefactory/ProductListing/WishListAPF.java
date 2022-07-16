package mobile_pagefactory.ProductListing;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class WishListAPF {



    @FindBy(xpath="//header/div[@id='navigationHeader']/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement hair;

    @FindBy(xpath="//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/article[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/img[2]")
    WebElement hairpfor;

    @FindBy(xpath="//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[2]/div[5]/button[1]")
    WebElement addbag;

    @FindBy(xpath="//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[2]/div[5]/button[1]")
    WebElement rembag;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/header[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement btn_MakeupBusinessGroupName;

    @FindBy(xpath = "(//span[@class='ProductTilestyle__WishListIcon-sc-1bpfvho-13 bPyhqf'])[1]")
    WebElement Btn_AddProductToWishListBag;

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/span[3]")
    WebElement btn_ProfileOnUsername;

    @FindBy(xpath = "//a[contains(text(),'My Wish List')]")
    WebElement btn_MyWishList;

    @FindBy(xpath = "//span[contains(text(),'Add to Bag')]")
    WebElement btn_addproduct;

    @FindBy(xpath = "//span[contains(text(),'View Bag')]")
    WebElement btn_viewbag;

    @FindBy(xpath = "//span[contains(text(),'Insight Cosmetics Nail Polish Remover Wipes - 30 S')]")
    WebElement btn_CLickOnProduct;

    @FindBy(xpath = "//span[contains(text(),'Proceed')]")
    WebElement btn_Proceed;

    @FindBy(xpath = "//button[contains(text(),'Nivea')]")
    WebElement btn_ClickOnQuickFilter;

    @FindBy(xpath = "(//img)[87]")
//    @FindBy(xpath = "(//div)[454]")
    WebElement btn_xmasbanner;

    @FindBy(xpath = "//span[contains(text(),'Out of Stock')]")
    WebElement btn_PickOutOFStockProduct;

    @FindBy(xpath = "//div[contains(text(),'Save')]")
    WebElement btn_SaveButtonOnproductPageWishList;

    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement btn_MyAccount;

    @FindBy(xpath = "//img[@alt='Wishlist Icon']")
    WebElement Btn_MyWishList;






    AppiumDriver driver;
    public WishListAPF(AppiumDriver driver) {
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        //PageFactory.initElements(driver, ProductDetailsPF.class)
    }

    public void hair() {
        hair.click();
    }
    public void hairfor() {
        hairpfor.click();
    }
    public void addbag() {
        addbag.click();
    }
    public void removefrombag() {
        rembag.click();
    }

    public void ClickAddToWishList() {
        Btn_AddProductToWishListBag.click();

    }

    public void ClickOnBusinessGroup() throws InterruptedException {
        System.out.println("Iam inside the step of home page methods");
        Thread.sleep(5000);
        btn_MakeupBusinessGroupName.click();
    }

    public void ClickMyWishList() {
        btn_ProfileOnUsername.click();
        btn_MyWishList.click();

    }
    public void AddProductsInClick() {
        btn_addproduct.click();
        btn_viewbag.click();

    }

    public void PDPPageClick() {
        btn_CLickOnProduct.click();


    }

    public void ClickOnCheckOut() {
        btn_Proceed.click();

    }
    public void OutOfStock() {
        btn_ClickOnQuickFilter.click();
        btn_PickOutOFStockProduct.click();
    }

    public void EmptyWishList() throws InterruptedException {
        Thread.sleep(3000);
        btn_xmasbanner.click();
        System.out.println("EmptyWishList Validation Product should not be added to whish-list and colour of whish-list icon should not be change in to orrange");


    }

    public void WishListFromProductPage() throws InterruptedException {
        Thread.sleep(4000);
        btn_SaveButtonOnproductPageWishList.click();
        driver.navigate().back();
    }

    public void MyAccountWishList(){
        btn_MyAccount.click();
        btn_MyWishList.click();
    }

}
