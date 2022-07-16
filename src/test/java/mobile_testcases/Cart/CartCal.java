package mobile_testcases.Cart;

import mobile_pagefactory.Cart.CartCalAPF;
import mobile_pagefactory.Cart.CartPageAPF;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;

import java.io.IOException;

@Listeners(utils.ListenerClass.class)
public class CartCal {
    AppiumDriver driver = null;
    CartPageAPF Cart;
    LoginWebPF login;
    CartCalAPF Cal;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void setup(@Optional("url") String env, @Optional("android") String browsername) throws IOException, InterruptedException, IOException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = (AppiumDriver) baseClass.getDriver();
        Cart = new CartPageAPF(this.driver);
        Cart = new CartPageAPF(driver);
        login = new LoginWebPF(driver);
    }

    @Test
    public void CartProductsCount() throws InterruptedException {
        Cart.ClickOnBusinessGroup();
        Cart.ClickOnCategory();
        Cart.ClickOnSubCategory();
        for(int i=1;i<=4;i++){
           Cart.AddProductsInClick();
        }
        Cart.ClickOnMyBagInCart();
        Cal.ProductCount();
    }

    @Test
    public void TotalCalclation() throws InterruptedException {
        Cart.ClickOnBusinessGroup();
        for(int i=1;i<=4;i++){
            Cart.AddProductsInClick();
        }
        Cart.ClickOnMyBagInCart();
        Cal.ProductTotal();
    }


    @Test
    public void MRPTotalCalclation() throws InterruptedException {
        Cart.ClickOnBusinessGroup();
        for(int i=1;i<=4;i++){
            Cart.AddProductsInClick();
        }
        Cart.ClickOnMyBagInCart();
        Cal.MRPValue();
    }

    @Test
    public void  PromotionalDiscountCalculation() throws InterruptedException {
        Cart.ClickOnBusinessGroup();
        for(int i=1;i<=4;i++){
            Cart.AddProductsInClick();
        }
        Cart.ClickOnMyBagInCart();
        Cal.totalPromoCalculation();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
