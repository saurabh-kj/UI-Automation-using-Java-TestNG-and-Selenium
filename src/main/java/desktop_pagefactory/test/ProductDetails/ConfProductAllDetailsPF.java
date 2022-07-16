package desktop_pagefactory.test.ProductDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import java.util.List;

public class ConfProductAllDetailsPF {

    //------------------Configurable Product-------------------------------//

    @FindBy(xpath = "//*[normalize-space()='Kidswear'] | //a[normalize-space()='Kidswear']")
    WebElement category;

    @FindBy(xpath = "//*[@class='ProductTilestyle__ProductName-sc-1bpfvho-3 gZLkfg'] | //*[@class='ProductTilestyle__ProductName-sc-1bpfvho-3 gZLkfg']")
    WebElement Conf_Select_Product;

    @FindBy(xpath = "//*[@id='__next']/div[3]/div[3]/div[1]/h1 | //*[@class='Heading-sc-1ciy20x-0 ihzFTn']")
    WebElement Conf_Product_Name;

    @FindBy(xpath = "//*[@class='Pricestyle__StyledPrice-sc-18r84va-0 gDuavx default'] | //*[@class='Pricestyle__StyledPrice-sc-18r84va-0 gDuavx default']")
    WebElement Conf_Product_Price;

    @FindBy(xpath = "//*[@class='Pricestyle__StyledPrice-sc-18r84va-0 gDuavx grey'] | //*[@class='Pricestyle__StyledPrice-sc-18r84va-0 gDuavx grey']")
    WebElement Conf_Product_Actualprice;

    @FindBy(xpath = "//div[@class='bestPrice']//span[contains(text(),'Best Price:')] | //div[@class='bestPrice']//span[@class='discountedPrice']")
    WebElement Conf_BestPrice;

    @FindBy(xpath = "//*[@type='button'] | //body/div[@id='__next']/div[@class='Productstyle__StyledProduct-sc-1b2alsv-0 gLZlyi']/div[@class='col']/div[@class='offerDetailsstyle__OfferDetailsWrap-sc-58halc-0 RpdCg']/div[2]/div[2]/button[1]")
    WebElement Conf_Coupon_Copy;

    @FindBy(xpath = "//*[@class='Pricestyle__StyledPrice-sc-18r84va-0 gDuavx danger']")
    WebElement Conf_Product_Offer;

    @FindBy(xpath = "//button[normalize-space()='Enter pin code'] | //p[normalize-space()='Know your delivery date?']")
    WebElement Conf_ExpectedDeliveryDate;

    @FindBy(xpath = "//button[@class='addSaveToBagstyle__SaveToBag-sc-ims6j7-1 ixbjmb'] | //button[@class='addSaveToBagstyle__SaveToBag-sc-ims6j7-1 ixbjmb']")
    WebElement Conf_SaveButton;

    @FindBy(xpath = "//button[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ'] | //button[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ']")
    WebElement Conf_AddtoBag;

    @FindBy(xpath = "//div[@class='TrellForYoustyle__StyledBrandName-sc-mjrr8m-6 dbNHBH'] | //div[@class='TrellForYoustyle__StyledBrandName-sc-mjrr8m-6 dbNHBH']")
    WebElement Conf_BrandName;

    @FindBy(xpath = "//div[contains(text(),'Expiry')]")
    WebElement Conf_Expiry;

    @FindBy(xpath = "//h2[normalize-space()='About The Product'] | //h2[normalize-space()='About The Product']")
    WebElement Conf_AboutProduct;

    @FindBy(xpath = "//h2[normalize-space()='Specifications'] | //h2[normalize-space()='Specifications']")
    WebElement Conf_Specification;

    @FindBy(xpath = "//h2[normalize-space()='What Makes it Special']")
    WebElement Conf_WhatMakeitSpecial;

    @FindBy(xpath = "//span[contains(text(),'Good To Know')]")
    WebElement Conf_GoodtoKnow;

    @FindBy(xpath = "//h2[normalize-space()='How To Use?']")
    WebElement Conf_HowtoUse;

    @FindBy(xpath = "//h2[normalize-space()='Product Authenticity'] | //h2[normalize-space()='Product Authenticity']")
    WebElement Conf_ProductAuthenticity;

    @FindBy(xpath = "//*[contains(@class,'TrellForYoustyle__StyledReturnDetails-sc-mjrr8m-22 bLLAlt')] | //div[@class='TrellForYoustyle__StyledReturnPolicyTitle-sc-mjrr8m-19 famXkJ']")
    WebElement Conf_ReturnProduct;

    @FindBy(xpath = "//div[contains(text(),'COD Available')] | //div[@class='TrellForYoustyle__StyledReturnPolicyTitle-sc-mjrr8m-19 famXkJ']")
    WebElement Conf_Cod;

