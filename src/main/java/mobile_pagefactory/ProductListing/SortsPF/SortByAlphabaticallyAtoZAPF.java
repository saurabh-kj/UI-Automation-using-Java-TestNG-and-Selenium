package mobile_pagefactory.ProductListing.SortsPF;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SortByAlphabaticallyAtoZAPF {

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

    //--------------------Sort By alphabetically a to z------------------------//

    @FindBy(xpath = "//strong[normalize-space()='Mens']")
    WebElement men;

    @FindBy(xpath = "//span[@class='sortTitle']")
    WebElement sort;

    @FindBy(xpath = "//div[@class='mobileSort']//label[@for='Discount'][normalize-space()='Discount']//span[@class='checkmark']")
    WebElement alphabetically;

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

    public SortByAlphabaticallyAtoZAPF(AppiumDriver driver) {
        super();
        this.driver = driver;

        //PageFactory.initElements(driver, LoginWebPF.class);
        //AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }
    public void Men(){
        men.click();
    }
    public void Sort() throws InterruptedException {
        Thread.sleep(3000);
        sort.click();
    }
    public void Alphabetically() throws InterruptedException {
        Thread.sleep(5000);
        alphabetically.click();
    }
}
