package desktop_testcases.Cart;

import java.io.IOException;
import java.util.HashMap;

import com.aventstack.extentreports.Status;
import desktop_pagefactory.test.Cart.CartPagePF;
import desktop_pagefactory.test.Login.LoginWebPF;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class CartAddNewAddress {

    WebDriver driver = null;
    CartPagePF Cart;
    LoginWebPF login;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();
        HashMap<String, String> loginDetails = YamlReader.getInstance().getDetails("LoginDetails");

//        Login = new LoginWebPF(driver);
//        Login.clickLogin();
//        Login.enterMobileNo(loginDetails.get("mobile"));
//        Login.otpValue(loginDetails.get("otp"));
//        Login.clickOnVerifyNow();
//        Thread.sleep(4000);
        Cart = new CartPagePF(driver);
//        Cart.BackToHome();
    }

    @Test(priority = 1)
    public void AddNewAddress() throws InterruptedException {
        //TSW_2.1.23
        login = new LoginWebPF(driver);
        login.clickLogin();
        login.enterMobileNo("9999999999");
        login.otpValue("987699");
        login.clickOnVerifyNow();
        Thread.sleep(5000);
//        Cart.BackToHome();

        getTest().log(Status.PASS, "TestCase on Add new Address");
        Cart.ClickOnCategory();
        getTest().log(Status.PASS, "Clicked on business group");
        Cart.AddProductsInClick();
        getTest().log(Status.PASS, "Add product to Cart");
        Cart.ClickOnCheckOut();
        getTest().log(Status.PASS, "Clicked on Checkout for Cart page");
        Cart.EnterAddressPageFullName("Aravind");
        getTest().log(Status.PASS, "Clicked on the Change And Enter full name");
        Cart.EnterPinCode("560050");
        getTest().log(Status.PASS, "Enter Postal Code");
        Cart.EnterAddress("srinivas nagar,banaglore");
        getTest().log(Status.PASS, "Enter Full address");
        Cart.EnterLandMark("batashow room near the main road");
        getTest().log(Status.PASS, "Enter Near by landmark");
        Cart.clickOnVerifyAddAddress();
        getTest().log(Status.PASS, "Save and process with saved address");
        Cart.BackToHome();
        getTest().log(Status.PASS, "Back to home page");

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
