package mobile_testcases.ProductListing;

import mobile_pagefactory.Cart.CartPageAPF;
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
public class ProductListPageTestCases {


    AppiumDriver driver = null;
    CartPageAPF Cart;
    LoginWebPF login;
    ProductListPageAPF PLP;
    WishListAPF WishList;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void setup(@Optional("url") String env, @Optional("android") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = (AppiumDriver) baseClass.getDriver();
    }

    @Test(priority = 0)
    public void Login() throws InterruptedException {
        Cart = new CartPageAPF(this.driver);
        Cart.ClickCloseTheBanner();
        Cart.ClickOnBurgerMenu();
        //Cart.ClickBackOnSideBurgerMenu();
        //Login = new LoginWebPF(driver);
        Cart.enterMobileNo();
        Cart.otpValue();
        Cart.clickOnVerifyNow();

    }

    @Test(priority = 1)
    public void BestSellerAndProductPage() throws InterruptedException {
        PLP = new ProductListPageAPF(driver);
        Cart = new CartPageAPF(driver);

        getTest().log(Status.PASS, "Best Seller and product page Method");
        //#TSW_1.1.3-TSW_1.1.5

        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        PLP.ValidateBestSellerProduct();
        PLP.ValidateProductPageValidation();
        Cart.ClickOnBackToHome();

    }

    @Test(priority = 2)
    public void WishListColorChangeValidation() throws InterruptedException {
        PLP = new ProductListPageAPF(driver);
        Cart = new CartPageAPF(driver);
        WishList = new WishListAPF(driver);

        //#TSW_1.1.7
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        //WishList.ClickAddToWishList();
        PLP.ValidateWishListTag();
        Cart.ClickOnBackToHome();

        //Uncommentabove line late when issue is fixed
    }

    @Test(priority = 3)
    public void RemoveTheProductFromWishList() throws InterruptedException {
        PLP = new ProductListPageAPF(driver);
        Cart = new CartPageAPF(driver);
        WishList = new WishListAPF(driver);

        //#TSW_1.1.8
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        //WishList.ClickAddToWishList();
        WishList.EmptyWishList();
        Cart.ClickOnBackToHome();

        //Uncommentabove line late when issue is fixed
    }

    @Test(priority = 4)
    public void AddToWishListFromProductPage() throws InterruptedException {
        PLP = new ProductListPageAPF(driver);
        Cart = new CartPageAPF(driver);
        WishList = new WishListAPF(driver);

        //#TSW_1.1.9-#TSW_1.1.10
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        PLP.ClickOnProduct();
        WishList.WishListFromProductPage();
        PLP.AddProductPageWishListValidation();
        WishList.WishListFromProductPage();
        PLP.AddProductPageWishListValidation();
        Cart.ClickOnBackToHome();

        //Uncommentabove line late when issue is fixed
    }


    @Test(priority = 5)
    public void AddTheProductFromMyWishListPage() throws InterruptedException {
        PLP = new ProductListPageAPF(driver);
        Cart = new CartPageAPF(driver);
        WishList = new WishListAPF(driver);

        Login();
        //#TSW_1.1.8
//        Cart.ClickCloseTheBanner();
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        WishList.ClickAddToWishList();
        getTest().log(Status.PASS, "Clicked On the Add to wishlist");
        WishList.EmptyWishList();
        getTest().log(Status.PASS, "Empty Cart validatation");
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to home");


        //Uncommentabove line late when issue is fixed
    }

