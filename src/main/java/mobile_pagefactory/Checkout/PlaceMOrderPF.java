package mobile_pagefactory.Checkout;

import io.appium.java_client.AppiumDriver;
import mobile_pagefactory.Login.LoginAPF;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utils.DriverClass;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Order eligible for more the Rs. 250
public class PlaceMOrderPF extends DriverClass {
    JavascriptExecutor js;
    private AppiumDriver driver;

    public PlaceMOrderPF(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

//Elements

    //	Category page elements
    @FindBy(xpath = "//span[@class='header-hamburgerIconWrapper-1cw']")
    WebElement btnHamburger;

    @FindBy(xpath = "//*[@id='root']/aside/div/div[1]/ul[2]/li[10]/button")
    WebElement healthCatHam; //Click on Health category in hamburger

    @FindBy(xpath = "//*[@id='root']/aside/div/div[1]/div[2]")
    WebElement healthAll;

    @FindBy(xpath = "//*[@id='gallery-item-8106']/div[3]/button")
    WebElement btn_addToBag1; //Add to Cart button for Product1 on Category page

    @FindBy(xpath = "//*[@id='gallery-item-17016']/div[3]/button")
    WebElement btn_addToBag2; //Add to Cart button for Product2 on Category page

    @FindBy(xpath = "//*[@id='gallery-item-12921']/div[3]/button")
    WebElement btn_addToBag3; //Add to Cart button for Product3 on Category page

    //	Adding products For mcstaging

    @FindBy(xpath = "//*[@id='gallery-item-363']/div[3]/button")  //For MCStaging
    WebElement btn_addToBagMC1; //Add to Cart button for Product1 on Category page

    @FindBy(xpath = "//*[@id='gallery-item-504']/div[3]/button")  //For MCStaging
    WebElement btn_addToBagMC2; //Add to Cart button for Product2 on Category page

    @FindBy(xpath = "//*[@id='gallery-item-453']/div[3]/button")  //For MCStaging
    WebElement btn_addToBagMC3; //Add to Cart button for Product3 on Category page

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/div[3]/div[2]/a/button")
    WebElement btn_viewBag;  //Bag button on header


    //	Cart Page Elements
    @FindBy(xpath = "//*[@id='root']/main/div/div[2]/div[2]/div/div/div[1]/ul/li[1]/div[2]/div/div/form/div/div/button[1]")
    WebElement btn_delProduct;  //Delete button on in Cart

    @FindBy(xpath = "//*[@id='root']/main/div/div[2]/div[2]/div/div/div[1]/ul/li[1]/div[2]/div/div/form/div/div/button[2]")
    WebElement btn_increaseProduct;  //Increase product button on in Cart

    @FindBy(xpath = "//*[@id='root']/main/div/div[2]/div[2]/div/div/div[1]/ul/li[1]/div[2]/div/div/form/div/div/button[1]")
    WebElement btn_decreaseProduct; //Decrease product button on in Cart. Can be applied post increasing the product.


    //	Cart Page Elements For mcstaging

    @FindBy(xpath = "//*[@id='root']/main/div/div[1]/div[2]/div/div/div[1]/ul/li[1]/div[1]/div[3]/div/form/div/div/button[1]") //For mcstaging
    WebElement btn_delProductMC;  //Delete button on in Cart

    @FindBy(xpath = "//*[@id='root']/main/div/div[1]/div[2]/div/div/div[1]/ul/li[1]/div[1]/div[3]/div/form/div/div/button[2]")
    WebElement btn_increaseProductMC;  //Increase product button on in Cart

    @FindBy(xpath = "//*[@id='root']/main/div/div[1]/div[2]/div/div/div[1]/ul/li[1]/div[1]/div[3]/div/form/div/div/button[1]")
    WebElement btn_decreaseProductMC; //Decrease product button on in Cart. Can be applied post increasing the product.


    @FindBy(xpath = "//*[@id='Cart-summary-node']/div/div[1]/div[2]/div[2]/button")
    WebElement btn_loginToApply; //Log in to Apply btn for anonymous user

    @FindBy(xpath = "//*[@id='root']/main/div/div[3]/div/div/div/div[2]/a")
    WebElement btn_proceed; //Proceed button


    //	Checkout page
    //Delivery Address Details
    @FindBy(id = "firstname")
    WebElement txt_fName; //Full name

    @FindBy(id = "postcode")
    WebElement txt_pinCode; //Pincode

    @FindBy(id = "street0")
    WebElement txt_address1;  //Address field

    @FindBy(id = "street1")
    WebElement txt_address2;  //Landmark

    @FindBy(id = "//*[@id='address_form']/button")
    WebElement btn_addAddress;  //Add Address button

    //		Payment Option: COD Order
//    @FindAll({ @FindBy(id = "cashondelivery"),
    @FindBy(xpath = "//div[@class='checkout-payment_inner-3O6 overlayClass']/input[@id='cashondelivery']")
    WebElement radio_cod;  //COD radio button

    //		Payment Option: Juspay
    @FindBy(id = "JusPay")
    WebElement jusPay;

    //		Payment Option: Razorpay
    @FindBy(id = "razorpay")
    WebElement radio_razorpay;

    //Debit Card
    @FindBy(css = "button[method = 'card']")
    WebElement btn_debitCard;

    @FindBy(id = "card_number")
    WebElement cardNum;

    @FindBy(id = "card_expiry")
    WebElement cardExpiry;

    @FindBy(id = "card_name")
    WebElement cardHolderName;

    @FindBy(id = "card_cvv")
    WebElement cardCVV;

    @FindBy(id = "should-save-card")
    WebElement unCheckSaveCard;

    @FindBy(xpath = "//*[@id='footer-cta']")
    WebElement btn_Pay;  //Pay button

    @FindBy(className = "success")
    WebElement btn_success;    //for testing env


    //		For Trell Cash
    @FindBy(xpath = "//button[contains(text(),'Remove')]")
    WebElement btn_removeTrellCash; //Remove applied Trell Cash Button

    @FindBy(css = "button[data-disabled = 'false']")
    WebElement btn_applyTrellCash;  // Enabled Apply Trell Cash Button

    @FindBy(css = "button[data-disabled = 'true']")
    WebElement btn_disabledTrellCash;  //Disabled Apply Trell Cash button

    @FindBy(xpath = "//*[@id='Cart-summary-node']/div/div[1]/div[1]/div[2]")
    WebElement getTxt_toAddMore;

    @FindBy(xpath = "//*[@id='Cart-summary-node']/div/div[1]/div[2]/div/span")
    WebElement trellCashValue;

    //UPI Mode
    @FindBy(css = "button[method = 'upi']")
    WebElement btn_upi;

    @FindBy(id = "vpa-upi")
    WebElement enterUPIId;

    //		Place Order button
    @FindBy(xpath = "//*[@id='payment']/div[2]/div[2]/button")
    WebElement btn_placeCODOrder;  //Place Order button on Checkout page for COD Orders

    @FindBy(xpath = "//*[@id='payment']/div[2]/div[3]/button")
    WebElement btn_placeRazorPayOrder; //Place Order button on Checkout page for Razorpay Orders


    //		Fetch Order ID
    @FindBy(xpath = "//*[@id='root']/main/div/div[2]/div[1]/div/div[2]/p[1]")
    WebElement orderID;

//Methods

    // Add products to bag
    public void addProduct_to_Cart() throws InterruptedException {  //more than Applicable Trell Cash Threshold value in Prod
        waitForElementToBeClickable(btnHamburger);
        btnHamburger.click();
        waitForElementToBeClickable(healthCatHam);
        healthCatHam.click();
        waitForElementToBeClickable(healthAll);
        healthAll.click();
        Thread.sleep(2000);
        System.out.println("Health category clicked");
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)", "");
        btn_addToBag1.click();
        System.out.println("Add to Bag1 button clicked");
        Thread.sleep(2000);
        btn_addToBag2.click();
        System.out.println("Add to Bag2 button clicked");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,600)", "");
        btn_addToBag3.click();
        System.out.println("Add to Bag3 button clicked");
        Thread.sleep(2000);
        btn_viewBag.click();
        System.out.println("View Bag button clicked");
        Thread.sleep(2000);
    }

    //	Update your Cart
    public void updateCart() throws InterruptedException {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)", "");
        Thread.sleep(2000);
        btn_delProduct.click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        System.out.println("Delete button clicked");
        js.executeScript("window.scrollBy(0,200)", "");
        Thread.sleep(3000);
        btn_increaseProduct.click();
