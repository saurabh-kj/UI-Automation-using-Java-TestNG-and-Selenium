package desktop_pagefactory.test.Cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import java.util.List;

public class CartCalPF {

    @FindBy(xpath = "(//span[@class='totalsSummary-detailsTitle__value-1sG'])[3]/span[2]")
    WebElement Subtotalbeforeshipping;

    @FindBy(xpath = "(//span[@class='totalsSummary-detailsTitle__value-1sG'])[1]")
    WebElement MRPTotalvalue;

//    @FindBy(xpath = "//span[@class='totalsSummary-promotionalDiscount-3X_']")
    @FindBy(xpath = "//img[@alt='accordian_icon']")
    WebElement btn_PromotionalDiscount;

    @FindBy(xpath = "(//span[@class='totalsSummary-detailsTitle__value-1sG'])[2]")
    WebElement btn_Subtotal;



    WebDriver driver;

    public CartCalPF(WebDriver driver) {
        this.driver = driver;

        //PageFactory.initElements(driver, LoginWebPF.class);
        //AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }



    public void ProductCount() throws InterruptedException {

        String xpathrows = "//ul[@class='productList-root-1dQ']/li";
        List<WebElement> listTotal = driver.findElements(By.xpath(xpathrows));
        System.out.println("total no of rows" + listTotal.size());
    }

    public void ProductTotal() throws InterruptedException {

        String xpathrows = "//ul[@class='productList-root-1dQ']/li";
        List<WebElement> listTotal = driver.findElements(By.xpath(xpathrows));
        System.out.println("total no of rows" + listTotal.size());

        float total =0;
        for (int j = 1; j <= listTotal.size(); j++) {
//				String xpathforProductName = "//*[@class=\"ProductListstyle__ProductListContainer-sc-1r0vbhp-0 fIkKJb\"]/div["+i+"]/div/div[1]/div[2]/a/div/div[2]/h2[2]";//div[1]//div[1]//div[2]//a[1]//div[1]//div[2]/h2
            String xpathforOffersName = "//ul[@class='productList-root-1dQ']/li["+ j +"]/div[1]/div[2]/div[2]/div[1]/span[1]/span[2]";
            WebElement contentEle = driver.findElement(By.xpath(xpathforOffersName));
            System.out.println(contentEle.getText().toString());
            float Ptotal = Float.parseFloat(contentEle.getText());
            total = total+Ptotal;
        }
        System.out.println(total);

        Assert.assertEquals(total, Subtotalbeforeshipping.getText());


    }

    public void MRPValue() throws InterruptedException {

        String xpathrows = "//ul[@class='productList-root-1dQ']/li";
        List<WebElement> listTotal = driver.findElements(By.xpath(xpathrows));
        System.out.println("total no of rows" + listTotal.size());

        float total =0;
        for (int j = 1; j <= listTotal.size(); j++) {
//				String xpathforProductName = "//*[@class=\"ProductListstyle__ProductListContainer-sc-1r0vbhp-0 fIkKJb\"]/div["+i+"]/div/div[1]/div[2]/a/div/div[2]/h2[2]";//div[1]//div[1]//div[2]//a[1]//div[1]//div[2]/h2
            String xpathforOffersName = "//ul[@class='productList-root-1dQ']/li["+j+"]/div[1]/div[2]/div[2]/div[1]/strike/span/span[2]";
            WebElement contentEle = driver.findElement(By.xpath(xpathforOffersName));
            System.out.println(contentEle.getText().toString());
            float Ptotal = Float.parseFloat(contentEle.getText());
            total = total+Ptotal;
        }
        System.out.println(total);

        String MRP = MRPTotalvalue.getText();
        MRP = MRP.substring(1);

        Assert.assertEquals(total,MRP);


    }

    public void totalPromoCalculation() throws InterruptedException {
        btn_PromotionalDiscount.click();
        Thread.sleep(5000);
        String xpathrows = "//div[@class='totalsSummary-discountsContainar-1Zv']/div";
        List<WebElement> listTotal = driver.findElements(By.xpath(xpathrows));
        System.out.println("total no of rows" + listTotal.size());
        for(int i =1;i<=1;i++){
            String xpathforPromotainalDiscount = "//div[@class='totalsSummary-discountsInfo-ktl']["+i+"]/span[1]";
            WebElement contentEle = driver.findElement(By.xpath(xpathforPromotainalDiscount));
            System.out.println(contentEle.getText().toString());
            String text = contentEle.getText();
            int digits = (int) Float.parseFloat(text.replaceAll("[^0-9.]", ""));
            System.out.println(digits);
            String Subtotal = btn_Subtotal.getText();
            Subtotal= Subtotal.substring(1);
            double Subtotal1 = (double) Float.parseFloat(Subtotal);
            System.out.println(Subtotal1);
            double proDis = (float) (Subtotal1 * digits);
            double proDis1 = (float) (proDis/100);
            System.out.println(proDis1);
            for(int j=1;j<=1;j++){
                String GetDiscountPromo ="(//span[@class='totalsSummary-discountsValue-Xnn'])["+j+"]";
				WebElement GetPromoDis = driver.findElement(By.xpath(GetDiscountPromo));
                String ProAmount = GetPromoDis.getText();
                ProAmount = ProAmount.substring(1);
                System.out.println(ProAmount);
                Assert.assertEquals(ProAmount,proDis1);


            }
        }
    }
}
