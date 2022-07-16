package desktop_testcases.ProductListing.Sort;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import desktop_pagefactory.test.ProductListing.SortByRelevancePF;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class SortByRelevance {

    private static final TimeUnit Thred = null;
    WebDriver driver = null;
    SortByRelevancePF sortbyrelevance;
    LoginWebPF login;

    @Parameters({"env","browsername"})

    @BeforeClass
    public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException {
        System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");
        System.out.println("Inside Step - browser is open");
        BaseClass baseClass=new BaseClass(env,browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();

        login = new LoginWebPF(driver);
        sortbyrelevance=new SortByRelevancePF(driver);

//        Login.enterMobileNo("9999999999");
//        Login.otpValue("123456");
//        Login.clickOnVerifyNow();

    }

    @Test(priority = 0)
    public void SortByRelevance() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case for sorting products");
        sortbyrelevance.personalfeminine();
        getTest().log(Status.PASS, "Clicking on personal feminine");
//        sortbyrelevance.PersonalPageValidation();
        Thread.sleep(3000);
        sortbyrelevance.ClickOnSort();
        getTest().log(Status.PASS, "Clicking on sort option");
        Thread.sleep(3000);
        sortbyrelevance.SelectRelevance();
        getTest().log(Status.PASS, "Select relevance option in sort");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