    @Test(priority = 6)
    public void AddToWishListFromOnWishList() throws InterruptedException {
        PLP = new ProductListPageAPF(driver);
        Cart = new CartPageAPF(driver);
        WishList = new WishListAPF(driver);

        //#TSW_1.1.19-#TSW_1.1.20
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategory();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        PLP.ClickOnProduct();
        getTest().log(Status.PASS, "Clicked On the Product");
        WishList.WishListFromProductPage();
        getTest().log(Status.PASS, "Clicked On the Wishlist the product");
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to home page");
        WishList.ClickMyWishList();
        getTest().log(Status.PASS, "Go to my wishlist page");
        PLP.ClickOnProduct();
        getTest().log(Status.PASS, "Clicked on product");
        PLP.AddProductPageWishListValidation();
        getTest().log(Status.PASS, "Product validation from wishlist page");
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to home page");

        //Uncommentabove line late when issue is fixed
    }



    @Test(priority = 7)
    public void ExpertReview() throws InterruptedException {
        PLP = new ProductListPageAPF(driver);
        Cart = new CartPageAPF(driver);
        WishList = new WishListAPF(driver);

        //#TSW_1.1.19-#TSW_1.1.20
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategorykajal();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        Cart.ClickOnKajalproduct();
        getTest().log(Status.PASS, "Clicked On the Kajal product");
        PLP.ExpertReview();
        getTest().log(Status.PASS, "Go to review expret option ");
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to home page");
    }

    @Test(priority = 8)
    public void AdditionalInformation() throws InterruptedException {
        PLP = new ProductListPageAPF(driver);
        Cart = new CartPageAPF(driver);
        WishList = new WishListAPF(driver);

        //#TSW_1.1.28-29
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategorykajal();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        Cart.ClickOnKajalproduct();
        getTest().log(Status.PASS, "Clicked On the Kajal product");
        PLP.AdditionalInformation();
        getTest().log(Status.PASS, "Go to additional information section");
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to home page");

    }

    @Test(priority = 9)
    public void BestSellerSort() throws InterruptedException {
        PLP = new ProductListPageAPF(driver);
        Cart = new CartPageAPF(driver);
        WishList = new WishListAPF(driver);

        //#TSW_1.1.31-42
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategorykajal();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        PLP.BestSeller();
        getTest().log(Status.PASS, "Clicked On the Best selleer");
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to home page");

    }


    @Test(priority = 10)
    public void FilterByBrand() throws InterruptedException {
        PLP = new ProductListPageAPF(driver);
        Cart = new CartPageAPF(driver);
        WishList = new WishListAPF(driver);

        //#TSW_1.1.43
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategorykajal();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        PLP.FilterPage();
        getTest().log(Status.PASS, "Clicked On the Filter page");
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to home page");

    }

    @Test(priority = 11)
    public void EnterSearchValue(){
        PLP = new ProductListPageAPF(driver);

        //#TSW_1.1.47-48
        PLP.SearchFieldValue();
        getTest().log(Status.PASS, "Entered Search value");


    }

    @Test(priority = 12)
    public void ChooseByCategory() throws InterruptedException {
        PLP = new ProductListPageAPF(driver);
        Cart = new CartPageAPF(driver);
        WishList = new WishListAPF(driver);

        //#TSW_1.1.49
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        PLP.ClickCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to home page");

    }

    @Test(priority = 13)
    public void CategoryFilterByBrand() throws InterruptedException {
        PLP = new ProductListPageAPF(driver);
        Cart = new CartPageAPF(driver);
        WishList = new WishListAPF(driver);

        //#TSW_1.1.49-TSW_1.1.69
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "Clicked On Burger Menu");
        Cart.ClickOnBusinessGroup();
        getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked On the Category");
        Cart.ClickOnSubCategorykajal();
        getTest().log(Status.PASS, "Clicked On the SubCategory");
        //PLP.CategoryFilterPage();
        //Gender
       // PLP.GenderFilterPage();
        //Price Range
       // PLP.PriceFilterPage();
        //sizeType
        PLP.SizeTypeFilterPage();
        getTest().log(Status.PASS, "Clicked On the Filter byt size type");
        Cart.ClickOnBackToHome();
        getTest().log(Status.PASS, "Back to home page");
    }

    @AfterTest
    public void navigateHome(){
        driver.quit();
    }
}
