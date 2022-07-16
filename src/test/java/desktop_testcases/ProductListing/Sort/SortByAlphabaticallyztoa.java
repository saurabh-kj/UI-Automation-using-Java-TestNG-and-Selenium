package desktop_testcases.ProductListing.Sort;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import desktop_pagefactory.test.ProductListing.SortByAlphabaticallyztoaPF;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class SortByAlphabaticallyztoa {

    private static final TimeUnit Thred = null;
    WebDriver driver = null;
    SortByAlphabaticallyztoaPF sortbyztoa;
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
        sortbyztoa = new SortByAlphabaticallyztoaPF(driver);

//        Login.enterMobileNo("9999999999");
//        Login.otpValue("123456");
//        Login.clickOnVerifyNow();

    }

    @Test(priority = 0)
    public void sort_by_ztoa() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case for sorting products");
        sortbyztoa.MomBaby();
        sortbyztoa.mom_baby_validation();
        Thread.sleep(4000);
        getTest().log(Status.PASS, "Clicking on mom baby module");
        sortbyztoa.ClickOnSort();
        sortbyztoa.sorting_validation();
        Thread.sleep(5000);
        getTest().log(Status.PASS, "Clicking on sort option");
        sortbyztoa.AlphabaticallyZtoA();
        getTest().log(Status.PASS, "Selecting alphabatically z to a in sorting option");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
