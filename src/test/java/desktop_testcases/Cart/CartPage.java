package desktop_testcases.Cart;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import com.aventstack.extentreports.Status;
import desktop_pagefactory.test.Cart.CartPagePF;
import desktop_pagefactory.test.Login.LoginWebPF;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;


@Listeners(utils.ListenerClass.class)
public class CartPage {
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


    @Test(priority = 1)
    public void AddProductToBag() throws InterruptedException, FileNotFoundException {
        Cart = new CartPagePF(driver);
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case is to add product Sucessfully to Cart Page");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On MakeUp Business Group");
//        String addproducttext = Cart.ECProductName.getText();
//        System.out.println(Cart.ECProductName.getText());
        Cart.AddProductsInClick();
        getTest().log(Status.PASS, "Product Added To Cart, view bag and Back to Home Page ");
//        Cart.ValidateproductNameTag(addproducttext);
        getTest().log(Status.PASS, "Clicked On My Bag");
        Cart.RemoveProduct();
        getTest().log(Status.PASS, "Product Removed Sucessfully from the Cart");
        Cart.BackToHome();
        getTest().log(Status.PASS, "Redirect Back to Home Page");

    }


    @Test(priority = 1)
    public void MyBagWithSameProduct() throws InterruptedException {
        //TSW_2.1.18/20-22/

        getTest().log(Status.PASS, "TestCase on adding same product 2 times to Cart");
        Cart = new CartPagePF(driver);
        for (int i = 0; i <= 1; i++) {
            Cart.ClickOnCategory();
            getTest().log(Status.PASS, "Clicked on the make up business group");
//        String addproducttext = Cart.ECProductName.getText();
            Cart.AddProductsInClick();
            getTest().log(Status.PASS, "Add product to Cart");
//        Cart.ValidateproductNameTag(addproducttext);
            Cart.ClickOnCheckOut();
            getTest().log(Status.PASS, "Clicked on the checkout in Cart page");
            Cart.BackToHome();
            getTest().log(Status.PASS, "Back to home page");
        }

    }

    @Test(priority = 1)
    public void IncreaseAndDecreaseProductQuntity() throws InterruptedException {
        //TSW_2.1.8
        getTest().log(Status.PASS, "Test case for Decrease Product Quntity");

        Cart = new CartPagePF(driver);
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked on the make up business group");
//        String addproducttext = Cart.ECProductName.getText();
        Cart.AddProductsInClick();
        getTest().log(Status.PASS, "Add product to Cart");
//        Cart.ValidateproductNameTag(addproducttext);
        Cart.IncreaseProductFromBag();
        Thread.sleep(3000);
        Cart.DecreaseProductFromBag();
        Cart.RemoveProductFromBag();
        getTest().log(Status.PASS, "Decrease Product Quntity in Cart page");
        Cart.BackToHome();
        getTest().log(Status.PASS, "Back to Home page");


    }


    @Test(priority = 1)
    public void DifferentProductOnDiffType() throws InterruptedException {
        //TSW_2.1.9
        getTest().log(Status.PASS, "TestCase adding product from two different Business groups");

        Cart = new CartPagePF(driver);
//        Cart.BackToHome();
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked on the make up business group");
//        String addproducttext = Cart.ECProductName.getText();
        Cart.AddProductsInClick();
        getTest().log(Status.PASS, "Add product to Cart");
//        Cart.ValidateproductNameTag(addproducttext);
//        Cart.BackToHome();
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked on the Second Business group");
//        String addproducttextNext = Cart.ECProductNameNext.getText();
        Cart.AddProductsInClick();
//        Cart.ValidateproductNameTagNext(addproducttextNext);
        getTest().log(Status.PASS, "Add the product to Cart from second business group");
        Cart.clickOnMyBag();
        getTest().log(Status.PASS, "Clicked on My Bag");
        Cart.RemoveProduct();
        getTest().log(Status.PASS, "Clicked on the removed product");
        Cart.BackToHome();
        getTest().log(Status.PASS, "Back to home page");
    }

    @Test(priority = 1)
    public void RemoveAllProductsInBag() throws InterruptedException, FileNotFoundException {
        //TSW_2.1.11

        Cart = new CartPagePF(driver);
        LoginWebPF login = new LoginWebPF(driver);
        Thread.sleep(4000);
        Cart.clickOnMyBag();
        Cart.RemoveCompleteListFromCart();
        Cart.BackToHome();
    }

    @Test(priority = 1)
    public void ClickProductOnCart() throws InterruptedException {
        //TSW_2.1.12

        getTest().log(Status.PASS, "TestCase product on Cart");

        Cart = new CartPagePF(driver);
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked on the make up business group");
//        String addproducttext = Cart.ECProductName.getText();
        Cart.AddProductsInClick();
        getTest().log(Status.PASS, "Add product to Cart");
//        Cart.ValidateproductNameTag(addproducttext);
        Cart.ClickOnProductCart();
        getTest().log(Status.PASS, "Clicked on the Product in Cart page");
        Cart.clickOnMyBag();
        getTest().log(Status.PASS, "Clicked on the My Bag");
        Cart.RemoveProduct();
        getTest().log(Status.PASS, "Remove the the product from Cart");
        Cart.BackToHome();
        getTest().log(Status.PASS, "Back to home page");
    }


}

