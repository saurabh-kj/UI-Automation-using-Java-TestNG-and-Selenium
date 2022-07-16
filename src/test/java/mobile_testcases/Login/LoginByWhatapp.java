package mobile_testcases.Login;

import mobile_pagefactory.Cart.CartPageAPF;
import mobile_pagefactory.Login.LoginByWhatappAPF;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;

import java.io.IOException;
import java.time.Duration;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class LoginByWhatapp {

    AppiumDriver driver = null;
    CartPageAPF Cart;
    LoginWebPF login;
    LoginByWhatappAPF LoginWA;


    @BeforeClass
    public void setup(@Optional("url") String env, @Optional("android") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = (AppiumDriver) baseClass.getDriver();
    }

    @Test
    public void WaitingForElement() throws InterruptedException {
        driver.get("https://shop.trell.co/");
        Cart = new CartPageAPF(driver);
        LoginWA = new LoginByWhatappAPF(driver);

        getTest().log(Status.PASS, "Test Case is to Login via Whatsapp verfication code");
        Cart.ClickCloseTheBanner();
        getTest().log(Status.PASS, "CLick on close banner of header");
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Click on burger menu");
//          Cart.ClickBackOnSideBurgerMenu();
        login = new LoginWebPF(driver);
        getTest().log(Status.PASS, "ClickOn Login button");
        Cart.enterMobileNoWhatapp();
        getTest().log(Status.PASS, "Enter mobile number in text box");
        LoginWA.clickongetOtp();
        getTest().log(Status.PASS, "Clicked on the OTP by Whatsapp");
        Thread.sleep(5000);
        driver.runAppInBackground(Duration.ofSeconds(-1));
        getTest().log(Status.PASS, "Making Chrome browser to run on background");
        driver.activateApp("com.whatsapp");
        getTest().log(Status.PASS, "Opening the Whatsapp application");
        LoginWA.whatConv();
        getTest().log(Status.PASS, "Click on what app convercation and copy message");
        Thread.sleep(5000);
        driver.activateApp("com.android.chrome");
        getTest().log(Status.PASS, "Reopening chrome from background");
//        otp = LoginWA.otp;
//        Cart.otpValueWhatsapp(otp);


    }



//    @Test
//    public void Mmmm() throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("appPackage", "com.whatsapp");
//        capabilities.setCapability("appActivity", "com.whatsapp.instrumentation.ui.InstrumentationAuthActivity");
//        capabilities.setCapability("noReset", true);
//        capabilities.setCapability("fullReset", false);
//        URL url = new URL("http://0.0.0.0:4723/wd/hub");
//        driver = new AppiumDriver(url, capabilities);
//        driver.manage().deleteAllCookies();
//    }

}


