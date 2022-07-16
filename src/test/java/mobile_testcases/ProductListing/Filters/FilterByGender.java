package mobile_testcases.ProductListing.Filters;

import mobile_pagefactory.Cart.CartPageAPF;
import mobile_pagefactory.ProductListing.FiltersPF.FilterByGenderAPF;
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
public class FilterByGender {

    private static final TimeUnit Thred = null;
    AppiumDriver driver = null;
    FilterByGenderAPF gender;
    LoginWebPF login;
    CartPageAPF Cart;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void setup(@Optional("url") String env, @Optional("android") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = (AppiumDriver) baseClass.getDriver();

        Cart = new CartPageAPF(this.driver);

        login = new LoginWebPF(driver);
        gender = new FilterByGenderAPF(driver);

    }

    @Test(priority = 0)
    public void Login() throws InterruptedException {

        Cart = new CartPageAPF(driver);
        Cart.ClickCloseTheBanner();
//        Cart.ClickOnBurgerMenu();
//        Cart.ClickBackOnSideBurgerMenu();
//        //Login = new LoginWebPF(driver);
//        Cart.enterMobileNo();
//        Cart.otpValue();
//        Cart.clickOnVerifyNow();
    }

    @Test(priority = 1)
    public void FilterByGender() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "FilterByGender Method");

        getTest().log(Status.PASS, "Test Case is to filter products on the basis of gender");
        gender.Men();
        getTest().log(Status.PASS, "Clicking on mens business module");
        gender.ClickOnFilter();
        getTest().log(Status.PASS, "Clicking on filter option");
        gender.ClickOngender();
        getTest().log(Status.PASS, "Clicking on gender");
        gender.SelectGender();
        getTest().log(Status.PASS, "Selecting gender");
        gender.Apply();
        getTest().log(Status.PASS, "Clicking on apply");
        gender.ExitFromFilter();
        getTest().log(Status.PASS, "Exit from filter");
    }

    @AfterTest
    public void navigateHome(){
        driver.quit();
    }
}
