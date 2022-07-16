package mobile_pagefactory.Common;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class GuestUserAPF {


    @FindBy(xpath = "//strong[normalize-space()='Mens']")
    WebElement mens;

    @FindBy(xpath = "//h2[normalize-space()='Pepe Jeans Vapour Slim Fit Mid Waist Jeans-2']")
    WebElement mens_product;

    @FindBy(xpath = "//*[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ']")
    WebElement add_to_bag;

    @FindBy(xpath = "//button[@class='cartButton active']")
    WebElement go_to_bag;

    @FindBy(xpath = "//*[.='Proceed']")
    WebElement proceed;
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

    AppiumDriver driver;

    public void enterMobileNo() {

        // btn_login_signup.click();
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
    public GuestUserAPF(AppiumDriver driver) {
        this.driver = driver;

        //PageFactory.initElements(driver, LoginWebPF.class);
        //AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }
    public void mens(){
        mens.click();
    }
    public void mensproduct(){
        mens_product.click();
    }
    public void addtobag(){
        add_to_bag.click();
    }
    public void gotobag(){
        go_to_bag.click();
    }
    public void proceed(){
        proceed.click();
    }
    //----------------------validations------------------------//
    public void mens_product_page_validation(){
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),\"men's collection\")]"));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertEquals("Men's Collection", strng);
    }
    public void mens_product_for(){
        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Pepe Jeans Vapour Slim Fit Mid Waist Jeans, 36 , 1')]")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Pepe Jeans Vapour Slim Fit Mid Waist Jeans, 36 , 1')]")).isDisplayed());
    }
}
