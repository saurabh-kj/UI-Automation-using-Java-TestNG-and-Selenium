package desktop_pagefactory.test.Orders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverClass;

public class MyOrdersPF extends DriverClass {

    @FindBy(xpath ="//li[@class='myAccount-item-103 myAccount-active-U1F']/a[text()='My Orders']")
    WebElement lnkMyOrders;

    WebDriver driver;
    public MyOrdersPF(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

public void clickMyOrders(){
        waitForElementToBeClickable(lnkMyOrders);
}
}
