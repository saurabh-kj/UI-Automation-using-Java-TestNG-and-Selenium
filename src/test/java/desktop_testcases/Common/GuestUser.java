package desktop_testcases.Common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Common.GuestUserPF;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Listeners(utils.ListenerClass.class)
public class GuestUser {
    private static final TimeUnit Thred = null;
    WebDriver driver = null;
    GuestUserPF guestuser;
    LoginWebPF login;

    @Parameters({"env", "browsername"})
    @BeforeClass
    public void browser_is_open(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();
        guestuser =new GuestUserPF(driver);
        guestuser.hair();
        Thread.sleep(3000);
        // getTest().log(Status.PASS, "Clicking on hair module");
//        guestuser.kidswear_page_validation();
        guestuser.hairproduct();
        Thread.sleep(3000);
        // getTest().log(Status.PASS, "Clicking on hair product");
        guestuser.addtobag();
        Thread.sleep(3000);
        // getTest().log(Status.PASS, "Clicking on add  to bag");
        //guestuser.add_to_bag_validation();
        guestuser.gotobag();
//        guestuser.proceed_validation();
        Thread.sleep(3000);
        // getTest().log(Status.PASS, "Clicking on go to bag");
        guestuser.proceed();
        Thread.sleep(5000);
        // getTest().log(Status.PASS, "Clicking on hair proceed");

    }
    //----------------------Login------------------------------//
    @Test(priority = 0)
    public void login() {
        guestuser.enter_phone_num();
        guestuser.get_otp();
        guestuser.enter_otp();
        guestuser.verify_otp();
        guestuser.login_validation();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
