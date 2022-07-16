package desktop_testcases.ProductListing;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import desktop_pagefactory.test.ProductListing.PlpPF;
import utils.BaseClass;
import utils.YamlReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class Plp {

    WebDriver driver = null;
    PlpPF plp;
    LoginWebPF login;

    @Parameters({"env","browsername"})

    @BeforeClass
    public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
        System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");
        System.out.println("Inside Step - browser is open");
        BaseClass baseClass=new BaseClass(env,browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();

        login = new LoginWebPF(driver);
        plp = new PlpPF(driver);
//
//        Login.enterMobileNo("9999999999");
//        Login.otpValue("123456");
//        Login.clickOnVerifyNow();

    }

    @Test
    public void BestSeller_AddToWishlist() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test cases for Showing best seller first and add remove from wishlist");
        plp.mekup();
        getTest().log(Status.PASS, "Clicking on mekup");
        plp.BestSeller();
        getTest().log(Status.PASS, "Bestseller product showing");
        plp.TopRated();
        getTest().log(Status.PASS, "Toprated product showing");
        plp.AddToWishlist();
        Thread.sleep(5000);
        getTest().log(Status.PASS, "Product add to wishlist");
        plp.RemoveFromWishlist();
        getTest().log(Status.PASS, "Product remove from wishlist");
        plp.BackToHome();
        getTest().log(Status.PASS, "Back to home page");
    }
    @Test(priority = 1)
    public void All_Details() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test cases for all deails of product with images");
        plp.mekup();
        getTest().log(Status.PASS, "Clicking on mekup business module");
        plp.MekupProdut();
        getTest().log(Status.PASS, "Clicking on mekup product");
        plp.ClickOnImage1();
        getTest().log(Status.PASS, "Clicking on image 1");
        plp.ClickOnImage2();
        getTest().log(Status.PASS, "Clicking on image 2");
        plp.ClickOnImage3();
        getTest().log(Status.PASS, "Clicking on image 3");
        plp.ProductName();
        getTest().log(Status.PASS, "Product name displayed");
        plp.ProductPrice();
        getTest().log(Status.PASS, "Product price displayed");
        plp.SaveButton();
        getTest().log(Status.PASS, "Save button displayed");
        plp.AddToBagButton();
        getTest().log(Status.PASS, "Add to bag button displayed");
        plp.AboutProduct();
        getTest().log(Status.PASS, "About product showing");
        plp.SimilarProduct();
        getTest().log(Status.PASS, "Similar product showing");
        plp.BackToHome();
        getTest().log(Status.PASS, "Back to home page");
    }
    @Test(priority = 2)
    public void Copy_Code() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test cases for copy code ");
        plp.mekup();
        getTest().log(Status.PASS, "Clicking on mekup business module");
        plp.MekupProduct1();
        getTest().log(Status.PASS, "Clicking on mekup product");
        plp.CopyCode();
        getTest().log(Status.PASS, "Copy coupon code");
        plp.BackToHome();
        getTest().log(Status.PASS, "Back to home page");
    }
//    @Test(priority = 3)
//    public void Add_To_Bag_View_Bag() throws InterruptedException, FileNotFoundException {
//        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
//        getTest().log(Status.PASS, "Test cases for Add bag and View bag ");
//        ProductListing.mekup();
//        getTest().log(Status.PASS, "Clicking on mekup module");
//        ProductListing.MekupProduct1();
//        getTest().log(Status.PASS, "Clicking on mekup product");
//        ProductListing.AddToBag();
//        getTest().log(Status.PASS, "Add product to bag");
//        ProductListing.ViewBag();
//        getTest().log(Status.PASS, "View bag");
//        //ProductListing.BackToHome();
//        // getTest().log(Status.PASS, "Back to home page");
//    }
    @Test(priority = 4)
    public void Low_To_High_Price() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        plp.Mekup();
        plp.Sort2();
        plp.LowToHigh();
        Thread.sleep(5000);
        plp.Price_Comparision();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
        System.out.println("Driver has quit now");
    }
}