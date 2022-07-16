package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class SortByHightolowPF {

//--------------------staging--------------------------------------//

	@FindBy(xpath="//a[normalize-space()='Other Categories'] | //a[@href=\"/other-categories/c/741\"]")
	WebElement health;


	@FindBy(xpath="//span[@class='sortTitle'] | //button[@class='sortBtn']")
	WebElement sort3;

	@FindBy(xpath="//label[normalize-space()='Price: Low to High']")
	WebElement hightolow;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement go_to_home;

	final WebDriver driver;
	public SortByHightolowPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}
	public void health() {
		health.click();
	}
	public void sort3() {
		sort3.click();
	}
	public void hightolow() {
		hightolow.click();
	}
	//public void homepage(){go_to_home.click();}

	//---------------Validations------------------------//
	public void other_page_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Other Categories']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Other Categories']")).isDisplayed());
	}

}
