package mobile_testcases.Cart;

import mobile_pagefactory.Cart.CartPageAPF;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;
import utils.YamlReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class CartTestCases {


    AppiumDriver driver = null;
    CartPageAPF Cart;
    LoginWebPF login;


   @Parameters({"env", "browsername"})

   @BeforeClass
   public void setup(@Optional("url") String env, @Optional("android") String browsername) throws IOException, InterruptedException, IOException {
       BaseClass baseClass = new BaseClass(env, browsername);
       baseClass.chromeDriverManager(env);
       this.driver = (AppiumDriver) baseClass.getDriver();
       Cart = new CartPageAPF(this.driver);
       Cart = new CartPageAPF(driver);
       login = new LoginWebPF(driver);
   }


    @Test(priority = 0)
    public void Login() throws InterruptedException, FileNotFoundException {


        Cart.ClickCloseTheBanner();
//        Cart.ClickOnBurgerMenu();
////          Cart.ClickBackOnSideBurgerMenu();
//        Login = new LoginWebPF(driver);
//        Cart.enterMobileNo();
//        Cart.otpValue();
//        Cart.clickOnVerifyNow();
//        Thread.sleep(5000);

    }


    @Test(priority = 2)
    public void AddProductToBag() throws InterruptedException, FileNotFoundException {
        CartPageAPF Cart = new CartPageAPF(driver);
        //#TSW_2.1.6

//        Cart.ClickCloseTheBanner();
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "AddProductToBag Method");
        getTest().log(Status.PASS, "Test Case is to add product Sucessfully to Cart Page");
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        //Cart.ClickBackOnSideBurgerMenu();
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked on the Category ");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked on the Subcategory");
        Cart.AddProductsInClickAndViewBag();
        getTest().log(Status.PASS, "Add Product to Bag");
        Cart.MyBagPageProductValidation();
        getTest().log(Status.PASS, "My Bag validation");
         Cart.RemoveProductFromBag();
        getTest().log(Status.PASS, "Removing product from bag");
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to home page");
    }


    //Note:-Important this case will never sucess Blocker need to fix on prority(#TSW_2.1.5)
    @Test(priority = 7)
    public void DecreaseTheCartValue() throws InterruptedException {
        CartPageAPF Cart = new CartPageAPF(driver);

//        Cart.ClickCloseTheBanner();
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Increase and DecreaseTheCartValue Method");
        getTest().log(Status.PASS, "Testcase to Increase and  Decrease Quanity in Cart");
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        //Cart.ClickBackOnSideBurgerMenu();//c
        Cart.ClickOnBusinessGroup();//c
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();//c
        getTest().log(Status.PASS, "Clicked on the Category ");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked on the Subcategory");
        Cart.AddProductsInClickAndViewBag();
        getTest().log(Status.PASS, "Add Product to Bag and view bag");
        //Cart.ClickOnProceed();
        //Cart.LoginToAppInCheckOut();
        Cart.ChangeProductQuantity();
        getTest().log(Status.PASS, "Increase the product Quantity");

        Cart.ClickDecreaseQuantity();
        getTest().log(Status.PASS, "Decrease Quantity of the product");
        Cart.RemoveProductFromBag();
        getTest().log(Status.PASS, "Removing product from bag");
        getTest().log(Status.PASS, "Going back from checkout page");
////        Cart.CheckBagisEmptyValidation();
        Cart.ClickOnBackToCart();
        getTest().log(Status.PASS, "Back From Cart Page");
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to Home Page");
    }

    @Test(priority = 7)
    public void IncreaseMyBagQuanity() throws InterruptedException {

        //#TSW_2.1.7
        Cart = new CartPageAPF(driver);
//        Cart.ClickCloseTheBanner();
        getTest().log(Status.PASS, "IncreaseMyBagQuanity Method");
        getTest().log(Status.PASS, "TestCase For Product Quantity in Cart page ");
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked on the Category ");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked on the Subcategory");
        Cart.AddProductsInClick();
        getTest().log(Status.PASS, "Add Product to Bag");
        Cart.ClickOnMyBagInCart();
        getTest().log(Status.PASS, "Clicked on My Bag");
        Cart.ChangeProductQuantity();
        getTest().log(Status.PASS, "Increase the quantity of the product");
        Cart.RemoveProductFromBag();
        getTest().log(Status.PASS,"Remove product from bag");
        driver.navigate().back();
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to Home Page");

    }

    @Test(priority = 4)
    public void AddSameProductInMyBagQuanity() throws InterruptedException {

        //#TSW_2.1.8

        getTest().log(Status.PASS, "AddSameProductInMyBagQuanity Method");
        getTest().log(Status.PASS, "Test Cases is for Adding same product multiple times");
        Cart = new CartPageAPF(driver);
//        Cart.ClickCloseTheBanner();
        for (int i = 1; i <= 2; i++) {
            Cart.ClickOnBurgerMenu();
            getTest().log(Status.PASS, "Clicked On Burger Menu");
            Cart.ClickOnBusinessGroup();
            getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
            Cart.ClickOnCategory();
            getTest().log(Status.PASS, "Clicked On the Category");
            Cart.ClickOnSubCategory();
            getTest().log(Status.PASS, "Clicked On the Subcategory");
            Cart.AddProductsInClickAndViewBag();
            getTest().log(Status.PASS, "Add Product to Bag");
            Cart.RemoveProductFromBag();
            getTest().log(Status.PASS,"Remove product from bag");
            Cart.ClickOnBackToHome();
            getTest().log(Status.PASS, "Back to home page");
        }
    }

    @Test(priority = 5)
    public void DifferentProducttoCart() throws InterruptedException {

        //#TSW_2.1.9
        getTest().log(Status.PASS, "DifferentProducttoCart Method");

        getTest().log(Status.PASS, "Testcase for Adding Different product from different Bussiness Group");
        Cart = new CartPageAPF(driver);
//        Cart.ClickCloseTheBanner();
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        Cart.AddProductsInClickAndViewBag();
        getTest().log(Status.PASS, "Add Product to Bag");
        Cart.RemoveProductFromBag();
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to Home Page From Make Up Bussiness group");
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
//        Cart.ClickBackOnSideBurgerMenu();
        Cart.ClickOnBusinessGroupSkincare();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategorySkincare();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategorySkincare();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        Cart.AddProductsInClickAndViewBag();
        getTest().log(Status.PASS, "Add Product to Bag");
        Cart.RemoveProductFromBag();
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to Home Page From Skin Care Bussiness group");

    }



    @Test(priority = 5)
    public void RedirectTOProductPage() throws InterruptedException {

        //#TSW_2.12

        getTest().log(Status.PASS, "RedirectTOProductPage Method");

        getTest().log(Status.PASS, "Test Cases To redirect From Cart Page to Product Page");
        Cart = new CartPageAPF(driver);
//        Cart.ClickCloseTheBanner();
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        Cart.AddProductsInClick();
        getTest().log(Status.PASS, "Add Product to Bag");
        Cart.ClickOnMyBagInCart();
        Cart.RemoveProductFromBag();
        getTest().log(Status.PASS, "Clicked on MyBag ");
//        Cart.RedirectToProductDescriptionPage();
        getTest().log(Status.PASS, "Clicked On the Product to Redirect to Product Description page");
//        Cart.ClickOnMyBagInCart();
        getTest().log(Status.PASS, "Clicked on My Bag  ");
//        Cart.RemoveProductFromBag();
        getTest().log(Status.PASS, "Removed Product from Cart page");
        Cart.ClickOnBackToHome();

    }


    @Test(priority = 5)
    public void RedirectTOCheckOutPage() throws InterruptedException {

        //#TSW_2.18
        getTest().log(Status.PASS, "RedirectTOCheckOutPage Method");

        getTest().log(Status.PASS, "Testcase to redirect to checkout page");

        Cart = new CartPageAPF(driver);
//        Cart.ClickCloseTheBanner();
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        Cart.AddProductsInClick();
        getTest().log(Status.PASS, "Add Product to Bag");
        Cart.ClickOnMyBagInCart();
        getTest().log(Status.PASS, "Clicked on MyBag ");
        Cart.ClickOnProceed();
        getTest().log(Status.PASS, "Clicked on Proceed to CheckOut ");
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Clicked Back to Home Page");

    }

//    @Test(priority = 5)
//    public void TotalTaxValidation() throws InterruptedException {
//
//        //#TSW_2.19/20
//        Cart = new CartPageAPF(driver);
//        Cart.ClickOnBurgerMenu();
//        Cart.ClickOnCategory();
//        Cart.ClickOnCategory();
//        Cart.ClickOnSubCategory();
//        Cart.AddProductsInClick();
//        Cart.ClickOnMyBag();
//        Cart.ClickOnProceed();
//        Cart.ClickOnBackToHome();
//
//    }

    @AfterTest
    public void navigateHome(){
        driver.quit();
    }
}

