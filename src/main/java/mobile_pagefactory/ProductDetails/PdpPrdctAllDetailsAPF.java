package mobile_pagefactory.ProductDetails;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utils.DriverClass;

public class PdpPrdctAllDetailsAPF extends DriverClass {

    //---------------Login---------------------//
    @FindBy(xpath = "//button[@class='appInstall-cancelBtnForImage-dWW']")
    WebElement BtnBannerClose;

    @FindBy(xpath = "//p[@class='userName']")
    WebElement btn_login_signup;

    @FindBy(xpath = "//input[@placeholder='Enter Phone Number']")
    WebElement txt_mobileno;

    @FindBy(xpath = "//input[@placeholder='Enter Phone Number']")
    WebElement txt_mobilenoInCheckout;

    @FindBy(xpath = "//button[normalize-space()='Get OTP via SMS']")
    WebElement btn_GetOTP;

    @FindBy(xpath = "//input[@name='otp-value']")
    WebElement txt_otp_value;

    @FindBy(xpath = "//input[@placeholder='Enter OTP']")
    WebElement txt_otp_valueInCheckout;

    @FindBy(xpath = "//button[contains(text(),'Verify Now')]")
    WebElement btn_verify_now;

    //----------- Details for Product--------//

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement search_product;

    @FindBy(xpath = "//p[normalize-space()='Lakme']")
    WebElement select_product;

    @FindBy(xpath = "//h2[normalize-space()='Sprite Yoga Strap 8 foot242242'] | //h2[normalize-space()='Lakme 9 To 5 Naturale Day Crème Spf 20, 50gm']")
    WebElement eye_product;

    @FindBy(xpath="//h2[normalize-space()='Sprite Yoga Strap 8 foot242242'] | //h2[normalize-space()='Lakme 9 To 5 Naturale Day Crème Spf 20, 50gm']")
    WebElement product_name;

    @FindBy(xpath="//h2[normalize-space()='Sprite Yoga Strap 8 foot242242'] | //h2[normalize-space()='Lakme 9 To 5 Naturale Day Crème Spf 20, 50gm']")
    WebElement review;

    @FindBy(xpath="//*[contains(.,'â‚¹ 147')]")
    WebElement price;

    @FindBy(xpath="//*[contains(@class,'Pricestyle__StyledPrice-sc-18r84va-0 gDuavx grey')]")
    WebElement actualprice;

    @FindBy(xpath="//*[@class='Pricestyle__StyledPrice-sc-18r84va-0 gDuavx danger']")
    WebElement offer;

    @FindBy(xpath="//p[normalize-space()='Know your delivery date?']")
    WebElement expecteddeliverydate;

    @FindBy(xpath="//*[@class='TrellForYoustyle__StyledBrandName-sc-mjrr8m-6 dbNHBH']")
    WebElement brandname;

    @FindBy(xpath="//div[normalize-space()='Expiry']")
    WebElement expiry;

    @FindBy(xpath="//h2[normalize-space()='About The Product']")
    WebElement aboutproduct;

    @FindBy(xpath="//h2[normalize-space()='What Makes it Special']")
    WebElement whatmakeitspecial;

    @FindBy(xpath="//h2[normalize-space()='Good To Know']")
    WebElement goodtoknow;

    @FindBy(xpath="//h2[normalize-space()='Ingredients']")
    WebElement ingredient;

    @FindBy(xpath="//h2[normalize-space()='Good To Know']")
    WebElement howtouse;

    @FindBy(xpath="//h2[normalize-space()='Product Authenticity']")
    WebElement productauthenticity;

    @FindBy(xpath="//*[@class='TrellForYoustyle__StyledReturnPolicyTitle-sc-mjrr8m-19 famXkJ']")
    WebElement returnproduct;

    @FindBy(xpath="//div[contains(text(),'COD Available')]")
    WebElement cod;

    @FindBy(xpath="//*[@class='headTitle']")
    WebElement similarproduct;

    @FindBy(xpath="//p[normalize-space()='Additional Information']")
    WebElement additionalinfo;

    @FindBy(xpath="//*[@class='addSaveToBagstyle__SaveToBag-sc-ims6j7-1 ixbjmb']")
    WebElement save;

    @FindBy(xpath="//*[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ']")
    WebElement addtobag;

    @FindBy(xpath="//*[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ']")
    WebElement breadcrumbs;

    @FindBy(xpath="//*[@class='breadcrumbsstyle__ActiveLabel-sc-1rvnu12-2 caxaJU")
    WebElement click_on_breadcrubs;
    //--------------------Back to Home-------------------//

    @FindBy(xpath = "//*[@src='https://cdn.trell.co/images/orig/zlaflrCQtPQBqSWprxyGNVPzGDmbTKdp.svg?auto=format&fit=max&w=48']")
    WebElement menu_icon;

    @FindBy(xpath = "//*[@src='https://cdn.trell.co/images/orig/f55Ts0XiBj7kyo5Q83kZAiRp6Wfnzqdj.svg?auto=format&fit=max&w=256']")
    WebElement trell_icon;

    AppiumDriver driver;

    public void enterMobileNo() {

        btn_login_signup.click();
        driver.hideKeyboard();
        txt_mobileno.sendKeys("9999999999");
        btn_GetOTP.click();
    }
    public void otpValue() {
        txt_otp_value.sendKeys("123456");
    }

    public void clickOnVerifyNow() {
        btn_verify_now.click();
    }

    public PdpPrdctAllDetailsAPF(AppiumDriver driver) {
        this.driver = driver;

        //PageFactory.initElements(driver, LoginWebPF.class);
        //AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }
    public void SearchProduct() {
        search_product.click();
    }
    public void SelectProduct() {
        select_product.click();
    }
    public void EyeProduct() {
        eye_product.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
    }
    public void ProductName() {
        try{
            product_name.isDisplayed();
        }catch (Exception e){
            return;
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)", "");
    }
    public void Review() {
        try{
            review.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Product_Price() {
        try{
            price.isDisplayed();
        }catch (Exception e){
            return;
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)", "");
    }
    public void Actual_Price() {
        try{
            actualprice.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void Offer() {
        try{
            offer.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void ExpectedDeliveryDate() {
        try{
            expecteddeliverydate.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void SaveBtn() {
        try{
            save.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void AddtoBag() {
        try{
            addtobag.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void BrandName() {
        try{
            brandname.isDisplayed();
        }catch (Exception e){
            return;
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,50)", "");
    }
    public void ExpiryDate() {
        try{
            expiry.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void AboutProduct() {
        try{
            aboutproduct.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void MakeItSpecial() {
        try{
            whatmakeitspecial.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void GoodToKnow() {
        try{
            goodtoknow.isDisplayed();
        }catch (Exception e){
            return;
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,50)", "");
    }
    public void Ingredient() {
        try{
            ingredient.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void HowToUse() {
        try{
            howtouse.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void ProductAuthenticity() {
        try{
            productauthenticity.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void ReturnProduct() {
        try{
            returnproduct.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void CashOnDelivery() {
        try{
            cod.isDisplayed();
        }catch (Exception e){
            return;
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,50)", "");
    }
    public void SimilarProduct() {
        try{
            similarproduct.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void AdditionalInfo() {
        try{
            additionalinfo.isDisplayed();
        }catch (Exception e){
            return;
        }
    }

    public void Breadcrumbs() {
        try{
            breadcrumbs.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void ClickOnBreadcrumbs() {
        try{
            click_on_breadcrubs.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void MenuIcon() {
        menu_icon.click();
    }
    public void TrellIcon() {
        trell_icon.click();
    }




}


