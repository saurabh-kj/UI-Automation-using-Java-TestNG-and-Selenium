package desktop_testcases.Login;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginInDifferentPagesPF;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;
import utils.YamlReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static utils.extent.ExtentTestManager.getTest;
@Listeners(utils.ListenerClass.class)
public class LoginFromHomePage {

    private static final TimeUnit Thred = null;
    WebDriver driver = null;
    LoginWebPF login;
    LoginInDifferentPagesPF AllLogin;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void GoToPlpPage(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();
        AllLogin = new LoginInDifferentPagesPF(driver);
    }
    //------------------Login from home page----------------------//
    @Test(priority = 0)
    public void HomePageLogin() throws InterruptedException, FileNotFoundException {
        if(AllLogin.CheckApplicationAlreadyLogedOut()) {
            HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
            getTest().log(Status.PASS, "Test Case is to Login from home page");
            Thread.sleep(5000);
            AllLogin.LoginSignup();
            getTest().log(Status.PASS, "Clicking on Login signup option");
            AllLogin.EnterPhoneNum();
            AllLogin.Login_Page_Validation();
            getTest().log(Status.PASS, "Login page validation");
            getTest().log(Status.PASS, "Enter phone number");
            AllLogin.GetOtp();
            getTest().log(Status.PASS, "Clicking on get otp");
            AllLogin.EnterOtp();
            getTest().log(Status.PASS, "Enter otp");
            AllLogin.VerifyNow();
            getTest().log(Status.PASS, "Clicking on verify now");
            AllLogin.HoverOnLogOut();
            getTest().log(Status.PASS, "Hover on log out option");
            AllLogin.LogOut();
            getTest().log(Status.PASS, "Clicking on log out");
        }
        else {
            System.out.println("Application already Login");
        }
    }
    //-----------------otp rcieved by sms-------------//
    @Test(priority = 1)
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
    @AfterClass
    public void tearDown() {
        driver.quit();

    }
}
