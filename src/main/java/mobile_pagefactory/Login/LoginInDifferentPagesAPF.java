package mobile_pagefactory.Login;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginInDifferentPagesAPF {
//--------------------------Login----------------------------//
   @FindBy(xpath = "//*[contains(@src,'https://cdn.trell.co/images/orig/zlaflrCQtPQBqSWprxyGNVPzGDmbTKdp.svg?auto=format&fit=max&w=48')]")
   WebElement burger_menu;

   @FindBy(xpath = "//button[@class='signInbtn']")
   WebElement login_signup;

    @FindBy(xpath = "//input[@placeholder='Enter Phone Number']")
    WebElement enter_phn_num;

    @FindBy(xpath = "//button[normalize-space()='Get OTP via SMS']")
    WebElement get_otp;

    @FindBy(xpath = "//input[@placeholder='Enter OTP']")
    WebElement enter_otp;

    @FindBy(xpath = "//button[normalize-space()='Verify Now']")
    WebElement verify_otp;
  //-------------------Login from ProductListing-------------------------------//

   @FindBy(xpath = "//*[.='Grooming']")
   WebElement grooming;

//----------------------Login from ProductDetails------------------------------//
   @FindBy(xpath = "//h2[normalize-space()='Maryaj Deuce Homme Eau De Parfum, 100ml']")
   WebElement select_product;
//-------------------Login from search-----------------------------//
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement search;

    @FindBy(xpath = "//p[normalize-space()='Lakme']")
    WebElement selectProduct;
 //-------------------Login from check out-------------------------//
   @FindBy(xpath = "//*[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ']")
   WebElement add_to_bag;

   @FindBy(xpath = "//img[@alt='Cart Bag']")
   WebElement view_bag;

   @FindBy(xpath = "//*[@class='flow-checkoutNavigation-1Qd'")
   WebElement proceed;
//--------------------Check application already loged out-----------------------//

   @FindBy(xpath = "//*[@class='signInText']")
   WebElement check_loged_out;


    AppiumDriver driver;

    public LoginInDifferentPagesAPF(AppiumDriver driver) {
        this.driver = driver;

        //PageFactory.initElements(driver, LoginWebPF.class);
        //AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }
    public void BurgerMenu(){
        burger_menu.click();
    }
    public void LoginSignup(){
        login_signup.click();
    }
    public void EnterPhoneNuber() {
        enter_phn_num.sendKeys("9999999999");
    }
        public void GetOtp(){
            get_otp.click();
        }
        public void EnterOtp(){
            enter_otp.sendKeys("987699");
        }
        public void VerifyOtp() {
            verify_otp.click();
        }
        public void Grooming() {
            grooming.click();
        }
         public void SelectPtoduct() {
            select_product.click();
        }
         public void Search() {
            search.click();
        }
         public void SelectProduct() {
            selectProduct.click();
        }
    public void AddToBag() {
        add_to_bag.click();
    }
    public void ViewBag() {
        selectProduct.click();
    }
    public void Proceed() {
        proceed.click();
    }
//---------------Check loged out-----------------------//
    public boolean Check_LogedOut() {
        check_loged_out.isDisplayed();
        return true;
    }





    }