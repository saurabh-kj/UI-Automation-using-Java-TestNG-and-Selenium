package mobile_testcases.Checkout;

import mobile_pagefactory.Checkout.PlaceMOrderPF;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import utils.BaseClass;
import java.io.FileNotFoundException;
import java.io.IOException;

public class mPlaceCOD {
    AppiumDriver driver = null;
    PlaceMOrderPF placeCODOrder;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void setup(@Optional("url") String env, @Optional("android") String browsername) throws IOException, InterruptedException {
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = (AppiumDriver) baseClass.getDriver();
        placeCODOrder = new PlaceMOrderPF(driver);
    }

    @Test
    public void placeCODOrder() throws InterruptedException, FileNotFoundException {
        placeCODOrder.addProduct_to_Cart();
        System.out.println("addProduct function done. Product added to Cart");
        placeCODOrder.updateCart();
        System.out.println("updateCart function. Cart updated");
        placeCODOrder.loginToVerify();
        System.out.println("logged in successfully");
        placeCODOrder.checkoutCOD();
        System.out.println("checkout Completed");
        placeCODOrder.fetchOrderID();
        System.out.println("Order ID been fetch successfully.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
