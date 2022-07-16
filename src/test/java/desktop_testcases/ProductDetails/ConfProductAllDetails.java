package desktop_testcases.ProductDetails;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import desktop_pagefactory.test.Cart.CartPagePF;
import desktop_pagefactory.test.ProductDetails.ConfProductAllDetailsPF;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;
import utils.YamlReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)

public class ConfProductAllDetails {

    private static final TimeUnit Thred = null;
    WebDriver driver = null;
    ConfProductAllDetailsPF confpdpalldetails;
    LoginWebPF login;
    CartPagePF Cart;


    @BeforeClass
    public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
        System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");
        System.out.println("Inside Step - browser is open");
        BaseClass baseClass = new BaseClass(env, browsername);
        baseClass.chromeDriverManager(env);
        this.driver = baseClass.getDriver();

        login = new LoginWebPF(driver);
        confpdpalldetails = new ConfProductAllDetailsPF(driver);
//
//		Login.enterMobileNo("9999999999");
//		Login.otpValue("123456");
//		Login.clickOnVerifyNow();

    }

    //-----------------configurable product------------------------//
    @Test(priority = 0)
    public void go_to_fashion() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case is for configurable all products");
//        confpdpalldetails.Fashion();
        getTest().log(Status.PASS, "Clicking on fashion module");
//        confpdpalldetails.plp_page_validation_conf();
        getTest().log(Status.PASS, "Plp page validated");
//        confpdpalldetails.Conf_SelectProduct();
        getTest().log(Status.PASS, "Clicking on a products");
