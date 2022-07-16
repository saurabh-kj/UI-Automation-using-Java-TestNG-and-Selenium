package desktop_pagefactory.test.Login;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class LoginInDifferentPagesPF {

    //----------------------Login Plp------------------------//
    @FindBy(xpath = "//a[normalize-space()='Makeup']")
    WebElement mekup;

    @FindBy(xpath = "//p[@class='userName']")
    WebElement login_signup;

    @FindBy(xpath = "//input[@placeholder='Enter Phone Number']")
    WebElement enter_phone_num;

    @FindBy(xpath = "//button[normalize-space()='Get OTP via SMS']")
    WebElement get_otp;

    @FindBy(xpath = "//input[@placeholder='Enter OTP']")
    WebElement enter_otp;

    @FindBy(xpath = "//button[normalize-space()='Verify Now']")
    WebElement verify_now;
    //---------------------Login Pdp-------------------------------//
    @FindBy(xpath="//*[@href='/personal-feminine-hygiene/c/27']")
    WebElement personal_hygiene;

    @FindBy(xpath="//*[@class='ProductTilestyle__ProductName-sc-1bpfvho-3 gZLkfg']")
    WebElement select_product;

    //-----------------------After Search Login---------------------//
    @FindBy(xpath = "//input[@placeholder='Search for brands, products and more...']")
    WebElement search_product;

    @FindBy(xpath = "//p[normalize-space()='Lakme']")
    WebElement select_from_search;

//--------------Login from Check out------------------------//

    @FindBy(xpath = "//*[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ']")
    WebElement add_to_bag;

    @FindBy(xpath = "//button[@class='cartButton']")
    WebElement view_bag;

    @FindBy(xpath = "//*[@class='totalsSummary-proceed-WrG']")
    WebElement proceed;

    @FindBy(xpath = "//*[.='Sign Out'] | //*[normalize-space()='Sign Out']")
    WebElement click_on_logout;
    //--------------------Check out Login----------------------------//
    @FindBy(xpath = "//input[@placeholder='Enter Phone Number']")
    WebElement enter_phone_num_checkout;

    @FindBy(xpath = "//button[normalize-space()='Get OTP via SMS']")
    WebElement get_otp_checkout;

    @FindBy(xpath = "//input[@placeholder='Enter OTP']")
    WebElement enter_otp_checkout;

    @FindBy(xpath = "//button[normalize-space()='Verify Now']")
    WebElement otp_verify_for_checkout;
//-------------------Check application already loged out----------------------//

    @FindBy(xpath = "//p[@class='userName']")
    WebElement check_logout;

    WebDriver driver;

    public LoginInDifferentPagesPF(WebDriver driver) {
        this.driver = driver;

        //PageFactory.initElements(driver, LoginWebPF.class);
        //AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    //---------------------LoginPlp---------------------//
    public void Mekup(){
        mekup.click();
    }
    public void LoginSignup(){
        login_signup.click();
    }
    public void EnterPhoneNum(){
        enter_phone_num.sendKeys("9999999999");
    }
    public void GetOtp(){
        get_otp.click();
    }
    public void EnterOtp(){
        enter_otp.sendKeys("987699");
    }
    public void VerifyNow(){
        verify_now.click();
    }
    //-----------------------Pdp Login-----------------------------//
    public void PersonalHygiene(){
        personal_hygiene.click();
    }

    public void SelctProduct(){
        select_product.click();
    }
    //------------------------After Search Login---------------------//
    public void SearchProduct(){
        search_product.click();
    }
    public void SelctFromSearch(){
        select_from_search.click();
    }
    //----------------Login from checkout page-------------------------//
    public void AddToBag(){
        add_to_bag.click();
    }
    public void ViewBag(){
        view_bag.click();
    }
    public void Proceed(){
        proceed.click();
    }
    //--------------------------Log out-------------------------------//
    public void HoverOnLogOut(){
        WebElement ele = driver.findElement(By.xpath("//p[@class='userName']"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
    }
    public void HoverOnLogOutForCheckoutPage(){
        WebElement ele = driver.findElement(By.xpath("//div[@class='header-my_account_wrapper-2hM']//span[@class='header-my_account_text-h6w'][normalize-space()='Hello -']"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
    }
    public void LogOut(){
        click_on_logout.click();
    }
    //------------------------Check out Login--------------------------//
    public void EnterPhoneNuberCheckOut(){
        enter_phone_num_checkout.sendKeys("9999999999");
    }
    public void GetOtpForCheckout(){
        get_otp_checkout.click();
    }
    public void EnterOtpCheckOut(){
        enter_otp_checkout.sendKeys("987699");
    }

    public void VerifyOtpCheckOut(){
        otp_verify_for_checkout.click();
    }
    //-------------------------------Validations-----------------------------//
    public void Plp_Page_Validation() {
        Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Makeup']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Makeup']")).isDisplayed());
    }
    public void Pdp_Page_Validation() {
        Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='INLIFE Face Cream2']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='INLIFE Face Cream2']")).isDisplayed());
    }
    public void Login_Page_Validation() {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@placeholder='Enter Phone Number']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//input[@placeholder='Enter Phone Number']")).isDisplayed());
    }
    public void CheckOut_Page_Validation() {
        Assert.assertTrue(driver.findElement(By.xpath("//p[normalize-space()='Price Details (1 item)']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//p[normalize-space()='Price Details (1 item)']")).isDisplayed());
    }
    public boolean CheckApplicationAlreadyLogedOut(){
        check_logout.isDisplayed();
        return true;
    }
}
