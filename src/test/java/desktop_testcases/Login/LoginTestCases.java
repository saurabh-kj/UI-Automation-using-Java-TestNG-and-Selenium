package desktop_testcases.Login;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
import desktop_pagefactory.test.Cart.CartPagePF;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;
import utils.Log;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class LoginTestCases {

    WebDriver driver = null;
    LoginWebPF login;

    @Parameters({"env", "browsername"})
    @BeforeMethod
    public void browser_is_open(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();

        System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");
        System.out.println("Inside Step - browser is open");

    }

    @Test
    public void verifyUserisAbleToLogin() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> loginDetails = YamlReader.getInstance().getDetails("LoginDetails");
        login = new LoginWebPF(driver);
        CartPagePF Cart = new CartPagePF(driver);
        getTest().log(Status.PASS, "Entering Mobile Number");
        login.clickLogin();

        login.enterMobileNo(loginDetails.get("mobile"));
        getTest().log(Status.PASS, "Mobile Number Entered: " + loginDetails.get("mobile"));
        Log.info("Mobile Number is "+loginDetails.get("mobile"));
        getTest().log(Status.PASS, "Entering Otp");
        login.otpValue(loginDetails.get("otp"));
        getTest().log(Status.PASS, "Otp Number Entered: " + loginDetails.get("otp"));
        Log.info("Otp Number is "+loginDetails.get("otp"));
        getTest().log(Status.PASS, "Clicking on Submit Button");
        login.clickOnVerifyNow();
        getTest().log(Status.PASS, "Submit Button Clicked");
        Cart.Logout();


    }
    @Test(priority = 0)
    public void OtpRecievedBySms()throws InterruptedException, FileNotFoundException{
        HashMap<String, String> loginDetails = YamlReader.getInstance().getDetails("LoginDetails");
        login = new LoginWebPF(driver);
        login.clickLogin();

        login.enterMobileNo(loginDetails.get("mobile"));
        getTest().log(Status.PASS, "Mobile Number Entered: " + loginDetails.get("mobile"));
        login.clickOnResendOtp();
        login.otpValue(loginDetails.get("otp"));
        getTest().log(Status.PASS, "Otp entered: " + loginDetails.get("otp"));
        login.clickOnVerifyNow();
        getTest().log(Status.PASS, "Submit Button Clicked");

    }
    @Test(priority = 1)
    public void OtpRecievedByWatsaap()throws InterruptedException, FileNotFoundException{
        HashMap<String, String> loginDetails = YamlReader.getInstance().getDetails("LoginDetails");
        login = new LoginWebPF(driver);
        login.enterMobileNo(loginDetails.get("mobile"));
        getTest().log(Status.PASS, "Mobile Number Entered: " + loginDetails.get("mobile"));
        Thread.sleep(16000);
        login.getOtpOnWatsaap();
        login.otpValue(loginDetails.get("otp"));
        getTest().log(Status.PASS, "Otp entered: " + loginDetails.get("otp"));
        login.clickOnVerifyNow();
        getTest().log(Status.PASS, "Submit Button Clicked");

    }
    @Test(priority = 2)
    public void ResendOtpBySms()throws InterruptedException, FileNotFoundException{
        HashMap<String, String> loginDetails = YamlReader.getInstance().getDetails("LoginDetails");
        login = new LoginWebPF(driver);
        login.enterMobileNo(loginDetails.get("mobile"));
        getTest().log(Status.PASS, "Mobile Number Entered: " + loginDetails.get("mobile"));
        Thread.sleep(18000);
        login.clickOnResendOtp1();
        login.otpValue(loginDetails.get("otp"));
        getTest().log(Status.PASS, "Otp entered: " + loginDetails.get("otp"));
        login.clickOnVerifyNow();
        getTest().log(Status.PASS, "Submit Button Clicked");

    }

    @AfterMethod
    public void signOut() throws InterruptedException {
    login.clickMyAccount();
    login.clickSignOut();
        driver.quit();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
