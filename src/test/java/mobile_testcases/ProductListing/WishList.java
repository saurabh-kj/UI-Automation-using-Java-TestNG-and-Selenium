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
public class WishList{

	AppiumDriver driver = null;
	CartPageAPF Cart;
	ProductListPageAPF PLP;
	WishListAPF WishList;
	LoginWebPF login;

	@Parameters({"env", "browsername"})

	@BeforeClass
	public void setup(@Optional("url") String env, @Optional("android") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = (AppiumDriver) baseClass.getDriver();


		login = new LoginWebPF(driver);
		Cart = new CartPageAPF(driver);
		Cart.ClickCloseTheBanner();
		Cart.ClickOnBurgerMenu();
		Cart.enterMobileNo();
        Cart.otpValue();
        Cart.clickOnVerifyNow();
        Thread.sleep(5000);
	}


	@Test(priority = 1)
	public void WishListColorChangeValidation() throws InterruptedException {
		PLP = new ProductListPageAPF(driver);
		Cart = new CartPageAPF(driver);
		WishList = new WishListAPF(driver);

		//#TSW_1.1.7
		getTest().log(Status.PASS, "Test Case For wishlist Colour validation");
		Cart.ClickOnBurgerMenu();
		getTest().log(Status.PASS, "Clicked On Burger Menu");
		//Cart.ClickBackOnSideBurgerMenu();
		Cart.ClickOnBusinessGroup();
		getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
		Cart.ClickOnCategory();
		getTest().log(Status.PASS, "Clicked on the Category ");
		Cart.ClickOnSubCategory();
		getTest().log(Status.PASS, "Clicked on the SubCategory ");
		//WishList.ClickAddToWishList();
		getTest().log(Status.PASS, "Clicked on the add to wishlist");
		PLP.ValidateWishListTag();
		getTest().log(Status.PASS, "validating the Wishlist Tag ");
		Cart.ClickOnBackToHome();
		getTest().log(Status.PASS, "Clicked on Back to Home page");

		//Uncommentabove line late when issue is fixed
	}

	@Test(priority = 1)
	public void RemoveTheProductFromWishList() throws InterruptedException {
		PLP = new ProductListPageAPF(driver);
		Cart = new CartPageAPF(driver);
		WishList = new WishListAPF(driver);

		//#TSW_1.1.8
		getTest().log(Status.PASS, "Test Case For Remove the product from wishlist product");
		Cart.ClickOnBurgerMenu();
		getTest().log(Status.PASS, "Clicked On Burger Menu");
		Cart.ClickBackOnSideBurgerMenu();
		Cart.ClickOnBusinessGroup();
		getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
		Cart.ClickOnCategory();
		getTest().log(Status.PASS, "Clicked on the Category ");
		Cart.ClickOnSubCategory();
		getTest().log(Status.PASS, "Clicked on the SubCategory ");
		WishList.ClickAddToWishList();
//		WishList.EmptyWishList();
		getTest().log(Status.PASS, "Removing product from wishlist page");
		Cart.ClickOnBackToHome();
		getTest().log(Status.PASS, "Back to home page");

		//Uncommentabove line late when issue is fixed
	}

