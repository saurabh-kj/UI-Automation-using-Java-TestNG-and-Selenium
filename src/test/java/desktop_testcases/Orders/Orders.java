package desktop_testcases.Orders;

import desktop_pagefactory.test.Cart.CartPagePF;
import desktop_pagefactory.test.Cart.OrdersPF;
import desktop_pagefactory.test.Checkout.PlaceOrderPF;
import desktop_pagefactory.test.Login.LoginWebPF;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.BaseClass;
import utils.YamlReader;

import java.io.IOException;
import java.util.HashMap;

@Listeners(utils.ListenerClass.class)
public class Orders {

    WebDriver driver = null;
    CartPagePF Cart;
    LoginWebPF login;
    OrdersPF Order;
    PlaceOrderPF placeCardOrder;


    @Parameters({"env", "browsername"})

    @BeforeClass
    public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();
        HashMap<String, String> loginDetails = YamlReader.getInstance().getDetails("LoginDetails");
        login = new LoginWebPF(driver);
        login.clickLogin();
        login.enterMobileNo(loginDetails.get("mobile"));
        login.otpValue(loginDetails.get("otp"));
        login.clickOnVerifyNow();
        Thread.sleep(7000);
        Cart = new CartPagePF(driver);
        placeCardOrder = new PlaceOrderPF(driver);
//        Cart.BackToHome();
    }

    @Test
    public void TotalNoOfOrders() throws InterruptedException {
        Order = new OrdersPF(driver);
        Order.MyOrdersInProfile();
        Order.MyOrdersCount();
        Cart.BackToHome();
    }

    @Test
    public void OrderDetails() throws InterruptedException {
        Order = new OrdersPF(driver);
        Order.MyOrdersInProfile();
        Order.AllOrderDetails();
        Cart.BackToHome();
    }

    @Test
    public void OrderDetailsCompletedBreakdown() throws InterruptedException {
        Order = new OrdersPF(driver);
        Order.MyOrdersInProfile();
        Order.OrderDetailsCompletedBreakdownMD();
        Cart.BackToHome();

    }
//    @Test
//    public void CashOnDelivery() throws InterruptedException, FileNotFoundException {
//        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
//        getTest().log(Status.PASS, "Test Case for cash on delivery");
//        Order = new OrdersPF(driver);
//        Order.Mekup();
//        getTest().log(Status.PASS, "Select mekup module");
//        Order.SelectProduct();
//        Thread.sleep(3000);
//        getTest().log(Status.PASS, "Select product");
//        Order.AddBag();
//        Thread.sleep(3000);
//        getTest().log(Status.PASS, "Click on add to bag");
//        Order.ViewBag();
//        Thread.sleep(3000);
//        getTest().log(Status.PASS, "Click on view bag");
//        Order.Proceed();
//        Thread.sleep(3000);
//        getTest().log(Status.PASS, "Click on proceed");
//        Order.CashOnDelivery();
//        getTest().log(Status.PASS, "Select cash on delivery option");
//        Order.PlaceOrder();
//        getTest().log(Status.PASS, "Clicking on place order");
//        placeCardOrder.fetchOrderID();
//        Cart.BackToHome();


//    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
