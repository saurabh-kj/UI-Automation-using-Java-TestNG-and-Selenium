package mobile_pagefactory.ProductListing.FiltersPF;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FilterByBrandNameAPF {
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

    //--------------------Filter By Brand Name------------------------//

    @FindBy(xpath = "//strong[normalize-space()='Mens'] | (//span[contains(text(),'Skin')])[2]")
    WebElement men;

    @FindBy(xpath = "//button[@class='filterBtn']")
    WebElement click_on_filter;

    @FindBy(xpath = "//div[@class='contentWrapper active']//input[@id='AEROPOSTALE'] | (//input[@id='Dry Skin Under Beard'])[1]")
    WebElement select_brand;

    @FindBy(xpath = "//div[@class='contentWrapper active']//button[@type='button'][normalize-space()='Apply']")
    WebElement apply;

    @FindBy(xpath = "//img[@alt='Cancel Icon']")
    WebElement exit_from_filter;

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

    public FilterByBrandNameAPF(AppiumDriver driver) {
        super();
        this.driver = driver;

        //PageFactory.initElements(driver, LoginWebPF.class);
        //AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }
   public void Men(){
        men.click();
   }
    public void ClickOnFilter(){
        click_on_filter.click();
    }
    public void SelectBrand(){
        select_brand.click();
    }
    public void Apply(){
        apply.click();
    }
    public void ExitFromFilter(){
        exit_from_filter.click();
    }
}