    @FindBy(xpath = "//*[contains(.,'Similar Products')] | //span[@class='headTitle']")
    WebElement Conf_SimilarProduct;

    @FindBy(xpath = "//*[.='Customer also bought']")
    WebElement Conf_Customer_Also_Bought;

    @FindBy(xpath = "//p[normalize-space()='Additional Information'] | //p[normalize-space()='Additional Information']")
    WebElement Conf_AdditionalInfo;

    @FindBy(xpath = "//*[contains(.,'Hand Washes')] | //*[contains(.,'Kidswear')]")
    WebElement Conf_Breadcrumbs;

    @FindBy(xpath = "//img[@alt='logo']")
    WebElement Conf_Go_To_Home;

    //----------------------------------------------///
    @FindBy(xpath = "//span[contains(text(),'Sign Out')]")
    WebElement btn_logout;

    @FindBy(xpath = "//button[normalize-space()='Add to Bag']")
    WebElement btn_addproduct;

    @FindBy(xpath = "(//*[name()='path'][@fill-rule='evenodd'])['+counter+']")
    WebElement btn_OOS;

    @FindBy(xpath = "(//span[@class='RadioGroupstyle__StyledChip-sc-1j4p2bd-1 hmUnUy'])['+counter+']")
    WebElement btn_OOSA;

    @FindBy(xpath = "(//span[@class='RadioGroupstyle__StyledChip-sc-1j4p2bd-1 hmUnUy'])['+counter+']")
    WebElement btn_OOSB;

    @FindBy(xpath = "(//span[@class='RadioGroupstyle__StyledChip-sc-1j4p2bd-1 hmUnUy'])['+counter+']")
    WebElement btn_OOSC;
    //--------------------Products-------------------------------------//
    @FindBy(xpath = "//a[normalize-space()='Kidswear']")
    WebElement mekup;

    @FindBy(xpath = "//button[normalize-space()='View 4 Sizes']")
    WebElement nail_pant;

    @FindBy(xpath = "//div[@id='1']//div[1]//div[2]//button[1]")
    WebElement Colour_shade;

    @FindBy(xpath = "//a[normalize-space()='Kidswear']")
    WebElement kids_wear;

    @FindBy(xpath = "//h2[normalize-space()='Trell Fashion HSR']")
    WebElement select_kids_wear_product;

    @FindBy(xpath = "//a[normalize-space()='Fashion']")
    WebElement fashion;

    @FindBy(xpath = "//h2[normalize-space()='TestConifStaging1']")
    WebElement select_dress;

    @FindBy(xpath = "//button[text()='Add to Bag'] | //span[text()='Add to Bag']")
    public
    WebElement btn_AddProductbutton;

    @FindBy(xpath = "//a[normalize-space()='Health & Wellness']")
    public static
    WebElement btn_CatHealthWellness;


//----------------------Back To Home Page---------------------------//

    @FindBy(xpath = "//img[@alt='Logo']")
    WebElement back_to_home;

    //--------------------------------------//
    WebDriver driver;

