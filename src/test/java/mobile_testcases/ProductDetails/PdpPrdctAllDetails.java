package mobile_testcases.ProductDetails;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import mobile_pagefactory.Cart.CartPageAPF;
import mobile_pagefactory.ProductDetails.PdpPrdctAllDetailsAPF;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class PdpPrdctAllDetails {

    private static final TimeUnit Thred = null;
    AppiumDriver driver = null;
    PdpPrdctAllDetailsAPF pdpalldetails;
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
        pdpalldetails=new PdpPrdctAllDetailsAPF(driver);

    }
    @Test(priority = 0)
    public void Login() throws InterruptedException, FileNotFoundException {

        Cart.ClickCloseTheBanner();
//        Cart.ClickOnBurgerMenu();
//        //  Cart.ClickBackOnSideBurgerMenu();
//        //Login = new LoginWebPF(driver);
//        Cart.enterMobileNo();
//        Cart.otpValue();
//        Cart.clickOnVerifyNow();

    }

    @Test(priority = 1)
    public void pdp_all_details_of_product() throws FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "PDP all details of product Method");
        getTest().log(Status.PASS, "Test Case is to show all details of product");
        pdpalldetails.SearchProduct();
        getTest().log(Status.PASS,"Clicking on search field");
        pdpalldetails.SelectProduct();
        getTest().log(Status.PASS,"Selecting product");
        pdpalldetails.EyeProduct();
        getTest().log(Status.PASS,"Clicking on eye product");
        pdpalldetails.ProductName();
        getTest().log(Status.PASS,"Product name showing");
        pdpalldetails.Review();
        getTest().log(Status.PASS,"Review showing");
        pdpalldetails.Product_Price();
        getTest().log(Status.PASS,"Price showing");
        pdpalldetails.Actual_Price();
        getTest().log(Status.PASS,"Actual price showing");
        pdpalldetails.Offer();
        getTest().log(Status.PASS,"Offer showing");
        pdpalldetails.ExpectedDeliveryDate();
        getTest().log(Status.PASS,"Explvdate showing");
        pdpalldetails.SaveBtn();
        getTest().log(Status.PASS,"Save button showing");
        pdpalldetails.AddtoBag();
        getTest().log(Status.PASS,"Add to bag option showing");
        pdpalldetails.BrandName();
        getTest().log(Status.PASS,"Brand name showing");
        pdpalldetails.ExpiryDate();
        getTest().log(Status.PASS,"Expiary date showing");
        pdpalldetails.AboutProduct();
        getTest().log(Status.PASS,"About product option showing");
        pdpalldetails.MakeItSpecial();
        getTest().log(Status.PASS,"Make it special option showing");
        pdpalldetails.GoodToKnow();
        getTest().log(Status.PASS,"Good to know option showing");
        pdpalldetails.Ingredient();
        pdpalldetails.HowToUse();
        getTest().log(Status.PASS,"How to use option showing");
        pdpalldetails.ProductAuthenticity();
        getTest().log(Status.PASS,"Product authenticity option showing");
        pdpalldetails.ReturnProduct();
        getTest().log(Status.PASS,"Return product option showing");
        pdpalldetails.CashOnDelivery();
        getTest().log(Status.PASS,"Cach on delivery option showing");
        pdpalldetails.SimilarProduct();
        getTest().log(Status.PASS,"Similar product showing");
        pdpalldetails.AdditionalInfo();
        getTest().log(Status.PASS,"Additional info showing");
        pdpalldetails.SaveBtn();
        getTest().log(Status.PASS,"Save button showing");
        pdpalldetails.AddtoBag();
        getTest().log(Status.PASS,"Add tot bag button showing");
        pdpalldetails.Breadcrumbs();
        getTest().log(Status.PASS,"Breadcrumbs showing");
        pdpalldetails.ClickOnBreadcrumbs();
        getTest().log(Status.PASS,"Clicking on breadcrumbs");
    }
    @Test(priority = 2)
    public void go_to_home_page() {
        pdpalldetails.MenuIcon();
        pdpalldetails.TrellIcon();
    }

}

