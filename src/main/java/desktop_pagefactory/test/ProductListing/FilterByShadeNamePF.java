package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class FilterByShadeNamePF {
	//--------------------------mc-staging----------------------------------//

	@FindBy(xpath="//button[normalize-space()=\"Men's Grooming\"] | //a[normalize-space()=\"Men's Grooming\"]")
	WebElement groomingformen;

	@FindBy(xpath="//span[normalize-space()='Shade Name']")
	WebElement shadename;

	@FindBy(xpath="(//span[@class='checkmark'])[7] | //span[normalize-space()='Pink-Beach']")
	WebElement basebrown;

	@FindBy(xpath="//img[@alt='Cancel Icon']")
	WebElement exitfromfilter;


	WebDriver driver;
	public FilterByShadeNamePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}
	public void groomingformen() {
		groomingformen.click();
	}
	public void shadename() {
		shadename.click();
	}
	public void basebrown() {
		basebrown.click();
	}
	public void exitfromfilter() {
		exitfromfilter.click();
	}
	//public void homepage(){go_to_home.click();}

	//----------------------Validations---------------------------------//
	public void grooming_page_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()=\"Men's Grooming\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()=\"Men's Grooming\"]")).isDisplayed());
	}
	public void filter_shadename_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("(//span[@class='checkmark'])[7]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("(//span[@class='checkmark'])[7]")).isDisplayed());
	}
}
