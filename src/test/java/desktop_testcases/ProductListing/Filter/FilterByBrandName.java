package desktop_testcases.ProductListing.Filter;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import desktop_pagefactory.test.ProductListing.FilterByBrandNamePF;
import desktop_pagefactory.test.Login.LoginWebPF;
import desktop_pagefactory.test.Orders.MyOrdersPF;
import utils.BaseClass;
import utils.ScreenshotClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class FilterByBrandName extends ScreenshotClass {

    private static final TimeUnit Thred = null;
    WebDriver driver = null;
    FilterByBrandNamePF filterbybrand;
    MyOrdersPF myOrdersPF;
    LoginWebPF login;

    @Parameters({"env", "browsername"})
    @BeforeClass
    public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws Exception {
        System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");

        System.out.println("Inside Step - browser is open");

        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();
        login = new LoginWebPF(driver);
        filterbybrand = new FilterByBrandNamePF(driver);
        myOrdersPF=new MyOrdersPF(driver);

//        Login.enterMobileNo("9999999999");
//        Login.otpValue("123456");
//        Login.clickOnVerifyNow();
        Thread.sleep(10000);
//        String PathString = ScreenshotClass.getScreenshot(driver, "Filtername");
//        getTest().addScreenCaptureFromPath(PathString);

    }

    @AfterMethod
    public void tearDown(ITestResult result) throws Exception {
        if(result.getStatus()==ITestResult.FAILURE) {
            getTest().log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
            getTest().log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));

            String pathString=ScreenshotClass.getScreenshot(driver, result.getName());
            getTest().addScreenCaptureFromPath(pathString);

        } else if(result.getStatus()==ITestResult.SKIP) {
            getTest().log(Status.SKIP, "Skipped Test case is: "+result.getName());
        } else if(result.getStatus()==ITestResult.SUCCESS) {
            getTest().log(Status.PASS, "Pass Test case is: "+result.getName());
        }
        driver.close();
    }
    //------------------------filter by brand name-------------------------//
    @Test(priority = 0)
    public void go_to_brand() throws Exception {
//        myOrdersPF.clickMyOrders();
        System.out.println("goto brand");
        getScreenshot(driver,"Filterimage");
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case is to filter product on the basis of brand name");
        filterbybrand.brand();
        getTest().log(Status.PASS, "Clicking on mekup module");
        filterbybrand.mekup_page_validation();
        //Thread.sleep(3000);
        filterbybrand.clickonbrand();
        getTest().log(Status.PASS, "Click on filter");
        filterbybrand.click_on_mekup_validation();
        //Thread.sleep(5000);
        filterbybrand.filterbrand();
        getTest().log(Status.PASS, "Select brand");
        //Thread.sleep(5000);
        filterbybrand.exitfromfilter();
        getTest().log(Status.PASS, "Exit from filter");
        //Thread.sleep(3000);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}

