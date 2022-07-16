package desktop_testcases.Cart;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Cart.CartPagePF;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;
import utils.YamlReader;

import java.io.IOException;
import java.util.HashMap;

@Listeners(utils.ListenerClass.class)
public class CartMaxOut {

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

    @Test
    public void ProductFromList() throws InterruptedException {
        Cart = new CartPagePF(driver);
        Cart.ClickOnCategory();
        Cart.CountOfNthProduct();
        Cart.PDPClickOnOffers();
        Cart.NoOfOffers();
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
