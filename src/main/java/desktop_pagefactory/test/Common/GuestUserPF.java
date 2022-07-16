package desktop_pagefactory.test.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class GuestUserPF {


    @FindBy(xpath = "//a[normalize-space()='Kidswear'] | //a[normalize-space()='Hair']")
    WebElement hair;

    @FindBy(xpath = "//h2[normalize-space()='Trell Fashion HSR'] | //*[@class='ProductTilestyle__ProductName-sc-1bpfvho-3 gZLkfg']")
    WebElement hair_product;

    @FindBy(xpath = "//div[@class='addSaveToBagstyle__AddBagLabel-sc-ims6j7-3 etAPzA'] | //button[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ']")
    WebElement add_to_bag;

    @FindBy(xpath = "//button[@class='cartButton'] | //button[@class='cartButton']")
    WebElement go_to_bag;

    @FindBy(xpath = "//button[@class='totalsSummary-proceed-WrG'] | //button[@class='totalsSummary-proceed-WrG']")
    WebElement proceed;

    @FindBy(xpath = "//input[@placeholder='Enter Phone Number']")
    WebElement enter_phone_num;
    @FindBy(xpath = "//button[normalize-space()='Get OTP via SMS']")
    WebElement get_otp;
    @FindBy(xpath = "//input[@placeholder='Enter OTP']")
    WebElement enter_otp;
    @FindBy(xpath = "//button[normalize-space()='Verify Now']")
    WebElement otp_verify;


    WebDriver driver;
    public GuestUserPF(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }
    public void hair(){
        hair.click();
    }
    public void hairproduct(){
        hair_product.click();
    }
    public void addtobag(){
        add_to_bag.click();
    }
    public void gotobag(){
        go_to_bag.click();
    }
    public void proceed() {
        proceed.click();
    }
    public void enter_phone_num() {
        enter_phone_num.sendKeys("9999999999");
    }
    public void get_otp() {
        get_otp.click();
    }
    public void enter_otp() {
        enter_otp.sendKeys("987699");
    }
    public void verify_otp() {
        otp_verify.click();
    }

    //-------------------validation----------------------------//
    public void kidswear_page_validation() throws InterruptedException {
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.xpath("//h1[normalize-space()='Kidswear']"));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertEquals("Kidswear", strng);
    }

    public void proceed_validation(){
        Assert.assertTrue(driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/button[1]")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/button[1]")).isDisplayed());
    }
    public void login_validation(){
        WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Verify Mobile Number')]"));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertEquals("Verify Mobile Number", strng);
    }



}
