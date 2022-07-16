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
public class HomePageItemHover {
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

    //---------------home page display item--------------------------//
    @Test(priority = 0)
    public void home_page_item() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case for home page");
        homepage.shoptrell_logo();
        homepage.search_logo();
        homepage.signuplogin();
        homepage.baglogo();
        Thread.sleep(3000);
    }

    //    @Test(priority = 3)
//    public void sell_offers() throws Exception {
//        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
//        getTest().log(Status.PASS, "Test Case for home page to show sell offer");
//        homepage.megasell();
//        homepage.crackingdeal1();
//        homepage.cracklingdeal2();
//        homepage.click_on_poster();
//    }
    //-----------------------hover functionality-------------------//
    @Test(priority = 1)
    public void hover_option() throws InterruptedException {
        homepage.hover();
        Thread.sleep(3000);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}