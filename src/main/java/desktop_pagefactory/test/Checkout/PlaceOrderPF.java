package desktop_pagefactory.test.Checkout;

import desktop_pagefactory.test.Login.LoginWebPF;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utils.DriverClass;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Order eligible for more the Rs. 250
public class PlaceOrderPF extends DriverClass {

    final WebDriver driver;
    JavascriptExecutor executor;

    public PlaceOrderPF(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

    }

//Elements

    //	Category page elements
    @FindBy(xpath = "//a[contains(text(), 'Makeup')] | //button[contains(text(), 'Makeup')]")
    WebElement category;

    //Add product from PDP

    @FindBy(xpath = "(//h2[@class='item-productName-2bT'])[3]")
    WebElement product;

    //    @FindBy(xpath = "//button[ contains(text(), 'Add to Bag')]")
    @FindBy(xpath = "//button[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ']//*[name()='svg']")
    WebElement btn_addToBag;

    @FindBy(xpath = "//div[@class='addSaveToBagstyle__AddBagLabel-sc-ims6j7-3 etAPzA']")
    WebElement btn_OOS;

    //	Cart Page Elements
    @FindBy(className = "cartButton")
    WebElement btn_viewBag;

    @FindBy(xpath = "//*[@id='root']/main/div/div[1]/div[2]/div/div/div[1]/ul/li[2]/div[1]/div[3]/div/form/div/div/button[1]")
    WebElement btn_delProduct;  //Delete button on in Cart

    @FindBy(xpath = "//*[@id='root']/main/div/div[1]/div[2]/div/div/div[1]/ul/li[1]/div[1]/div[3]/div/form/div/div/button[2]")
    WebElement btn_increaseProduct;  //Increase product button on in Cart

    @FindBy(xpath = "//*[@id='root']/main/div/div[1]/div[2]/div/div/div[1]/ul/li[1]/div[1]/div[3]/div/form/div/div/button[1]")
    WebElement btn_decreaseProduct; //Decrease product button on in Cart. Can be applied post increasing the product.


    @FindBy(xpath = "//*[@id='Cart-summary-node']/div/div[1]/div[2]/div[2]/button")
    WebElement btn_loginToApply; //Log in to Apply btn for anonymous user

    @FindBy(xpath = "//*[@id='Cart-summary-node']/div/div[5]/a/button")
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
    @FindBy(id = "cashondelivery")
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
    @FindBy(xpath = "//button[ contains(text(), 'Remove')]")
    WebElement btn_removeTrellCash; //Remove applied Trell Cash Button

    @FindBy(css = "button[data-disabled = 'false']")
    WebElement btn_applyTrellCash;  // Disabled Apply Trell Cash Button

    @FindBy(css = "button[data-disabled = 'true']")
    WebElement btn_disabledTrellCash;  //Enabled Apply Trell Cash button

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
    @FindBy(xpath = "//*[@id='root']/main/div/div/div[1]/div/div[2]/p[1]")
    WebElement orderID;


    //click multiple Add to Bag buttons in SSR mode for Simple Products
    public void addtoBagSimpleProduct(int index) throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> buttons = driver.findElements(By.xpath("//button[text()='Add to Bag'] | //span[text()='Add to Bag']"));
        for (int i=0; i<index; i++){
            waitForElementToBeClickable(buttons.get(i));
            buttons.get(i).click();
            System.out.println(i+1 + " Add to Bag button clicked");
//            waitForElementToDisappear(driver.findElement(By.xpath("//div[text()='Added to bag']")));
            Thread.sleep(3000);
        }
    }


    // Add products to bag
    public void addProduct_to_Cart() throws InterruptedException {  //more than Applicable Trell Cash Threshold value in Prod
        category.click();
        Thread.sleep(2000);
        System.out.println("Category clicked");
        addtoBagSimpleProduct(3);
        System.out.println("3 products added to Bag.");
        btn_viewBag.click();
        System.out.println("View Bag button clicked");
    }

    //	Update your Cart
    public void updateCart() {
        waitForElementToBeClickable(btn_delProduct);
        btn_delProduct.click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        System.out.println("Delete button clicked");
        btn_increaseProduct.click();
        System.out.println("increase button clicked");
        waitForElementToBeClickable(btn_decreaseProduct);
        btn_decreaseProduct.click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        System.out.println("Decrease button clicked");
    }

    public void addProduct_to_Cart1() throws InterruptedException {  //less than Applicable Trell Cash Threshold value in Stage
        category.click();
        Thread.sleep(2000);
        System.out.println("Category clicked");
        addtoBagSimpleProduct(1);
        System.out.println("1 product added to Bag.");
        btn_viewBag.click();
        System.out.println("View Bag button clicked");
    }

    //	Login to application
    public void loginToVerify() throws InterruptedException {
        LoginWebPF login;
        btn_loginToApply.click();
        System.out.println("Login to Apply button clicked");
        login = new LoginWebPF(driver);
        login.enterMobileNoToVerify("9999999999");
        Thread.sleep(2000);
        login.otpValue("987699");
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
        executor = (JavascriptExecutor) driver;
        Thread.sleep(3000);
//			waitForElementToBeClickable(btn_proceed);
        executor.executeScript("arguments[0].click();", btn_proceed);
        System.out.println("Proceed button clicked");
        Thread.sleep(3000);
        driver.navigate().refresh();
        executor.executeScript("arguments[0].click();", radio_cod);
        System.out.println("COD Option clicked");
        executor.executeScript("arguments[0].click();", btn_placeCODOrder);
        System.out.println("Wooohooo!!! You have placed your order Successfully");
    }


    public void fetchOrderID() {
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        System.out.println("Here is your " + orderID.getText());
    }


    public void clickOnViewBag(){
        btn_viewBag.click();
        System.out.println("View Bag button clicked");
    }

    public void addProductfromPD() throws InterruptedException {
        Thread.sleep(4000);
        product.click();
        waitForElementToBeClickable(btn_addToBag);
        btn_addToBag.click();
    }

    public void button(){
        System.out.println(btn_addToBag.getText());
    }
}


