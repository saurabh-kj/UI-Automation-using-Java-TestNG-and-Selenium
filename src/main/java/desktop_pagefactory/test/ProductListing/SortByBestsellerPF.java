package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class SortByBestsellerPF {
//---------------------------staging---------------------------//

	@FindBy(xpath="//a[normalize-space()='Makeup'] | //a[normalize-space()='Makeup']")
	WebElement toolsappliance;

	@FindBy(xpath="//span[@class='sortTitle'] | //button[@class='sortBtn']")
	WebElement clic_on_sort;

	@FindBy(xpath="//label[normalize-space()='Bestseller']")
	WebElement bestseller;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement go_to_home;

	final WebDriver driver;
	public SortByBestsellerPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}

	public void ToolsAppliance() {
		toolsappliance.click();
	}
	public void ClickOnSort() {
		clic_on_sort.click();
	}
	public void BestSeller() {
		bestseller.click();
	}
	//public void homepage(){go_to_home.click();}

	//---------------Validations----------------------------//


	public void tools_page_validation() {
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Makeup']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Makeup']")).isDisplayed());
	}
	public void sorting_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='sortTitle']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//span[@class='sortTitle']")).isEnabled());
	}
}
