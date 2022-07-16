package mobile_pagefactory.Common;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import utils.DriverClass;

import java.util.List;

public class HomePageAPF extends DriverClass {
    //-------------Login-----------------//
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
//--------------Home Page-----------------//

    @FindBy(xpath = "//*[@src='https://cdn.trell.co/images/orig/zlaflrCQtPQBqSWprxyGNVPzGDmbTKdp.svg?auto=format&fit=max&w=48']")
    WebElement menu_option;

    @FindBy(xpath = "//a[normalize-space()='']//div[@class='logo']//div//img[@alt='Logo']")
    WebElement trell_shop_logo;

    @FindBy(xpath = "//img[@alt='Cart Bag']")
    WebElement bag_option;

    @FindBy(xpath = "//*[.='Offer']")
    WebElement offers;

    @FindBy(xpath = "//*[.='Men']")
    WebElement mens_option;

    @FindBy(xpath = "//*[.='Women']")
    WebElement women_option;

    @FindBy(xpath = "//*[.='Kids']")
    WebElement kids_option;

    @FindBy(xpath = "//*[@src='https://cdn.trell.co/images/orig/zlaflrCQtPQBqSWprxyGNVPzGDmbTKdp.svg?auto=format&fit=max&w=48']")
    WebElement main_menu;
    //---------------------menu Option-------------------------//
    @FindBy(xpath = "(//*[@class='itemWrap'])[3]")
    WebElement mekup;

    @FindBy(xpath = "//*[.='Complete Makeup Collection']")
    WebElement allmekup;

    @FindBy(xpath = "//*[@alt='Logo'] | //div[@class='logo']//div//div//img[@alt='Logo']")
    WebElement againhomepage;

    //------------------Search Product---------------------------//

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement search;

    @FindBy(xpath = "//p[normalize-space()='Lakme']")
    WebElement select_prdct;

    @FindBy(xpath = "//div[@class='mobileSearchBar__backButton']//button[@type='button']//*[name()='svg']")
    WebElement back_to_homepage;
//-----------------Click on banner------------------------------//

    @FindBy(xpath = "//div[@class='rowstyle__StyledRowContainer-sc-11gjizh-0 jvDmRr full-width-image']//div//div[@class='bannerstyle__BannerWrapper-sc-asb6oa-0 kvuYph']//a[@class='bannerstyle__StyledLink-sc-asb6oa-1 eKYFGR']//div[@class='bannerstyle__ImageContainer-sc-asb6oa-3 kikYHd']//div//img[@alt='banner-home-page']")
    WebElement click_on_banner;

    @FindBy(xpath = "//a[normalize-space()='']//div[@class='logo']//div//img[@alt='Logo']")
    WebElement back_to_home;

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

    public HomePageAPF(AppiumDriver driver) {
        super(driver);
        this.driver = driver;

        //PageFactory.initElements(driver, LoginWebPF.class);
        //AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void MenuOption() {
        menu_option.isDisplayed();
    }

    public void TrellShopLogo() {
        waitForElementToBeClickable(trell_shop_logo);
        Assert.assertTrue(trell_shop_logo.isDisplayed());
//        trell_shop_logo.click();
    }

    public void BagOption() {
        waitForElementToBeClickable(bag_option);
        Assert.assertTrue(bag_option.isDisplayed());
    }

    public boolean ListMenuSelection(String name) throws InterruptedException {
        List<WebElement>  ele = driver.findElements(By.xpath("//div[@class='row-root-24z row-scrollSection-3kE']//div[@class='banner-root-H25']//span"));
        Assert.assertEquals(ele.size(),7);
        String[] expectedList={"Offer","Men","Women","Kids","Beauty","Fragrances","Wellness"};
        for(int i=0;i<ele.size();i++){
            System.out.println(ele.get(i).getText());
            Assert.assertEquals(ele.get(i).getText().trim(),expectedList[i]);
        }

        return true;
    }

    public void homePageMenu(String name) throws InterruptedException {
        Thread.sleep(4000);
//        Assert.assertTrue(ListMenuSelection(name));
    }

    public void mensoption() {
        mens_option.isDisplayed();
    }

    public void womenoption() {
        women_option.isDisplayed();
    }

    public void kidsoption() {
        kids_option.isDisplayed();
    }

    public void main_menu() {
        main_menu.click();
    }

    public void Mekup() {
        mekup.click();
    }

    public void AllMekup() throws InterruptedException {
        allmekup.click();
        Thread.sleep(5000);
    }

    public void AgainHomePage() throws InterruptedException {
        waitForElementToBeClickable(againhomepage);
        againhomepage.click();
        Thread.sleep(4000);
    }

    public void Search() {
        waitForElementToBeClickable(search);
        search.click();
    }

    public void Select_Prdct() {
        select_prdct.click();
    }

    public void Back_To_HomePage() throws InterruptedException {
//        Thread.sleep(4000);
        waitForElementToBeClickable(againhomepage);
        againhomepage.click();
        Thread.sleep(7000);

    }

    public void Click_On_Banner() {
        click_on_banner.click();
    }

    public void back_to_home() {
        back_to_home.click();
    }


}
