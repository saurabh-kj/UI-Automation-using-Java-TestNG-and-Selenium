package desktop_testcases.Login;

import com.aventstack.extentreports.Status;
import desktop_pagefactory.test.Login.LoginInDifferentPagesPF;
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
public class LoginInDifferentPages {

    private static final TimeUnit Thred = null;
    WebDriver driver = null;
    LoginWebPF login;
    LoginInDifferentPagesPF AllLogin;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void GoToPlpPage(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();
        AllLogin = new LoginInDifferentPagesPF(driver);
    }

    @Test(priority = 0)
    public void HomePageLogin() throws InterruptedException, FileNotFoundException {
        if(AllLogin.CheckApplicationAlreadyLogedOut()) {
            HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
            getTest().log(Status.PASS, "Test Case is to Login from home page");
            Thread.sleep(5000);
            AllLogin.LoginSignup();
            getTest().log(Status.PASS, "Clicking on Login signup option");
            AllLogin.EnterPhoneNum();
            AllLogin.Login_Page_Validation();
            getTest().log(Status.PASS, "Login page validation");
            getTest().log(Status.PASS, "Enter phone number");
            AllLogin.GetOtp();
            getTest().log(Status.PASS, "Clicking on get otp");
            AllLogin.EnterOtp();
            getTest().log(Status.PASS, "Enter otp");
            AllLogin.VerifyNow();
            getTest().log(Status.PASS, "Clicking on verify now");
            AllLogin.HoverOnLogOut();
            getTest().log(Status.PASS, "Hover on log out option");
            AllLogin.LogOut();
            getTest().log(Status.PASS, "Clicking on log out");
        }
        else {
            System.out.println("Application already Login");
        }
    }

    @Test(priority = 1)
    public void LoginOnPlpPage() throws InterruptedException, FileNotFoundException {
        if(AllLogin.CheckApplicationAlreadyLogedOut()) {
            HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
            getTest().log(Status.PASS, "Test Case is to Login from ProductListing");
            AllLogin.Mekup();
            getTest().log(Status.PASS, "Clicking on mekup");
            AllLogin.Plp_Page_Validation();
            getTest().log(Status.PASS, "Plp page validation");
            Thread.sleep(5000);
            AllLogin.LoginSignup();
            getTest().log(Status.PASS, "Clicking on Login signup option");
            AllLogin.EnterPhoneNum();
            AllLogin.Login_Page_Validation();
            getTest().log(Status.PASS, "Login page validation");
            getTest().log(Status.PASS, "Enter phone number");
            AllLogin.GetOtp();
            getTest().log(Status.PASS, "Clicking on get otp");
            AllLogin.EnterOtp();
            getTest().log(Status.PASS, "Enter otp");
            AllLogin.VerifyNow();
            getTest().log(Status.PASS, "Clicking on verify now");
            AllLogin.HoverOnLogOut();
            getTest().log(Status.PASS, "Ho er on log out option");
            AllLogin.LogOut();
            getTest().log(Status.PASS, "Clicking on log out");
        }
        else {
            System.out.println("Application already Login");
        }
    }

    @Test(priority = 2)
    public void LoginOnPdpPage() throws InterruptedException, FileNotFoundException {
        if(AllLogin.CheckApplicationAlreadyLogedOut()) {
            HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
            getTest().log(Status.PASS, "Test Case is to Login from ProductDetails page");
            AllLogin.Mekup();
            getTest().log(Status.PASS, "Clicking on personal mekup business module");
            Thread.sleep(5000);
            AllLogin.SelctProduct();
            getTest().log(Status.PASS, "Select product");
            AllLogin.Pdp_Page_Validation();
            getTest().log(Status.PASS, "Pdp page validation");
            Thread.sleep(5000);
            AllLogin.LoginSignup();
            getTest().log(Status.PASS, "Clicking on Login signup option");
            AllLogin.EnterPhoneNum();
            getTest().log(Status.PASS, "Enter phone number");
            AllLogin.Login_Page_Validation();
            getTest().log(Status.PASS, "Login page validation");
            AllLogin.GetOtp();
            getTest().log(Status.PASS, "Clicking on get otp");
            AllLogin.EnterOtp();
            getTest().log(Status.PASS, "Enter otp");
            AllLogin.VerifyNow();
            getTest().log(Status.PASS, "Clicking on verify now");
            AllLogin.HoverOnLogOut();
            getTest().log(Status.PASS, "Ho er on log out option");
            AllLogin.LogOut();
            getTest().log(Status.PASS, "Clicking on log out");
        }
        else {
            System.out.println("Application already Login");
        }
    }
    @Test(priority = 3)
    public void LoginFromSeachPage() throws InterruptedException, FileNotFoundException {
        if(AllLogin.CheckApplicationAlreadyLogedOut()) {
            HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
            getTest().log(Status.PASS, "Test Case is to Login from search page");
            AllLogin.SearchProduct();
            getTest().log(Status.PASS, "Search product");
            AllLogin.SelctFromSearch();
            getTest().log(Status.PASS, "Select product in search option");
            Thread.sleep(5000);
            AllLogin.LoginSignup();
            getTest().log(Status.PASS, "Clicking on Login signup option");
            AllLogin.EnterPhoneNum();
            AllLogin.Login_Page_Validation();
            getTest().log(Status.PASS, "Login page validation");
            getTest().log(Status.PASS, "Enter phone number");
            AllLogin.GetOtp();
            getTest().log(Status.PASS, "Clicking on get otp");
            AllLogin.EnterOtp();
            getTest().log(Status.PASS, "Enter otp");
            AllLogin.VerifyNow();
            getTest().log(Status.PASS, "Clicking on verify now");
            AllLogin.HoverOnLogOut();
            getTest().log(Status.PASS, "Hover on log out option");
            AllLogin.LogOut();
            getTest().log(Status.PASS, "Clicking on log out");
        }
        else {
            System.out.println("Application already Login");
        }
    }
    @Test(priority = 4)
    public void LoginFromCheckout() throws InterruptedException, FileNotFoundException {
        if(AllLogin.CheckApplicationAlreadyLogedOut()) {
            HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
            getTest().log(Status.PASS, "Test Case is to Login from check out page");
            AllLogin.Mekup();
            getTest().log(Status.PASS, "clicking on mekup business module");
            Thread.sleep(5000);
            AllLogin.SelctProduct();
            getTest().log(Status.PASS, "Select product");
            AllLogin.AddToBag();
            getTest().log(Status.PASS, "Product add to bag");
            AllLogin.ViewBag();
            getTest().log(Status.PASS, "View bag");
//            AllLogin.CheckOut_Page_Validation();
            getTest().log(Status.PASS, "Check out page validation");
            AllLogin.Proceed();
            getTest().log(Status.PASS, "Click on proceed");
            Thread.sleep(5000);
            AllLogin.EnterPhoneNuberCheckOut();
            getTest().log(Status.PASS, "Enter phone number");
            AllLogin.GetOtpForCheckout();
            getTest().log(Status.PASS, "Click on get otp");
            AllLogin.EnterOtpCheckOut();
            getTest().log(Status.PASS, "Enter otp");
            AllLogin.VerifyOtpCheckOut();
            getTest().log(Status.PASS, "Verify otp");
            Thread.sleep(5000);
            AllLogin.HoverOnLogOutForCheckoutPage();
            getTest().log(Status.PASS, "Hover on log out option");
            AllLogin.LogOut();
            getTest().log(Status.PASS, "Clicking on log out");
        }
        else {
            System.out.println("Application already Login");
        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
