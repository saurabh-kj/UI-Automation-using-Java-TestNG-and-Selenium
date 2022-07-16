package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class SortByAlphabaticallyatozPF {

	@FindBy(xpath="//*[normalize-space()='Brands'] | //a[normalize-space()='Brands']")
	WebElement brand;

	@FindBy(xpath="//span[@class='sortTitle'] | //button[@class='sortBtn']")
	WebElement click_on_sort;

	@FindBy(xpath="//label[normalize-space()='Alphabetically: A-Z']")
	WebElement alphabaticallyatoz;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement go_to_home;

	final WebDriver driver;
	public SortByAlphabaticallyatozPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}
	public void Brand() {
		brand.click();
	}
	public void ClickOnSort() {
		click_on_sort.click();
	}
	public void AlphabaticallyAtoZ() {
		alphabaticallyatoz.click();
	}
	//public void homepage(){go_to_home.click();}

	//--------------Validations-----------------------------//

	public void brand_page_validation() {
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Brands']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Brands']")).isDisplayed());
	}
	public void sorting_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='sortTitle']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//span[@class='sortTitle']")).isEnabled());
	}
}
