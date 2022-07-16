package mobile_testcases.Common;
import mobile_pagefactory.Cart.CartPageAPF;
import mobile_pagefactory.Common.SearchAPF;
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

public class Search {

    private static final TimeUnit Thred = null;
    AppiumDriver driver = null;
    SearchAPF search;
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
        search = new SearchAPF(driver);
    }
//    @Test(priority = 0)
//    public void Login() throws InterruptedException {
//        Cart = new CartPageAPF(driver);
//        Cart.ClickCloseTheBanner();
//        Cart.ClickOnBurgerMenu();
////        Cart.ClickBackOnSideBurgerMenu();
//        //Login = new LoginWebPF(driver);
//        Cart.enterMobileNo();
//        Cart.otpValue();
//        Cart.clickOnVerifyNow();
//
//    }
    @Test(priority = 1)
    public void search() {
        search.SearchField();
    }

    @Test(priority = 2)
    public void brands() throws FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case is to show brand");
        search.Brand();
        getTest().log(Status.PASS,"Clicking on search");
        search.Lakmi();
        getTest().log(Status.PASS,"Display lakme brand");
        search.Mamaearth();
        getTest().log(Status.PASS,"Display lakme maaearth brand");
        search.Maybelline();
        getTest().log(Status.PASS,"Display lakme maybelline brand");
        search.Garnier();
        getTest().log(Status.PASS,"Display garnier brand");
        search.Lotus();
        getTest().log(Status.PASS,"Display lotus brand");
//        search.BackPage();
        getTest().log(Status.PASS,"Go to back page");
    }
    @Test(priority = 3)
    public void products_for_body_parts() throws FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case is to show products for body parts");
        search.Hair();
        getTest().log(Status.PASS,"Hair module showing");
        search.Lip();
        getTest().log(Status.PASS,"Lip module showing");
        search.Face();
        getTest().log(Status.PASS,"Face module showing");
    }
    @Test(priority = 4)
    public void products_suggestions() throws FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case is to show product suggestion");
        search.Product_Suggestions();
        getTest().log(Status.PASS,"Product suggestions showing");
        search.BackPage();
        getTest().log(Status.PASS,"Go to back page");
    }
    @Test(priority = 5)
    public void brand_name_showing() throws FileNotFoundException {
        search();
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case is to show brand name");
        search.Brand_Name();
        getTest().log(Status.PASS,"Clicking on search field");
        search.Brand_Name_Showing();
        getTest().log(Status.PASS,"Brand Name showing");
    }
//    @Test(priority = 4)
//    public void product_name_showing() throws FileNotFoundException {
//        search.SearchField();
//        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
//        getTest().log(Status.PASS, "Test Case is to show product name");
//        search.Product_Name_Showing1();
//        getTest().log(Status.PASS,"First product name showing");
//        search.Product_Name_Showing2();
//        getTest().log(Status.PASS,"Second product name showing");
//        search.Price();
//        getTest().log(Status.PASS,"Price showing");
//        search.Actual_Price();
//        getTest().log(Status.PASS,"Actual price showing");
//        search.Offer();
//        getTest().log(Status.PASS,"Offer showing");
//
//    }
//    @Test(priority = 5)
//    public void view_all_products_showing() throws FileNotFoundException {
//        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
//        getTest().log(Status.PASS, "Test Case is to show view all products option");
//        search.View_All_Products();
//        getTest().log(Status.PASS,"View all products button");
//        search.View_All_Products();
//        getTest().log(Status.PASS,"View all products");
//    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
