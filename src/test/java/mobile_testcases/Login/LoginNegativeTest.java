package mobile_testcases.Login;

import mobile_pagefactory.Cart.CartPageAPF;
import mobile_pagefactory.Login.LoginAPF;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import utils.BaseClass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginNegativeTest {
    AppiumDriver driver = null;
    LoginAPF login;
    CartPageAPF Cart;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void setup(@Optional("url") String env, @Optional("android") String browsername) throws IOException, InterruptedException, IOException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = (AppiumDriver) baseClass.getDriver();
        login = new LoginAPF(this.driver);
    }



    @BeforeClass
    public void LoginToWebsite() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        //capabilities.setCapability(MobileCapabilityType.);
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AppiumDriver(url, capabilities);

        driver.get("https://mcstaging.shop.trell.co/");
        //driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        Cart = new CartPageAPF(driver);
//        Login = new LoginWebPF(driver);
        login = new LoginAPF(this.driver);
    }

    @Test
    public void verifyInvalidLogin() throws Exception {
        Cart.ClickCloseTheBanner();
        login.clickHamburger();
        System.out.println("Hamburger click");
        login.inputInvalidMobileNum("999abcddn2");
        System.out.println("Input invalid mobile num method done.");
        login.inputInvalidOTP("683554");
        System.out.println("Input invalid OTP method done.");
    }

    @AfterTest
    public void navigateHome(){
        driver.quit();
    }
}
