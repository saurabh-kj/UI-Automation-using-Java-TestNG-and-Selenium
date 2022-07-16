package mobile_testcases.ProductListing.Sort;

import mobile_pagefactory.Cart.CartPageAPF;
import mobile_pagefactory.ProductListing.SortsPF.SortByAlphabeticallyZtoAAPF;
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
public class SortByAlphabeticallyZtoA {

    private static final TimeUnit Thred = null;
    AppiumDriver driver = null;
    SortByAlphabeticallyZtoAAPF sortByAlphabetically;
    LoginWebPF login;
    CartPageAPF Cart;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void setup(@Optional("qa") String env, @Optional("android") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = (AppiumDriver) baseClass.getDriver();

        login = new LoginWebPF(driver);
        Cart = new CartPageAPF(this.driver);
        sortByAlphabetically = new SortByAlphabeticallyZtoAAPF(driver);
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
    public void SortByDiscount() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case is to sort products on the basis of alphabetically");
        sortByAlphabetically.Men();
        getTest().log(Status.PASS, "Clicking on mens business module");
        sortByAlphabetically.Sort();
        getTest().log(Status.PASS, "Clicking on sorting option");
        sortByAlphabetically.Alphabetically();
        getTest().log(Status.PASS, "Selecting alphabetically z to a");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
