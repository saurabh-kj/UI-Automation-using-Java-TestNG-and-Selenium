package desktop_testcases.Cart;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Cart.CartPagePF;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;
import utils.YamlReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

@Listeners(utils.ListenerClass.class)
public class CartNProducts {

    WebDriver driver = null;
    CartPagePF Cart;
    LoginWebPF login;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();
        HashMap<String, String> loginDetails = YamlReader.getInstance().getDetails("LoginDetails");

//        Login = new LoginWebPF(driver);
//        Login.clickLogin();
//        Login.enterMobileNo(loginDetails.get("mobile"));
//        Login.otpValue(loginDetails.get("otp"));
//        Login.clickOnVerifyNow();
//        Thread.sleep(4000);
        Cart = new CartPagePF(driver);
//        Cart.BackToHome();
    }

    @Test(priority = 7)
    public void NoOfTheProducts() throws InterruptedException {
        Cart = new CartPagePF(driver);
        Cart.ClickOnCategory();
        Cart.CountOfNthProduct();
        Cart.BackToHome();

    }

    @Test(priority = 8)
    public void ProductFromList() throws InterruptedException {
        Cart = new CartPagePF(driver);
        Cart.ClickOnCategory();
        Cart.PDPClickOnOffers();
        Cart.NoOfOffers();
        Cart.BackToHome();

    }
    @Test(priority = 1)
    public void RemoveAllProductsInBagitems() throws InterruptedException {
        //TSW_2.1.11

        Cart = new CartPagePF(driver);
        login = new LoginWebPF(driver);
        Thread.sleep(4000);
        Cart.clickOnMyBag();
        Cart.RemoveCompleteListFromCart();
        Cart.BackToHome();
    }

    @Test(priority = 8)
    public void MaxProductListInGuest() throws InterruptedException, FileNotFoundException {
        Cart = new CartPagePF(driver);
        Cart.ClickOnCategory();
        Cart.AddProductMaxinProductList();
//        Cart.ValidationOnMax();
        RemoveAllProductsInBagitems();
        Cart.BackToHome();
    }


    //    @Test(priority = 8)
//    public void MaxProductinguestandLogin() throws InterruptedException, FileNotFoundException {
//        Cart = new CartPagePF(driver);
//        LoginWebPF Login = new LoginWebPF(driver);
//        PlaceOrderPF PlaceOdr = new PlaceOrderPF(driver);
//        HashMap<String, String> loginDetails = YamlReader.getInstance().getDetails("LoginDetails");
//
//        Cart.ClickOnCategory();
////        PlaceOdr.addtoBagSimpleProduct(6);
//        Cart.AddProductMaxinProductList();
//        Cart.ValidationOnMax();
//        Login.clickLogin();
//        Login.enterMobileNo(loginDetails.get("mobile"));
//        Login.otpValue(loginDetails.get("otp"));
//        Login.clickOnVerifyNow();
//        Cart.MyBagFromHome();
//        Cart.ProductListCount();
//        Cart.BackToHome();
//        Cart.ClickOnCategory();
//        Cart.AddProducts();
//        Cart.ValidationOnMax();
//        RemoveAllProductsInBag();
//    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
