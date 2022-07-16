package desktop_testcases.Common;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Cart.CartPagePF;
import desktop_pagefactory.test.Checkout.PlaceOrderPF;
import desktop_pagefactory.test.Common.SearchPF;
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
    WebDriver driver = null;
    SearchPF search;
    PlaceOrderPF clickToAdd;
    CartPagePF cart;


    @Parameters({"env", "browsername"})

    @BeforeClass
    public void OpenWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
        System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");
        System.out.println("Inside Step - browser is open");
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();
        search = new SearchPF(driver);
        clickToAdd = new PlaceOrderPF(driver);
        cart = new CartPagePF(driver);
    }
    //--------------------------search field------------------------//
    @Test(priority = 0)
    public void search() throws FileNotFoundException, InterruptedException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("Search Functionality");
        getTest().log(Status.PASS, "Test Case for Search field");

        search.search();
        getTest().log(Status.PASS, "Clicking on search field");

        search.search_validation();
        getTest().log(Status.PASS, "Validating search field");

        search.backToHome();
        getTest().log(Status.PASS,"Back to home page");
    }
    //------------------trending products----------------------------//
    @Test(priority = 1)
    public void trendingOnTrell() throws FileNotFoundException, InterruptedException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("Search Functionality");
        getTest().log(Status.PASS, "Test Case for sorting products");
        Thread.sleep(4000);
        search.trendingItems();
        getTest().log(Status.PASS,"Getting total count of Trending Search Items");

        //---validation-----//
        search.trendingItemValidations();
        getTest().log(Status.PASS,"Validating all available trending items");

        search.backToHome();
        getTest().log(Status.PASS,"Back to home page");

    }
    //-------------------search by valid brand name-----------------------//
    @Test(priority = 2)
    public void validBrandNameKeyword() throws FileNotFoundException, InterruptedException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("Search Functionality");
        getTest().log(Status.PASS, "Test Case for Search by valid Brand Name");
        Thread.sleep(4000);
        search.search();
        getTest().log(Status.PASS, "Clicking on search field");

        search.searchByBrandName();
        getTest().log(Status.PASS, "inputting valid brand name");

        search.pressEnterBtn();
        getTest().log(Status.PASS, "Click on enter");

        search.searchResultPageValidation();
        getTest().log(Status.PASS, "Checking page title for Search Result page");

        search.backToHome();
        System.out.println("Clicked here");
        getTest().log(Status.PASS, "Returning back to homepage");
    }
    //-----------------search by misstype brand name-----------------//
    @Test(priority = 3)
    public void invalidBrandNameKeyword() throws FileNotFoundException, InterruptedException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("Search Functionality");
        getTest().log(Status.PASS, "Test Case for Search by mistype Brand Name");
        Thread.sleep(4000);
        search.search();
        getTest().log(Status.PASS, "Clicking on search field");

        search.searchBrandByWrongName();
        getTest().log(Status.PASS,"Search brand by typing wrong");

        search.pressEnterBtn();
        getTest().log(Status.PASS, "Click on enter");

        search.searchResultPageValidation();
        getTest().log(Status.PASS, "Checking page title for Search Result page");

        search.backToHome();
        getTest().log(Status.PASS,"Back to home page");
    }
    //--------------clicking on view all details button------------------//
    @Test(priority = 4)
    public void product_showing_in_bottom_for_view_all_details_button() throws FileNotFoundException, InterruptedException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("Search Functionality");
        getTest().log(Status.PASS, "Test Case for sorting products");
        Thread.sleep(4000);
        search.searchProductForViewAllDetailsButton();
        getTest().log(Status.PASS,"Searching product for view all details");

        search.viewAllElementsDisplay();
        getTest().log(Status.PASS,"View all element display");

        search.viewAllElementShow();
        getTest().log(Status.PASS,"View all element show");

        search.backToHome();
        getTest().log(Status.PASS,"Back to home page");
    }
    //--------------------search product and add to bag---------------//
    @Test(priority = 5)
    public void searchProducttoAddtoBag() throws FileNotFoundException, InterruptedException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("Search Functionality");
        getTest().log(Status.PASS, "Test Case for Search products and Add to Bag");
        Thread.sleep(4000);
        search.searchAnyTerm("cream");
        getTest().log(Status.PASS,"Search products with keyword");

        search.viewAllElementShow();
        getTest().log(Status.PASS,"Click on View all button");

        clickToAdd.addtoBagSimpleProduct(2);
        getTest().log(Status.PASS,"Added products from Search Result page");

        clickToAdd.addProductfromPD();
        getTest().log(Status.PASS,"Added product from PD page");

        clickToAdd.clickOnViewBag();
        getTest().log(Status.PASS,"Click on View Bag button");

        cart.listOfAllProducts();
        getTest().log(Status.PASS,"Checking all added product from Cart Page");
    }

    @AfterClass
    public void tearDown() {driver.quit();
    }
}