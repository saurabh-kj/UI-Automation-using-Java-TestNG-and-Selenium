package desktop_pagefactory.test.Login;

import java.io.FileNotFoundException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utils.DriverClass;
import utils.YamlReader;

public class LoginWebPF extends DriverClass {

    @FindBy(xpath = "//span[@class='header-my_account_text-h6w']|//p[@class='userName']")
    WebElement btn_login_signup;

    @FindBy(name = "phoneNo")
    WebElement txt_mobileno;

    @FindBy(xpath = "//button[contains(text(),'Get OTP')]")
    WebElement btn_GetOTP;

    @FindBy(name = "otp-value")
    WebElement txt_otp_value;

    @FindBy(xpath = "//button[contains(text(),'Verify Now')]")
    WebElement btn_verify_now;

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement go_to_home;

    @FindBy(xpath = "//button[contains(text(),'Resend via SMS')]")
    WebElement send_otp_by_sms;

    @FindBy(xpath = "//body/div[@id='__next']/a[1]/div[1]/div[1]/form[1]/div[3]/button[2]")
    WebElement get_otp_on_watsaap;

    @FindBy(xpath = "//button[contains(text(),'Resend via SMS')]")
    WebElement resend_otp_by_sms;

    @FindBy(className = "header-my_account_text-h6w")
    public WebElement btn_MyAccount;

    @FindBy(xpath = "//span[text()='Sign Out']")
    public WebElement btnSignOut;

    final WebDriver driver;

    public LoginWebPF(WebDriver driver) {
        super(driver);
        this.driver = driver;

        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }


    public void clickLogin() {
        waitForElementToBeClickable(btn_login_signup);
        btn_login_signup.click();

    }

    public void enterMobileNo(String mobileno) throws InterruptedException {

        waitForElementToBeClickable(txt_mobileno);
        txt_mobileno.sendKeys(mobileno);
        btn_GetOTP.click();
    }


    public void enterMobileNoToVerify(String mobileno) {
        waitForElementToBeClickable(txt_mobileno);
        txt_mobileno.sendKeys(mobileno);
        waitForElementToBeClickable(btn_GetOTP);
        btn_GetOTP.click();
    }

    public void otpValue(String otp) {
        txt_otp_value.sendKeys(otp);
    }

    public void clickOnVerifyNow() {
        waitForElementToBeClickable(btn_verify_now);
        btn_verify_now.click();
        waitForPageToLoad(driver);
        //System.out.println("abc "+ btn_verify_now.toString());

        //waitForElementToDisappear(btn_verify_now);
    }

    public void clickOnResendOtp() {
        waitForElementToBeClickable(send_otp_by_sms);
        send_otp_by_sms.click();
    }

    public void getOtpOnWatsaap() {
        get_otp_on_watsaap.click();
    }

    public void clickOnResendOtp1() {
        resend_otp_by_sms.click();
    }


    public void clickMyAccount() {
        waitForElementToBeClickable(btn_MyAccount);
        btn_MyAccount.click();
    }

    public void clickSignOut() {
        waitForElementToBeClickable(btnSignOut);
        btnSignOut.click();
        waitForPageToLoad(driver);
    }

    public void loginMethod() throws FileNotFoundException {
        HashMap<String, String> loginDetails = YamlReader.getInstance().getDetails("LoginDetails");

    }
}
