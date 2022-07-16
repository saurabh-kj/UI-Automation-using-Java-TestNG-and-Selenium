package desktop_testcases.Common;

import com.aventstack.extentreports.Status;
import desktop_pagefactory.test.Common.HomePagePF;
import desktop_pagefactory.test.Login.LoginWebPF;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.BaseClass;
import utils.YamlReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class HomePage {
    private static final TimeUnit Thred = null;
    WebDriver driver = null;
    HomePagePF homepage;
    LoginWebPF login;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException {
        System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");
        System.out.println("Inside Step - browser is open");
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();
        login = new LoginWebPF(driver);
        homepage = new HomePagePF(driver);
//
//        Login.enterMobileNo("9999999999");
//        Login.otpValue("123456");
//        Login.clickOnVerifyNow();

    }
    @Test(priority = 0)
    public void home_page() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case for home page");
        homepage.shoptrell_logo();
        homepage.search_logo();
        homepage.signuplogin();
        homepage.baglogo();
    }
    @Test(priority = 1)
    public void module() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case for home page to show all module");
        homepage.mekup();
        homepage.skinecare();
        homepage.hair();
        homepage.fragrance();
        homepage.bathbody();
        homepage.mensgrooming();
        homepage.tools();
        homepage.personal();
        homepage.health();
        homepage.brand();
        homepage.mombaby();
        homepage.womenswear();
        homepage.menswear();
        homepage.kidswear();
        homepage.bags();
        homepage.luggage();
    }
    @Test(priority = 2)
    public void product_option() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case for home page to show product option");
        homepage.offer();
        homepage.men();
        homepage.women();
        homepage.kid();
        homepage.beauty();
//        homepage.fragrancep();
//        homepage.wellness();
    }

//    @Test(priority = 3)
//    public void sell_offers() throws Exception {
//        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
//        getTest().log(Status.PASS, "Test Case for home page to show sell offer");
//        homepage.megasell();
//        homepage.crackingdeal1();
//        homepage.cracklingdeal2();
//        homepage.click_on_poster();
////        homepage.cracklingdeal3();
////        homepage.cracklingdeal4();
////        homepage.grabtheme();
////        homepage.festivedelight();
////        homepage.hairposter();
//    }
    //    @Test(priority = 4)
//    public void all_products() throws InterruptedException {
//        homepage.all_productor.findElement(AjaxElementLocator.java:99)
//	at org.openqa.selenium.support.desktop_pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)
//	at com.sun.proxy.$Proxy13.isDisplayed(Unknown Source)
//	at desktop_pagefactory.test.Home.HomePagePF.skinecare(HomePagePF.java:174)s();
//    }
//    @Test(priority = 5)
//    public void hover_option() throws InterruptedException {
//        homepage.hover();
//        Thread.sleep(5000);
//    }
//    @Test(priority = 6)
//    public void poster_click() throws InterruptedException {
//        homepage.click_on_poster();
//        homepage.cick_on_poster_verify();
//    }
//    @Test(priority = 7)
//    public void offers_click() throws InterruptedException {
//        homepage.click_on_offers();
//        homepage.cick_on_offer_verify();
//    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}