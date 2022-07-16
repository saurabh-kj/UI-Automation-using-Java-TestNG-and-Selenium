package mobile_pagefactory.Common;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SearchAPF {
    //-------------Login-----------------//
    @FindBy(xpath = "//button[@class='appInstall-cancelBtnForImage-dWW']")
    WebElement BtnBannerClose;

    @FindBy(xpath = "//p[@class='userName']")
    WebElement btn_login_signup;

    @FindBy(xpath = "//input[@placeholder='Enter Phone Number']")
    WebElement txt_mobileno;

    @FindBy(xpath = "//input[@placeholder='Enter Phone Number']")
    WebElement txt_mobilenoInCheckout;

    @FindBy(xpath = "//button[normalize-space()='Get OTP via SMS']")
    WebElement btn_GetOTP;

    @FindBy(xpath = "//input[@name='otp-value']")
    WebElement txt_otp_value;

    @FindBy(xpath = "//input[@placeholder='Enter OTP']")
    WebElement txt_otp_valueInCheckout;

    @FindBy(xpath = "//button[contains(text(),'Verify Now')]")
    WebElement btn_verify_now;
    //----------------------search----------------------------//
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement searchfield;

    //-----------------------brand------------------------------//
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement brand;

    @FindBy(xpath = "//p[normalize-space()='Lakme']")
    WebElement lakmi;

    @FindBy(xpath = "//p[normalize-space()='Wow']")
    WebElement wow;

    @FindBy(xpath = "//p[normalize-space()='Mamaearth']")
    WebElement mamaearth;

    @FindBy(xpath = "//p[normalize-space()='Maybelline'] | //p[normalize-space()='Mamaearth']")
    WebElement maybelline;

    @FindBy(xpath = "//p[normalize-space()='Garnier']")
    WebElement garnier;

    @FindBy(xpath = "//p[normalize-space()='Lotus'] | //p[normalize-space()='Lakme']")
    WebElement lotus;
    //-----------------------Product for body parts------------------------------//

    @FindBy(xpath = "//p[normalize-space()='Hair']")
    WebElement hair_product;

    @FindBy(xpath = "//p[normalize-space()='Lip'] | //p[normalize-space()='Lotus']")
    WebElement lip_product;

    @FindBy(xpath = "//p[normalize-space()='Face']")
    WebElement face_product;
    //----------------------back page--------------------------//
    @FindBy(xpath = "//div[@class='mobileSearchBar__backButton']//button[@type='button']//*[name()='svg']")
    WebElement back_page;
    //-------------------------Product Suggestions for wrong typing---------------------//
    @FindBy(xpath = "//input[@id='searchbox']")
    WebElement wrong_typing;

    @FindBy(xpath = "//input[@placeholder='Search for brands, products and more...']")
    WebElement txt_WrongType;
    //--------------------- brand name showing -----------------------//
    @FindBy(xpath = "//input[@id='searchbox']")
    WebElement brand_name_typing;
    @FindBy(xpath = "//div[@class='resultTitle'][normalize-space()='Lakme']")
    WebElement brand_name_showing;
    //-------------- Product name showing with brand typing brand name product with price offers--------------//

    @FindBy(xpath = "//div[contains(text(),'Lakme Face Sheer Blusher')]")
    WebElement product_name_with_brand1;

    @FindBy(xpath = "//div[contains(text(),'Lakme Eyebrow Pencil, Black, 1.2gm')]")
    WebElement product_name_with_brand2;

    @FindBy(xpath = "//button[2]//div[2]//div[2]//span[1]")
    WebElement price;

    @FindBy(xpath = "//button[2]//div[2]//div[2]//span[1]")
    WebElement actual_price;

    @FindBy(xpath = "//button[2]//div[2]//div[2]//span[4]")
    WebElement offers;

    //------------------ view all products button---------------------------//

    @FindBy(xpath = "//a[normalize-space()='VIEW ALL 233 PRODUCT(S)']")
    WebElement view_all_product;



    AppiumDriver driver;

    public void enterMobileNo() {

        btn_login_signup.click();
        driver.hideKeyboard();
        txt_mobileno.sendKeys("9999999999");
        btn_GetOTP.click();
    }

    public void otpValue() {
        txt_otp_value.sendKeys("123456");
    }

    public void clickOnVerifyNow() {
        btn_verify_now.click();
    }

    public SearchAPF(AppiumDriver driver) {
        this.driver = driver;

        //PageFactory.initElements(driver, LoginWebPF.class);
        //AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void SearchField(){
        searchfield.isDisplayed();
    }
    //-----------------------brand------------------------------//
    public void Brand(){
        brand.click();
    }
    public void Lakmi(){
        lakmi.isDisplayed();
    }
    public void Mamaearth(){
        mamaearth.isDisplayed();
    }
    public void Maybelline(){
        maybelline.isDisplayed();
    }
    public void Garnier(){
        garnier.isDisplayed();
    }
    public void Lotus(){
        lotus.isDisplayed();
    }
    //-----------------------Product for body parts------------------------------//
    public void Hair(){
        hair_product.isDisplayed();
    }
    public void Lip(){
        lip_product.isDisplayed();
    }
    public void Face(){
        face_product.isDisplayed();
    }
    //---------------------Back Page-------------------------------------//
    public void BackPage(){
        back_page.click();
    }
    //-------------------------Product Suggestions for wrong typing---------------------//
    public void Product_Suggestions(){
        txt_WrongType.sendKeys("lakh");
        txt_WrongType.clear();
    }
    //---------------------Brand Name showing in Suggestions---------------------//
    public void Brand_Name() {
//        wrong_typing.sendKeys("lak");
        txt_WrongType.sendKeys("lak");
        txt_WrongType.clear();
    }
    public void Brand_Name_Showing(){
        brand_name_showing.isDisplayed();
    }
    //------------- Product name showing with brand typing brand name product with offer price --------------//
    public void Product_Name_Showing1(){
        product_name_with_brand1.isDisplayed();
    }
    public void Product_Name_Showing2(){
        product_name_with_brand2.isDisplayed();
    }
    public void Price(){
        price.isDisplayed();
    }
    public void Actual_Price(){
        actual_price.isDisplayed();
    }
    public void Offer(){
        offers.isDisplayed();
    }



    //------------------ view all products button---------------------------//
    public void View_All_Products(){
        view_all_product.isDisplayed();
        view_all_product.click();
    }

}
