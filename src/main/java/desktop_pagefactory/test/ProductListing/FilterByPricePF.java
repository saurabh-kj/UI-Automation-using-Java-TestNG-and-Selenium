package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class FilterByPricePF {
	//--------------------------mc-staging------------------------------------//
	@FindBy(xpath="//button[normalize-space()='Hair'] | //a[normalize-space()='Hair']")
	WebElement hair_p;

	@FindBy(xpath="//span[normalize-space()='Price']")
	WebElement price;

	@FindBy(xpath="//label[@for='0-1000']//span[@class='checkmark']")
	WebElement selprice;

	@FindBy(xpath="//img[@alt='Cancel Icon']")
	WebElement exitfromfilter;

	final WebDriver driver;
	public FilterByPricePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}
	public void hair() throws InterruptedException {
		Thread.sleep(5000);
		hair_p.click();
	}
	public void price() {
		price.click();
	}
	public void SelectPrice() {
		selprice.click();
	}
	public void exitfromfilter() {
		exitfromfilter.click();
	}

	//---------------validations----------------------------//
	public void hair_page_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Hair']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Hair']")).isSelected());
	}
	public void filter_price_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/article[1]/div[2]/div[1]/button[1]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("(//span[@class='checkmark'])[28]")).isDisplayed());
	}
}

