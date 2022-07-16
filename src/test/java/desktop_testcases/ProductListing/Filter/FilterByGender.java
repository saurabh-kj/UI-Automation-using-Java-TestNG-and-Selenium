package desktop_testcases.ProductListing.Filter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.ProductListing.FilterByGenderPF;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;
import utils.RetryAnalyzerTest;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class FilterByGender {

    private static final TimeUnit Thred = null;
    WebDriver driver = null;
    FilterByGenderPF filterbygender;
    LoginWebPF login;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
        System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");
        System.out.println("Inside Step - browser is open");
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();
        login = new LoginWebPF(driver);
        filterbygender = new FilterByGenderPF(driver);
//        Login.clickLogin();
//        Login.enterMobileNo("9999999999");
//        Login.otpValue("123456");
//        Login.clickOnVerifyNow();

    }
    //--------------filter by gender--------------------//
    @Test(priority = 0, retryAnalyzer = RetryAnalyzerTest.class)
    public void filter_by_gender() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case is to filter product on the babsis of gender");
        filterbygender.skin_product();
        getTest().log(Status.PASS, "Clicking on skin product");
        filterbygender.skin_product_validation();
        Thread.sleep(3000);
        filterbygender.filterbygender();
        getTest().log(Status.PASS, "Clicking on filter");
        filterbygender.filter_by_gender_validation();
        Thread.sleep(5000);
        filterbygender.selgender();
        getTest().log(Status.PASS, "Selecting gender");
        Thread.sleep(5000);
        filterbygender.exitfromfilter();
        getTest().log(Status.PASS, "Exit from filter");
        Thread.sleep(3000);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
