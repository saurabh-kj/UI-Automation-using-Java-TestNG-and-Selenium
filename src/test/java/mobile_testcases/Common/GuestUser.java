package mobile_testcases.Common;

import mobile_pagefactory.Cart.CartPageAPF;
import mobile_pagefactory.Common.GuestUserAPF;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;
import utils.YamlReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class GuestUser {

    private static final TimeUnit Thred = null;
    AppiumDriver driver = null;
    LoginWebPF login;
    GuestUserAPF guest;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void setup(@Optional("url") String env, @Optional("IOS") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = (AppiumDriver) baseClass.getDriver();

        guest = new GuestUserAPF(driver);
        login = new LoginWebPF(driver);
        guest = new GuestUserAPF(driver);
        CartPageAPF Cart = new CartPageAPF(driver);
        Cart.ClickCloseTheBanner();

    }
    @Test(priority = 0)
    public void GuestUser() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case is to show best price");
        guest.mens();
        getTest().log(Status.PASS,"Clicking on mens");
        // guest.mens_product_page_validation();
        guest.mensproduct();
        getTest().log(Status.PASS,"Clicking on mens module");
        guest.mens_product_for();
        getTest().log(Status.PASS,"Clicking on a product");
        guest.addtobag();
        getTest().log(Status.PASS,"Clicking on add to bag");
        guest.gotobag();
        getTest().log(Status.PASS,"Clicking on bag");
        guest.proceed();
        getTest().log(Status.PASS,"Clicking on proceed");
    }
    @Test(priority = 1)
    public void Login() throws InterruptedException {
        guest = new GuestUserAPF(driver);
        // guest.ClickOnBurgerMenu();
        // guest.ClickBackOnSideBurgerMenu();
        //Login = new LoginWebPF(driver);
        guest.enterMobileNo();
        guest.otpValue();
        guest.clickOnVerifyNow();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
