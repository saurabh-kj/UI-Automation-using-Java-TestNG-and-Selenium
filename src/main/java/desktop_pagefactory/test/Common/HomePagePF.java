package desktop_pagefactory.test.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utils.DriverClass;

public class HomePagePF extends DriverClass {

    public WebDriver driver;
    JavascriptExecutor js;

    public HomePagePF(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    //----------------------SSR--------------------------//

    @FindBy(xpath = "//a[normalize-space()='']//div//div//img[@alt='Logo']")
    WebElement shoptrell;

    @FindBy(xpath = "//input[@placeholder='Search for brands, products and more...']")
    WebElement search_logo;

    @FindBy(xpath = "//p[@class='userName']")
    WebElement login_signup;

    @FindBy(xpath = "//p[normalize-space()='Bag']")
    WebElement bag_logo;
    //---------------module-------------------------------//
    @FindBy(xpath = "//a[normalize-space()='Makeup']")
    WebElement mekup;

    @FindBy(xpath = "//*[.='Skin Care']")
    WebElement skincare;

    @FindBy(xpath = "//a[normalize-space()='Hair']")
    WebElement hair;

    @FindBy(xpath = "//a[contains(text(),'Fragrances')]")
    WebElement fragrance;

    @FindBy(xpath = "//a[normalize-space()='Bath & Body']")
    WebElement bathbody;

    @FindBy(xpath = "//a[normalize-space()=\"Men's Grooming\"]")
    WebElement mensgrooming;

    @FindBy(xpath = "//a[normalize-space()='Tools & Appliances']")
    WebElement tools;

    @FindBy(xpath = "//*[.='Personal/ Feminine Hygiene']")
    WebElement personal;

    @FindBy(xpath = "//a[normalize-space()='Health & Wellness']")
    WebElement health;

    @FindBy(xpath = "//a[normalize-space()='Brands']")
    WebElement brand;

    @FindBy(xpath = "//*[.='Mom & Baby']")
    WebElement mombaby;

    @FindBy(xpath = "//*[.='Womenswear']")
    WebElement womenswear;

    @FindBy(xpath = "//*[.='Menswear']")
    WebElement menswear;

    @FindBy(xpath = "//*[.='Kidswear']")
    WebElement kidswear;

    @FindBy(xpath = "//*[.='Bags']")
    WebElement bags;

    @FindBy(xpath = "//div[contains(@class,'sliderstyle__StyledSlider-sc-26uqte-0 dHRUlA')]//button[contains(@aria-label,'Go to next slide')]")
    WebElement RightArrow;

    @FindBy(xpath = "//*[.='Luggage']")
    WebElement luggage;
    //---------------Category-----------------------//
    @FindBy(xpath = "(//strong[contains(text(),'Offers')])[2]")
    WebElement offers;

    @FindBy(xpath = "(//strong[contains(text(),'Mens')])[2]")
    WebElement men;

    @FindBy(xpath = "(//strong[contains(text(),'Women')])[2]")
    WebElement women;

    @FindBy(xpath = "(//strong[contains(text(),'Kids')])[2]")
    WebElement kids;

    @FindBy(xpath = "//li[contains(@class,'react-multi-carousel-item react-multi-carousel-item--active')]//strong[contains(text(),'Beauty')]")
    WebElement beauty;

    @FindBy(xpath = "//li[contains(@class,'react-multi-carousel-item react-multi-carousel-item--active')]//strong[contains(text(),'Fragrances')]")
    WebElement fragrance_pdt;

    @FindBy(xpath = "//li[contains(@class,'react-multi-carousel-item react-multi-carousel-item--active')]//strong[contains(text(),'Wellness')]")
    WebElement wellness;
//---------------Posters-------------------------------------//

    @FindBy(xpath = "//div[@class='homestyle__StyledRoot-sc-3xgovj-1 ekUGtM']//div[2]//div[1]//div[1]//a[1]//div[1]//div[1]//img[1]")
    WebElement megasell;

    @FindBy(xpath = "//*[@src='https://shop.trell.co/media/wysiwyg/Ecraft_india_D_9.png?auto=webp&format=pjpg&width=800&quality=80']")
    WebElement crackling_deal1;

    @FindBy(xpath = "//*[@src='https://shop.trell.co/media/wysiwyg/VALENTINE_70__2x2_copy_2.png?auto=webp&format=pjpg&width=800&quality=80']")
    WebElement crackling_deal2;

    @FindBy(xpath = "//*[@src='https://shop.trell.co/media/wysiwyg/VALENTINE_60__2x2_copy_2.png?auto=webp&format=pjpg&width=800&quality=80']")
    WebElement crackling_deal3;

    @FindBy(xpath = "//div[7]//div[1]//div[1]//a[1]//div[1]//div[1]//img[1]")
    WebElement crackling_deal4;

    @FindBy(xpath = "//div[8]//div[1]//div[1]//a[1]//div[1]//div[1]//img[1]")
    WebElement grab_theme;

    @FindBy(xpath = "//div[9]//div[1]//div[1]//a[1]//div[1]//div[1]//img[1]")
    WebElement festive_delight;

    @FindBy(xpath = "//div[10]//div[1]//div[1]//a[1]//div[1]//div[1]//img[1]")
    WebElement hair_poster;

//---------------click on poster--------------------//

    @FindBy(xpath = "//*[@src='https://shop.trell.co/media/wysiwyg/Valentine_HP_D_S_2.png?auto=webp&format=pjpg&width=800&quality=80']")
    WebElement clickBanner;

    //Element on PLP
    @FindBy(xpath = "//h2[contains(text(), 'Filters')]")
    WebElement filterText;


//---------------Click on offers---------------//

    @FindBy(xpath = "//div[14]//div[1]//div[1]//a[1]//div[1]//div[1]//img[1]")
    WebElement clickonoffers;

    public void shoptrell_logo(){
        shoptrell.isDisplayed();
    }

    public void search_logo(){
        search_logo.isDisplayed();
    }

    public void signuplogin(){
        login_signup.isDisplayed();
    }

    public void baglogo(){
        bag_logo.isDisplayed();
    }

    //--------------modules-----------------------//
    public void mekup(){
        mekup.isDisplayed();
    }

    public void skinecare(){
        skincare.isDisplayed();
    }

    public void hair(){
        hair.isDisplayed();
    }

    public void fragrance(){
        fragrance.isDisplayed();
    }

    public void bathbody(){
        bathbody.isDisplayed();
    }

    public void mensgrooming(){
        mensgrooming.isDisplayed();
    }

    public void tools(){
        tools.isDisplayed();
    }

    public void personal(){
        personal.isDisplayed();
    }

    public void health(){
        health.isDisplayed();
    }

    public void brand(){
        brand.isDisplayed();
    }

    public void mombaby(){
        mombaby.isDisplayed();
    }

    public void womenswear(){
        womenswear.isDisplayed();
    }

    public void menswear(){
        menswear.isDisplayed();
    }

    public void kidswear(){
        kidswear.isDisplayed();
    }

    public void bags(){
        bags.isDisplayed();
    }

    public void luggage(){
        luggage.isDisplayed();
    }

    //---------------Category-------------------------//
    public void offer(){
        offers.isDisplayed();
    }

    public void men(){
        men.isDisplayed();
    }

    public void women(){
        women.isDisplayed();
    }

    public void kid(){
        kids.isDisplayed();
    }

    public void beauty(){
        beauty.isDisplayed();
    }
    public void hoverOnbeauty() {
        WebElement ele = driver.findElement(By.xpath("//li[contains(@class,'react-multi-carousel-item react-multi-carousel-item--active')]//strong[contains(text(),'Beauty')]"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        RightArrow.click();
    }
    public void fragrancep(){

        fragrance_pdt.isDisplayed();
    }
    public void hoverOnFragrance() {
        WebElement ele = driver.findElement(By.xpath("//li[contains(@class,'react-multi-carousel-item react-multi-carousel-item--active')]//strong[contains(text(),'Wellness')]"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        RightArrow.click();
    }
    public void wellness(){
        wellness.isDisplayed();
    }

    //--------------------poster----------------------------//
    public void megasell(){
        megasell.isDisplayed();
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
    }

    public void crackingdeal1(){
        crackling_deal1.isDisplayed();
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
    }

    public void cracklingdeal2(){
        crackling_deal2.isDisplayed();
    }


    public void hover(){
        WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Makeup']"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
    }

    //-----------------------click on Banner--------------------//
    public void click_on_poster() throws Exception{
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(800);
        js.executeScript("window.scrollBy(0,500)", "");
        waitForElementToBeClickable(clickBanner);
        clickBanner.click();
        driver.navigate().back();
    }

    public void click_on_offers(){
        clickonoffers.click();
    }

}