package mobile_testcases.Common;

import mobile_pagefactory.Cart.CartPageAPF;
import mobile_pagefactory.Common.HomePageAPF;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;

import java.io.IOException;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class HomePage {
    AppiumDriver driver = null;
    HomePageAPF homepage;
    LoginWebPF login;
    CartPageAPF Cart;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void setup(@Optional("url") String env, @Optional("android") String browsername) throws IOException, InterruptedException, IOException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = (AppiumDriver) baseClass.getDriver();
        Cart = new CartPageAPF(this.driver);
        login = new LoginWebPF(driver);
        homepage = new HomePageAPF(driver);

    }
//    @Test(priority = 0)
//    public void Login() throws InterruptedException, FileNotFoundException {
//
//        Cart.ClickCloseTheBanner();
//        Cart.ClickOnBurgerMenu();
//        //  Cart.ClickBackOnSideBurgerMenu();
//        //Login = new LoginWebPF(driver);
//        Cart.enterMobileNo();
//        Cart.otpValue();
//        Cart.clickOnVerifyNow();
//
//    }
    @Test(priority = 1)
    public void Homepage() throws InterruptedException {
        getTest().log(Status.PASS, "Home page Method");

        getTest().log(Status.PASS, "Test Case is to Check the home page load");
        Cart.ClickCloseTheBanner();
        getTest().log(Status.PASS, "Click on close banner ");


//        Cart.ClickOnBurgerMenu();
        homepage.TrellShopLogo();
        getTest().log(Status.PASS, "Checked for trell shop logo");
        homepage.BagOption();
        getTest().log(Status.PASS, "Checked for Bag option logo");
        homepage.homePageMenu("Offer");
        getTest().log(Status.PASS, "Checked for Burger menu logo");
        //homepage.homePageMenu("Men");
        //homepage.homePageMenu("Women");
        //homepage.homePageMenu("Kids");

        //homepage.kidsoption();
    }
    @Test(priority = 2)
    public void Homepage_check_menu() throws InterruptedException {
        getTest().log(Status.PASS, "Home page Check menu Method");
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Checked on burger menu");
        homepage.Mekup();
        getTest().log(Status.PASS, "Click on Category L1");
        homepage.AllMekup();
        getTest().log(Status.PASS, "Clicked on Category L2");
        homepage.AgainHomePage();
        getTest().log(Status.PASS, "Back to Home page ");
    }
    @Test(priority = 3)
    public void Search_product() throws InterruptedException {
        getTest().log(Status.PASS, "Search product Method");
        homepage.Search();
        getTest().log(Status.PASS, "Clicked on Search Button");
        homepage.Select_Prdct();
        getTest().log(Status.PASS, "Select the product in list");
//        Cart.ClickOnBurgerMenu();
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to Home page");
//        homepage.Back_To_HomePage();
    }
    @Test(priority = 4)
    public void Click_on_banner() throws InterruptedException {
        getTest().log(Status.PASS, "Click on banner Method");
        homepage.Click_On_Banner();
        getTest().log(Status.PASS, "Clicked on Banner in home page");
        homepage.Back_To_HomePage();
        getTest().log(Status.PASS, "Back to home page");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
