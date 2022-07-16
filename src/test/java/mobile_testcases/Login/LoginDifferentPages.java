package mobile_testcases.Login;

import mobile_pagefactory.Cart.CartPageAPF;
import mobile_pagefactory.Login.LoginInDifferentPagesAPF;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;
import utils.YamlReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class LoginDifferentPages {

    private static final TimeUnit Thred = null;
    AppiumDriver driver = null;
    LoginInDifferentPagesAPF loginDifferentPage;
    LoginWebPF login;
    CartPageAPF Cart;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void setup(@Optional("url") String env, @Optional("android") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = (AppiumDriver) baseClass.getDriver();
        Cart = new CartPageAPF(this.driver);
        Cart.ClickCloseTheBanner();
        login = new LoginWebPF(driver);
        loginDifferentPage = new LoginInDifferentPagesAPF(driver);

    }

    @Test(priority = 1)
    public void Home_Page_Login() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case Login from home page");
        Cart.ClickOnBurgerMenu();
        getTest().log(Status.PASS, "CLicking on burger menu");
        if (loginDifferentPage.Check_LogedOut()) {
            loginDifferentPage.LoginSignup();
            getTest().log(Status.PASS, "Clicking on Login and signup");
            loginDifferentPage.EnterPhoneNuber();
            getTest().log(Status.PASS, "Enter phone number");
            loginDifferentPage.GetOtp();
            getTest().log(Status.PASS, "Clicking on get otp");
            loginDifferentPage.EnterOtp();
            getTest().log(Status.PASS, "Enter otp");
            loginDifferentPage.VerifyOtp();
            getTest().log(Status.PASS, "Clicking on verify otp");
        } else {
            System.out.println("Application already Login");
        }
    }

    @Test(priority = 2)
    public void Login_From_Plp_Page() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case for Login from ProductListing page");
        loginDifferentPage.Grooming();
        loginDifferentPage.BurgerMenu();
        getTest().log(Status.PASS, "CLicking on burger menu");
        if (loginDifferentPage.Check_LogedOut()) {
        loginDifferentPage.LoginSignup();
        getTest().log(Status.PASS, "Clicking on Login and signup");
        loginDifferentPage.EnterPhoneNuber();
        getTest().log(Status.PASS, "Enter phone number");
        loginDifferentPage.GetOtp();
        getTest().log(Status.PASS, "Clicking on get otp");
        loginDifferentPage.EnterOtp();
        getTest().log(Status.PASS, "Enter otp");
        loginDifferentPage.VerifyOtp();
        getTest().log(Status.PASS, "Clicking on verify otp");
    }
    else
      {
        System.out.println("Application already Login");
    }

}
    @Test(priority = 3)
    public void Login_From_Pdp_Page() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case for Login from ProductDetails");
        loginDifferentPage.Grooming();
        loginDifferentPage.SelectPtoduct();
        loginDifferentPage.BurgerMenu();
        getTest().log(Status.PASS, "CLicking on burger menu");
        if (loginDifferentPage.Check_LogedOut()) {
            loginDifferentPage.LoginSignup();
            getTest().log(Status.PASS, "Clicking on Login and signup");
            loginDifferentPage.EnterPhoneNuber();
            getTest().log(Status.PASS, "Enter phone number");
            loginDifferentPage.GetOtp();
            getTest().log(Status.PASS, "Clicking on get otp");
            loginDifferentPage.EnterOtp();
            getTest().log(Status.PASS, "Enter otp");
            loginDifferentPage.VerifyOtp();
            getTest().log(Status.PASS, "Clicking on verify otp");
        } else {
            System.out.println("Application already Login");
        }
    }
    @Test(priority = 3)
    public void Login_From_Search_Page() throws InterruptedException, FileNotFoundException {
            HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
            getTest().log(Status.PASS, "Test Case for Login from search page");
            loginDifferentPage.Search();
            getTest().log(Status.PASS, "CLicking on search field");
            loginDifferentPage.SelectPtoduct();
            getTest().log(Status.PASS, "Select product");
            loginDifferentPage.BurgerMenu();
            getTest().log(Status.PASS, "CLicking on burger menu");
            if (loginDifferentPage.Check_LogedOut()) {
                loginDifferentPage.LoginSignup();
                getTest().log(Status.PASS, "Clicking on Login and signup");
                loginDifferentPage.EnterPhoneNuber();
                getTest().log(Status.PASS, "Enter phone number");
                loginDifferentPage.GetOtp();
                getTest().log(Status.PASS, "Clicking on get otp");
                loginDifferentPage.EnterOtp();
                getTest().log(Status.PASS, "Enter otp");
                loginDifferentPage.VerifyOtp();
                getTest().log(Status.PASS, "Clicking on verify otp");
            } else {
                System.out.println("Application already Login");
            }
        }

    @Test(priority = 4)
    public void Login_From_CheckOut_Page() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case for Login from check out page");
        loginDifferentPage.Grooming();
        getTest().log(Status.PASS, "Clicking on grooming");
        loginDifferentPage.SelectPtoduct();
        getTest().log(Status.PASS, "Clicking on select product");
        loginDifferentPage.AddToBag();
        getTest().log(Status.PASS, "Clicking on add to bag");
        loginDifferentPage.ViewBag();
        getTest().log(Status.PASS, "Clicking on view bag");
        loginDifferentPage.Proceed();
        getTest().log(Status.PASS, "Clicking on proceed");
        loginDifferentPage.EnterPhoneNuber();
        getTest().log(Status.PASS, "Enter phone number");
        loginDifferentPage.GetOtp();
        getTest().log(Status.PASS, "Clicking on get otp");
        loginDifferentPage.EnterOtp();
        getTest().log(Status.PASS, "Enter otp");
        loginDifferentPage.VerifyOtp();
        getTest().log(Status.PASS, "Clicking on verify otp");
       }
    }

