package desktop_pagefactory.test.ProductDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PDPAReYouLookingForPF {

    @FindBy(xpath = "//body/div[@id='__next']/div[2]/div[1]/div[1]/div[1]/ul[1]/li[13]")
    WebElement btn_WomenWearBusinessGroup;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/article[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/img[2]")
    WebElement Clk_ProductOnPLP;


    WebDriver driver;

    public PDPAReYouLookingForPF(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void ProductImgInProductListPage(){
        Clk_ProductOnPLP.click();
    }

    public void BussinessGroupWomenWear() {
        btn_WomenWearBusinessGroup.click();

    }
}
