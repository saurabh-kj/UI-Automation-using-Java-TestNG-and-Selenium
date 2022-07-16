package desktop_pagefactory.test.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class SelectProductPF {
	@FindBy(xpath = "//*[normalize-space()='Makeup']")
	WebElement product;

	@FindBy(xpath = "//h2[normalize-space()='INLIFE Face Cream2'] | (//h2[@class=\"ProductTilestyle__ProductName-sc-1bpfvho-3 gZLkfg\"])[1]")
	WebElement select_product;

	final WebDriver driver;

	public SelectProductPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	public void product() {
		product.click();
	}

	public void SelectProduct() {
		select_product.click();
	}

	//-------------------Validation------------------------//
	public void plp_validation() {
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Makeup']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Makeup']")).isDisplayed());
	}

	public void pdp_validation() {
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='INLIFE Face Cream2']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='INLIFE Face Cream2']")).isDisplayed());
	}
}