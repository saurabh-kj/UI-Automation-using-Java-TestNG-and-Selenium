package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SortByDiscountPF {
	//----------------------staging-------------------------------------//
	@FindBy(xpath="//a[normalize-space()='Kidswear'] | //a[normalize-space()='Personal/ Feminine Hygiene']")
	WebElement personal_product;

	@FindBy(xpath="//span[@class='sortTitle'] | //button[@class='sortBtn']")
	WebElement click_on_sort;

	@FindBy(xpath="//label[normalize-space()='Discount']")
	WebElement discount;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement go_to_home;

	@FindBy(xpath = "//*[@class='Pricestyle__DiscountValue-sc-1vje94u-7 hWbdeH']")
	public
	WebElement PriceSortValue;

	@FindBy(xpath = "//*[@class='Pricestyle__DiscountValue-sc-1vje94u-7 hWbdeH']")
	public
	WebElement PriceSortValue2;

	@FindBy(xpath = "//*[@class='Pricestyle__DiscountValue-sc-1vje94u-7 hWbdeH']")
	public
	WebElement PriceSortValue3;

	@FindBy(xpath = "//*[@class='Pricestyle__DiscountValue-sc-1vje94u-7 hWbdeH']")
	public
	WebElement PriceSortValue4;

	final WebDriver driver;
	public SortByDiscountPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}
	public void PersonalProduct() {
		personal_product.click();
	}
	public void ClickOnSort() {
		click_on_sort.click();
	}
	public void discount() {
		discount.click();
	}
	//public void homepage(){go_to_home.click();}

	//----------------validations------------------------//
	public void DiscountValidation(String ECSortPrice, String ACSortPrice){
//		Assert.assertEquals(ECSortPrice , ACSortPrice);

		System.out.println(ACSortPrice);

		int PS0 = Integer.parseInt(String.valueOf(ECSortPrice));
		int PS1 = Integer.parseInt(String.valueOf(ACSortPrice));
		int PS2 = Integer.parseInt(PriceSortValue2.getText());
		int PS3 = Integer.parseInt(PriceSortValue3.getText());
		int PS4 = Integer.parseInt(PriceSortValue4.getText());
		if((PS0 >= PS1) &&	 (PS1 >= PS2) &&	(PS2 >= PS3) &&	(PS3>=PS4)){
			System.out.println("Test case PASS for sort");

		}
		else
		{
			System.out.println("Test case failed");
		}

	}
}
