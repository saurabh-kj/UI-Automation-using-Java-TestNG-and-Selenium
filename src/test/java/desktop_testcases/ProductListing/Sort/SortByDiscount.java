package desktop_testcases.ProductListing.Sort;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import desktop_pagefactory.test.Login.LoginWebPF;
import desktop_pagefactory.test.ProductListing.SortByDiscountPF;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class SortByDiscount {

    private static final TimeUnit Thred = null;
    WebDriver driver = null;
    SortByDiscountPF sortbydiscount;
    LoginWebPF login;
    private String ECSortPrice;

    @Parameters({"env","browsername"})

    @BeforeClass
    public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException {
        System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");
        System.out.println("Inside Step - browser is open");
        BaseClass baseClass=new BaseClass(env,browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();

        login = new LoginWebPF(driver);
        sortbydiscount = new SortByDiscountPF(driver);
//
//        Login.enterMobileNo("9999999999");
//        Login.otpValue("123456");
//        Login.clickOnVerifyNow();

    }


    @Test(priority = 0)
    public void sort_product_by_discount() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case for sorting products");
        sortbydiscount.PersonalProduct();
        Thread.sleep(5000);
        getTest().log(Status.PASS, "Clicking on personal module");
        sortbydiscount.ClickOnSort();
        Thread.sleep(3000);
        getTest().log(Status.PASS, "Clicking on sorting option");
        sortbydiscount.discount();
        getTest().log(Status.PASS, "Selecting sort on the basis of discount");
        // sortbydiscount.DiscountValidation();
        String ACSortPrice = sortbydiscount.PriceSortValue.getText();
//        sortbydiscount.DiscountValidation(ECSortPrice,ACSortPrice);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
