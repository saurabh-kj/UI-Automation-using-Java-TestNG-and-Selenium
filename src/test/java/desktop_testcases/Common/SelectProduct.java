package desktop_testcases.Common;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import desktop_pagefactory.test.Common.SelectProductPF;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class SelectProduct {
    private static final TimeUnit Thred = null;
    WebDriver driver = null;
    SelectProductPF sltproduct;
    LoginWebPF login;

    @Parameters({"env","browsername"})

    @BeforeClass
    public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
        System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");
        System.out.println("Inside Step - browser is open");
        BaseClass baseClass=new BaseClass(env,browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();

        login = new LoginWebPF(driver);
        sltproduct = new SelectProductPF(driver);
//        Login.clickLogin();
//        Login.enterMobileNo("9999999999");
//        Login.otpValue("987699");
//        Login.clickOnVerifyNow();

    }
    @Test(priority = 0)
    public void select_product() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case for selecting product");
        sltproduct.product();
        Thread.sleep(5000);
        getTest().log(Status.PASS, "Clicking on business module");
        sltproduct.plp_validation();
        Thread.sleep(4000);
        sltproduct.SelectProduct();
        Thread.sleep(3000);
        getTest().log(Status.PASS, "Product selection");
        sltproduct.pdp_validation();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }}



