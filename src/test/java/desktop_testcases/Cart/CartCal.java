package desktop_testcases.Cart;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Cart.CartCalPF;
import desktop_pagefactory.test.Cart.CartPagePF;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;
import utils.YamlReader;

import java.io.IOException;
import java.util.HashMap;

@Listeners(utils.ListenerClass.class)
public class CartCal {
    WebDriver driver = null;
    CartPagePF Cart;
    LoginWebPF login;
    CartCalPF Cal;

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
        Cal = new CartCalPF(driver);
//        Cart.BackToHome();
    }


    @Test
    public void CartProductsCount() throws InterruptedException {
        Cart.ClickOnCategory();
        for(int i=1;i<=4;i++){
           Cart.AddProducts();
        }
        Cart.clickOnMyBag();
        Cal.ProductCount();
        Cart.BackToHome();

    }

    @Test
    public void TotalCalclation() throws InterruptedException {
        Cart.BackToHome();
        Cart.ClickOnCategory();
        for(int i=1;i<=4;i++){
            Cart.AddProducts();
        }
        Cart.clickOnMyBag();
        Cal.ProductTotal();
        Cart.BackToHome();
    }


    @Test
    public void MRPTotalCalclation() throws InterruptedException {
        Cart.ClickOnCategory();
        for(int i=1;i<=4;i++){
            Cart.AddProducts();
        }
        Cart.clickOnMyBag();
        Cal.MRPValue();
        Cart.BackToHome();

    }

//    @Test
//    public void  PromotionalDiscountCalculation() throws InterruptedException {
//        Cart.ClickOnCategory();
//        for(int i=1;i<=4;i++){
//            Cart.AddProducts();
//        }
//        Cart.MyBag();
//        Cal.totalPromoCalculation();
//        Cart.BackToHome();
//
//
//    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
