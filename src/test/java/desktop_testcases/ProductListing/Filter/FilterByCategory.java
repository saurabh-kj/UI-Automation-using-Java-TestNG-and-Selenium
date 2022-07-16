package desktop_testcases.ProductListing.Filter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Cart.CartPagePF;
import desktop_pagefactory.test.ProductListing.FilterByCategoryPF;
import desktop_pagefactory.test.Login.LoginWebPF;
import desktop_pagefactory.test.Orders.MyOrdersPF;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)

public class FilterByCategory {
    private static final TimeUnit Thred = null;
    WebDriver driver = null;
    FilterByCategoryPF filterbycategory;
    LoginWebPF login;
    MyOrdersPF myOrdersPF;

    @Parameters({"env", "browsername"})
    @BeforeClass
    public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
        System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();
        System.out.println("Inside Step - browser is open");
        login = new LoginWebPF(driver);
        filterbycategory = new FilterByCategoryPF(driver);

//        myOrdersPF=new MyOrdersPF(driver);
//        Login.clickLogin();
//        Login.enterMobileNo("9999999999");
//        Login.otpValue("987699");
//        Login.clickOnVerifyNow();

    }
    //---------------------filter by category-----------------------//
    @Test(priority = 0)
    public void goToSkinCare() throws InterruptedException, FileNotFoundException {
//        myOrdersPF.clickMyOrders();
        CartPagePF cart = new CartPagePF(driver);
//        Cart.BackToHome();
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case is to filter product on the basis of category");
        filterbycategory.skinep();
        getTest().log(Status.PASS, "Clicking on select skin product");
//        filterbycategory.skin_page_validation();
        Thread.sleep(5000);
        filterbycategory.filtercategory();
        getTest().log(Status.PASS, "Clicking on filter");
        filterbycategory.filter_by_category_validation();
        Thread.sleep(5000);
        filterbycategory.selectanycategory();
        getTest().log(Status.PASS, "Select category");
        Thread.sleep(5000);
        filterbycategory.exitfromfilter();
        getTest().log(Status.PASS, "Exit from filter");
        Thread.sleep(3000);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