//        confpdpalldetails.pdp_validation_conf();
        getTest().log(Status.PASS, "Pdp page validated");
        confpdpalldetails.Conf_Product_Name();
        getTest().log(Status.PASS, "Product name showing");
        confpdpalldetails.Conf_Product_Price();
        getTest().log(Status.PASS, "Product price showing");
        confpdpalldetails.Conf_BestPrice();
        getTest().log(Status.PASS, "Product best price showing");
        confpdpalldetails.Conf_Coupon_Copy();
        getTest().log(Status.PASS, "Coupon showing");
        confpdpalldetails.Conf_ProductActualPrice();
        getTest().log(Status.PASS, "Actual price showing");
        confpdpalldetails.Conf_Product_Offer();
        getTest().log(Status.PASS, "Product offer showing");
        confpdpalldetails.Conf_ExpectedDeliveryDate();
        getTest().log(Status.PASS, "Expected delivery showing");
        confpdpalldetails.Conf_SaveButton();
        getTest().log(Status.PASS, "Save button showing");
        confpdpalldetails.Conf_AddToBag();
        getTest().log(Status.PASS, "Add to bag showing");
        confpdpalldetails.Conf_BrandName();
        getTest().log(Status.PASS, "Brand name showing");
        confpdpalldetails.Conf_Expiry();
        getTest().log(Status.PASS, "Expiry showing");
        confpdpalldetails.Conf_AboutProduct();
        getTest().log(Status.PASS, "About product showing");
        confpdpalldetails.Conf_Specification();
        getTest().log(Status.PASS, "Specification showing");
        confpdpalldetails.Conf_WhatmakeItSpecial();
        getTest().log(Status.PASS, "What make it special");
        confpdpalldetails.Conf_GoodtoKnow();
        getTest().log(Status.PASS, "Good to Know showing");
        confpdpalldetails.Conf_HowToUse();
        getTest().log(Status.PASS, "How to use");
        confpdpalldetails.Conf_ProductAuthenticity();
        getTest().log(Status.PASS, "Product Authenticity showing");
        confpdpalldetails.Conf_ReturnProduct();
        getTest().log(Status.PASS, "Return product showing");
        confpdpalldetails.Conf_Cod();
        getTest().log(Status.PASS, "Cash on delivery showing");
        confpdpalldetails.Conf_ReturnProduct();
        getTest().log(Status.PASS, "Return product showing");
        confpdpalldetails.Conf_SimilarProduct();
        getTest().log(Status.PASS, "Similar product showing");
        confpdpalldetails.Conf_Customer_Also_Bought();
        getTest().log(Status.PASS, "Customer also bought showing");
        confpdpalldetails.Conf_AdditionalInfo();
        getTest().log(Status.PASS, "Additional info showing");
        confpdpalldetails.Conf_Breadcrumbs();
        getTest().log(Status.PASS, "Breadcrumbs showing");
    }

    @Test(priority = 1)
    public void go_to_pdp_page() {
        driver.navigate().back();
    }

    @Test(priority = 2)
    public void go_to_home() {
        driver.navigate().back();
    }


    @Test(priority = 6)
    public void ColourShade() throws InterruptedException {
        confpdpalldetails = new ConfProductAllDetailsPF(driver);
        confpdpalldetails.Mekup();
        confpdpalldetails.Colour();
        confpdpalldetails.SelectColourShade();
        confpdpalldetails.BackToHome();
    }

    @Test(priority = 3)
    public void ColourType() throws InterruptedException {
        confpdpalldetails = new ConfProductAllDetailsPF(driver);
        confpdpalldetails.Mekup();
        confpdpalldetails.NailPant();
        confpdpalldetails.SelectColourType();
        confpdpalldetails.BackToHome();
    }

    @Test(priority = 4)
    public void SizeType() throws InterruptedException {
        confpdpalldetails = new ConfProductAllDetailsPF(driver);
        confpdpalldetails.KidsWear();
        confpdpalldetails.SelectKidsWearProduct();
        confpdpalldetails.SelectSize();
        confpdpalldetails.BackToHome();
    }

    @Test(priority = 6)
    public void DressSizeType() throws InterruptedException {
        confpdpalldetails = new ConfProductAllDetailsPF(driver);
        confpdpalldetails.Fashion();
        confpdpalldetails.SelectDress();
        confpdpalldetails.SelectDressSize();
        confpdpalldetails.BackToHome();
    }


    @Test(priority = 7)
    public void CustomProductAndSimpleProduct() throws FileNotFoundException, InterruptedException {
        confpdpalldetails = new ConfProductAllDetailsPF(driver);
        ConfProductAllDetailsPF.btn_CatHealthWellness.click();

        int index = 10;
        for (int i = 1; i < index; i++) {
            String ProductButton = "//div[@class='ProductListstyle__ProductListContainer-sc-1r0vbhp-0 fIkKJb']/div[" + i + "]/div[2]/button[1]";
            WebElement ButtonValue = driver.findElement(By.xpath(ProductButton));
            System.out.println(ButtonValue.getText());
            String A1 = "Add to Bag";
            if (A1.equals(ButtonValue.getText())) {
                String Product = "//div[@class='ProductListstyle__ProductListContainer-sc-1r0vbhp-0 fIkKJb']/div[" + i + "]/div[1]";
                WebElement ProductOn = driver.findElement(By.xpath(Product));
                ProductOn.click();
                go_to_fashion();
                driver.navigate().back();

            } else {

                String Product = "//div[@class='ProductListstyle__ProductListContainer-sc-1r0vbhp-0 fIkKJb']/div[" + i + "]/div[1]";
                WebElement ProductOn = driver.findElement(By.xpath(Product));
                ProductOn.click();
                confpdpalldetails.SelectDressSize();
                driver.navigate().back();
            }
//            String buttons = "(//*[text()='Add to Bag'])[" + i + "]";
//            WebElement ProductOnPDP = driver.findElement(By.xpath(buttons));
//            if (ProductOnPDP.isDisplayed()) {
//                String Product = "(//div[@class=\"ProductTilestyle__ProductDetailsSection-sc-1bpfvho-2 hAnLGR\"])[" + i + "]";
//                WebElement ProductOn = driver.findElement(By.xpath(Product));
//                ProductOn.click();
//                go_to_fashion();
//            } else {
//                confpdpalldetails.SelectDressSize();
//            }
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}

