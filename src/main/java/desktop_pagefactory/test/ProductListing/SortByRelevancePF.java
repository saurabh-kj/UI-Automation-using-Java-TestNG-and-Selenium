package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class SortByRelevancePF {

	//--------------------------------staging--------------------------------------//
	@FindBy(xpath = "//*[normalize-space()='Personal Hygiene'] | //a[normalize-space()='Personal/ Feminine Hygiene']")
	WebElement personalfeminine;


	@FindBy(xpath = "//span[@class='sortTitle'] | //button[@class='sortBtn']")
	WebElement click_on_sort;

	@FindBy(xpath = "//label[normalize-space()='Relevance']")
	WebElement select_relevance;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement go_to_home;
//------------------------Validations-------------------------------//

	@FindBy(xpath = "//span[contains(text(),'personal/ feminine hygiene')]")
	WebElement personal;

	final WebDriver driver;

	public SortByRelevancePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}

	public void personalfeminine() {
		personalfeminine.click();
	}

	public void ClickOnSort() {
		click_on_sort.click();
	}

	public void SelectRelevance() {
		select_relevance.click();
	}

	//----------validations------------------//

	public void PersonalPageValidation(){
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Personal Hygiene']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Personal Hygiene']")).isDisplayed());
	}

}