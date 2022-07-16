package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class FilterByGenderPF {
	//---------------------------mc-staging---------------------------//
	@FindBy(xpath="//*[@href='/skin-care/c/6']")
	WebElement skin_product;

	@FindBy(xpath="//span[contains(text(),'Gender')]")
	WebElement filterbygender;

	@FindBy(xpath="//*[contains(text(),'Female')] | //span[normalize-space()='Female']")
	WebElement selgender;

	@FindBy(xpath="//img[@alt='Cancel Icon']")
	WebElement exitfromfilter;


	final WebDriver driver;
	public FilterByGenderPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}
	public void skin_product() {
		skin_product.click();
	}
	public void filterbygender() {
		filterbygender.click();
	}
	public void selgender() {
		selgender.click();
	}
	public void exitfromfilter() {
		exitfromfilter.click();
	}

	//-----------------validations--------------------------//
	public void skin_product_validation(){
		WebElement element = driver.findElement(By.xpath("//h1[normalize-space()='Skin Care']"));
		String strng = element.getText();
		System.out.println(strng);
		Assert.assertEquals("Skin Care", strng);
	}
	public void filter_by_gender_validation(){
		WebElement element = driver.findElement(By.xpath("//label[@for='Female']"));
		String strng = element.getText();
		System.out.println(strng);
		Assert.assertEquals("Female", strng);
	}
}
