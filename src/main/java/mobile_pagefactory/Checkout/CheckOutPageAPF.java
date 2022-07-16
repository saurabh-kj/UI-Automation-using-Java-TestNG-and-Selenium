package mobile_pagefactory.Checkout;

import io.appium.java_client.AppiumDriver;
import mobile_pagefactory.Cart.CartPageAPF;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CheckOutPageAPF {

    @FindBy(xpath = "//label[normalize-space()='Cash On Delivery']")
    WebElement Btn_CashOnDelivery;

    @FindBy(xpath = "//span[contains(text(),'Place Order')]")
    WebElement Btn_PlaceOrder;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/button[1]")
    WebElement Btn_BackButtonOnCheckOutPage;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/button[1]")
    WebElement Btn_BackButtonOnMyBagPage;

    @FindBy(xpath = "//span[normalize-space()='Change']")
//    @FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[2]/div[3]/label[1]/div[1]/button[1]/span[1]")
    WebElement btn_ChangeAddressButton;

    @FindBy(xpath = "//button[normalize-space()='Add New Address']")
    WebElement btn_AddNewAddressButton;

    @FindBy(xpath = "//span[normalize-space()='Add Address']  ")
    WebElement btn_AddAddressButton;


    @FindBy(xpath = "//input[@id='firstname']")
    WebElement txt_FullName;

    @FindBy(xpath = "//input[@id='postcode']")
    WebElement txt_PinCode;

    @FindBy(xpath = "//input[@id='street0']")
    WebElement txt_Address;

    @FindBy(xpath = "//input[@id='street1']")
    WebElement txt_LandMark;

    @FindBy(xpath = "//div[@id='scroll_top']")
    WebElement btn_ScrollUp;

    @FindBy(xpath = "//span[contains(text(),'Place Order')]")
    WebElement btn_PaymentMethodOnPlaceOrder;

    @FindBy(xpath = "//span[normalize-space()='Select and Proceed']")
    WebElement btn_SelectAndProcessed;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[2]/div[2]/div[2]/div[1]/div[1]/img[1]")
    WebElement btn_BackButtonToAddressPage;

    AppiumDriver driver;

    public CheckOutPageAPF(AppiumDriver driver) {
        this.driver = driver;

        //PageFactory.initElements(driver, LoginWebPF.class);
        //AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }


    public void ClickCashOnDelivery() throws InterruptedException {
        CartPageAPF Cart = new CartPageAPF(driver);
        Thread.sleep(4000);
        Btn_CashOnDelivery.click();
        driver.navigate().back();
        Thread.sleep(4000);
		Cart.RemoveProductFromBag();
//        driver.navigate().back();

    }

    public void ClickPlaceOrder(){
        Btn_PlaceOrder.click();
    }

    public void ClickBackOnCheckoutPage() throws InterruptedException {
        Btn_BackButtonOnCheckOutPage.click();
        Thread.sleep(4000);
        driver.navigate().back();
    }

    public void ClickBackOnMyBag() throws InterruptedException {
        Btn_BackButtonOnMyBagPage.click();
        Thread.sleep(4000);

    }

    public void ClickOnAddAdressPage() {
        btn_ScrollUp.click();
        btn_ChangeAddressButton.click();
        btn_AddNewAddressButton.click();
        btn_AddAddressButton.click();

    }

    public void EnterAddressPageFullName() throws InterruptedException {
        //btn_ScrollUp.click();
        Thread.sleep(5000);
        btn_ChangeAddressButton.click();
        btn_AddNewAddressButton.click();
        txt_FullName.sendKeys("Aravind");
    }

    public void EnterPinCode() {
        txt_PinCode.sendKeys("560050");
    }


    public void EnterAddress() {
        txt_Address.sendKeys("bangalore,karanataka");
    }

    public void EnterLandMark() {
        txt_LandMark.sendKeys("vk Bakary road near");
        driver.hideKeyboard();
    }

    public void clickOnVerifyAddAddress() throws InterruptedException {
        btn_AddAddressButton.click();
        btn_SelectAndProcessed.click();
        Thread.sleep(4000);

    }

    public void ClickOnBackToCart() throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().back();

    }
}