	@Test(priority = 1)
	public void AddToWishListFromProductPage() throws InterruptedException {
		PLP = new ProductListPageAPF(driver);
		Cart = new CartPageAPF(driver);
		WishList = new WishListAPF(driver);

		//#TSW_1.1.9-#TSW_1.1.10
		//Login();
		getTest().log(Status.PASS, "Test Case For Remove the product from wishlist product");
		Cart.ClickOnBurgerMenu();
		getTest().log(Status.PASS, "Clicked On Burger Menu");
		Cart.ClickBackOnSideBurgerMenu();
		Cart.ClickOnBusinessGroup();
		getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
		Cart.ClickOnCategory();
		getTest().log(Status.PASS, "Clicked on the Category ");
		Cart.ClickOnSubCategory();
		getTest().log(Status.PASS, "Clicked on the SubCategory ");
		PLP.ClickOnProduct();
		getTest().log(Status.PASS, "Clicked on product in Product listing page");
		WishList.WishListFromProductPage();
		getTest().log(Status.PASS, "Clicked on Wishlist in Product description page");
		PLP.AddProductPageWishListValidation();
		getTest().log(Status.PASS, "Adding product After adding product to wishlist");
		WishList.WishListFromProductPage();
		getTest().log(Status.PASS, "Removing the wishlist from the product description page");
		PLP.AddProductPageWishListValidation();
		getTest().log(Status.PASS, "Validation for the wishlist of product");
		Cart.ClickOnBackToHome();
		getTest().log(Status.PASS, "Back to home page");

		//Uncommentabove line late when issue is fixed
	}


	@Test(priority = 0)
	public void AddTheProductFromMyWishListPage() throws InterruptedException {
		PLP = new ProductListPageAPF(driver);
		Cart = new CartPageAPF(driver);
		WishList = new WishListAPF(driver);

		getTest().log(Status.PASS, "Test Case For adding product from wishlist page");

		Cart.ClickOnBurgerMenu();
		getTest().log(Status.PASS, "Clicked On Burger Menu");
		//Cart.ClickBackOnSideBurgerMenu();
		Cart.ClickOnBusinessGroup();
		getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
		Cart.ClickOnCategory();
		getTest().log(Status.PASS, "Clicked on the Category ");
		Cart.ClickOnSubCategory();
		getTest().log(Status.PASS, "Clicked on the SubCategory ");
		WishList.ClickAddToWishList();
		getTest().log(Status.PASS, "Clicked on wishlist");
//		WishList.EmptyWishList();
		getTest().log(Status.PASS, "Validation for wishlist");
		Cart.ClickOnBackToHome();
		getTest().log(Status.PASS, "Clicked on back to home page");

		//Uncommentabove line late when issue is fixed
	}

	@Test(priority = 1)
	public void AddToWishListFromOnWishList() throws InterruptedException {
		PLP = new ProductListPageAPF(driver);
		Cart = new CartPageAPF(driver);
		WishList = new WishListAPF(driver);


		//#TSW_1.1.19-#TSW_1.1.20
		getTest().log(Status.PASS, "Test Case For product from Checkout page from wishlist page");

		Cart.ClickOnBurgerMenu();
		getTest().log(Status.PASS, "Clicked On Burger Menu");
		Cart.ClickBackOnSideBurgerMenu();
		Cart.ClickOnBusinessGroup();
		getTest().log(Status.PASS, "Clicked On the Makeup Business Group");
		Cart.ClickOnCategory();
		getTest().log(Status.PASS, "Clicked on the Category ");
		Cart.ClickOnSubCategory();
		getTest().log(Status.PASS, "Clicked on the SubCategory ");
		PLP.ClickOnProduct();
		getTest().log(Status.PASS, "Clicked on product For checkout page to PDP page");
		WishList.WishListFromProductPage();
		getTest().log(Status.PASS, "Clicked on Adding product to wishlist/save");
		Cart.ClickOnBackToHome();
		getTest().log(Status.PASS, "Back to home page");
		WishList.ClickMyWishList();
		getTest().log(Status.PASS, "Clicked on My wishlist page");
		PLP.ClickOnProduct();
		getTest().log(Status.PASS, "Opened product from My wishlist page");
		PLP.AddProductPageWishListValidation();
		getTest().log(Status.PASS, "Validating the product from the added to wishlist");
		Cart.ClickOnBurgerMenu();
		getTest().log(Status.PASS, "Clicked on burger menu");
		WishList.MyAccountWishList();
		getTest().log(Status.PASS, "Checking if the product is added in is removed on wishlist page");
		Cart.ClickOnBackToHome();
		getTest().log(Status.PASS, "Back to home page");


		//Uncommentabove line late when issue is fixed
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}