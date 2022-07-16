package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import utils.DriverClass;

public class FilterByCategoryPF extends DriverClass {
	//----------------------mc-staging-------------------------------------//


	@FindBy(xpath = "//a[@href='/personal-feminine-hygiene/c/27'] | //a[normalize-space()='Personal/ Feminine Hygiene']")
	WebElement skinep;


	@FindBy(xpath = "//span[normalize-space()='Category (L4)'] | //div[@data-type=\"Category (L4)\"]")
	WebElement filtercategory;

	@FindBy(xpath = "(//span[@class='checkmark'])[3]")
	WebElement selectanycategory;

	@FindBy(xpath="//img[@alt='Cancel Icon']")
	WebElement exitfromfilter;


	final WebDriver driver;
	public FilterByCategoryPF(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}
	public void skinep() {
		waitForElementToBeClickable(skinep);
		skinep.click();
//		driver.navigate().refresh();
	}
	public void filtercategory() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		waitForElementToBeClickable(filtercategory);
		filtercategory.click();
	}
	public void selectanycategory() {
		waitForElementToBeClickable(selectanycategory);
		selectanycategory.click();
	}
	public void exitfromfilter() {
		waitForElementToBeClickable(exitfromfilter);
		exitfromfilter.click();
	}

	//------------------------validations--------------------------------//
	public void skin_page_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Personal Hygiene']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Personal Hygiene']")).isDisplayed());
	}
	public void filter_by_category_validation(){
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='Nail Polish']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@id='Nail Polish']")).isDisplayed());
	}
}