//        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        System.out.println("increase button clicked");
        Thread.sleep(3000);
//        waitForElementToBeClickable(btn_decreaseProduct);
        btn_decreaseProduct.click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        System.out.println("Decrease button clicked");
    }

    //	Login to application
    public void loginToVerify() throws InterruptedException, FileNotFoundException {
        LoginAPF login;
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        btn_loginToApply.click();
        System.out.println("Login to Apply button clicked");
        login = new LoginAPF(driver);
        login.enterMobileNoToVerify("9999999999");
        Thread.sleep(2000);
        login.otpValue("123456");
        login.clickOnVerifyNow();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        System.out.println("Login done");
    }


    //	Checkout (COD) process
    public void checkoutCOD() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        // Check if address form is displayed
			/*if(txt_fName.isDisplayed()) {
//				WebDriverWait wait = new WebDriverWait(driver, 10);
//				wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) txt_fName));
				Thread.sleep(2000);
				txt_fName.sendKeys("Iron-Man");
				System.out.println("First Name filled");
				txt_pinCode.sendKeys("560034");
				System.out.println("Pincode filled");
				txt_address1.sendKeys("17th cross, BTM 2nd stage");
				System.out.println("Address1 filled");
				txt_address2.sendKeys("near Gopal Kung crossing");
				System.out.println("Address2 filled");
				btn_addAddress.click();
			}*/
        js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
//			waitForElementToBeClickable(btn_proceed);
        js.executeScript("arguments[0].click();", btn_proceed);
        System.out.println("Proceed button clicked");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try{
            driver.switchTo().alert().dismiss();
        }
        catch (Exception e){
            System.out.println("No Alert present");
        }
        js.executeScript("arguments[0].click();", radio_cod);
//        radio_cod.click();
        System.out.println("COD Option clicked");
        js.executeScript("arguments[0].click();", btn_placeCODOrder);
        System.out.println("Wooohooo!!! You have placed your order Successfully");
    }

    public void fetchOrderID() {
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        System.out.println("Here is your " + orderID.getText());
    }
}
