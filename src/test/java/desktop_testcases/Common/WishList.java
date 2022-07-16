package desktop_testcases.Common;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
import desktop_pagefactory.test.Cart.CartPagePF;
import desktop_pagefactory.test.Login.LoginWebPF;
import desktop_pagefactory.test.ProductListing.WishListPF;
import utils.BaseClass;
import utils.YamlReader;

@Listeners(utils.ListenerClass.class)
public class WishList {

    private static final TimeUnit Thred = null;
    WebDriver driver = null;
    WishListPF wishlist;
    LoginWebPF login;
    CartPagePF Cart;
    HashMap<String, String> loginDetails;


    @Parameters({"env", "browsername"})

    @BeforeClass
    public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();
        wishlist = new WishListPF(driver);
        login = new LoginWebPF(driver);
        loginDetails = YamlReader.getInstance().getDetails("LoginDetails");
        login.clickLogin();
        login.enterMobileNo(loginDetails.get("mobile"));
        Thread.sleep(2000);
        login.otpValue(loginDetails.get("otp"));
        Thread.sleep(2000);
        login.clickOnVerifyNow();
        Thread.sleep(2000);
        Cart = new CartPagePF(driver);
    }

    @Test
    public void urlClickTest() throws Exception {
        driver.get("https://mcstaging.shop.trell.co/mywishlist?fromv2=true");
        wishlist.verifyWishlistedItem();
    }

  /*  @Test(priority = 0)
    public void WishlistProductOnPLP() throws InterruptedException {
        wishlist.verifyWishlistedItem();
        getTest().log(Status.PASS, "Test Case is to add Product to wishlist from PLP page.");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked on the business group");
        wishlist.clickOnWishlistOnPLP();
        getTest().log(Status.PASS, "Clicked on the wishlist icon");
        Cart.BackToHome();
    }*/

    /*@Test(priority = 1)
    public void WishlistProductOnCart() throws InterruptedException {
        getTest().log(Status.PASS, "Test Case is to add Product to wishlist from the PLP Page");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked on the business group");
        Cart.AddProducts();
        getTest().log(Status.PASS, "Add product to Wishlist");
        wishlist.WishlistFromCart();
    }

    @Test (priority = 2)
    public void WishlistProductOnPDP() throws InterruptedException {
        getTest().log(Status.PASS, "Test Case is to add Product to wishlist from the PD Page");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked on the business group");
        wishlist.addToWishlistFromPDP();
        getTest().log(Status.PASS, "Added product to bag from PD page");
        Cart.clickOnMyBag();
        getTest().log(Status.PASS, "Clicked on bag button");
    }


    @Test (priority = 3)
    public void WishlistVerification() throws InterruptedException {
        getTest().log(Status.PASS, "TestCase for verify the wishlist");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked on the business group");
        Cart.AddProducts();
        getTest().log(Status.PASS, "Add product to bag");
        wishlist.WishlistFromCart();
        getTest().log(Status.PASS, "Add product to wishlist");
        wishlist.Profilewishlist();
        getTest().log(Status.PASS, "view profile for wishlist ");
        Cart.clickOnMyBag();
        getTest().log(Status.PASS, "Clicked on my bag");
        Cart.RemoveProduct();
        getTest().log(Status.PASS, "Remove product from my bag");
//        wish.WishListValidation();
        Cart.BackToHome();
        getTest().log(Status.PASS, "Back to home page");
    }*/
/*
    @Test (priority = 4)
    public void RemoveWishlistFromProfile() throws InterruptedException {
        getTest().log(Status.PASS, "Test cases for Remove Product");
        wishlist.Profilewishlist();
        getTest().log(Status.PASS, "Remove product from My Wishlist page.");
    }
*/

    @AfterClass
    public void tearDown() {
//        driver.quit();
    }

}
