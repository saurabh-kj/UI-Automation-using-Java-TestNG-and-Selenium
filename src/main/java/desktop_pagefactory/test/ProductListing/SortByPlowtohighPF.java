package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class SortByPlowtohighPF {
	//-----------------------staging----------------------------------------//

	@FindBy(xpath="//*[@href='/other-categories/c/741'] | //a[normalize-space()='Other Categories']")
	WebElement others;


	@FindBy(xpath="//span[@class='sortTitle'] | //button[@class='sortBtn']")
	WebElement click_on_sort;

	@FindBy(xpath = "(//div[@class='Pricestyle__ProductPrice-sc-1vje94u-4 eLAiGs'])[2]")
	public
	WebElement PriceSortValue;

	@FindBy(xpath = "(//div[@class='Pricestyle__ProductPrice-sc-1vje94u-4 eLAiGs'])[2]")
	public
	WebElement PriceSortValue2;

	@FindBy(xpath = "(//div[@class='Pricestyle__ProductPrice-sc-1vje94u-4 eLAiGs'])[3]")
	public
	WebElement PriceSortValue3;

	@FindBy(xpath = "(//div[@class='Pricestyle__ProductPrice-sc-1vje94u-4 eLAiGs'])[3]")
	public
	WebElement PriceSortValue4;

	@FindBy(xpath="//label[normalize-space()='Price: Low to High']")
	WebElement lowtohigh;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement go_to_home;

	final WebDriver driver;
	public SortByPlowtohighPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}

	public void others() throws InterruptedException {
		Thread.sleep(5000);
		others.click();
	}
	public void ClickOnSort() {
		click_on_sort.click();
	}
	public void lowtohigh() {
		lowtohigh.click();
	}
	//public void homepage(){go_to_home.click();}

	//--------------------validations------------------------//
	public void others_page_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Other Categories']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Other Categories']")).isDisplayed());
	}


	public void ValidationBySort(String ECSortPrice, String ACSortPrice){
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