    public ConfProductAllDetailsPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }
    //------------------configurabale product-----------------------------//
    public void Fashion() {
        category.click();
    }
    public void Conf_SelectProduct() {
        Conf_Select_Product.click();
    }
    public void Conf_Product_Name() {
        try{
            Conf_Product_Name.isDisplayed();
        }catch (Exception e){
            return;
        }
    }

    public void Colour(){
        Colour_shade.click();
    }
    public void Conf_Product_Price() {
        try{
            Conf_Product_Price.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_BestPrice() {
        try{
            Conf_BestPrice.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_Coupon_Copy() {
        try{
            Conf_Coupon_Copy.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_ProductActualPrice() {
        try{
            Conf_Product_Actualprice.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_Product_Offer() {
        try{
            Conf_Product_Offer.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_ExpectedDeliveryDate() {
        try{
            Conf_ExpectedDeliveryDate.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_SaveButton() {
        try{
            Conf_SaveButton.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_AddToBag() {
        try{
            Conf_AddtoBag.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_BrandName() {
        try{
            Conf_BrandName.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_Expiry() {
        try{
            Conf_Expiry.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_AboutProduct() {
        try{
            Conf_AboutProduct.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_Specification() {
        try{
            Conf_Specification.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_WhatmakeItSpecial() {
        try{
            Conf_WhatMakeitSpecial.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_GoodtoKnow() {
        try{
            Conf_GoodtoKnow.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_HowToUse() {
        try{
            Conf_HowtoUse.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_ProductAuthenticity() {
        try{
            Conf_ProductAuthenticity.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_ReturnProduct() {
        try{
            Conf_ReturnProduct.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_Cod() {
        try{
            Conf_Cod.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_SimilarProduct() {
        try{
            Conf_SimilarProduct.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_Customer_Also_Bought() {
        try{
            Conf_Customer_Also_Bought.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_AdditionalInfo() {
        try{
            Conf_AdditionalInfo.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Conf_Breadcrumbs() {
        try{
            Conf_Breadcrumbs.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void conf_go_to_home() {
        Conf_Go_To_Home.isDisplayed();
    }
    //-----------validation------------------//
    public void plp_page_validation_conf() {
//        Fashion.click();
        Assert.assertTrue(category.isDisplayed());
        System.out.println(category.isDisplayed());
    }

    public void pdp_validation_conf() {
        System.out.println(Conf_Product_Name.getText());
        Assert.assertTrue(Conf_Product_Name.isDisplayed());
        System.out.println(Conf_Product_Name.isDisplayed());
    }

    //-----------------------------------------//
    public void Mekup(){
        mekup.click();
    }
    public void NailPant(){
        nail_pant.click();
    }
    public void KidsWear(){
        kids_wear.click();
    }
    public void SelectKidsWearProduct(){
        select_kids_wear_product.click();
    }
//    public void Fashion(){
//        fashion.click();
//    }
    public void SelectDress(){
        select_dress.click();
    }
    //----------------------Back To Home Page---------------------------//
    public void BackToHome(){
        back_to_home.click();
    }

    public void SelectColourShade() throws InterruptedException {

        List<WebElement> childs = driver.findElements(By.cssSelector(".Colorsstyle__StyledColorItemsContainer-sc-1ppjtcx-2.dnfjEy")); //Change the class here based on Variant list classes
        System.out.println("Total number of variants in this product page: " + childs.size());
        try {

            if(btn_OOS.isDisplayed() == true) {
                int counter = 1;
                do {
                    childs.get(counter++).click();
                    System.out.println("Hi Count"+counter);
                } while (!btn_addproduct.getText().equals("Add to Bag") && counter < childs.size());
                if (btn_addproduct.isDisplayed() == true) {
                    btn_addproduct.click();
                } else {
                    System.out.println("All child products are Out of Stocks. Try with other product.");
                }
            }else{
                btn_addproduct.click();
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("All child products are Out of Stocks. Try with other product.");
        }


    }

    public void SelectColourType() throws InterruptedException {

        List<WebElement> childs = driver.findElements(By.cssSelector(".RadioGroupstyle__StyleWrap-sc-1j4p2bd-5.ePWcWt")); //Change the class here based on Variant list classes
        System.out.println("Total number of variants in this product page: " + childs.size());
        try {

            if(btn_OOSA.isDisplayed() == true) {
                int counter = 0;
                do {
                    childs.get(counter++).click();
                    System.out.println("Hi Count"+counter);
                    btn_OOSA.click();
                } while (!btn_addproduct.getText().equals("Add to Bag") && counter < childs.size());
                if (btn_addproduct.isDisplayed() == true) {
                    btn_addproduct.click();
                } else {
                    System.out.println("All child products are Out of Stocks. Try with other product.");
                }
            }else{
                btn_addproduct.click();
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("All child products are Out of Stocks. Try with other product.");
        }


    }

    public void SelectSize() throws InterruptedException {

        List<WebElement> childs = driver.findElements(By.xpath("(//div[@class='RadioGroupstyle__StyleWrap-sc-1j4p2bd-5 ePWcWt'])[1]")); //Change the class here based on Variant list classes
        System.out.println("Total number of variants in this product page: " + childs.size());
        try {

            if(btn_OOSA.isDisplayed() == true) {
                int counter = 0;
                do {
                    childs.get(counter++).click();
                    System.out.println("Hi Count"+counter);
                    btn_OOSB.click();
                } while (!btn_addproduct.getText().equals("Add to Bag") && counter < childs.size());
                if (btn_addproduct.isDisplayed() == true) {
                    btn_addproduct.click();
                } else {
                    System.out.println("All child products are Out of Stocks. Try with other product.");
                }
            }else{
                btn_addproduct.click();
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("All child products are Out of Stocks. Try with other product.");
        }


    }


    public void SelectDressSize() throws InterruptedException {

        List<WebElement> childs = driver.findElements(By.cssSelector(".RadioGroupstyle__StyleWrap-sc-1j4p2bd-5.ePWcWt")); //Change the class here based on Variant list classes
        System.out.println("Total number of variants in this product page: " + childs.size());
        try {

            if(btn_OOSA.isDisplayed() == true) {
                int counter = 0;
                do {
                    childs.get(counter++).click();
                    System.out.println("Hi Count"+counter);
                    btn_OOSC.click();
                } while (!btn_addproduct.getText().equals("Add to Bag") && counter < childs.size());
                if (btn_addproduct.isDisplayed() == true) {
                    btn_addproduct.click();
                } else {
                    System.out.println("All child products are Out of Stocks. Try with other product.");
                }
            }else{
                btn_addproduct.click();
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("All child products are Out of Stocks. Try with other product.");
        }


    }

}
