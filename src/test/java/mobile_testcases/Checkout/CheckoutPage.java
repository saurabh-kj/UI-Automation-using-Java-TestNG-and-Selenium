package mobile_testcases.Checkout;

import mobile_pagefactory.Cart.CartPageAPF;
import mobile_pagefactory.Checkout.CheckOutPageAPF;
import mobile_pagefactory.ProductListing.ProductListPageAPF;
import mobile_pagefactory.ProductListing.WishListAPF;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;

import java.io.IOException;

import static utils.extent.ExtentTestManager.getTest;


@Listeners(utils.ListenerClass.class)
public class CheckoutPage {
    AppiumDriver driver = null;
    CartPageAPF Cart;
    LoginWebPF login;
    ProductListPageAPF PLP;
    WishListAPF WishList;
    CheckOutPageAPF CKO;

    @BeforeClass
    public void setup(@Optional("url") String env, @Optional("android") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = (AppiumDriver) baseClass.getDriver();

        Cart = new CartPageAPF(driver);
        //CKO is fullform of Checkout
        CKO = new CheckOutPageAPF(driver);
        Cart.ClickCloseTheBanner();


    }
    @Test(priority = 0)
    public void Login() throws InterruptedException {

        getTest().log(Status.PASS, "Test Case For Login to website");

        Cart.ClickOnBurgerMenu();
        //Cart.ClickBackOnSideBurgerMenu();
        //Login = new LoginWebPF(driver);
        Cart.enterMobileNo();
        getTest().log(Status.PASS, "Enter mobile number");
        Cart.otpValue();
        getTest().log(Status.PASS, "Enter verification process");
        Cart.clickOnVerifyNow();
        getTest().log(Status.PASS, "Logged in to the application sucessfully");


    }

    @Test(priority = 1)
    public void CheckOutProductByCOD() throws InterruptedException {

//        Login();
        getTest().log(Status.PASS, "Test Case For Placing order on Cash On Delivery");
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        //Cart.ClickBackOnSideBurgerMenu();
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked on the Category ");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked on the SubCategory ");
        Cart.AddProductsInClickAndViewBag();
        getTest().log(Status.PASS, "Clicked on the Add product to bag and view bag ");
        Cart.ClickOnProceed();
        getTest().log(Status.PASS, "Clicked on the proceed to Checkout");
        CKO.ClickCashOnDelivery();
        getTest().log(Status.PASS, "Clicked on the Payment method and choose Cash On Delivery");
        //CKO.ClickPlaceOrder();
        getTest().log(Status.PASS, "Commented line Clicked on Place Order to confirm the product placement");


        //need to remove below 2 lines
        CKO.ClickBackOnCheckoutPage();
        getTest().log(Status.PASS, "Clicked on the Back from Check Out Page");
        CKO.ClickBackOnMyBag();
        getTest().log(Status.PASS, "Clicked on the Back from Cart Page");
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Clicked on the Back to home page");


    }

    @Test(priority = 1)
    public void CheckOutProductByOnlinePayments() throws InterruptedException {

        getTest().log(Status.PASS, "Test Case For Placing order on Choose Online Payment payment method");
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        //Cart.ClickBackOnSideBurgerMenu();
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked on the Category ");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked on the SubCategory ");
        Cart.AddProductsInClickAndViewBag();
        getTest().log(Status.PASS, "Clicked on the Add product to bag and view bag ");
        Cart.ClickOnProceed();
        getTest().log(Status.PASS, "Clicked on the proceed to Checkout");
        //CKO.ClickCashOnDelivery();
        getTest().log(Status.PASS, "Clicked on Online payment method");
        CKO.ClickPlaceOrder();
        getTest().log(Status.PASS, "Clicked on the proceed to Place Order");


        //need to remove below 2 lines
        driver.navigate().back();
        CKO.ClickBackOnCheckoutPage();
        getTest().log(Status.PASS, "Clicked on the back from Checkout Page");
        CKO.ClickBackOnMyBag();
        getTest().log(Status.PASS, "Clicked on the back from Cart page");
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Clicked on the back to home page");

    }

    @Test(priority = 4)
    public void AddNewAddressOnCheckOutPage() throws InterruptedException {
//        Login();
        getTest().log(Status.PASS, "Test Case For Placing order on Choose Online Payment payment method");
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        //Cart.ClickBackOnSideBurgerMenu();
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked on the Category ");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked on the SubCategory ");
        Cart.AddProductsInClickAndViewBag();
        getTest().log(Status.PASS, "Clicked on the Add product to bag and view bag ");
        Cart.ClickOnProceedForAddress();
        getTest().log(Status.PASS, "Clicked on the Proceed to checkout");
        getTest().log(Status.PASS, "Clicked on the Change Address Button");
        CKO.EnterAddressPageFullName();
        getTest().log(Status.PASS, "Clicked on the FullName With Full name entered");
        CKO.EnterPinCode();
        getTest().log(Status.PASS, "Clicked on the PinCode field and enter pin code");
        CKO.EnterAddress();
        getTest().log(Status.PASS, "Clicked on the Address field and enter Complete Addresss");
        CKO.EnterLandMark();
        getTest().log(Status.PASS, "Clicked on the Land mark field and enter Near by land mark");
        CKO.clickOnVerifyAddAddress();
        getTest().log(Status.PASS, "Clicked on the Verify Address and save & proceed with selected address");
        Cart.ClickOnMyBagInCart();
        getTest().log(Status.PASS, "Clicked on My Bag  ");
        Cart.RemoveProductFromBag();
        getTest().log(Status.PASS, "Removed Product from Cart page");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
