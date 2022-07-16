package mobile_testcases.Orders;

import mobile_pagefactory.Cart.CartPageAPF;
import mobile_pagefactory.Login.LoginAPF;
import mobile_pagefactory.Orders.OrdersAPF;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import utils.BaseClass;

import java.io.IOException;

@Listeners(utils.ListenerClass.class)
public class Orders {

    AppiumDriver driver = null;
    CartPageAPF Cart;
    LoginAPF login;
    OrdersAPF Order;

    @BeforeClass
    public void setup(@Optional("url") String env, @Optional("android") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = (AppiumDriver) baseClass.getDriver();

        Cart = new CartPageAPF(driver);
        Cart.ClickCloseTheBanner();
        Cart.ClickOnBurgerMenu();
////          Cart.ClickBackOnSideBurgerMenu();
        login = new LoginAPF(driver);
        Cart.enterMobileNo();
        Cart.otpValue();
        Cart.clickOnVerifyNow();
        Thread.sleep(5000);
    }

    @Test
    public void TotalNoOfOrders() throws InterruptedException {
        Order = new OrdersAPF(driver);
        Cart.ClickOnBurgerMenu();
        Order.MyOrdersInProfile();
        Order.MyOrdersCount();
    }

    @Test
    public void OrderDetails() throws InterruptedException {
        Order = new OrdersAPF(driver);
        Cart.ClickOnBurgerMenu();
        Order.MyOrdersInProfile();
        Order.AllOrderDetails();
    }

    @Test
    public void OrderDetailsCompletedBreakdown() throws InterruptedException {
        Order = new OrdersAPF(driver);
        Cart.ClickOnBurgerMenu();
        Order.MyOrdersInProfile();
        Order.OrderDetailsCompletedBreakdownMD();

        //Comments
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
