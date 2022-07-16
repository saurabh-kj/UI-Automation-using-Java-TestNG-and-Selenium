package desktop_pagefactory.test.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HelpFooterPF {

    @FindBy(xpath = "//a[normalize-space()='Shipping']")
    WebElement shipping;

    @FindBy(xpath = "//a[normalize-space()='FAQ']")
    WebElement faq;

    @FindBy(xpath = "//a[normalize-space()='Cancellations']")
    WebElement cancellation;

    WebDriver driver;
    public HelpFooterPF(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

    }
    public void Shipping(){
        shipping.click();
    }
    public void Cancellation(){
        cancellation.click();
    }
    public void Faq(){
        faq.click();
    }
}
