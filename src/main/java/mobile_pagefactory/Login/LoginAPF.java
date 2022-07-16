package mobile_pagefactory.Login;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utils.DriverClass;
import utils.YamlReader;

import java.io.FileNotFoundException;
import java.util.HashMap;

import static utils.extent.ExtentTestManager.startTest;

public class LoginAPF extends DriverClass {

    @FindBy(xpath = "(//img)[2]")
    WebElement btnHamburger;

    @FindBy(xpath = "(//span[@class='signInText'])[1]")
    WebElement btn_login_signup;

    @FindBy(xpath="//input[@name='phoneNo']")
    //@FindBy(name="phoneNo")
    WebElement txtMobile;

    @FindBy(xpath = "//button[contains(text(),'Get OTP via SMS')]")
    WebElement btnOtp;

    @FindBy(xpath = "//input[@class='Login-otp-loginModal__otp-3zQ']")
    WebElement txtOtp;

    @FindBy(xpath="//button[@class='Login-otp-button-J-g']")
    WebElement btnSubmit;

    @FindBy(css = "p[class = 'Login-otp-phonenoError-6j7']")
    WebElement validationMobileNo;

    @FindBy(xpath = "//button[contains(text(),'Resend via SMS')]")
    WebElement resend_otp_via_sms;


    private AppiumDriver driver;

    public LoginAPF(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void clickHamburger() {
        waitForElementToBeClickable(btnHamburger);
        btnHamburger.click();
    }

    public void login() throws FileNotFoundException, InterruptedException {
        startTest(this.getClass().getName(),"abc");
        HashMap<String,String> loginDetails= YamlReader.getInstance().getDetails("LoginDetails");

        waitForElementToBeClickable(btn_login_signup);
        btn_login_signup.click();
        waitForElementToBeClickable(txtMobile);
        txtMobile.sendKeys(loginDetails.get("mobile"));
        waitForElementToBeClickable(btnOtp);
        btnOtp.click();
        waitForElementToBeClickable(txtOtp);
        txtOtp.sendKeys(loginDetails.get("otp"));
        waitForElementToBeClickable(btnSubmit);
        btnSubmit.click();

    }

    public void inputInvalidMobileNum(String mobileno) throws Exception {
        waitForElementToBeClickable(btn_login_signup);
        btn_login_signup.click();
        txtMobile.sendKeys(mobileno);
        Thread.sleep(1500);
        if (validationMobileNo.isDisplayed()){
            txtMobile.clear();
            txtMobile.sendKeys("##&@923khk");
            Thread.sleep(2500);
        }
        if (validationMobileNo.isDisplayed()){
            System.out.println("I am inside 2nd if");
            txtMobile.clear();
        }
    }

    public void inputInvalidOTP(String otp) throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        txtMobile.sendKeys("9999999999");
        System.out.println("Valid mobile number entered");
        Thread.sleep(2500);
        btnOtp.click();
        System.out.println("Get OTP button clicked");
        txtOtp.sendKeys(otp);
        Thread.sleep(2500);
        System.out.println("OTP entered");
        btnSubmit.click();
        System.out.println("Verify button clicked");

		/*if (validationOTP.isDisplayed()){
			txt_otp_value.clear();
			System.out.println("Wait for miracle");
			executor.executeScript("arguments[0].click();", clickOutsidePopup);
//			return;
		}*/
    }

    public void enterMobileNoToVerify(String mobileno) {   //method to Login on Cart page
        txtMobile.sendKeys(mobileno);
        btnOtp.click();
    }

    public void otpValue(String otp) {
        txtOtp.sendKeys(otp);
    }

    public void clickOnVerifyNow() {
        btnSubmit.click();
    }
    public void resendOtpViaSms() {
        resend_otp_via_sms.click();
    }
}
