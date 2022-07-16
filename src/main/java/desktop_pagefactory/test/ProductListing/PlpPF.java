package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PlpPF {
    //-----------------------Add to wishlist remove from wishlist---------------------//
    @FindBy(xpath = "//*[@href='/other-categories/c/741']")
    WebElement mekup;

    @FindBy(xpath = "//*[contains(.,'Bestseller')] | //div[@class='ProductListingstyle__StyledProductListing-sc-1wnf7f-0 jwvwRy']//div[@class='container']//div[1]//div[1]//div[1]//div[1]//p[1]")
    WebElement bestseller;

    @FindBy(xpath = "//*[contains(.,'Top Rated')] | //div[34]//div[1]//div[1]//div[1]//p[1]")
    WebElement toprated;

    @FindBy(xpath = "//*[local-name()='svg'] | //body/div[@id='__next']/div[@class='ProductListingstyle__StyledProductListing-sc-1wnf7f-0 jwvwRy']/div[@class='container']/div[@class='ProductListingstyle__StyledListingContainer-sc-1wnf7f-2 hOyYxT']/div[@class='ProductListstyle__ProductListContainer-sc-1r0vbhp-0 fIkKJb']/div[1]/div[1]/span[1]//*[name()='svg']")
    WebElement add_to_wishlist;

    @FindBy(xpath = "//*[local-name()='svg'] | //body/div[@id='__next']/div[@class='ProductListingstyle__StyledProductListing-sc-1wnf7f-0 jwvwRy']/div[@class='container']/div[@class='ProductListingstyle__StyledListingContainer-sc-1wnf7f-2 hOyYxT']/div[@class='ProductListstyle__ProductListContainer-sc-1r0vbhp-0 fIkKJb']/div[1]/div[1]/span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M15 17.792')]")
    WebElement remove_from_wishlist;

    @FindBy(xpath = "//img[@alt='Logo']")
    WebElement back_to_home;

    //---------------------Details of products with picture-------------------------//

    @FindBy(xpath = "//h2[contains(text(),'INLIFE BCAA Branched Chain Amino Acids 7 G With L-')]")
    WebElement mekup_product;

    @FindBy(xpath = "//div[@class='spotlightThumbnails']//div[2]//div[1]//img[1]")
    WebElement click_on_image1;

    @FindBy(xpath = "//div[@class='DesktopSpotLightstyle__DesktopSpotLightWrapper-sc-10wftbx-0 epSOKn']//div[3]//div[1]//img[1]")
    WebElement click_on_image2;

    @FindBy(xpath = "//div[@class='DesktopSpotLightstyle__DesktopSpotLightWrapper-sc-10wftbx-0 epSOKn']//div[3]//div[1]//img[1]")
    WebElement getClick_on_image3;

    @FindBy(xpath = "//h1[normalize-space()='Blue Heaven Lash Twist Curling Mascara Black 12ml']")
    WebElement product_name;

    @FindBy(xpath = "//*[@class='Pricestyle__StyledPrice-sc-18r84va-0 gDuavx default'")
    WebElement product_price;

    @FindBy(xpath = "//button[@class='addSaveToBagstyle__SaveToBag-sc-ims6j7-1 ixbjmb']")
    WebElement save_button;

    @FindBy(xpath = "//button[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ']")
    WebElement add_to_bag_button;

    @FindBy(xpath = "//h2[normalize-space()='About The Product']")
    WebElement about_product;

    @FindBy(xpath = "//*[contains(.,'Similar Products')]")
    WebElement similar_product;
    //--------------------Coupon code copy------------------------------------//
    @FindBy(xpath = "//h2[normalize-space()='Cats Note Gel Look Nail Enamel12345653637381(test)']")
    WebElement mekup_product1;

    @FindBy(xpath = "//*[@class='buttonStyle']")
    WebElement copy_code;
//---------------------------Add To Bag view bag-----------------------------------//

    @FindBy(xpath = "//*[contains(@class,'addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ')]")
    WebElement add_to_bag;

    @FindBy(xpath = "//button[@class='cartButton']")
    WebElement view_bag;
//--------------------------Sorting low to high---------------------//

    @FindBy(xpath="//a[normalize-space()='Makeup']")
    WebElement mekup_module;

    @FindBy(xpath="//button[@class='sortBtn']")
    WebElement sort2;

    @FindBy(xpath="//*[@class='checkmark']")
    WebElement lowtohigh;

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement go_to_home;

    final WebDriver driver;

    public PlpPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        //PageFactory.initElements(driver, ProductDetailsPF.class);
    }

    public void mekup(){
        mekup.click();
    }
    public void BestSeller(){
        try{
            bestseller.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void TopRated(){
        try{
            toprated.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void AddToWishlist(){
        add_to_wishlist.click();
    }
    public void RemoveFromWishlist(){
        remove_from_wishlist.click();
    }

    public void BackToHome(){
        back_to_home.click();
    }

    //------------------all details-------------------------------------//
    public void MekupProdut(){
        mekup_product.click();
    }
    public void ClickOnImage1(){
        click_on_image1.click();
    }
    public void ClickOnImage2(){
        click_on_image2.click();
    }
    public void ClickOnImage3(){
        getClick_on_image3.click();
    }
    public void ProductName(){
        try{
            product_name.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void ProductPrice(){
        try{
            product_price.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void SaveButton(){
        try{
            save_button.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void AddToBagButton(){
        try{
            add_to_bag_button.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void AboutProduct(){
        try{
            about_product.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    public void SimilarProduct(){
        try{
            similar_product.isDisplayed();
        }catch (Exception e){
            return;
        }
    }
    //------------------------copy code----------------------------------------//

    public void MekupProduct1(){
        mekup_product.click();
    }
    public void CopyCode(){
        copy_code.click();
    }
    //-------------------Add to bag view bag-----------------------------------//
    public void AddToBag(){
        add_to_bag.click();
    }
    public void ViewBag(){
        view_bag.click();
    }

    //--------------------------Sorting low to high---------------------//
    public void Mekup() throws InterruptedException {
        Thread.sleep(5000);
        mekup_module.click();
    }
    public void Sort2() {
        sort2.click();
    }
    public void LowToHigh() {
        lowtohigh.click();
    }

    public void Price_Comparision(){
        String s1 = new String(String.valueOf(driver.findElement(By.xpath("//*[@class='Pricestyle__ProductPrice-sc-1vje94u-4 eLAiGs']"))));
        String s2 = new String(String.valueOf(driver.findElement(By.xpath("//*[@class='Pricestyle__ProductPrice-sc-1vje94u-4 eLAiGs']"))));
        System.out.println(s1 !=s2);
    }

}

