package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class SortByAlphabaticallyztoaPF {
	//----------------------staging------------------------------------//
	@FindBy(xpath="//*[normalize-space()='Kidswear'] | //a[normalize-space()='Kidswear']")
	WebElement mombaby;

	@FindBy(xpath="//span[@class='sortTitle']")
	WebElement click_on_sort;

	@FindBy(xpath="//label[normalize-space()='Alphabetically: Z-A']")
	WebElement alphabaticallyztoa;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement go_to_home;

	final WebDriver driver;
	public SortByAlphabaticallyztoaPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}
	public void MomBaby() {
		mombaby.click();
	}
	public void ClickOnSort() {
		click_on_sort.click();
	}
	public void AlphabaticallyZtoA() {
		alphabaticallyztoa.click();
	}
	//public void homepage(){go_to_home.click();}

	//------------------Validations--------------------------------//
	public void mom_baby_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Kidswear']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Kidswear']")).isDisplayed());
	}
	public void sorting_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='sortTitle']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//span[@class='sortTitle']")).isEnabled());
	}
}
