package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class BestPricePF {

    @FindBy(xpath = "//a[normalize-space()=\"Men's Grooming\"] | //a[normalize-space()=\"Men's Grooming\"]")
    WebElement mens_grooming;

    @FindBy(xpath = "//div[@class='container']//div[1]//div[1]//div[2]//a[1]//div[1]//div[2]//span[1]//span[1]//span[2] | //div[@class='container']//div[1]//div[1]//div[2]//a[1]//div[1]//div[2]//span[1]//span[1]//span[2]")
    WebElement best_price_on_plp;

    @FindBy(xpath = "//h2[normalize-space()='Dr. Vegan Khadi Onion Ginger Shampoo, 200ml'] | //h2[normalize-space()='Trell Simple Product'] | (//h2[@class=\"ProductTilestyle__ProductName-sc-1bpfvho-3 gZLkfg\"])[1]")
    WebElement mens_grooming_product;

    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/span[1] | //div[@class='bestPrice']//span[@class='discountedPrice']")
    WebElement best_price_on_pdp;

    @FindBy(xpath = "//*[@class='discountedPrice'] | //a[@href='/men-s-grooming/weight-management/lip-gloss/trell-simple-product/p']//div[@class='ProductTilestyle__ProductWrapper-sc-1bpfvho-8 cUNgoj']//div[@class='ProductTilestyle__ProductDetailsSection-sc-1bpfvho-2 hAnLGR']//span[@class='OffersCountstyle__OffersSection-sc-1plo22k-0 kWPuEQ']//span[@class='BestPricestyle__StyledBestPrice-sc-19qy5lu-0 cGEdEP']//span[@class='discountedPrice']")
    WebElement best_price_click;
//------------------Home Page-------------------------//

    @FindBy(xpath = "//img[@alt='Logo']")
    WebElement back_to_home;

    @FindBy(xpath = "//div[@class='container']//div[1]//div[1]//div[2]//a[1]//div[1]//div[2]//span[1]//span[1]//span[2] | //a[@href='/men-s-grooming/weight-management/lip-gloss/trell-simple-product/p']//div[@class='ProductTilestyle__ProductWrapper-sc-1bpfvho-8 cUNgoj']//div[@class='ProductTilestyle__ProductDetailsSection-sc-1bpfvho-2 hAnLGR']//span[@class='OffersCountstyle__OffersSection-sc-1plo22k-0 kWPuEQ']//span[@class='BestPricestyle__StyledBestPrice-sc-19qy5lu-0 cGEdEP']//span[@class='discountedPrice']")
    public
    WebElement product_bestprice;

    final WebDriver driver;
    public BestPricePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

    }
    public void mensgrooming(){
        mens_grooming.click();
    }
    public void BestPriceOnPlp(){best_price_on_plp.isDisplayed();}
    public void mensgroomingproduct(){
        mens_grooming_product.click();
    }
    public void BestPriceOnPdp(){
        best_price_on_pdp.isDisplayed();
    }
    public void BackToHome(){
        back_to_home.isDisplayed();
    }
    public void ClickOnBestPrice(){
        best_price_click.click();
    }
    public void best_price_validation(String productBestPrice) {
        Assert.assertEquals(productBestPrice, product_bestprice.getText());
    }
    public void PriceValidationOnPlp(){
        String s1 = new String(String.valueOf(driver.findElement(By.xpath("//div[@class='container']//div[1]//div[1]//div[2]//a[1]//div[1]//div[2]//div[1]//div[1]//div[1]"))));
        String s2 = new String(String.valueOf(driver.findElement(By.xpath("//div[@class='container']//div[1]//div[1]//div[2]//a[1]//div[1]//div[2]//span[1]//span[1]//span[2]"))));
        System.out.println(s1 !=s2);
    }
    public void PriceValidationOnPdp(){
        String s1 = new String(String.valueOf(driver.findElement(By.xpath("//*[@class='Pricestyle__StyledPrice-sc-18r84va-0 gDuavx default']"))));
        String s2 = new String(String.valueOf(driver.findElement(By.xpath("//div[@class='bestPrice']//span[@class='discountedPrice']"))));
        System.out.println(s1 !=s2);
    }


}










