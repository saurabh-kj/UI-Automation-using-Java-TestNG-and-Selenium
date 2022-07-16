package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class FilterByGoodtoKnowPF {
	//--------------------------mc-staging-----------------------------------//

	@FindBy(xpath = "//button[normalize-space()='Fragrances'] | //a[normalize-space()='Fragrances']")
	WebElement fragrance;

	@FindBy(xpath = "(//div[@data-type='Good to Know'])[1] | //div[@data-type=\"Good to Know\"]")
	WebElement goodtoknow;

	@FindBy(xpath = "//label[@for='Cruelty free']//span[@class='checkmark']")
	WebElement selectgoodtoknow;

	@FindBy(xpath = "//img[@alt='Cancel Icon']")
	WebElement exitfromfilter;


	final WebDriver driver;

	public FilterByGoodtoKnowPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}

	public void fragrance() {
		fragrance.click();
	}

	public void goodtoknow() {
		goodtoknow.click();
	}

	public void selectgoodtoknow() {
		selectgoodtoknow.click();
	}

	public void exitfromfilter() {
		exitfromfilter.click();
	}

	//------------------------validation----------------------------------//
	public void fragrance_page_validation() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[@class='headTitle']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@class='headTitle']")).isDisplayed());
	}

	public void filter_by_goodtoknow_validation() {
		Assert.assertTrue(driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/article[1]/div[2]/div[1]/button[1]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/article[1]/div[2]/div[1]/button[1]")).isSelected());
	}
}
