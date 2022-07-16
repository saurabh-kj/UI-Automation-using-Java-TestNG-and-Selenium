package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import utils.DriverClass;


public class FilterByBrandNamePF extends DriverClass {

	@FindBy(xpath="//button[normalize-space()='Makeup'] | //a[normalize-space()='Brands']")
	WebElement brand;

	@FindBy(xpath="//span[contains(text(),'Brand Name')]")
	WebElement clickonbrand;

	@FindBy(xpath="(//span[@class='checkmark'])[21]")
	WebElement filterbrand;

	@FindBy(xpath="//img[@alt='Cancel Icon']")
	WebElement exitfromfilter;



	final WebDriver driver;
	public FilterByBrandNamePF(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}
	public void brand() throws InterruptedException {
    	Thread.sleep(4000);
		waitForElementToBeClickable(brand);
		brand.click();
	}
	public void clickonbrand() {
		waitForElementToBeClickable(clickonbrand);
		clickonbrand.click();
	}
	public void filterbrand() {
		waitForElementToBeClickable(filterbrand);
		filterbrand.click();
	}
	public void exitfromfilter() throws InterruptedException {
		Thread.sleep(3000);
		waitForElementToBeClickable(exitfromfilter);
		exitfromfilter.click();
	}
	//------------------Staging-Validation---------------------------------//
	public void mekup_page_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Makeup']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Makeup']")).isDisplayed());
	}
	public void click_on_mekup_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Brand Name')]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Brand Name')]")).isDisplayed());
	}

}
